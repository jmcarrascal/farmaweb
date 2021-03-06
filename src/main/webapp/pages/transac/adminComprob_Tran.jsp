<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec"%><%@ taglib
	uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec"%>
<link href="<%=request.getContextPath()%>/css/styles.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/blockuiv1.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/popup.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/jquery.autocomplete.css"
	rel="stylesheet" type="text/css" />

<script src="<%=request.getContextPath()%>/js/jquery.blockUI.js"
	type="text/javascript"></script>

<script
	src="<%=request.getContextPath()%>/js/jquery.autocomplete.js"
	type="text/javascript"></script>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.bgiframe.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.ajaxQueue.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/thickbox-compressed.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.alphanumeric.js?n=2"></script>
<script>
function callSelectList() {
	$("#codArt").val($("#idAutoCompleteManual").val());
	$("#idClave").val($("#idAutoCompleteManual").val());
	$("#descripArtID").text($("#idAutoCompleteManual option:selected").html());
	$("#descripArtNameId").val($("#idAutoCompleteManual option:selected").html());
	loadPrecio($("#idAutoCompleteManual").val());
	$("#listAutoComplete").hide();
	$("#cantidad").focus();		
}
function loadArtPorCod(articuloClave) {
	if(articuloClave != ''){
		$("#idLoadArt").show();			
		$.ajax({
			type : "POST",
			url : "getArticuloPorClave_OP",
			data : {
				"stock.clave" : articuloClave
			},
			success : function(msg) {
				$("#idLoadArt").hide();
				if (msg != ''){
					$("#idClave").val(articuloClave);						
					$("#articuloAuto").val('');
					loadPrecio(articuloClave);
					$("#cantidad").focus();
				}					
				$("#descripArtID").text(msg);
				$("#descripArtNameId").val(msg);
				
			}
		});
	}else{
		$("#articuloAuto").focus();
		
	}
	$("#idEstadoPantalla").val('1');
}

function loadPrecio(articuloClave) {
	if (articuloClave != null && articuloClave != ''){
		$("#idLoadPrecio").show();
		var genteNr = $("#idAgendado").val();
		$.ajax({
			type : "POST",
			url : "getPrecioPorArtAgendado",
			data : {
				"gente.genteNr" : genteNr,
				"stock.clave" : articuloClave
			},
			success : function(msg) {
				$("#idLoadPrecio").hide();
				$("#precio").val(msg);
			}
		});
		callGetStock(articuloClave);
	}
}

function callStockList() {
	if ($("#articuloAuto").val() != ''){
	nombreStock = $("#articuloAuto").val();				
	$("#idAutoCompleteLoad").show();
	$.ajax({
		type : "POST",
		url : "getStockPorNombreList",
		data : {
			"q" : nombreStock
		},
		success : function(msg) {
			$("#listAutoComplete").html(msg);
			$("#listAutoComplete").show();
			$("#idAutoCompleteManual").focus();
			$("#idAutoCompleteLoad").hide();
						
		}
	});
	$("#idEstadoPantalla").val('1');
	}	
}

function loadPedidoVta() {						
	
	$("#idLoadPedidoVtaImg").show();
	$("div.uiComprob").css({position:'absolute', left: ($("#cantidad").position().left), top: ($("#cantidad").position().top + 20) });
	var nombreStock=$("#idClave").val();
	$.ajax({
		type : "POST",
		url : "getTablePedido",
		data : {
			"stock.clave" : nombreStock,
			"transac.tipoComprob.nr" : 8
		},
		success : function(msg) {
			$("#idTableComprobante").html(msg);
			$("#idTableComprobante").show();
			$("#idLoadPedidoVtaImg").hide();
		}
	});			
							
}

function loadPedidoCompra() {						
	$("#idLoadPedidoCompraImg").show();
	$("div.uiComprob").css({position:'absolute', left: ($("#cantidad").position().left), top: ($("#cantidad").position().top + 20) });
	var nombreStock=$("#idClave").val();
	$.ajax({
		type : "POST",
		url : "getTablePedido",
		data : {
			"stock.clave" : nombreStock,
			"transac.tipoComprob.nr" : 15
		},
		success : function(msg) {
			$("#idTableComprobante").html(msg);
			$("#idTableComprobante").show();
			$("#idLoadPedidoCompraImg").hide();
		}
	});		
							
}




