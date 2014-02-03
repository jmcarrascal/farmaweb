<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/popup.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/js/popup.js" type="text/javascript"></script>

<script src="<%=request.getContextPath()%>/js/jquery.autocomplete.js" type="text/javascript"></script>
 
<script>
$(document).ready(function(){
	$("#consultar").click(function (){
		document.getElementById('findArticuloForm').submit();
	});

	$("#consultarPorFam").click(function (){
		document.getElementById('findArticuloPorFliaForm').submit();
	});	
});
</script>
<div class = "main">
	<jsp:include page="add_on/botones_basicos.jsp"/>
	<s:form id="findArticuloPorFliaForm" action="findArticuloPorFlia" theme="simple" cssClass="inline" method="post" >		
		<fieldset class="defaultFieldset" >
		<legend><b>Consulta de Stock - Busqueda de Articulo por Familia / SubFamilia</b></legend>
		<div class = "space"></div>		
	    <table>
			<tr>
				<td><label for="desFam">Familia:</label></td>				
				<td><s:select id="fam" name="fam.nrfam" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all" list="%{#session['listFam']}" listKey="nrfam" listValue="desfam"/></td>
				
				<td><label for="desFam">SubFamilia:</label></td>				
				<td><s:select id="subFam" name="subFam.nrsubfam" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all" list="%{#session['listSubFam']}" listKey="nrsubfam" listValue="desubfa"/></td>
				
				<td><label for="articuloAuto">Art. Activos</label></td>
				<td><s:checkbox name="articuloActivo" id = "idArticuloActivoCB" /></td>
			</tr>
	    </table>

		<center>
			<div id="consultarPorFam" style="display:inline;">
					<img src="images/general/icon_buscar.png" alt="Consultar" border="0" >		
				
			</div>
		</center>
		</fieldset>
	</s:form>
</div>
<s:form action="otipABandejaPendientes" id="goToPendientes">	
</s:form>

<s:form action="otipAgetFichaDactilar" id="downloadFichaDactilarForm">
	<s:hidden key="solicitud.idSolicitud" id="idSolicitudFD"/>
</s:form>
