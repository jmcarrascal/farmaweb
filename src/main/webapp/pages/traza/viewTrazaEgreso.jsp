<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec" %>
 
<link href="<%=request.getContextPath()%>/css/hints.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />






<div class="main">
<div align="right"><a href="preparedSendRemitos"> <img
	src="<%=request.getContextPath()%>/images/general/back.png" width="50px" alt="Volver" title="Volver"
	 border="0"></img> </a> <a href="<%=request.getContextPath()%>/home"> <img
	src="<%=request.getContextPath()%>/images/general/homev1.png" width="50px" alt="Inicio" title="Inicio"
	border="0"></img> </a>
	</div>
			
		   	<fieldset class="defaultFieldset">
    			<legend><b>Enviar por Remito(SK) - Medicamentos a Enviar</b></legend>
    			
	 			<table>					
				<tr>
					<td align="left">
	 					<s:label id="idRazonSocial" name="nombre" cssClass="entidadGrande"/>		
					</td>										
				</tr>				
				</table>
				<table>
				<tr>
					<td align="left">	 						 						
	 					<s:label name="transac.nroComprobante" cssClass="entidadMedia"/>		
					</td>										
				</tr>				
				</table>
					<div class = "separator"></div>
					<ec:table					
						tableId="notReg" 
				    	items="trazabiFarmaList"
						var = "trazabi"
						locale="es_ES"
						action="viewTrazaIngreso"
						imagePath="images/table/*.gif"
						width="100%"
						rowsDisplayed="100" >						
						<ec:exportPdf view="pdf" headerColor="white" headerTitle='<%=String.valueOf((request.getAttribute("grillaResult")))%>' fileName="soloImpagos.pdf" tooltip="Exportar PDF" />
						<ec:exportXls view="xls" text='<%=String.valueOf((request.getAttribute("grillaResult")))%>' fileName="soloImpagos.xls" tooltip="Exportar Excel"/>
						<ec:row>
								<ec:column width="40px" property="transacNr" title="Nr" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.nr}</span>
								</ec:column>
								<ec:column width="40px" property="stock.descripcion" title="Articulo" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.stock.descripcion}</span>
								</ec:column>
								<ec:column width="40px" property="gtin" title="GTIN" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.gtin}</span>
								</ec:column>
								<ec:column width="40px" property="serieGtin" title="Serie" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.serieGtin}</span>
								</ec:column>
								<ec:column width="40px" property="nrLote" title="Lote" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.nrlote}</span>
								</ec:column>
								<ec:column width="40px" property="vencimLote" title="Vencimiento" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.vencimLote}</span>
								</ec:column>
								<ec:column width="40px" property="glndestinoIng" title="GLN Origen" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.glndestinoIng}</span>
								</ec:column>							
								<ec:column width="40px" property="respuestaIngreso" title="Resp. ANMAT" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.respuestaIngreso}</span>
								</ec:column>							
								
						</ec:row>
					</ec:table>
					
				
			</fieldset>				
			<table>
					<tr>
						
						<td>
<s:select label="Seleccione en tipo de Destinatario " 
		headerKey="-1" headerValue="Seleccione..."
		list="#{'1':'Paciente', '2':'Eslabón posterior'}" 
		name="tipoDestinatario" 
		value="0" onchange="setDisplay();" id = "tipoDestinatarioId"/>