function CloseUiTableBlue() {					
	$("#idTableComprobante").html('');
	$("#idTableComprobante").hide();
	}	

function callGetStock(articuloClave) {					
	$("#idLoadStock").show();
	$("#idShowStock").html("");
	$.ajax({
		type : "POST",
		url : "getFormulaStock",
		data : {
			"stock.clave" : articuloClave
		},
		success : function(msg) {
			$("#idShowStock").html(msg);
			$("#idLoadStock").hide();
		}
	});	
	}	



	function operaEvento(evento) {
		//alert('pantalla: ' + $("#idEstadoPantalla").val())
		
		
	
		if ($("#idEstadoPantalla").val() == 0) {
			if (evento.keyCode == 13) {
				$("#idEstadoPantalla").val("1");
				agregarItem();
			}
		}else{
			if ($("#idEstadoPantalla").val() == 1) {
				if (evento.keyCode == 13) {					
					var idFocus =($("*:focus").attr("id"));
					//alert('idFocus ' + idFocus );
					switch (idFocus) {
					case "codArt":						
						loadArtPorCod($("#codArt").val());	
						break;
					case "cantidad":
						//alert('entro a cantidad');
						if ($("#idRolHidden").val('5')){
							if (validarCampos()){
								$("#adminOrdenPedidoForm").submit();
							}								
						}else{
							$("#precio").focus();	
						}							
						break;
					case "precio":						
						$("#bonificacion").focus();	
						break;
					case "bonif1":						
						loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);
						$("#bonif2").focus();	
						break;
					case "bonif2":	
						loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);
						$("#bonif3").focus();	
						break;
					case "bonif3":		
						loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);
						$("#bonif4").focus();	
						break;										
					case "bonif4":
						if ($("#idCierreCarga").val() == '1'){
							if (validarCampos()){
								$("#adminOrdenPedidoForm").submit();
							}
						}else{
							$("#cadenaBonifId").hide();
							loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);
							$("#idCierreCarga").val('1');	
							break;						
						}
					case "articuloAuto":						
						$("div.ui").css({position:'absolute', left: ($("#articuloAuto").position().left), top: ($("#articuloAuto").position().top + 20) });
						
						callStockList();				
						break;
					case "idAutoCompleteManual":						
						$("#codArt").val($("#idAutoCompleteManual").val());
						$("#idClave").val($("#idAutoCompleteManual").val());
						$("#descripArtID").text($("#idAutoCompleteManual option:selected").html());
						$("#descripArtNameId").val($("#idAutoCompleteManual option:selected").html());
						loadPrecio($("#idAutoCompleteManual").val());
						$("#listAutoComplete").hide();
						$("#cantidad").focus();												
						break;
					default:
						if (validarCampos()){
							$("#idEstadoPantalla").val("0");
							$("#adminOrdenPedidoForm").submit();	
						}else{
							$("#idEstadoPantalla").val("0");
						}
						break;
					}
				}else{
					if (evento.keyCode == 27) {
						$.unblockUI();
						$("#idEstadoPantalla").val("0");
					}
				}
			}
		}

	}
	function operaEventoTest(evento) {
		alert(evento.keyCode);
	}

	function updateTips(t, tipcontainer) {
	    tipcontainer.text(t).effect("highlight",{},1500);
	}

	
	function checkMayorCero(o, n, tipcontainer) {	    
		var cantV = o.val(); 
		if (cantV == "") {
			cantV = 0;
		}
			if (cantV > 0) {
		        return true;
		    } else {
	    		o.focus();
	        	o.addClass('ui-state-error');
		        updateTips("El campo " + n + " debe ser Numerico y Mayor a 0!", tipcontainer);
		        return false;
		    }
	}
	function checkMenorCien(o, n, tipcontainer) {	    
		var cantV = o.val(); 
		if (cantV == "") {
			cantV = 0;
		}
			if (cantV <= 100 && cantV >= 0) {
		        return true;
		    } else {
	    		o.focus();
	        	o.addClass('ui-state-error');
		        updateTips("El campo " + n + " debe ser positivo y menor igual a 100!", tipcontainer);
		        return false;
		    }
	}
	
	function checkNotEmpty(o, n, tipcontainer) {	    
		if (o.val() != "") {
	        return true;
	    } else {
    		o.focus();
        	o.addClass('ui-state-error');
	        updateTips("El campo " + n + " es obligatorio!", tipcontainer);
	        return false;
	    }
	}

	function validarCampos() {
			var allFields = $([]).add($("#idClave").add($("#cantidad")).add($("#bonificacion")));
			var bValid = true;
			allFields.removeClass('ui-state-error');
			bValid = bValid && checkNotEmpty($("#idClave"), "Articulo", $("#validateTips"));
			bValid = bValid && checkMayorCero($("#cantidad"), "Cantidad", $("#validateTips"));
			bValid = bValid && checkMenorCien($("#bonificacion"), "Bonificacion", $("#validateTips"));
			return bValid;
	}
	
	function agregarItem() {
		//alert('agregoItem');
		$("#articuloAuto").val("");
		$("#cantidad").val("");
		$("#precio").val("");
		$("#codArt").val("");
		$("#bonif1").val("");
		$("#bonif2").val("");
		$("#bonif3").val("");
		$("#bonif4").val("");
		$("#idClave").val("");
		$("#idShowStock").html("");
		$("#descripArtID").html("");
		
		$("#idTituloItem").text('Agregar un nuevo Item');
		$("#idItemNr").val('');
		$("#articuloAuto").focus();
		
		//updateTips('',$('#validateTips'));
		window.scrollTo(0, 0);
		$.blockUI({
			message : $('#agregarItemForm'),
			opacity : .1,
			color : 'black',
			css : {
				top : ($(window).height() - 100) / 2 + 'px',
				left : ($(window).width() - 720) / 2 + 'px',
				width : '720px'
			}
		});
	}

	function loadBonifCadena(bonif1, bonif2, bonif3, bonif4, ultimo) {
		$("#loadBonificacion").show();
		$.ajax({
			type : "POST",
			url : "getBonifPorCadena",
			data : {
				"bonif1" : bonif1,
				"bonif2" : bonif2,
				"bonif3" : bonif3,
				"bonif4" : bonif4				
			},
			success : function(msg) {
				$("#loadBonificacion").hide();
				$("#bonificacion").val(msg);
				if (ultimo){
					$("#bonificacion").focus();
				}
			}
		});
		if (ultimo){
			$("#bonificacion").focus();
		}
		
	}
	$(document).ready(function() {
		
		
		if ($("#idRolHidden").val() == 5){			
			$("#precio").attr("disabled","disabled");	
			$("#bonificacion").attr("disabled","disabled");
			$("#addCadena").hide();
			$("#deleteCadena").hide();
			document.getElementById("precio").style.background="#C0C0A8";
			document.getElementById("bonificacion").style.background="#C0C0A8";
		}else{
			$("#precio").attr("disabled","");	
			$("#bonificacion").attr("disabled","");
			
		}
		
		$("#bonificacion").numeric();
		$("#precio").numeric();
		$("#cantidad").numeric();
		$("#codArt").blur(function() {	  
			loadArtPorCod($("#codArt").val());	  
		});
		$("#bonif1").blur(function() {	  
			loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);	  
		});
		$("#bonif2").blur(function() {	  
			loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);	  
		});
		$("#bonif3").blur(function() {	  
			loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), false);	  
		});
		$("#bonif4").blur(function() {	  
			
			$("#cadenaBonifId").hide();
			
			loadBonifCadena($("#bonif1").val(), $("#bonif2").val(), $("#bonif3").val(), $("#bonif4").val(), true);
			//Cerrar Texto de cadena
						
			
		});

		$(document).keypress(operaEvento);
		$("#agregarItem").focus();
		
		$("#idFinTransacButton").click(function() {
			$("#idAgendadoFinCombrobTran").val($("#idAgendado").val());
			if ($("#idCountItemsHidden").val() == "0"){
				alert("Debe ingresar al menos un item");
			}else{
				$("#finComprobForm").submit();	
			}
						
		});


		$("#agregarItem").click(function() {
			agregarItem();
		});
		
		function saveComprobante() {		
			$.blockUI({         	                       	               
	              message:  "<img src=\"./images/icons/loadingGrayCircle.gif\">"
	    	});			
			$.ajax({
 	   			  type: "POST",
 	   			  url: "saveTransac",
 	   			  data: $("#cerrarTransacForm").serialize(),
 	   			  dataType: "script",
 	   			  beforeSend: function(objeto){   				
 	   			  },
 	   			  success: function(msg){
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
  	   			  },
 	   			  error: function(objeto, quepaso, otroobj){
 	   				alert("Comuniquese con el Administrador del Sistema : "+ quepaso);
 	   			  }
 	   		
 	   			});
		}

		function format(mail) {
			return mail.clave;
		}

		$("#idBuscarPorCodigoImage").click(function() {
			loadArtPorCod($("#codArt").val());	
		});
		
		$("#idBuscarPorNombreImage").click(function() {
			$("div.ui").css({position:'absolute', left: ($("#articuloAuto").position().left), top: ($("#articuloAuto").position().top + 20) });			
			callStockList();
			
		});

		$("#addCadena").click(function() {
			$("#cadenaBonifId").show();
			$("#bonif1").focus();
		});

		$("#guardarItem").click(function() {
			if (validarCampos()){
			$("#adminOrdenPedidoForm").submit();
			}
		});

		$("#idCancelarItem").click(function() {
			$.unblockUI();
			$("#idEstadoPantalla").val("0");
		});
		
		$("#deleteCadena").click(function() {
			$("#bonificacion").focus();
			$("#cadenaBonifId").hide();
		});
		
		$("#bonificacion").val($("#idBonif").val())

	});
	
	function editItem(itemNr, bonif, bonif1, bonif2, bonif3, bonif4, descrip, clave, cant1, precio) {
		//Cargar los valores en el formulario
		$("#idItemNr").val(itemNr);
		$("#bonificacion").val(bonif);
		$("#bonif1").val(bonif1);
		$("#bonif2").val(bonif2);
		$("#bonif3").val(bonif3);
		$("#bonif4").val(bonif4);
		$("#descripArtNameId").val(descrip);
		$("#descripArtID").text(descrip);
		$("#cantidad").val(cant1);
		$("#precio").val(precio);
		$("#idClave").val(clave);
		$("#codArt").val(clave);
		$("#cantidad").focus();
		
		
		
		$("#idTituloItem").text('Editando el item N�: ' + itemNr);
		
		$.blockUI({
			message : $('#agregarItemForm'),
			opacity : .1,
			color : 'black',
			css : {
				top : ($(window).height() - 100) / 2 + 'px',
				left : ($(window).width() - 700) / 2 + 'px',
				width : '700px'
			}
		});		
	}

	function removeItems(itemNr) {
		//alert(itemNr)
		document.getElementById("idItem1").value = itemNr;
		document.getElementById("removeItemForm").submit();

	}
