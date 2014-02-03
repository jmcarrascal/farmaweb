<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec"%><%@ taglib
	uri="/WEB-INF/tlds/extremecomponents.tld" prefix="ec"%>
<link href="<%=request.getContextPath()%>/css/styles.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/blockuiv1.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/popup.css"
	rel="stylesheet" type="text/css" />

<link href="<%=request.getContextPath()%>/css/hints.css"
	rel="stylesheet" type="text/css" />

<script src="<%=request.getContextPath()%>/js/jquery.blockUI.js"
	type="text/javascript"></script>




<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.alphanumeric.js?n=2"></script>
<script>
$(document).ready(function() {
	
	jQuery(function($){
		   $.datepicker.regional['es'] = {
		      closeText: 'Cerrar',
		      prevText: '<Ant',
		      nextText: 'Sig>',
		      currentText: 'Hoy',
		      monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
		      monthNamesShort: ['Ene','Feb','Mar','Abr', 'May','Jun','Jul','Ago','Sep', 'Oct','Nov','Dic'],
		      dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
		      dayNamesShort: ['Dom','Lun','Mar','Mié','Juv','Vie','Sáb'],
		      dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','Sá'],
		      weekHeader: 'Sm',
		      dateFormat: 'dd/mm/yy',
		      firstDay: 1,
		      isRTL: false,
		      showMonthAfterYear: false,
		      yearSuffix: ''};
		   $.datepicker.setDefaults($.datepicker.regional['es']);
		});


	
$("#idFechaEntregaDate").mask("99/99/9999");
$("#idFechaEntregaDate").focus();

$("#cerrarTransac").click(function() {
	saveComprobante();
});

function saveComprobante() {		
	$.blockUI({         	                       	               
          message:  "<img src=\"./images/icons/loadingGrayBar.gif\">"
	});
	$.ajax({
			  type: "POST",
			  url: "saveTransac",
			  data: $("#finComprobForm").serialize(),
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
});
</script>


<fieldset class="defaultFieldset"><legend><b>Gestión
de Comprobante - Finalizar Transacción</b></legend> 

<div align="right"><img	src="<%=request.getContextPath()%>/images/general/Paso3.png"  alt="Paso3" title="Paso3" border="0"></img></div>


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
		<ec:column width="60" property="totalItem" title="Precio Item"
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
<s:form action="finComprob_Tran" id="finComprobForm">
<s:hidden key="gente.genteNr" id="idAgendadoFinCombrobHidden" />
<table>
<tr>
<td>
<sj:datepicker  label="Fecha de Entrega" id="idFechaEntregaDate" name="fechaEntrega" displayFormat="dd/mm/yy" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all" buttonImageOnly="true" changeMonth="true" changeYear="true" readonly="false" zindex="2002" cssStyle="display:inline" showOn="button"/>
</td>
</tr>
<tr>
<td>
<s:textarea label="Observaciones" cols="50" rows="3" name="transac.observaciones"/>
</td>
</tr>
</table>
</s:form>
<div align="center">
<div id="idVolverImage" style="display: inline;" > 
	<a href="javascript:history.back(-1)"> <img
	src="<%=request.getContextPath()%>/images/general/icon_volver.png" alt="Volver" title="Volver"
	></img> </a>
</div>


<div id="idCancelar" style="display: inline;" > 
	<a href="menuAgendado_Tran"> <img
	src="<%=request.getContextPath()%>/images/general/icon_cancelar.png" alt="Cancelar" title="Cancelar"
	 border="0"></img> </a>
</div>

<div id="cerrarTransac" style="display: inline;"><img
	src="images/general/icon_grabaTransac.png" alt="Guardar" border="0">
</div>

</div>

<div style="display: none" align="center" id="resultCerrarTransacId" >
		<h1 id="idMsgSave" >Transacción</h1>		
		<div id="buttonDown" >
				<a href="menuAgendado_Tran" onclick="this.blur();">
					<img src="images/general/icon_volver.png" alt="Volver al Agendado" border="0" style="float:center;margin-top:0px;"></img>
				</a>						
		</div>						
</div>
</center>
</fieldset>