</td>
					</tr>
			</table>	
			<div id = "datosPacienteId" style="display: none">
			<fieldset class="defaultFieldset">
    			<legend><b>Datos del Paciente</b></legend>
				<s:form id="enviarPorRemitoForm" action="enviarPorRemito" theme="simple" cssClass="inline" method="post" >
				<p id="validateTips"></p>				
				<s:hidden id ="idObraSocialID" key="datosTrazaWS.idObraSocial" name="datosTrazaWS.idObraSocial"/>
				<s:hidden key="transac.transacNr" name="transac.transacNr"/>
					<table>
						<tr>
							<td><label for="ob"><b>Numero de Remito:</b></label><td>
							<td><s:textfield id="nroRemitoID" name="datosTrazaWS.nroRemito" size="13" maxlength="13" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>				
					<table>
						<tr>
							<td><label for="forNombreOb">Ingrese una porción del nombre de la Obra Social:</label></td>
							<td><s:textfield id="idNombreOSTextList" 
								size="60" maxlength="60" cssErrorClass="error"
								cssClass="ui-widget-content ui-corner-all" /></td>
							<td style="display: none" id="idAutoCompleteLoad"><img alt=""
								src="images/general/loading1.gif"></td>	
							<td style="display: inline" id="idBuscarPorNombreImage"><img alt=""
								src="images/general/view.gif"></td>						</tr>
					</table>
					<table>		
						<tr>
							<td><s:label id="idNombreOSLabel"  /></td>
						</tr>
					</table>				
					<div id = "IdNombrePacienteDIV">					
						<table>
							<tr>
								<td><label for="nombre"><b>Nombre del Paciente:</b></label><td>
								<td><s:textfield id="nombrePacienteID" name="datosTrazaWS.nombrePaciente" size="100" maxlength="100" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
							</tr>
				    	</table>
			    	</div>
			    	<div id = "IdnroAfiliadoDIV">				
					<table>
						<tr>
							<td><label for="ob"><b>Numero de Afiliado:</b></label><td>
							<td><s:textfield id="nroAfiliadoID" name="datosTrazaWS.nroAsociado" size="20" maxlength="20" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>
			    	</div>				
					<table>
						<tr>
							<td><label for="ob"><b>Observaciones:</b></label><td>
							<td><s:textarea id="observID" name="datosTrazaWS.obs" cols="90" rows = "3" maxlength="200" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>				

				</s:form>
				<div style="display: inline;" > 
					<img src="<%=request.getContextPath()%>/images/general/icon_informar_anmat.png" alt="Informar Ingreso a ANMAT" title="Informar Ingreso a ANMAT" onclick="enviarPorRemito();"></img>
				</div>

	    	</fieldset>
	    	</div>
	    	<div id = "datosEslabonId" style="display: none">
			<fieldset class="defaultFieldset">
    			<legend><b>Datos del Eslabón posterior</b></legend>
				<s:form id="enviarEslabonPorRemitoForm" action="enviarPorRemito" theme="simple" cssClass="inline" method="post" >
				<p id="validateTips"></p>				
				<s:hidden id ="idObraSocialEID" key="datosTrazaWS.idObraSocial" name="datosTrazaWS.idObraSocial"/>
				<s:hidden key="transac.transacNr" name="transac.transacNr"/>
					<table>
						<tr>
							<td><label for="ob"><b>Número de Remito:</b></label><td>
							<td><s:textfield id="nroRemitoEID" name="datosTrazaWS.nroRemito" size="13" maxlength="13" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>				
					<table>
						<tr>
							<td><label for="forNombreOb">Ingrese una porción del nombre de la Obra Social:</label></td>
							<td><s:textfield id="idNombreOSETextList" 
								size="60" maxlength="60" cssErrorClass="error"
								cssClass="ui-widget-content ui-corner-all" /></td>
							<td style="display: none" id="idAutoCompleteLoad"><img alt=""
								src="images/general/loading1.gif"></td>	
							<td style="display: inline" id="idBuscarPorNombreEImage"><img alt=""
								src="images/general/view.gif"></td>						</tr>
					</table>
					<table>		
						<tr>
							<td><s:label id="idNombreOSELabel"  /></td>
						</tr>
					</table>				
					
			    	<table>
						<tr>
							<td><label for="ob"><b>Gln del Destinatario:</b></label><td>
							<td><s:textfield id="glnDestinatarioID" name="datosTrazaWS.glnDestinatario" size="20" maxlength="20" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>
			    	<table>
						<tr>
							<td><label for="ob"><b>Observaciones:</b></label><td>
							<td><s:textarea id="observREID" name="datosTrazaWS.obs" cols="90" rows = "3" maxlength="200" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
						</tr>
			    	</table>				

				</s:form>
				<div style="display: inline;" > 
					<img src="<%=request.getContextPath()%>/images/general/icon_informar_anmat.png" alt="Informar Ingreso a ANMAT" title="Informar Ingreso a ANMAT" onclick="enviarPorRemitoGLN();"></img>
				</div>

	    	</fieldset>
	    	</div>