</script>

<s:form action="finComprob_Tran" id="finComprobForm">	
	<s:hidden key="gente.genteNr" id="idAgendadoFinCombrobTran" />
	<s:hidden key="countItems" id="idCountItemsHidden"/>
	<s:hidden key="gente.idRol" id="idRolHidden"/>
</s:form>

<s:form action="removeItem_OP" id="removeItemForm">
	<s:hidden key="items.id.itemNr" id="idItem1" />
</s:form>



<fieldset class="defaultFieldset"><legend><b>Gesti�n
de Comprobante -  Ingreso de Items del Comprobante</b></legend> 

					<div align="right"><img	src="<%=request.getContextPath()%>/images/general/Paso2.png"  alt="Paso2" title="Paso2" border="0"></img></div>
<input type="hidden"
	id="idEstadoPantalla" value="0" ;/>



<div class="space"></div>
<s:label id="idRazonSocial" name="gente.descripC" cssClass="entidadGrande"/>
<div class="separator"></div>
<label class="label_33 field">Tipo de Comprobante:</label> <b><s:label
	name="transac.tipoComprob.descripcion" /></b>

<div class="space"></div>
<ec:table tableId="notReg" items="itemsList" var="items" locale="es_ES"
	action="listItems_OP" imagePath="images/table/*.gif" width="100%"
	rowsDisplayed="100" showPagination="false" showStatusBar="false"
	showTitle="false" showTooltips="false" showExports="false">
	<ec:row>
		<ec:column width="40px" title=" " filterable="false" sortable="false"
			alias="read">
			<a href="#"> <img src="images/general/edit.png" 
	          	alt="Editar Item" title=" Editar Item " 
	          	onclick="editItem('${items.id.itemNr}', '${items.bonif}','${items.bonif1}','${items.bonif2}','${items.bonif3}','${items.bonif4}','${items.descrip}','${items.clave}','${items.cant1}','${items.precio}');" border="0" ></img>
			</a>				
			<a href="#"> <img src="images/general/remove.png"
				alt=" Eliminar Item " title=" Eliminar Item"
				onclick="removeItems('${items.id.itemNr}')" border="0"></img> </a>
		</ec:column>
		<ec:column width="80px" property="articulo" title="Clave"
			sortable="true" sortable="false" filterable="false" />
		<ec:column width="40px" property="id.itemNr" title="Nr" sortable="false"
			filterable="false" />
		<ec:column width="auto" property="descrip" title="Articulo"
			sortable="true" sortable="false" filterable="false" />
		<ec:column width="60" property="cant1" title="Cantidad"
			sortable="false" filterable="false" />
		<ec:column width="60" property="precio" title="Precio Un"
			sortable="false" filterable="false" />
		<ec:column width="60" property="bonif" title="Bonificacion"
			sortable="false" filterable="false" />
		<ec:column width="60" property="totalItem" title="SubTotal"
			sortable="false" filterable="false" />
		<ec:column width="60" property="porcentajeImpuesto" title="IVA"
			sortable="false" filterable="false" />
	</ec:row>
