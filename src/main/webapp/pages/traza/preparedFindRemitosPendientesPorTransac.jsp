<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>


<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/popup.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/js/popup.js" type="text/javascript"></script>

<script src="<%=request.getContextPath()%>/js/jquery.autocomplete.js" type="text/javascript"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.alphanumeric.js?n=2"></script> 
<script>
$(document).ready(function(){
	$("#idTransac").val('');
	$("#idTransac").focus();	
	$("#consultar").click(function (){
		document.getElementById('findTrazabiPorTransacForm').submit();
	});

});
</script>
<div class = "main">

	<s:form id="findTrazabiPorTransacForm" action="viewTrazaIngreso" theme="simple" cssClass="inline" method="post" >		
		<fieldset class="defaultFieldset" >
		<s:hidden key="porTransac" value="true"/>
		<legend><b>Recepción de Remitos - Busqueda por Numero de Transacción (Remito) Droguería</b></legend>
		
		<div class = "space"></div>
	    <table>
			<tr>
				<td><label for="nombreProveedor">Ingrese el número de transacción de la droguería:</label></td>
			   	<td><s:textfield id="idTransac" name="transac.transacNrStr" size="15" maxlength="15" cssErrorClass="error" cssClass="ui-widget-content ui-corner-all"/></td>
			</tr>
	    </table>
		<center>
			<div id="consultar" style="display:inline;">
					<img src="images/general/icon_buscar.png" alt="Consultar" border="0" >		
				
			</div>
		</center>
		</fieldset>
	</s:form>
</div>