</div>		
<div style="display: none" align="center" id="resultCerrarTransacId" >
		<h1 id="idMsgSave" >Transacción</h1>		
		<div id="buttonDown" >
				<a href="preparedSendRemitos" onclick="this.blur();">
					<img src="images/general/icon_volver.png" alt="Volver al Agendado" border="0" style="float:center;margin-top:0px;"></img>
				</a>
				<a onclick="downloadRemito();">
					<img src="images/general/icon_download_remito.png" alt="Descargar Remito" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
										
		</div>						
</div>
<div id ="listAutoComplete" class="ui" style="display: none;"/>
<s:form action="downloadRemito" id="downloadRemitoForm" target="_blank">
	<s:hidden key="transac.transacNr" name="transac.transacNr"/>	
</s:form>

<script type="text/javascript">

function validarDatos() {
	var allFields = $([]).add($("#nroRemitoEID").add($("#nroAfiliadoID")));
	var bValid = true;
	allFields.removeClass('ui-state-error');
	bValid = bValid && checkNotEmpty($("#nroRemitoID"), "Remito", $("#validateTips"));
	bValid = bValid && checkNroAfiliado($("#nroAfiliadoID"), "Numero de Afiliado", $("#validateTips"));
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
function checkNroAfiliado(o, n, tipcontainer) {
    if ($("#idObraSocialID").val() != '0' &&  o.val() == "") {
    	updateTips("El campo " + n + " es obligatorio cuando el cliente no es un consumidor final!", tipcontainer);
        return false;    	
    } else {
    	return true;
    }
}



function updateTips(t, tipcontainer) {
    tipcontainer.text(t).effect("highlight",{},1500);
}




$(document).ready(function() {
	//$("#nroRemitoID").mask("9999-99999999");
	//$("#nroRemitoEID").mask("9999-99999999");
	
	$("#idBuscarPorNombreImage").click(function (){	
		$("div.ui").css({position:'absolute', left: ($("#idNombreOSTextList").position().left), top: ($("#idNombreOSTextList").position().top +20) });
		callAgendadoList();				
	});
	
	$("#idBuscarPorNombreEImage").click(function (){	
		$("div.ui").css({position:'absolute', left: ($("#idNombreOSETextList").position().left), top: ($("#idNombreOSETextList").position().top +20) });
		callAgendadoEList();				
	});
});



function setDisplay() {
	
	if ($("#tipoDestinatarioId").val() == '1'){
		$("#datosPacienteId").show();
		$("#datosEslabonId").hide();
		
	}	
	if ($("#tipoDestinatarioId").val() == '2'){
		$("#datosPacienteId").hide();
		$("#datosEslabonId").show();
	}
}

function callAgendadoList() {
	if ($("#idNombreOSTextList").val() != ''){
	nombreOS = $("#idNombreOSTextList").val();				
	$("#idAutoCompleteLoad").show();
	$.ajax({
		type : "POST",
		url : "getOSPorNombreList",
		data : {
			"q" : nombreOS
		},
		success : function(msg) {
			$("#listAutoComplete").html(msg);
			$("#listAutoComplete").show();
			$("#idAutoCompleteManual").focus();
			$("#idAutoCompleteLoad").hide();
			
		}
	});
	}	
}

function callAgendadoEList() {
	
	nombreOS = $("#idNombreOSETextList").val();
	
	$("#idAutoCompleteLoad").show();
	$.ajax({
		type : "POST",
		url : "getOSPorNombreList",
		data : {
			"q" : nombreOS
		},
		success : function(msg) {
			$("#listAutoComplete").html(msg);
			$("#listAutoComplete").show();
			$("#idAutoCompleteManual").focus();
			$("#idAutoCompleteLoad").hide();
			
		}
	});
		
}


function callSelectList() {
	if ($("#tipoDestinatarioId").val() == '1'){
		$("#idNombreOSLabel").text($("#idAutoCompleteManual option:selected").html());
		$("#idObraSocialID").val($("#idAutoCompleteManual").val());
		$("#listAutoComplete").hide();	
		$("#idNombreOSTextList").val('');
		callArmarDestinatario();
				
	}	
	if ($("#tipoDestinatarioId").val() == '2'){
		$("#idNombreOSELabel").text($("#idAutoCompleteManual option:selected").html());
		$("#idObraSocialEID").val($("#idAutoCompleteManual").val());
		$("#listAutoComplete").hide();	
		$("#idNombreOSTextList").val('');
	}
}
	
	
	
	

function enviarPorRemito() {		
	if(validarDatos()){
		$("#validateTips").hide();
		$.blockUI({ 
			message:  '<h1>Se está enviando información a ANMAT, por favor aguarde...</h1>'		
	    }); 
		$.ajax({
				  type: "POST",
				  url: "enviarPorRemito",
				  data: $("#enviarPorRemitoForm").serialize(),
				  dataType: "script",
				  beforeSend: function(objeto){   				
				  },
				  success: function(msg){
					  var result = msg;
						if (result == "OK"){
							$("#idMsgSave").text(msg);
							$.unblockUI();
							$.blockUI({
			   				message : $('#resultCerrarTransacId'),
			   				opacity : .1,
			   				color : 'black',
			   				css : {
			   					top : ($(window).height() - 100) / 2 + 'px',
			   					left : ($(window).width() - 700) / 2 + 'px',
			   					width : '700px'
			   				}
			   				}); 	   			
						}else{
						 	$.unblockUI();
						 	$.blockUI({ 
								message:  result		
						    }); 	
						 	setTimeout($.unblockUI, 4000);
						}
	 			  },
				  error: function(objeto, quepaso, otroobj){
					alert("Comuniquese con el Administrador del Sistema : "+ quepaso);
				  }
			
				});

		}
}



function enviarPorRemitoGLN() {		
	
		$("#validateTips").hide();
		$.blockUI({ 
			message:  '<h1>Se está enviando información a ANMAT, por favor aguarde...</h1>'		
	    }); 
		$.ajax({
				  type: "POST",
				  url: "enviarPorRemito",
				  data: $("#enviarEslabonPorRemitoForm").serialize(),
				  dataType: "script",
				  beforeSend: function(objeto){   				
				  },
				  success: function(msg){
					  var result = msg;
						if (result == "OK"){
							$("#idMsgSave").text(msg);
							$.unblockUI();
							$.blockUI({
			   				message : $('#resultCerrarTransacId'),
			   				opacity : .1,
			   				color : 'black',
			   				css : {
			   					top : ($(window).height() - 100) / 2 + 'px',
			   					left : ($(window).width() - 700) / 2 + 'px',
			   					width : '700px'
			   				}
			   				}); 	   			
						}else{
						 	$.unblockUI();
						 	$.blockUI({ 
								message:  result		
						    }); 	
						 	setTimeout($.unblockUI, 4000);
						}
	 			  },
				  error: function(objeto, quepaso, otroobj){
					alert("Comuniquese con el Administrador del Sistema : "+ quepaso);
				  }
			
				});

		
}
function callArmarDestinatario(){
//alert($("#idObraSocialID").val());
if ($("#idObraSocialID").val() == '0'){
	$("#IdNombrePacienteDIV").show();
	$("#IdnroAfiliadoDIV").hide();	
	$("#IdNombrePacienteDIV").focus();
	
}else{
	$("#IdNombrePacienteDIV").hide();
	$("#IdnroAfiliadoDIV").show();		
	$("#IdnroAfiliadoDIV").focus();
	
}
}
function downloadRemito(){		
	document.getElementById("downloadRemitoForm").submit();
}

function loadFields(){
	if ($("#idObraSocialID").val() == '0'){
		$("#IdNombrePacienteDIV").show();
		$("#IdnroAfiliadoDIV").hide();	
		$("#nroAfiliadoID").val('');		
	}else{
		$("#IdNombrePacienteDIV").hide();
		$("#IdnroAfiliadoDIV").show();					
		$("#nombrePacienteID").val('');
	}
}



</script>