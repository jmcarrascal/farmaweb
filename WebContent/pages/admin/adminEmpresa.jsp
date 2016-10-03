<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/blockuiv1.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/popup.css" rel="stylesheet" type="text/css" />

<script src="<%=request.getContextPath()%>/js/jquery.blockUI.js" type="text/javascript"></script>

<link href="<%=request.getContextPath()%>/css/jquery.autocomplete.css"
	rel="stylesheet" type="text/css" />
<script
	src="<%=request.getContextPath()%>/js/jquery.autocomplete.js"
	type="text/javascript"></script>


 
<script>

$(document).ready(function(){
	
	$("#guardar").click(function (){
		window.scrollTo(0,0);
			if (validarDatosPersonales()) {
	   			$.ajax({
	   			  type: "POST",
	   			  url: "saveEmpresa",
	   			  data: $("#adminEmpresaForm").serialize(),
	   			  dataType: "script",
	   			  beforeSend: function(objeto){   				
	   			  },
	   			  success: function(msg){
	   				  
	   				document.getElementById("idMsgSave").innerHTML = msg;  
	   			 	
	   				saveMsg(msg);
	   			  },
	   			  error: function(objeto, quepaso, otroobj){
	   				alert("Comuniquese con el Administrador del Sistema / error: "+ quepaso);
	   			  }
	   		
	   			});
			}

		});
});
function saveMsg(msg) {
	if (msg == 'OK'){		
		document.getElementById("idMsgSaveOK").innerHTML = 'Operación realizada con Exito!';
		$.blockUI({
			theme:   true, 
			title: 'Guardar Empresa',
	        message: $('#respuestaSaveOKForm'), 
	        opacity: .1, 
	        color: 'black'
		});
			setTimeout(function() { 
			            $.unblockUI({ 
			                onUnblock: function(){ $('#listEmpresaForm').submit(); } 
			            }); 
			        }, 1000);
		

	}else{						
		$.blockUI({
			theme:   true, 
			title: 'Guardar Empresa',
	        message: $('#respuestaSaveForm'), 
	        opacity: .1, 
	        color: 'black'
		});
	}
}
function closeBlock(){	
	$.unblockUI();
}

function validarDatosPersonales() {
	var allFields = $([]).add($("#nombre").add($("#gln").add($("#usrPami").add($("#password")))));
	var bValid = true;
	allFields.removeClass('ui-state-error');
	bValid = bValid && checkNotEmpty($("#nombre"), "NOMBRE COMPLETO", $("#validateTips"));
	bValid = bValid && checkNotEmpty($("#gln"), "GLN", $("#validateTips"));
	bValid = bValid && checkNotEmpty($("#password"), "PASSWORD PAMI", $("#validateTips"));
	bValid = bValid && checkNotEmpty($("#usrPami"), "USUARIO PAMI", $("#validateTips"));
	return bValid;
}
function checkNotEmpty(o, n, tipcontainer) {
    if (o.val() != "") {
        return true;
    } else {
        updateTips("El campo " + n + " es obligatorio!", tipcontainer);
        return false;
    }
}
function updateTips(t, tipcontainer) {
    tipcontainer.text(t).effect("highlight",{},1500);
}

</script>

		<fieldset class="defaultFieldset" >
			<legend><b>Gestión de Empresa - Carga de Datos</b></legend>

	<s:form id="adminEmpresaForm" action="saveEmpresa" theme="simple" cssClass="inline" method="post" >
		<s:actionerror/>
		<s:actionmessage/>
		<p id="validateTips"></p>
        <s:hidden id="accion" name="adminEmpresa"/>
		<s:hidden id="idEmpresaWeb" name="empresaWeb.idEmpresaWeb"/>			
		
	    <table>
			<tr>
				<td><label for="nombre">Nombre:</label></td>
			   	<td><s:textfield id="nombre" name="empresaWeb.nombre" size="50" maxlength="50" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>

				<td><label for="gln">GLN:</label></td>
			   	<td><s:textfield id="gln" name="empresaWeb.gln" size="20" maxlength="20" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
			</tr>
		</table>
	    <table>
			<tr>
				<td><label for="usrPami">Usuario Pami:</label></td>
			   	<td><s:textfield id="usrPami" name="empresaWeb.usrPami" size="20" maxlength="20" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
			   	
			   	<td><label for="password">Password Pami:</label></td>
			   	<td><s:textfield id="password" name="empresaWeb.passPami" size="20" maxlength="20" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
			</tr>
		</table>
		
		<table>
		<tr>
		<td>
		<select name="empresaWeb.tipoEmpresa">
		  <option value="0">Farmacia</option>
		  <option value="1">Establecimiento Asistencial</option>
		</select>
		</td>
		</tr>
		</table>
		<center>
			<div id="guardar" style="display:inline;">
					<img src="images/general/icon_guardar.png" alt="Guardar" border="0">		
				
			</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<div id="cancelar" style="display:inline; align:top">
					<img src="images/general/icon_cancelar.png" alt="Cancelar" border="0">
				
			</div>
		</center>
	</s:form>	
</fieldset>
<div style="display: none" align="center" id="respuestaSaveForm">		
		<s:label for="idMsgSave" id="idMsgSave" />
		<div class="space"></div>
		<div class="space"></div>
		<div class="buttonPanel" id="buttonDown" align="center">
			<ul class="content_1x128">							
				<a href="#" onclick="closeBlock();">
					<img src="images/general/icon_cancelar.png" alt="Cerrar" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
			</ul>
		</div>						
</div>

<div style="display: none" align="center" id="respuestaSaveOKForm">		
		<s:label for="idMsgSaveOk" id="idMsgSaveOK" />
		<div class="space"></div>
		<div class="space"></div>
		
</div>
<s:form id="listEmpresaForm" action="getEmpresas" theme="simple" cssClass="inline" method="post" >
</s:form>

