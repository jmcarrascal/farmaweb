<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec"%>

<link href="<%=request.getContextPath()%>/css/hints.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/styles.css"
	rel="stylesheet" type="text/css" />



<script src="<%=request.getContextPath()%>/js/jquery-1.11.0.min.js"
	type="text/javascript"></script>






<div class="main">

	<div id="datosPacienteId">
		<fieldset class="defaultFieldset">
			<legend>
				<b>Devolucion de medicamentos - Buscar Medicamento en estado
					"Recepcionado" por la farmacia</b>
			</legend>
			<s:form id="findMedicamentoRecepcionadoForm"
				action="findMedicamentoRecepcionado" theme="simple"
				cssClass="inline" method="post">
				<table>
					<tr>
						<td><label for="ob"><b>GTIN:</b></label>
						<td>
						<td><s:textfield id="gtinID" name="trazabiFarma.gtin"
								size="14" maxlength="14" cssErrorClass="error"
								cssClass="ui-widget-content ui-corner-all"
								 /></td>
					</tr>
				</table>
				<table>
					<tr>
						<td><label for="ob"><b>Serie:</b></label>
						<td>
						<td><s:textfield id="serieID" name="trazabiFarma.serieGtin"
								size="25" maxlength="25" cssErrorClass="error"
								cssClass="ui-widget-content ui-corner-all" /></td>
					</tr>
				</table>


			</s:form>
			<div style="display: inline;">
				<img
					src="<%=request.getContextPath()%>/images/general/icon_buscar.png"
					alt="Informar Ingreso a ANMAT" title="Informar Ingreso a ANMAT"
					onclick="buscarMedicamento();"></img>
			</div>
			<div class="separator"></div>
			<div class="space"></div>
			<s:label id="resultCerrarTransacId" />
			<div class="separator"></div>
			<div id="idSelectEvento" style="display: none">
			<s:select label="Seleccione en tipo de Devolución "
								headerKey="-1" headerValue="Seleccione..."
								list="#{'119':'DEVOLUCION POR PROHIBICION A DROGUERIA' 
								, '114': 'DEVOLUCION POR VENCIMIENTO A DROGUERIA', '105':'DEVOLUCION A DROGUERIA'}"
								name="tipoEvento" value="-1" onchange="setDisplay();"
								id="tipoEventoId" />
			</div>
			<div class="separator"></div>
			
			<div style="display: none;" id="idDevolucionBt">
				<img
					src="<%=request.getContextPath()%>/images/general/icon_rechazar.png"
					alt="Devolucion a Drogueria" title="Devolucion a Drogueria"
					onclick="devolucion();"></img>
				
						
				
			</div>
			
		</fieldset>
	</div>

</div>


<s:form id="devolucionMedicamentoForm"
				action="devolucionMedicamento" theme="simple"
				cssClass="inline" method="post">
	<s:hidden name="trazabiFarma.gtin" id = "gtinIdForm"/>
	<s:hidden name="trazabiFarma.serieGtin" id = "serieIdForm"/>
	<s:hidden name="trazabiFarma.codEventoIng" id = "eventoIdForm"/>
				
</s:form>




<script type="text/javascript">

	function setDisplay(){
		$("#eventoIdForm").val($('#tipoEventoId').val());
	}
	
	function buscarMedicamento() {
		$
				.ajax({
					type : "POST",
					url : "findMedicamentoRecepcionado",
					data : $("#findMedicamentoRecepcionadoForm").serialize(),
					success : function(msg) {
						var obj = $.parseJSON(msg);
						if (obj.gtin == '') {
							$("#resultCerrarTransacId").show();
							$("#resultCerrarTransacId")
									.html(
											"No se encontraron medicamentos con la información ingresada");
							$("#idDevolucionBt").hide();
							$("#idSelectEvento").hide();
						} else {

							$("#resultCerrarTransacId")
									.html(
											"Medicamento: "
													+ obj.stock.CGLIB$CALLBACK_0.target.descripcion);
							$("#gtinIdForm").val(obj.gtin);
							$("#serieIdForm").val(obj.serieGtin);							
							$("#idDevolucionBt").show();
							$("#idSelectEvento").show();
							

						}
						//alert(obj.gtin);
					},
					error : function(objeto, quepaso, otroobj) {
						alert("Comuniquese con el Administrador del Sistema : "
								+ quepaso);
					}
				});
	}

	function devolucion() {
		$
				.ajax({
					type : "POST",
					url : "devolucionMedicamento",
					data : $("#devolucionMedicamentoForm").serialize(),
					success : function(msg) {
						alert(msg);

						//alert(obj.gtin);
					},
					error : function(objeto, quepaso, otroobj) {
						alert("Comuniquese con el Administrador del Sistema : "
								+ quepaso);
					}
				});
	}
	
	
</script>