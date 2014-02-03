<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec" %>
 
<link href="<%=request.getContextPath()%>/css/hints.css" rel="stylesheet" type="text/css" />


<div class="main">
	<jsp:include page="add_on/botones_basicos.jsp"/>
	
		<div class="space"></div>
		
		<fieldset class="defaultFieldset" >
			<legend><b>Descripción del Articulo</b></legend>

			<s:form action="downloadFactura" id="listFacturaForm" theme="simple" cssClass="inline" method="post" >						
				<s:hidden key = "stock.clave" id = "idClaveHidden"/>
 				<table> 				
 					<tr>
	 					<td>
	 					
	 					</td>
						
 					</tr>
				</table>
				<table>
					
 				<tr>
					<td>
	 					<label class="label_33 field">Clave N:</label>	 	 						 									
	 					<td align="left"><b><s:label id="idClave" name="stock.clave"/></b>					
		 			</td>
		 			<td>
	 					<label class="label_33 field">Nombre:</label>	 				
						<td align="left"><b><s:label id="idDescrip" name="stock.descripcion" /></b>					
					</td>				
				</tr>
 				<tr>
					<td>
	 					<label class="label_33 field">Familia:</label>	 				
	 					<td align="left"><b><s:label id="idFlia" name="stock.famStr" /></b>					
		 			</td>
		 			<td>
	 					<label class="label_33 field">Sub Familia:</label>	 				
						<td align="left"><b><s:label id="idSubFlia" name="stock.subFamStr" /></b>						
					</td>					
				</tr>
				</table>
			
			<div class="panel_100 tab">
	    	<div class="space"></div>
           	<fieldset class="defaultFieldset">
    			<legend id="idCuadroLeg"><b>Existencias</b></legend>    			
				<s:actionerror/>	
					<ec:table											
						tableId="notReg" 
				    	items="exiArtList"
						var = "exiArt"
						locale="es_ES"
						action="showArticulo"
						imagePath="images/table/*.gif"
						width="100%"
						rowsDisplayed="100" 
						>
						<ec:row>
								<ec:column width="40px" property="id.existencias.descrip" title="Existencia" sortable="false" filterable="false"/>
								<ec:column width="60px" property="cantidad1" title="Cantidad 1" sortable="false" filterable="false">
									<span style="white-space:nowrap;" class="tableRow${exiArt.signo}">${exiArt.cantidad1}</span>
								</ec:column>																																						
						</ec:row>
					</ec:table>
				<div class="space" id = "idFinTabla"></div> 
			</fieldset>		
		</div>	
		<table>
			<tr>
				<td style="display: none" id="idLoadStock"><img alt="" src="images/general/loading1.gif"></td>
	 			<td><div id = "idShowStock"/></td>
 			</tr>
 		</table>
 		<div id="idTableComprobante" class="uiComprob" style="display: none;"/>
		</s:form>
	
			
			<div class="space"></div>
		</fieldset>

		<div class="space"></div>
	</div>


<script language="javascript">

function CloseUiTableBlue() {					
	$("#idTableComprobante").html('');
	$("#idTableComprobante").hide();
	}	

function submitForm(formId) { 
	document.getElementById(formId).submit();
}

function loadPedidoVta() {						
	
	$("#idLoadPedidoVtaImg").show();
	$("div.uiComprob").css({position:'absolute', left: ($("#idFinTabla").position().left), top: ($("#idFinTabla").position().top + 40) });
	var nombreStock=$("#idClaveHidden").val();
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
	$("div.uiComprob").css({position:'absolute', left: ($("#idFinTabla").position().left), top: ($("#idFinTabla").position().top + 40) });
	var nombreStock=$("#idClaveHidden").val();
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
$(document).ready(function() {	
	callGetStock($("#idClave").text());
	
});
</script> 

