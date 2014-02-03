<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec" %>
 
<link href="<%=request.getContextPath()%>/css/hints.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />






<div class="main">
<div align="right"><a href="javascript:history.back(-1)"> <img
	src="<%=request.getContextPath()%>/images/general/back.png" width="50px" alt="Volver" title="Volver"
	 border="0"></img> </a> <a href="<%=request.getContextPath()%>/home"> <img
	src="<%=request.getContextPath()%>/images/general/homev1.png" width="50px" alt="Inicio" title="Inicio"
	border="0"></img> </a>
	</div>
			
		   	<fieldset class="defaultFieldset">
    			<legend><b>Recepcionar por Remito(SK) - Medicamentos a Recepcionar</b></legend>
    			
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
				    	items="trazabiList"
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
								<ec:column width="40px" property="glnorigenSal" title="GLN Origen" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.glnorigenSal}</span>
								</ec:column>

								<ec:column width="40px" property="glndestinoSal" title="GLN Destino" sortable="false" filterable="false">
									<span style="white-space:nowrap;" >${trazabi.glndestinoSal}</span>
								</ec:column>

								
								
						</ec:row>
					</ec:table>
					<div class="space"></div>
				<div style="display: inline;" > 
					<img src="<%=request.getContextPath()%>/images/general/icon_informar_anmat.png" alt="Informar Ingreso a ANMAT" title="Informar Ingreso a ANMAT" onclick="recepcionarPorRemito();"></img>
				</div>
				
			</fieldset>		
			
</div>		

<s:form action="recepcionarPorRemito" id="recepcionarPorRemitoForm">
	<s:hidden key="transac.transacNr" name="transac.transacNr"/>	
</s:form>

<s:form action="preparedFindRemitosPendientesPorTransac" id="preparedFindRemitosPendientesPorTransacForm">
</s:form>


<script type="text/javascript">


function viewMedicamentos(transacNr){	
	document.getElementById("transacNr1").value=transacNr;
	document.getElementById("showMedicamentosForm").submit();
}

function recepcionarPorRemito(){		
	$.blockUI({ 
		message:  '<h1>Se está enviando información a ANMAT, por favor aguarde...</h1>'		
    }); 
	
		$("#validateTips").hide();
		$.blockUI({ 
			message:  '<h1>Se está enviando información a ANMAT, por favor aguarde...</h1>'		
	    }); 
		$.ajax({
				  type: "POST",
				  url: "recepcionarPorRemito",
				  data: $("#recepcionarPorRemitoForm").serialize(),
				  dataType: "script",
				  beforeSend: function(objeto){   				
				  },
				  success: function(msg){
						var result = msg;
						if (result == "OK"){
							$.blockUI({ 
								message:  result		
						    }); 	
							setTimeout(function() { 
					            $.unblockUI({ 
					                onUnblock: function(){ $('#preparedFindRemitosPendientesPorTransacForm').submit(); } 
					            }); 
					        }, 500);
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

</script>