<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec" %>
 
<link href="<%=request.getContextPath()%>/css/hints.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />






<div class="main">
<div align="right"><a href="preparedListRemitosEnviados"> <img
	src="<%=request.getContextPath()%>/images/general/back.png" width="50px" alt="Volver" title="Volver"
	 border="0"></img> </a> <a href="<%=request.getContextPath()%>/home"> <img
	src="<%=request.getContextPath()%>/images/general/homev1.png" width="50px" alt="Inicio" title="Inicio"
	border="0"></img> </a>
	</div>
			
		   	<fieldset class="defaultFieldset">
    			<legend><b>Remito Enviados</b></legend>
    			
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
					
				
			</fieldset>		
			
</div>		


<s:form action="downloadRemito" id="downloadRemitoForm" target="_blank">
	<s:hidden key="transac.transacNr" name="transac.transacNr"/>	
</s:form>

<script type="text/javascript">


</script>