</ec:table>
<div class="space"></div>
<div align="right"><label class="label_33 field">SubTotal:</label>
<b><s:label id="transac.netoGrav" name="transac.netoGrav" /></b></div>
<div align="right"><label class="label_33 field">Impuestos:</label>
<b><s:label id="transac.iva" name="transac.iva" /></b></div>
<div align="right"><label class="label_33 field">Total:</label>
<b><s:label id="transac.iva" name="transac.total" /></b></div>

<div align="center">
<div id="agregarItem" style="display: inline;"><img
	src="images/general/icon_nuevo_item.png" alt="Agregar Item" border="0">
</div>
<div id="idVolverImage" style="display: inline;" > 
	<a href="menuAgendado_Tran" onclick="this.blur();">
		<img src="images/general/icon_volver.png" alt="Agregar Item" border="0" >
	</a>
</div>

<div id="idFinTransacButton" style="display: inline;"><img
	src="images/general/icon_continuar.png" alt="Agregar Item" border="0">
</div>

</div>
</center>
</fieldset>


<div style="display: none" align="center" id="resultCerrarTransacId" >
		<h1 id="idMsgSave" >Transacci�n</h1>		
		<div id="buttonDown" >
				<a href="preparedFindAgendadoPorNombre_OP" onclick="this.blur();">
					<img src="images/general/icon_nuevo_compro.png" alt="Nueva Solicitud" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
				<a href="home" onclick="this.blur();">
					<img src="images/general/icon_ir_menu.png" alt="Ir a Pendientes" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
		</div>						
