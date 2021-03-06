<%@page import="jmc.skweb.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="jmc.skweb.core.model.Usuario"%>
<%@page import="jmc.skweb.util.PreferenciasUtil"%>
<%@page import="jmc.skweb.util.Constants"%>
	
	<div class="pageHeader" style="margin:0px;background-image:url('images/general/banda_farma.PNG');background-repeat: no-repeat;border-bottom:1px solid #4d4d4d">
	<%
		//Tomar el usuario desde el Request
		Usuario usuarioActual = (Usuario) request.getSession().getAttribute("usuario");
	%>
	
	<div style="margin:0 2% 0 0;color:white;float:right;text-align:right;width:75%;line-height: 1.8;">
		Versi&oacute;n: <b>3.5</b> <br />
		Usuario:&nbsp;<b> <%=usuarioActual.getNombre()%> </b> 		
	</div>
	</div>
	
		<%
			switch (usuarioActual.getRol()) {
			case Constants.ID_USR_VENDEDOR:
		%>
			<div id="menu" >
		    <ul class="menu">
		    	<li><a href="#" class="parent"><span>Gente</span></a>
		            <ul>
		                <li><a href="preparedFindAgendadoPorNombre_Tran"><span>Agendado y sus Transacciones</span></a></li>
		            </ul>
		        </li>	
		        <li><a href="#" class="parent"><span>Stock</span></a>
		            <ul>
		                <li><a href="#"><span>Buscar Articulo</span></a>
		                    <ul>
		                		<li><a href="preparedFindArticuloPorNombre"><span>por Nombre</span></a></li>		                		
		                		<li><a href="preparedFindArticuloPorFlia"><span>por Familia</span></a></li>		                		
		                		<%if (PreferenciasUtil.comparePreferencia(usuarioActual.getListPreferencias(),Constants.PREF_ID_USA_ART_MADRE) == -1){ %>
		                			<li><a href="preparedFindArtMadrePorNombre"><span>por Art. Madre</span></a></li>
		                		<%} %>
		            		</ul>		                
		                </li>
		            </ul>
		        </li>
		        		        

		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			case Constants.ID_USR_CLIENTE:
		%>
			<div id="menu" >
		    <ul class="menu">
		    	<li><a href="#" class="parent"><span>Gente</span></a>
		            <ul>
		                <li><a href="preparedFindAgendadoPorNombre_Tran"><span>Agendado y sus Transacciones</span></a></li>
		            </ul>
		        </li>	
		        <li><a href="#" class="parent"><span>Stock</span></a>
		            <ul>
		                <li><a href="#"><span>Buscar Articulo</span></a>
		                    <ul>
		                		<li><a href="preparedFindArticuloPorNombre"><span>por Nombre</span></a></li>		                		
		                		<li><a href="preparedFindArticuloPorFlia"><span>por Familia</span></a></li>		                		
		                		<%if (PreferenciasUtil.comparePreferencia(usuarioActual.getListPreferencias(),Constants.PREF_ID_USA_ART_MADRE) == -1){ %>
		                			<li><a href="preparedFindArtMadrePorNombre"><span>por Art. Madre</span></a></li>
		                		<%} %>
		            		</ul>		                
		                </li>
		            </ul>
		        </li>
		       	        
		        	        		        
		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			case Constants.ID_USR_GERENTE:
		%>
			<div id="menu" >
		    <ul class="menu">
		    	<li><a href="#" class="parent"><span>Gente</span></a>
		            <ul>
		                <li><a href="preparedFindAgendadoPorNombre_Tran"><span>Agendado y sus Transacciones</span></a></li>
		            </ul>
		        </li>	
		        <li><a href="#" class="parent"><span>Stock</span></a>
		            <ul>
		                <li><a href="#"><span>Buscar Articulo</span></a>
		                    <ul>
		                		<li><a href="preparedFindArticuloPorNombre"><span>por Nombre</span></a></li>		                		
		                		<li><a href="preparedFindArticuloPorFlia"><span>por Familia</span></a></li>
		                		<li><a href="preparedFindProveedorPorNombre"><span>por Proveedor</span></a></li>
		                		<%if (PreferenciasUtil.comparePreferencia(usuarioActual.getListPreferencias(),Constants.PREF_ID_USA_ART_MADRE) == -1){ %>
		                			<li><a href="preparedFindArtMadrePorNombre"><span>por Art. Madre</span></a></li>
		                		<%} %>
		            		</ul>		                
		                </li>
		            </ul>
		        </li>
		       	        
		        	        		        
		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			case Constants.ID_USR_PROVEEDOR:
		%>
			<div id="menu" >
		    <ul class="menu">
		        <li><a href="#" class="parent"><span>Cuenta Corriente</span></a>
		            <ul>
		                <li><a href="preparedFindGentePorNombre_CC_C"><span>Solo Impagos Compras</span></a></li>
		                <li><a href="preparedFindAgendadoPorNombre_Resumen_CC_C"><span>Resumen Compras</span></a></li>
		            </ul>
		        </li>		        
		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			case Constants.ID_USR_TRAZA:
		%>
			<div id="menu" >
		    <ul class="menu">
		        <li><a href="#" class="parent"><span>Trazabilidad por Remito</span></a>
		            <ul>
		            	<li><a href="preparedFindRemitosPendientesPorTransac"><span>Buscar Remito Por Nr</span></a></li>
		                <li><a href="preparedListRemitosPendientes"><span>Recepcionar Remito(SK)</span></a></li>
<!--		                <li><a href="preparedNewUsuario"><span>Recepcionar por Caja</span></a></li>		                -->
		                <li><a href="preparedSendRemitos"><span>Enviar Remito(SK)</span></a></li>
<!--		                <li><a href="preparedNewUsuario"><span>Enviar por Caja</span></a></li>-->
 						<li><a href="preparedDevolucion"><span>Devolución a Drogueria</span></a></li>
		            </ul>
		        </li>
		        <li><a href="#" class="parent"><span>Trazabilidad por Unidad</span></a>
		            <ul>
		                <li><a href="preparedSendRemitosUnid"><span>Egreso</span></a></li>
		            </ul>
		        </li>
		        
		        <li><a href="#" class="parent"><span>Reportes</span></a>
		            <ul>
		                <li><a href="preparedListRemitosEnviados"><span>Remitos Enviados(SK)</span></a></li>
		                <li><a href="preparedFindRemitoFarma"><span>Remitos Farmacia</span></a></li>
		            </ul>
		        </li>
		       
		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			case Constants.ID_USR_ADMIN:
		%>
			<div id="menu" >
		    <ul class="menu">
		        <li><a href="#" class="parent"><span>Trazabilidad por Remito</span></a>
		            <ul>
		            	<li><a href="preparedFindRemitosPendientesPorTransac"><span>Buscar Remito Por Nr</span></a></li>
		                <li><a href="preparedListRemitosPendientes"><span>Recepcionar Remito(SK)</span></a></li>
<!--		                <li><a href="preparedNewUsuario"><span>Recepcionar por Caja</span></a></li>		                -->
		                <li><a href="preparedSendRemitos"><span>Enviar Remito(SK)</span></a></li>
<!--		                <li><a href="preparedNewUsuario"><span>Enviar por Caja</span></a></li>-->
						<li><a href="preparedDevolucion"><span>Devolución a Drogueria</span></a></li>
		            </ul>
		        </li>
		        <li><a href="#" class="parent"><span>Trazabilidad por Unidad</span></a>
		            <ul>
		                <li><a href="preparedSendRemitosUnid"><span>Egreso</span></a></li>
		            </ul>
		        </li>
		        <li><a href="#" class="parent"><span>Reportes</span></a>
		            <ul>
		                <li><a href="preparedListRemitosEnviados"><span>Remitos Enviados(SK)</span></a></li>
		                <li><a href="preparedFindRemitoFarma"><span>Remitos Farmacia</span></a></li>
		            </ul>
		        </li>
		         <li><a href="#" class="parent"><span>Usuarios</span></a>
		            <ul>
		                <li><a href="getEmpresas"><span>Lista de Empresas</span></a></li>
		                <li><a href="getUsuarios"><span>Lista de Usuarios</span></a></li>
		                <li><a href="preparedNewEmpresa"><span>Alta Empresa</span></a></li>
		                <li><a href="preparedNewUsuario"><span>Alta Usuario</span></a></li>
		            </ul>
		        </li>
		        
		    </ul>
		    <ul style="float:right;"> 
        		<li class="last" ><a href="out"><span><b>Cerrar Sesión</b></span></a></li>
    		</ul>
		</div>
		<%
			break;
			}
		%>
	