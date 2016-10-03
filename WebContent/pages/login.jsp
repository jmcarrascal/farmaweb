<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<link href="<%=request.getContextPath()%>/css/loginForm.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
	$(document).ready(function () {
		$("#idUsuario").focus();
	});
</script>

<div class="main" style="background: #EBEBEB;">
	<div class="separator"></div>
	<div class="space"></div>
	<div class="panel_100">
		<div class="space"></div>
		<div align="center">
			<s:form action="validateEmpresa">
				<table style="display: inline">
					<tr>
						<td><s:textfield label="Usuario" name="usuario" id = "idUsuario"/></td>
					</tr>
					<tr>
						<td><s:password label="Password" name="password" /></td>
					</tr>
					<tr>
						<s:submit value="Enviar" align="center"/>
					</tr>
				</table>				
				<s:actionerror/>
			</s:form>
		</div>
	</div>
</div>
<div class="space"></div>
<div class="space"></div>
<div class="space"></div>
<div class="space"></div>