</div>



<div style="display: none" align="left" id="agregarItemForm">
<br>
<fieldset class="defaultFieldset"><legend><b id = "idTituloItem">Agregar un nuevo Item</b></legend>
<p id="validateTips"></p>
<s:form	id="adminOrdenPedidoForm" action="addItem_OP" theme="simple" cssClass="inline" method="post"  autocomplete="off" >

	<s:hidden key="gente.genteNr" id="idAgendado" />
	<s:hidden key="gente.bonifStd" id="idBonif" />
	<s:hidden key="items.id.itemNr" id="idItemNr" />
	<s:hidden key="items.articulo" id="idClave" />
	<s:hidden key="items.descrip" id="descripArtNameId" />
	<s:hidden id="idCierreCarga" />
	<table>
		<tr>
			<td><label for="articuloAuto1">Cod. Art:</label></td>
			<td><s:textfield id="codArt" name="items.clave"
				size="20" maxlength="20" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
			<td style="display: none" id="idLoadArt"><img alt="" src="images/general/loading1.gif"></td>
			<td style="display: inline" id="idBuscarPorCodigoImage"><img alt=""
					src="images/general/view.gif"></td>
				

			<td><label for="articuloAuto1">Articulo:</label></td>
			<td><s:textfield id="articuloAuto" 
				size="60" maxlength="60" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
				<div id="listAutoComplete" class="ui" style="display: none;"/>
			<td style="display: none" id="idAutoCompleteLoad"><img alt=""
				src="images/general/loading1.gif"></td>
			<td style="display: inline" id="idBuscarPorNombreImage"><img alt=""
					src="images/general/view.gif"></td>	

		</tr>
		</table>
		<table>		
		<tr>
			<td><b for="descripArt" id= "descripArtID"/></td>
		</tr>
		</table>
		<table>
		<tr>
			<td><label for="cantidad1">Cantidad:</label></td>
			<td><s:textfield id="cantidad" name="items.cant1" size="15"
				maxlength="15" cssErrorClass="error" 
 				cssClass="ui-widget-content ui-corner-all" /></td>
 				<td style="display: none" id="idLoadStock"><img alt=""
				src="images/general/loading1.gif"></td>
 				<td><div id = "idShowStock"/></td>
 				<div id="idTableComprobante" class="uiComprob" style="display: none;"/>
		</tr>
		<tr>
			<td><label for="precio1">Precio:</label></td>
			<td><s:textfield id="precio" name="items.precio" size="15"
				maxlength="15" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" disabled="true"/></td>
			<td style="display: none" id="idLoadPrecio"><img alt=""
				src="images/general/loading1.gif"></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><label for="precio1">Bonificaci�n:</label></td>
			<td><s:textfield id="bonificacion" name="items.bonif" size="8"
				maxlength="15" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" />
				<td style="display: none" id="loadBonificacion"><img alt=""
				src="images/general/loading1.gif"></td>
				<td id="addCadena">
				<img title="Mostrar Cadena de Bonificaci�n" 	src="images/general/add.png"></td>
				<td id="deleteCadena">
				<img alt=""	src="images/general/delete.png" title="Ocultar Cadena de Bonificaci�n"></td>
		</tr>
	</table>
		
	<div style="display: none" align="left" id="cadenaBonifId">
	<fieldset class="defaultFieldset"><legend><b>Cadena de Bonificaciones</b></legend>
	<table>
		<tr>
			<td><label for="precio1">Bonif1:</label></td>
			<td><s:textfield id="bonif1" name="items.bonif1" size="5"
				maxlength="3" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
			<td><label for="precio1">Bonif2:</label></td>
			<td><s:textfield id="bonif2" name="items.bonif2" size="5"
				maxlength="3" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
			<td><label for="precio1">Bonif3:</label></td>
			<td><s:textfield id="bonif3" name="items.bonif3" size="5"
				maxlength="3" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
			<td><label for="precio1">Bonif4:</label></td>
			<td><s:textfield id="bonif4" name="items.bonif4" size="5"
				maxlength="3" cssErrorClass="error"
				cssClass="ui-widget-content ui-corner-all" /></td>
		</tr>
	</table>
	</fieldset>
	</div>
	
	
	<div align="center">
		<div id="guardarItem" style="display: inline;"><img
			src="images/general/icon_guardar.png" alt="Guardar Item" border="0" id = "guardarItemImg">
		</div>
		<div id="idCancelarItem" style="display: inline;"><img
			src="images/general/icon_cancelar.png" alt="Cancelar Item" border="0">
		</div>
	</div>
</div>

</s:form>
</fieldset>
</div>


