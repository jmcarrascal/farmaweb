<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec" %>
 
<link href="<%=request.getContextPath()%>/css/hints.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />

<div align="right"><a href="<%=request.getContextPath()%>/home"> <img
	src="<%=request.getContextPath()%>/images/general/homev1.png" width="50px" alt="Inicio" title="Inicio"
	border="0"></img> </a>
	</div>
	<s:form id="showRemitoFarmaForm" action="showRemitoFarma" theme="simple" cssClass="inline" method="post" >		
			<s:hidden id = "nrStrId" key = "nrStr"/>
			<fieldset class="defaultFieldset">
				<legend><b>Busqueda de Remito Farmacia</b></legend>
				<table>
				<tr>
					<td><label for="articuloAuto1">Ingrese el número de Remito de la Farmacia:</label></td>
					<td><s:textfield id="nroRemito_ID" 
						size="20" maxlength="20" cssErrorClass="error"
						cssClass="ui-widget-content ui-corner-all" /></td>
					<td style="display: none" id="idLoadFindRemito"><img alt=""
						src="images/general/loading1.gif"></td>
					<td style="display: inline" id="idBuscarPorRemitoFarma"><img alt=""
							src="images/general/view.gif"></td>
				</tr>
				</table>
				<br>				
    		</fieldset>
</s:form>

<div class="main">			
		   	<fieldset class="defaultFieldset">
    			<legend><b>Enviar por Remito(SK) - Medicamentos a Enviar</b></legend>    							
					<div class = "separator"></div>
					<ec:table					
						tableId="notReg" 
				    	items="trazabiFarmaList"
						var = "trazabi"
						locale="es_ES"
						action="showRemitoFarma"
						imagePath="images/table/*.gif"
						width="100%"
						rowsDisplayed="100"
						form="showRemitoFarmaForm" >						
						
						<ec:row>
								<ec:column width="40px" property="transacNr" title="Nr" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.nr}</span>
								</ec:column>
								<ec:column width="40px" property="stock.descripcion" title="Articulo" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.stock.descripcion}</span>
								</ec:column>
								<ec:column width="40px" property="nrRemitoPropio" title="Remito" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.nrRemitoPropio}</span>
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
								<ec:column width="40px" property="respuestaIngreso" title="Ingreso Nr" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.respuestaIngreso}</span>
								</ec:column>
								<ec:column width="40px" property="errores" title="Anmat Ingreso" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.errores}</span>
								</ec:column>
								<ec:column width="40px" property="respuestaSalida" title="Egreso Nr" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.respuestaSalida}</span>
								</ec:column>																					
								<ec:column width="40px" property="erroresSal" title="Anmat Egreso" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.erroresSal}</span>
								</ec:column>							
								
						</ec:row>
					</ec:table>
				<br>	
				<a onclick="downloadRemito();">
					<img src="images/general/icon_download_remito.png" alt="Descargar Remito" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
				
			</fieldset>		
</div>		


<s:form action="downloadRemitoFarma" id="downloadRemitoForm" target="_blank">
	<s:hidden key="nrStrDownId" name="nrStr"/>	
</s:form>

<script type="text/javascript">

function validarDatos() {
	var allFields = $([]).add($("#nroRemitoID").add($("#nroAfiliadoID")));
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

function downloadRemito(){		
	document.getElementById("downloadRemitoForm").submit();
}

function updateTips(t, tipcontainer) {
    tipcontainer.text(t).effect("highlight",{},1500);
}




$(document).ready(function() {
	$("#nroRemitoID").val('');
	//$("#nroRemito_ID").mask("9999-99999999");
	
	$("#idBuscarPorRemitoFarma").click(function() {
		$("#idLoadFindRemito").show();
		$("#nrStrId").val($("#nroRemito_ID").val());
		$("#nrStrDownId").val($("#nroRemito_ID").val());
		$("#showRemitoFarmaForm").submit();
	});
	
});

</script>