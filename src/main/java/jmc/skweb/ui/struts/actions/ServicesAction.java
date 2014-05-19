package jmc.skweb.ui.struts.actions;



import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jmc.skweb.core.model.ArtMadre;
import jmc.skweb.core.model.Domicilios;
import jmc.skweb.core.model.ExiArt;
import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Items;
import jmc.skweb.core.model.Paseban;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.SubFam;
import jmc.skweb.core.model.TipoComprob;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.Usuario;
import jmc.skweb.core.model.report.SaldoAcumulado;
import jmc.skweb.core.model.report.TipoReporte;
import jmc.skweb.core.model.shortEntities.GenteBasic;
import jmc.skweb.core.model.traza.ObraSocial;
import jmc.skweb.core.model.traza.Trazabi;
import jmc.skweb.core.model.traza.TrazabiFarma;
import jmc.skweb.core.model.traza.report.DatosTrazaWS;
import jmc.skweb.core.service.ArticuloManager;
import jmc.skweb.core.service.CuentaCorrienteManager;
import jmc.skweb.core.service.ParametrizacionManager;
import jmc.skweb.core.service.ReporteadorPdfManager;
import jmc.skweb.core.service.TesoreriaManager;
import jmc.skweb.core.service.TransaccionManager;
import jmc.skweb.core.service.UsuarioManager;
import jmc.skweb.util.CallUrl;
import jmc.skweb.util.Constants;
import jmc.skweb.util.DateUtil;
import jmc.skweb.util.FormatUtil;
import jmc.skweb.util.email.Email;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;





/**
 * @author vaio
 *
 */
public class ServicesAction extends ActionSupport  {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombreArticulo;
	private ArticuloManager articuloManager;
	private CuentaCorrienteManager cuentaCorrienteManager;
	private Stock stock = new Stock();
	private Fam fam = new Fam();
	private List<Fam> listFam = new ArrayList<Fam>();
	private List<SubFam> listSubFam = new ArrayList<SubFam>();
	private SubFam subFam = new SubFam();			
	private String nombreProveedor;
	private Gente gente = new Gente();
	private ArtMadre artMadre = new  ArtMadre();
	private Double totalSaldo = 0d;
	private Double saldoAnterior = 0d;
	private Transac transac = new Transac();
	private String fechaDesde = "";
	private String fechaHasta = "";
	private TesoreriaManager tesoreriaManager;
	private String serie;
	private String cuenta;
	private TransaccionManager transaccionManager;
	private Items items;
	private String bonif1;
	private String bonif2;
	private String bonif3;
	private String bonif4;
	private String countItems;
	private String fechaEntrega;
	private Integer tabSelected;
	private boolean articuloActivo = true;
	private UsuarioManager usuarioManager;
	private DatosTrazaWS datosTrazaWS;
	private ReporteadorPdfManager reporteadorPdfManager;
	private String nombre;
	private boolean porTransac = false;
	private TrazabiFarma trazabiFarma;
	private String nrStr;
	private String fecha;
	
	
	
	
	 
	

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getNrStr() {
		return nrStr;
	}


	public void setNrStr(String nrStr) {
		this.nrStr = nrStr;
	}


	public TrazabiFarma getTrazabiFarma() {
		return trazabiFarma;
	}


	public void setTrazabiFarma(TrazabiFarma trazabiFarma) {
		this.trazabiFarma = trazabiFarma;
	}


	public boolean isPorTransac() {
		return porTransac;
	}


	public void setPorTransac(boolean porTransac) {
		this.porTransac = porTransac;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ReporteadorPdfManager getReporteadorPdfManager() {
		return reporteadorPdfManager;
	}


	public void setReporteadorPdfManager(ReporteadorPdfManager reporteadorPdfManager) {
		this.reporteadorPdfManager = reporteadorPdfManager;
	}


	public DatosTrazaWS getDatosTrazaWS() {
		return datosTrazaWS;
	}


	public void setDatosTrazaWS(DatosTrazaWS datosTrazaWS) {
		this.datosTrazaWS = datosTrazaWS;
	}


	public UsuarioManager getUsuarioManager() {
		return usuarioManager;
	}


	public void setUsuarioManager(UsuarioManager usuarioManager) {
		this.usuarioManager = usuarioManager;
	}


	public boolean isArticuloActivo() {
		return articuloActivo;
	}


	public void setArticuloActivo(boolean articuloActivo) {
		this.articuloActivo = articuloActivo;
	}


	public Integer getTabSelected() {
		return tabSelected;
	}


	public void setTabSelected(Integer tabSelected) {
		this.tabSelected = tabSelected;
	}


	public String getFechaEntrega() {
		return fechaEntrega;
	}


	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


	public String getCountItems() {
		return countItems;
	}


	public void setCountItems(String countItems) {
		this.countItems = countItems;
	}


	public String getBonif1() {
		return bonif1;
	}


	public void setBonif1(String bonif1) {
		this.bonif1 = bonif1;
	}


	public String getBonif2() {
		return bonif2;
	}


	public void setBonif2(String bonif2) {
		this.bonif2 = bonif2;
	}


	public String getBonif3() {
		return bonif3;
	}


	public void setBonif3(String bonif3) {
		this.bonif3 = bonif3;
	}


	public String getBonif4() {
		return bonif4;
	}


	public void setBonif4(String bonif4) {
		this.bonif4 = bonif4;
	}


	public Items getItems() {
		return items;
	}


	public void setItems(Items items) {
		this.items = items;
	}


	public TransaccionManager getTransaccionManager() {
		return transaccionManager;
	}


	public void setTransaccionManager(TransaccionManager transaccionManager) {
		this.transaccionManager = transaccionManager;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public TesoreriaManager getTesoreriaManager() {
		return tesoreriaManager;
	}


	public void setTesoreriaManager(TesoreriaManager tesoreriaManager) {
		this.tesoreriaManager = tesoreriaManager;
	}


	public Double getSaldoAnterior() {
		return saldoAnterior;
	}


	public void setSaldoAnterior(Double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}


	public String getFechaHasta() {
		return fechaHasta;
	}


	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}


	public String getFechaDesde() {
		return fechaDesde;
	}


	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}


	public Transac getTransac() {
		return transac;
	}


	public void setTransac(Transac transac) {
		this.transac = transac;
	}


	public Double getTotalSaldo() {
		return totalSaldo;
	}


	public void setTotalSaldo(Double totalSaldo) {
		this.totalSaldo = totalSaldo;
	}


	public ArtMadre getArtMadre() {
		return artMadre;
	}


	public void setArtMadre(ArtMadre artMadre) {
		this.artMadre = artMadre;
	}


	public CuentaCorrienteManager getCuentaCorrienteManager() {
		return cuentaCorrienteManager;
	}


	public void setCuentaCorrienteManager(
			CuentaCorrienteManager cuentaCorrienteManager) {
		this.cuentaCorrienteManager = cuentaCorrienteManager;
	}


	public Gente getGente() {
		return gente;
	}


	public void setGente(Gente gente) {
		this.gente = gente;
	}


	public String getNombreProveedor() {
		return nombreProveedor;
	}


	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}


	public SubFam getSubFam() {
		return subFam;
	}


	public void setSubFam(SubFam subFam) {
		this.subFam = subFam;
	}


	public List<SubFam> getListSubFam() {
		return listSubFam;
	}


	public void setListSubFam(List<SubFam> listSubFam) {
		this.listSubFam = listSubFam;
	}


	public List<Fam> getListFam() {
		return listFam;
	}


	public void setListFam(List<Fam> listFam) {
		this.listFam = listFam;
	}


	public Fam getFam() {
		return fam;
	}


	public void setFam(Fam fam) {
		this.fam = fam;
	}


	public Stock getStock() {
		return stock;
	}


	public void setStock(Stock stock) {
		this.stock = stock;
	}


	public ArticuloManager getArticuloManager() {
		return articuloManager;
	}


	public void setArticuloManager(ArticuloManager articuloManager) {
		this.articuloManager = articuloManager;
	}


	public String getNombreArticulo() {
		return nombreArticulo;
	}


	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	private ParametrizacionManager parametrizacionManager;
	public ParametrizacionManager getParametrizacionManager() {
		return parametrizacionManager;
	}


	public void setParametrizacionManager(
			ParametrizacionManager parametrizacionManager) {
		this.parametrizacionManager = parametrizacionManager;
	}


	public String execute() throws Exception {
    
    return "success";
	}
  
	/**
	 * Redirige la APP a la pagina de Login 
	 * @return
	 * @throws Exception
	 */
	public String login(){	        
	    return "success";
	}
	
	
	/**
	 * Set TabSelected
	 */
	public String setTabSelected() throws Exception {	        		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		Usuario usuario = getUsuarioSesion();
		
		usuario.setTabSelected(tabSelected);
		
		request.getSession().setAttribute("usuario", usuario);
		
		return null;
	}
	
	/**
	 * Llama al menu de agendados
	 */
	public String menuAgendado_Tran() throws Exception {	        		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		Usuario usuario = getUsuarioSesion();
		
		Gente genteTmp = null;
		if (gente.getGenteNr() == null){
			genteTmp = usuario.getGenteSession();
		}else{
			genteTmp = transaccionManager.getGenteConDomiPrinc(gente.getGenteNr());
			usuario.setGenteSession(genteTmp);
			usuario.setTabSelected(0);
			request.getSession().setAttribute("usuario", usuario);
		}												
		tabSelected = usuario.getTabSelected();			
		
		gente = genteTmp;

		gente.setIdRol(usuario.getRol());
		
		return "success";
	}

	/**
	 * Cierra la session de la APP y redirige al Login
	 * @return
	 * @throws Exception
	 */
	public String out() throws Exception {	        		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);		
		String url = "";
		if (request.getContextPath().equals("/skweb")){
			url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "1/close?m=1";	
		}else{
			url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/close?m=1";
		}

		new Thread (new CallUrl(url)).start();
		
		request.getSession().setAttribute("usuario", null);
		request.setAttribute("usuario", null);
		request.getSession().invalidate();
		
		return "success";
	}
	
	public String close() throws Exception {	        		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);				
		request.getSession().setAttribute("usuario", null);
		request.setAttribute("usuario", null);
		request.getSession().invalidate();
		return null;
	}

	private static void openURL(String url){
		URL method = null; 
		try {
			method = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			method.openStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * Este metodo devuelve el usuario de la session actual
	 * @return Usuario actual
	 */
	private Usuario getUsuarioSesion() {
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);		
		return (Usuario)request.getSession().getAttribute("usuario");
	}

	

	
	public String home() throws Exception {	        		
		return "success";
	}

	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String preparedFindArticuloPorNombre() throws Exception {	        		
						
		return "success";
	}
	
	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String preparedFindRemitoFarma() throws Exception {	        		
						
		return "success";
	}
	
	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String preparedFindAgendadoPorNombre_Resumen_CC() throws Exception {	        		
						
		return "success";
	}
	

	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String preparedFindAgendadoPorNombre_Resumen_CC_C() throws Exception {	        								
		Usuario usuario = getUsuarioSesion();
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			return "buscoAgendado";
		}else{
			return "showResumenC";
		}		
	}
	
	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String preparedFindAgendadoPorNombre_Resumen_CC_P_C() throws Exception {	        								
		Usuario usuario = getUsuarioSesion();
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			return "buscoAgendado";
		}else{
			return "showResumenC";
		}		
	}
	
	

	/**
	 * 
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String preparedFindAgendadoPorNombre_CR() throws Exception {	        		
						
		return "success";
	}
	
	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String preparedFindAgendadoPorNombre_Tran() throws Exception {	        		
		//Cargo los tipo de Comprobante habilitados
		Usuario usuario = getUsuarioSesion();
		
		//Cargo los valores de los comprobantes permitidos
		List<TipoComprob> tipoComrobList= transaccionManager.getTipoComprobEnable(usuario.getRol());
		
		// Lista de TipoComprob
		ActionContext.getContext().getSession().put("tipoComrobList", tipoComrobList);

		//Cargo los valores de todos los comprobantes
		List<TipoComprob> tipoComprobAllList= transaccionManager.getTipoComprobAll();
		
		// Lista de TipoComprob
		ActionContext.getContext().getSession().put("tipoComprobAllList", tipoComprobAllList);
		
		//Cargo los valores de Tipo de Reporte
		List<TipoReporte> tipoReporteList= transaccionManager.getTipoReporteAll();
		
		// Lista de TipoComprob
		ActionContext.getContext().getSession().put("tipoReporteList", tipoReporteList);

		//Cargo los valores de Tipo de Reporte
		List<TipoReporte> tipoRepoTesoList= transaccionManager.getTipoReporteTesoreria();
		
		// Lista de TipoComprob
		ActionContext.getContext().getSession().put("tipoRepoTesoList", tipoRepoTesoList);
		
		if (getUsuarioSesion().getRol() == Constants.ID_USR_CLIENTE){
			gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());			
			return "goTransac";
		}
		return "success";
	}

	/**
	 * Prepara la busqueda de un Articulo Madre por Nombre.
	 * 
	 */
	public String preparedFindArtMadrePorNombre() throws Exception {	        		
						
		return "success";
	}

	
	/**
	 * Prepara la busqueda de un Articulo por Flia.
	 * 
	 */
	public String preparedFindArticuloPorFlia() throws Exception {	        		
		//Obtengo lista de SubFamilia
		listSubFam = articuloManager.getListSubFam();
		
		//Obtengo lista de Familia
		listFam = articuloManager.getListFam();
		
		// carga la lista de Familias
		ActionContext.getContext().getSession().put("listFam", listFam);

		// carga la lista de Sub Familias
		ActionContext.getContext().getSession().put("listSubFam", listSubFam);
				
		return "success";
	}

	/**
	 * Prepara la busqueda de un Proveedor por Nombre.
	 * 
	 */
	public String preparedFindGentePorNombre_CC() throws Exception {	        		
				
		return "success";
	}
	

	/**
	 * Prepara la busqueda de un Proveedor por Nombre.
	 * 
	 */
	public String preparedFindGentePorNombre_CC_C() throws Exception {	        		
		//Preguntar si el Rol es proveedor, por So Tomar el genteNr y envialo directo Pro No ir a buscar el 
		Usuario usuario = getUsuarioSesion();
		return "showSoloImpagosC";
	}

	
	/**
	 * Prepara la busqueda de un Proveedor por Nombre.
	 * 
	 */
	public String preparedFindProveedorPorNombre() throws Exception {	        		
				
		return "success";
	}

	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String findArticuloPorNombre() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Stock> articuloList = articuloManager.getArticuloProNombre(nombreArticulo,articuloActivo);
		
		request.setAttribute("articuloList", articuloList);
		
		return "success";
	}
	
	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y  data en el vector 1
	 */
	private String[] getJSonJquery(List<Stock> articuloList){
		String[] autocomplete = new String[2];
		String suggestions = "";
		String data = "";
		for(Stock stock: articuloList){
			if(suggestions.equals(""))
				suggestions = "['" + stock.getDescripC() + "'";
			else
				suggestions = suggestions + ",'" + stock.getDescripC() + "'";
			
			if(data.equals(""))
				data = "['" + stock.getClave() + "'";
			else
				data = data + ",'" + stock.getClave() + "'";
		}
		if(!suggestions.equals(""))
			suggestions = suggestions + "]";
		if(!data.equals(""))
			data = data + "]";
		
		autocomplete[0] = suggestions;
		autocomplete[1] = data;

		return autocomplete;
	}

	
//	[
//		{ name: "Peter Pan", to: "peter@pan.de" },
//		{ name: "Molly", to: "molly@yahoo.com" },
//		{ name: "Forneria Marconi", to: "live@japan.jp" },
//		{ name: "Master <em>Sync</em>", to: "205bw@samsung.com" },
//		{ name: "Dr. <strong>Tech</strong> de Log", to: "g15@logitech.com" },
//		{ name: "Don Corleone", to: "don@vegas.com" },
//		{ name: "Mc Chick", to: "info@donalds.org" },
//		{ name: "Donnie Darko", to: "dd@timeshift.info" },
//		{ name: "Quake The Net", to: "webmaster@quakenet.org" },
//		{ name: "Dr. Write", to: "write@writable.com" }
//	]
	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y  data en el vector 1
	 */
	private String getAutoCompleteDataJquery(List<Stock> articuloList){			
		String data = "";
		int i = 0;
		int total = articuloList.size();
		for(Stock stock: articuloList){
			i++;
			String descrip = stock.getDescripC().replaceAll("\"", "'").replaceAll(",", " ");			
			String tmp = "{ \"clave\": " + "\""+  stock.getClave() + "\", \"valor\": " + "\"" + descrip + "\" }" ;
			if (total == i){				
			}else{
				tmp = tmp + ", ";
			}
			data = data + tmp;
		}		
		data = data + "";
		return data;
	}
	
	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y  data en el vector 1
	 */
	private String getAutoCompleteDataJqueryGente(List<Gente> genteList){			
		String data = "";
		int i = 0;
		int total = genteList.size();
		for(Gente gente: genteList){
			i++;
			String descrip = gente.getDescripC().replaceAll("\"", "'").replaceAll(",", " ");			
			String tmp = "{ \"clave\": " + "\""+  gente.getGenteNr() + "\", \"valor\": " + "\"" + descrip + "\" }" ;
			if (total == i){				
			}else{
				tmp = tmp + ", ";
			}
			data = data + tmp;
		}		
		data = data + "";
		return data;
	}
	

	/**
	 * Metodo que devuelve un array de String con las suggestions en el vector 0
	 * y  data en el vector 1
	 */
	private String getAutoCompleteDataJqueryGenteBasic(List<GenteBasic> genteList){			
		String data = "";
		int i = 0;
		if(genteList != null){
		int total = genteList.size();
		for(GenteBasic gente: genteList){
			i++;
			String descrip = gente.getDescripC().replaceAll("\"", "'").replaceAll(",", " ");			
			String tmp = "{ \"clave\": " + "\""+  gente.getGenteNr() + "\", \"valor\": " + "\"" + descrip + "\" }" ;
			if (total == i){				
			}else{
				tmp = tmp + ", ";
			}
			data = data + tmp;
		}		
		data = data + "";
		}
		return data;
	}
	
	
	
	/**
	 * 
	 * Agrega una caja a la lista de cajas
	 * 
	 */
	public String showRemitoFarma() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		List<TrazabiFarma> trazabiFarmaSessionList = new ArrayList<TrazabiFarma>();
		
		trazabiFarmaSessionList = transaccionManager.getTrazabiFarmaPorRemito(nrStr, getUsuarioSesion());
				
		request.getSession().setAttribute("trazabiFarmaList", trazabiFarmaSessionList);
						
		request.setAttribute("trazabiFarmaList", trazabiFarmaSessionList);	
		
		gente = getUsuarioSesion().getGenteSession();		
		
		return "success";
	}

	/**
	 * 
	 * Agrega una caja a la lista de cajas
	 * 
	 */
	public String addTrazabiFarma() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		List<TrazabiFarma> trazabiFarmaSessionList = (List<TrazabiFarma>)request.getSession().getAttribute("trazabiFarmaList");
		
		TrazabiFarma tf = new TrazabiFarma();
		try{
			tf.setNr(Integer.parseInt(nrStr));
		}catch(NumberFormatException ne){
			tf.setNr(0);
		}
		
		trazabiFarmaSessionList = transaccionManager.addTrazabiFarma(trazabiFarmaSessionList, tf, getUsuarioSesion());
				
		request.getSession().setAttribute("trazabiFarmaList", trazabiFarmaSessionList);
						
		request.setAttribute("trazabiFarmaList", trazabiFarmaSessionList);	
		
		gente = getUsuarioSesion().getGenteSession();		
		
		return "success";
	}

	
	/**
	 * Agrega un item a la lista de Items
	 * 
	 */
	public String addItem_OP() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		List<Items> itemsSessionList = (List<Items>)request.getSession().getAttribute("items_OP");
		
		String cadena = (String) request.getSession().getAttribute("formatCadena");
		
		if (cadena == null){
			cadena = "00+00+00+00";
		}
		
		items.setObser(cadena);
		
		if (items.getId().getItemNr() != null && items.getId().getItemNr() !=0){
			itemsSessionList = transaccionManager.editItem(itemsSessionList, items, getUsuarioSesion());
		}else{
			itemsSessionList = transaccionManager.addItem(itemsSessionList, items, getUsuarioSesion());
		}
				
		request.getSession().setAttribute("items_OP", itemsSessionList);
						
		request.setAttribute("itemsList", itemsSessionList);	
		
		gente = getUsuarioSesion().getGenteSession();		
		
		transac = transaccionManager.calculoTotales(itemsSessionList);
		
		Transac transacOrig = (Transac)request.getSession().getAttribute("transac_tran");
		
		transac.setTipoComprob(transacOrig.getTipoComprob()); 
		
		countItems = String.valueOf(itemsSessionList.size());
		
		return "success";
	}

	/**
	 * Guarda una transaccion
	 * 
	 */
	public String saveTransac() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);		

		List<Items> itemsSessionList = (List<Items>)request.getSession().getAttribute("items_OP");				
		
		Transac transacOrig = (Transac)request.getSession().getAttribute("transac_tran");
		
		String result = transaccionManager.saveTransac_OP(itemsSessionList, gente.getGenteNr(), getUsuarioSesion().getEmpresaNrSk(), fechaEntrega, transac, transacOrig.getTipoComprob().getNr(), getUsuarioSesion());
		
		if (result.equals("error")){			
		}else{
			result = "Se ha generado la Transaccion Nr. " + result;
			
		}
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;

	}


	/**
	 * Elimina un item a la lista de Items
	 * 
	 */
	public String removeItem_OP() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		List<Items> itemsSessionList = (List<Items>)request.getSession().getAttribute("items_OP");
		
		itemsSessionList = transaccionManager.removeItem(itemsSessionList, items);
		
		request.getSession().setAttribute("items_OP", itemsSessionList);
						
		request.setAttribute("itemsList", itemsSessionList);	
		
		gente = getUsuarioSesion().getGenteSession();		
		
		transac = transaccionManager.calculoTotales(itemsSessionList);
		
		Transac transacOrig = (Transac)request.getSession().getAttribute("transac_tran");
		
		transac.setTipoComprob(transacOrig.getTipoComprob()); 
		
		countItems = String.valueOf(itemsSessionList.size());
		
		return "success";
	}

	
	/**
	 * Prepara la cargar de un pedido
	 * 
	 */
	public String adminComprob_Tran() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		List<Items> itemsList = new ArrayList<Items>();
		
		request.getSession().setAttribute("items_OP", itemsList);
						
		TipoComprob tipoComprob = transaccionManager.getTipoComprobByPK(transac.getTipoComprob().getNr());
		
		transac.setTipoComprob(tipoComprob);
		
		request.getSession().setAttribute("transac_tran", transac);
		
		request.setAttribute("itemsList", itemsList);	
								
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		gente.setIdRol(getUsuarioSesion().getRol());
				
		countItems = String.valueOf(itemsList.size());		
		
		return "success";
	}
	
	/**
	 * Prepara el final de un pedido
	 * 
	 */
	public String finComprob_Tran() throws Exception {	        												
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Items> itemsSessionList = (List<Items>)request.getSession().getAttribute("items_OP");		
		
		gente = articuloManager.getGentePorPK(gente.getGenteNr());		
		
		request.setAttribute("itemsList", itemsSessionList);

		transac = transaccionManager.calculoTotales(itemsSessionList);
		
		Transac transacOrig = (Transac)request.getSession().getAttribute("transac_tran");
		
		transac.setTipoComprob(transacOrig.getTipoComprob()); 

		
		return "success";
	}

	
	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String getBonifPorAgendado() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		int idGente = gente.getGenteNr();
		Gente gente  = articuloManager.getGentePorPK(idGente);
		

		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(gente.getBonifStd());

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	

	/**
	 * Prepara la busqueda de un Agendado por su clave.
	 * 
	 */
	public String getAgendadoPorCod_Tran() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		String nombreAgendado = "";
		System.out.println(gente.getGenteNr());
		try{
			nombreAgendado = articuloManager.getGentePorPKVendedor(gente.getGenteNr(), getUsuarioSesion()).getDescripC();				
			
		}catch(Exception nu){
			
		}
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(nombreAgendado);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	/**
	 * Prepara la busqueda de un Articulo por clave.
	 * 
	 */
	public String getArticuloPorClave_OP() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		System.out.println(stock.getClave());
		
		String artDescrip = transaccionManager.getArticuloPorClave(stock.getClave(), articuloActivo);
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(artDescrip);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	
	
	
	/**
	 * 
	 * 
	 */
	public String getBonifPorCadena() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		BigDecimal bonif = transaccionManager.getBonifPorCadena(bonif1,bonif2,bonif3,bonif4);
		
		String formatCadena = transaccionManager.getFormatCadena(bonif1,bonif2,bonif3,bonif4);
				
		request.getSession().setAttribute("formatCadena", formatCadena);
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(bonif);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String getPrecioPorArtAgendado() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		System.out.println(gente.getGenteNr());
		System.out.println(stock.getClave());
		
		BigDecimal precio = transaccionManager.getPrecioClienteArticulo(gente.getGenteNr(), stock.getClave());
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(precio);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	
	
	/**
	 * Muestra en stock por formula stock - pedidoVta + pedidoCompra.
	 * 
	 */
	public String getFormulaStock() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);						
		
		String result = articuloManager.getFormulaStock(stock.getClave(), getUsuarioSesion());
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	
	/**
	 * Muestra en un Pedido.
	 * 
	 */
	public String getTablePedido() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);						
		
		String result = transaccionManager.getTransacJoin(transac.getTipoComprob().getNr(),stock.getClave(), getUsuarioSesion());
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	/**
	 * Envoa el comprobante por Mail al cliente
	 * 
	 */
	public String sendComprobCliente() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);						
		
		String result = "";
		
		//Obtengo la transaccion
		Transac transacN = transaccionManager.getTransacByPK(transac.getTransacNr());
		
		//Obtengo el domicilio que tiene como descripcion @adm
		Domicilios domicilios = transaccionManager.getDomiciliosAdm(transacN.getGente());
		
		if (domicilios != null && domicilios.getInternet() != null && !domicilios.getInternet().trim().equals("")){
		
			//Obtengo el documento
			File fileDownload = cuentaCorrienteManager.getComprobantePdf(transac.getTransacNr(), getUsuarioSesion());
			
			//Obtener la direccion de correo del destinatario
			Email email = new Email("Simpa - Comprobante Electronico","Se adjunta el Comprobante tipo: " + transacN.getTipoComprob().getDescripcion() + " Numero : " + transacN.getPrefijo() + "-" + transacN.getNrComprob(),fileDownload, domicilios.getInternet());
			
			usuarioManager.sendMail(email);
			
			result = "<div class = space/>" +"<div class = space/>"+ "<b>Se ha enviado el correo con oxito al la direccion de correo " + domicilios.getInternet() + "</b>";
		
		}else{
			result = "<div class = space/>" +"<div class = space/>"+ "<b>El agendado " + transacN.getGente().getRazonSocial() + " no tiene cargada una direccion de correo electronico en su domicilio \"@adm\"</b>";
		}		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

		
	
	
	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String getAgendadoPorNombre() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String filter = (String) request.getParameter("q");
		
		List<Gente> genteList = articuloManager.getProveedorPorNombre(filter);
						
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();        				
		salida.append(getAutoCompleteDataJqueryGente(genteList));
      salida.insert(0, "[");
      salida.append("]");

		//		salida.append("[	{ name: \"Peter Pan\", to: \"peter@pan.de\" },	{ name: \"Molly\", to: \"molly@yahoo.com\" },	{ name: \"Forneria Marconi\", to: \"live@japan.jp\" },	{ name: \"Master <em>Sync</em>\", to: \"205bw@samsung.com\" },	{ name: \"Dr. <strong>Tech</strong> de Log\", to: \"g15@logitech.com\" },	{ name: \"Don Corleone\", to: \"don@vegas.com\" },	{ name: \"Mc Chick\", to: \"info@donalds.org\" },	{ name: \"Donnie Darko\", to: \"dd@timeshift.info\" },	{ name: \"Quake The Net\", to: \"webmaster@quakenet.org\" },	{ name: \"Dr. Write\", to: \"write@writable.com\" }]");
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	
	
	
	/**
	 * Prepara la busqueda de un Agendado por Nombre.
	 * 
	 */
	public String getAgendadoPorNombre_Tran() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String filter = (String) request.getParameter("q");
		
		List<GenteBasic> genteList = articuloManager.getProveedorBasicPorNombre(filter, getUsuarioSesion());		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(getAutoCompleteDataJqueryGenteBasic(genteList));
		salida.insert(0, "[");
		salida.append("]");
		
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	/**
	 * Prepara la busqueda de un Agendado por Nombre en una lista.
	 * 
	 */
	public String getAgendadoPorNombreList_Tran() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String filter = (String) request.getParameter("q");
		
		List<GenteBasic> genteList = articuloManager.getProveedorBasicPorNombre(filter, getUsuarioSesion());		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(FormatUtil.getListHTMLGenteBasic(genteList));
		
		
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	
	

	/**
	 * Prepara la busqueda de un Stock por descrip en una lista.
	 * 
	 */
	public String getTrazabiFarmaPorSerieList() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		Usuario usuario = getUsuarioSesion();
		
		String filter = (String) request.getParameter("q");
		
		List<TrazabiFarma> trazabiFarmaList = transaccionManager.getTrazabiFarmaPorSerie(filter, usuario);		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(FormatUtil.getListHTMLTrazabiFarma(trazabiFarmaList));
		
		
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	
	
	
	/**
	 *
	 * 
	 */
	public String 	devolucionMedicamento() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		Usuario usuario = getUsuarioSesion();
		
		TrazabiFarma trazabiFarmaU = transaccionManager.getBySerieGtinRecepcionado(trazabiFarma);	
		
		trazabiFarmaU.setCodEventoIng(trazabiFarma.getCodEventoIng());
		
		String ss = transaccionManager.sendDevolucionAnmat(usuario, trazabiFarmaU);
		
		System.out.println(ss);
		
//		Gson gson = new Gson();
		
		
		// convert java object to JSON format,
		// and returned as JSON formatted string
//		String json = gson.toJson(trazabiFarmaU);
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
       
		salida.append(ss);
		
		response.setContentType("text/html; charset=iso-8859-1");
       //Imprime el resultado
       try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	
	/**
	 *
	 * 
	 */
	public String findMedicamentoRecepcionado() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		Usuario usuario = getUsuarioSesion();
		
		TrazabiFarma trazabiFarmaU = transaccionManager.getBySerieGtinRecepcionado(trazabiFarma);	
		
		Gson gson = new Gson();
		if (trazabiFarmaU == null){
			trazabiFarmaU = new TrazabiFarma();
		}
		
		try{
		Stock st = trazabiFarmaU.getStock();
		
		
		System.out.println(st.getDescriAmpliada());
		
		trazabiFarmaU.setStockTmp(st);
		 
		}catch(Exception el){
		
		}
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(trazabiFarmaU);
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(json);
		
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	
	/**
	 * Prepara la busqueda de un Stock por descrip en una lista.
	 * 
	 */
	public String getStockPorNombreList() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String filter = (String) request.getParameter("q");
		
		List<Stock> stockList = articuloManager.getArticuloProNombre(filter, articuloActivo);		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(FormatUtil.getListHTMLStock(stockList));
		
		
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	

	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String getArticuloPorNombre() throws Exception {	        								
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String filter = (String) request.getParameter("q");
		
		List<Stock> articuloList = articuloManager.getArticuloProNombre(filter, articuloActivo);
		
		request.setAttribute("articuloList", articuloList);		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		
		
//		String[] autocomplete = getJSonJquery(articuloList); 
//		String suggestions = autocomplete[0];
//		String data = autocomplete[1]; 
//		salida.append("clave:"+ suggestions+",");
//		salida.append("valor:"+ data);
//
//        salida.insert(0, "{");
//        salida.append("}");
		salida.append(getAutoCompleteDataJquery(articuloList));
      salida.insert(0, "[");
      salida.append("]");

		//		salida.append("[	{ name: \"Peter Pan\", to: \"peter@pan.de\" },	{ name: \"Molly\", to: \"molly@yahoo.com\" },	{ name: \"Forneria Marconi\", to: \"live@japan.jp\" },	{ name: \"Master <em>Sync</em>\", to: \"205bw@samsung.com\" },	{ name: \"Dr. <strong>Tech</strong> de Log\", to: \"g15@logitech.com\" },	{ name: \"Don Corleone\", to: \"don@vegas.com\" },	{ name: \"Mc Chick\", to: \"info@donalds.org\" },	{ name: \"Donnie Darko\", to: \"dd@timeshift.info\" },	{ name: \"Quake The Net\", to: \"webmaster@quakenet.org\" },	{ name: \"Dr. Write\", to: \"write@writable.com\" }]");
		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
			
	}	
	
	/**
	 * Busqueda de un Articulos por ArtMadre.
	 * 
	 */
	public String showListArticulosPorArtMadre() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Stock> articuloList = articuloManager.getArticulosPorArtMadre(artMadre.getCodArtMad());
		
		artMadre = articuloManager.getArtMadreProPK(artMadre.getCodArtMad());
		
		request.setAttribute("articuloList", articuloList);
		
		return "success";
	}
	
	
	/**
	 * Prepara la busqueda de un Articulo por Nombre.
	 * 
	 */
	public String findArticuloPorProveedor() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Stock> articuloList = articuloManager.getArticuloPorProveedor(gente.getGenteNr(),articuloActivo);
		
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		request.setAttribute("articuloList", articuloList);
		
		return "success";
	}

	/**
	 * Busqueda de un Articulo Madre por Nombre.
	 * 
	 */
	public String findArtMadrePorNombre() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<ArtMadre> artMadreList = articuloManager.getArtMadrePorNombre(artMadre.getDescArtMad());
		
		request.setAttribute("artMadreList", artMadreList);
		
		return "success";
	}

	
	/**
	 * Este metodo devuelve el comprobante en formato PDF
	 * @return 
	 * @author Carrascal
	 */
	public String downloadPdf(){
		
			HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);									
			
			File fileDownload = cuentaCorrienteManager.getComprobantePdf(transac.getTransacNr(), getUsuarioSesion());						
	    	
			int length   = 0;
			
			ServletOutputStream sos;
			try {
				sos = response.getOutputStream();
			
					
			response.setHeader("Content-disposition", "attachment; filename=" + transac.getTransacNr() + ".pdf");        
			response.setHeader("Pragma", "Public");        
			response.setContentType("application/octet-stream");   
			response.setContentLength((int)fileDownload.length());
			
			//
			//  Stream to the requester.
			//
			byte[] bbuf = new byte[2048];
				
				//File fileDownload = file; 
				DataInputStream in = new DataInputStream(new FileInputStream(fileDownload));
			
				while ((in != null) && ((length = in.read(bbuf)) != -1))
				{
				sos.write(bbuf,0,length);
			}
			
			sos.flush();
			sos.close();
			in.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}										
	
		return null;
	}
	
	/**
	 * Muestra la cuenta corriente de ventas en base a una persona  
	 * 
	 */
	public String getSoloImpagosVentaPorGente_CC() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		SaldoAcumulado saldoAcumulado = cuentaCorrienteManager.getCuentaCorrienteVentasPorGente(gente.getGenteNr(), getUsuarioSesion());
		
		//totalSaldo = cuentaCorrienteManager.getTotalSaldoVentasPorGente(saldoAcumulado.getListTransac());
		
		totalSaldo = saldoAcumulado.getFinAcumulado();
		
		request.setAttribute("transacList", saldoAcumulado.getListTransac());
		
		request.setAttribute("grillaResult", "El cliente: " + gente.getDescripC() + " tiene un saldo total de: " + totalSaldo);		
		
		return "success";
	}

	/**
	 * Muestra la cuenta corriente de ventas en base a una persona  
	 * 
	 */
	public String getSoloImpagosPorGente_CC_C() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		if (usuario.getRol() == Constants.ID_USR_PROVEEDOR){
			gente = articuloManager.getGentePorPK(usuario.getGenteNr());
		}else{
			gente = articuloManager.getGentePorPK(gente.getGenteNr());
		}		
		
		SaldoAcumulado saldoAcumulado = cuentaCorrienteManager.getCuentaCorrienteComprasPorGente(gente.getGenteNr(), getUsuarioSesion());				
		
		totalSaldo = saldoAcumulado.getFinAcumulado();
		
		request.setAttribute("transacList", saldoAcumulado.getListTransac());
		
		request.setAttribute("grillaResult", "El cliente: " + gente.getDescripC() + " tiene un saldo total de: " + totalSaldo);		
		
		return "success";
	}

	/**
	 * Muestra la cuenta corriente de ventas en base a una persona  
	 * 
	 */
	public String findPasebanPorAgendado_CR() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		List<Paseban> pasebanList = tesoreriaManager.getPasebanPorAgendado(gente.getGenteNr());
		
		
		request.setAttribute("pasebanList", pasebanList);
					
		
		return "success";
	}
	
	/**
	 * Retorna la el objeto RESPONSE del contexto
	 */
	private HttpServletResponse getResponse() {
		return (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
	}
	
	/**
	 * Metodo para preguntar si existe el cheque
	 */
	public String existeCheque() {		
		String result = "";
		boolean existe = tesoreriaManager.existeCheque(serie);
		
		if (existe) {
			result = "OK";
		}
		
		
		HttpServletResponse response = this.getResponse();
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			sos.print(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	/**
	 * Metodo para recuperar el cheque
	 */
	public String recuperarCheque() {
		
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		
			try {
											
				byte[] bytes = tesoreriaManager.getCheque(serie);
					
					ServletOutputStream sos;
					try {
						sos = response.getOutputStream();		
							
					//response.setHeader("Content-disposition", "attachment; filename=" + facturaActual.getNombreArchivo().replaceAll("txt", "xml"));        
					response.setHeader("Pragma", "Public");        
					response.setContentType("image/jpeg");   
					//response.setContentLength(bytes.length);
					sos.write(bytes);
					sos.flush();
					sos.close();	
					
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				

				
			} catch (Exception e) {
				e.printStackTrace();
			}



		return null;
	}
	

	/**
	 * Muestra transac por tipo de comprobante entre fechas  
	 * 
	 */
	public String reportePorTipoComprob_Repo() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
						
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		List<Transac> transacList = cuentaCorrienteManager.getTransacPorTipoComprob(gente.getGenteNr(), getUsuarioSesion(), transac.getTipoComprob().getNr(), fechaDesde, fechaHasta);				
		
		request.setAttribute("transacList", transacList);
		
		TipoComprob tipoComprob = transaccionManager.getTipoComprobByPK(transac.getTipoComprob().getNr());
		
		transac.setTipoComprob(tipoComprob);
		
		return "success";
	}

	
	/**
	 * Muestra la cuenta corriente filtrado por cliente y fechas  
	 * 
	 */
	public String resumen_CC() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
						
		gente = articuloManager.getGentePorPK(gente.getGenteNr());
		
		SaldoAcumulado saldoAcumulado = cuentaCorrienteManager.getResumenCuentaCorriente(gente.getGenteNr(), getUsuarioSesion(), fechaDesde, fechaHasta);
		
		//totalSaldo = cuentaCorrienteManager.getTotalSaldoVentasPorGente(saldoAcumulado.getListTransac());
		
		saldoAnterior = saldoAcumulado.getIncioAcumulado(); 
		
		totalSaldo = saldoAcumulado.getFinAcumulado();
		
		request.setAttribute("transacList", saldoAcumulado.getListTransac());
		
		request.setAttribute("grillaResult", "El cliente: " + gente.getDescripC() + " tiene un saldo total de: " + totalSaldo);		
		
		return "success";
	}
	
	/**
	 * Muestra la cuenta corriente filtrado por cliente y fechas  
	 * 
	 */
	public String resumen_CC_C() throws Exception {	        						
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		Usuario usuario = getUsuarioSesion();
		
		if (usuario.getRol() == Constants.ID_USR_PROVEEDOR){
			gente = articuloManager.getGentePorPK(usuario.getGenteNr());
		}else{
			gente = articuloManager.getGentePorPK(gente.getGenteNr());
		}		
				
		SaldoAcumulado saldoAcumulado = cuentaCorrienteManager.getResumenCuentaCorrienteCompras(gente.getGenteNr(), getUsuarioSesion(), fechaDesde, fechaHasta);
		
		//totalSaldo = cuentaCorrienteManager.getTotalSaldoVentasPorGente(saldoAcumulado.getListTransac());
		
		saldoAnterior = saldoAcumulado.getIncioAcumulado(); 
		
		totalSaldo = saldoAcumulado.getFinAcumulado();
		
		request.setAttribute("transacList", saldoAcumulado.getListTransac());
		
		request.setAttribute("grillaResult", "El cliente: " + gente.getDescripC() + " tiene un saldo total de: " + totalSaldo);		
		
		return "success";
	}

	/**
	 * Prepara la busqueda de un Articulo por Flia y SubFlia.
	 * 
	 */
	
	public String findArticuloPorFlia() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		
		List<Stock> articuloList = articuloManager.getArticuloPorFliaSubFlia(fam.getNrfam(), subFam.getNrsubfam(),articuloActivo);

		fam = articuloManager.getFamiliaPorPK(fam.getNrfam());
		
		subFam = articuloManager.getSubFamiliaPorPK(subFam.getNrsubfam());

		request.setAttribute("articuloList", articuloList);
		
		return "success";
	}
			
	
	/**
	 * Muestra el detalle de un articulo.
	 * 
	 */
	public String showArticulo() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
		
		//Obtengo el Articulo
		stock = articuloManager.getArticuloPorPK(stock.getClave());						
		
		//Obtengo la lista de Existencia para el articulo
		List<ExiArt> exiArtList = articuloManager.getExistenciaPorArticulo(stock.getClave(), getUsuarioSesion());		

		//Publico la lista
		request.setAttribute("exiArtList", exiArtList);
		
		return "success";
	}
	
	
	
	
	
	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findGentePorNombre_CC() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findGentePorNombre_CC_C() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findAgendadoPorNombre_CR() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	
	
	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */

	public String findAgendadoPorNombre_Tran() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findAgendadoPorNombre_Resumen_CC() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	
	
	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findAgendadoPorNombre_Resumen_CC_P_C() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		if (usuario.getRol() == Constants.ID_USR_PROVEEDOR){
			List<Gente> genteListP = new ArrayList<Gente>();
			genteListP.add(articuloManager.getGentePorPK(usuario.getGenteNr()));
			genteList = genteListP; 
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	
	
	
	
	
	/**
	 * Prepara la busqueda de un Gente por Nombre.
	 * 
	 */
	public String findAgendadoPorNombre_Resumen_CC_C() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		Usuario usuario = getUsuarioSesion();
		
		List<Gente> genteList = new ArrayList<Gente>();
		
		if (usuario.getRol() == Constants.ID_USR_GERENTE){
			genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		}
		if (usuario.getRol() == Constants.ID_USR_VENDEDOR){		
			genteList = articuloManager.getProveedorPorNombreVendedor(nombreProveedor, usuario);
		}
		if (usuario.getRol() == Constants.ID_USR_PROVEEDOR){
			List<Gente> genteListP = new ArrayList<Gente>();
			genteListP.add(articuloManager.getGentePorPK(usuario.getGenteNr()));
			genteList = genteListP; 
		}
		request.setAttribute("genteList", genteList);
		
		return "success";
	}	

	/**
	 * Prepara la busqueda de un Proveedor por Nombre.
	 * 
	 */
	public String findProveedorPorNombre() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Gente> genteList = articuloManager.getProveedorPorNombre(nombreProveedor);
		
		request.setAttribute("genteList", genteList);
		
		return "success";
	}
			
	public String preparedFindRemitosPendientesPorTransac(){
		return "success";
	}
	
	/**
	 * Este Metodo muestra los remitos pendientes de recepcionar por el usuario logeado de Trazabilidad
	 */
	public String preparedListRemitosPendientes() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Transac> transacList = transaccionManager.getRemitosPendientesPorClienteTraza(getUsuarioSesion());
		
		
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		nombre = getUsuarioSesion().getNombre();
		
		request.setAttribute("transacList", transacList);
		
		return "success";
	}

	/**
	 * Este Metodo muestra los OS
	 */
	public String getOSPorNombreList() throws Exception {	        		
	
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
	
		String filter = (String) request.getParameter("q");
		
		List<ObraSocial> genteList = transaccionManager.getObraSocialPorNombre(filter);	
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
	    
		salida.append(FormatUtil.getListHTMLOS(genteList));
		
		
		response.setContentType("text/html; charset=iso-8859-1");
	    //Imprime el resultado
	    try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	/**
	 * Este Metodo muestra los remitos pendientes de enviar por el usuario logeado de Trazabilidad
	 */
	public String preparedSendRemitos() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Transac> transacList = transaccionManager.getRemitosAEnviarTraza(getUsuarioSesion());
		
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		request.setAttribute("transacList", transacList);
		 
		nombre = getUsuarioSesion().getNombre(); 
		
		return "success";
	}
	
	/**
	 * 
	 */
	public String preparedSendRemitosUnid() throws Exception {	        		
		
		return "success";
	}

	/**
	 * Este Metodo muestra los remitos enviados
	 */
	public String preparedListRemitosEnviados() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<Transac> transacList = transaccionManager.getRemitosEnviados(getUsuarioSesion());
		
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		request.setAttribute("transacList", transacList);
		
		nombre = getUsuarioSesion().getNombre();
		
		return "success";
	}

	
	/**
	 * Este Metodo muestra los Medicamentos pendientes de recepcionar por el usuario logeado de Trazabilidad
	 */
	public String viewTrazaIngreso() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		//List<Trazabi> trazabiList = transaccionManager.getTrazabiPorComprobante(transac.getTransacNr());
		List<Trazabi> trazabiList = new ArrayList<Trazabi>();
		if (transac.getTransacNr() == null){
			try{
				transac.setTransacNr(Integer.parseInt(transac.getTransacNrStr()));
			}catch(NumberFormatException ne){
				transac.setTransacNr(0);
			}
		}
		if (porTransac){
			trazabiList = transaccionManager.getTrazabiPorTransacPorTransac(transac.getTransacNr(), getUsuarioSesion());
		}else{
			trazabiList = transaccionManager.getTrazabiPorTransac(transac.getTransacNr());
		}
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		transac = transaccionManager.getTransacByPK(transac.getTransacNr());
		
		request.setAttribute("trazabiList", trazabiList);
		
		fecha = DateUtil.getCanonicalFech(new Date(System.currentTimeMillis()));
		request.setAttribute("fecha", DateUtil.getCanonicalFech(new Date(System.currentTimeMillis())));
		
		return "success";
	}
	
	/**
	 * Este Metodo muestra los Medicamentos envio por el usuario logeado de Trazabilidad
	 */
	public String viewTrazaEgreso() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<TrazabiFarma> trazabiFarmaList = transaccionManager.getTrazabiFarmaPorTransac(transac.getTransacNr());
		
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		transac = transaccionManager.getTransacByPK(transac.getTransacNr());
		
		//Obtengo OB
		List<ObraSocial> obraSocialList = transaccionManager.getAllObraSocial();
		
		// carga la lista de Obras Sociales
		ActionContext.getContext().getSession().put("obraSocialList", obraSocialList);
		
		request.setAttribute("trazabiFarmaList", trazabiFarmaList);
		
		fecha = DateUtil.getCanonicalFech(new Date(System.currentTimeMillis()));
		
		nombre = getUsuarioSesion().getNombre();
		
		return "success";
	}

	
	/**
	 * Este Metodo muestra los Medicamentos envio por el usuario logeado de Trazabilidad
	 */
	public String preparedDevolucion() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		
		
		return "success";
	}
	
	
	/**
	 * Este Metodo muestra los Medicamentos envio por el usuario logeado de Trazabilidad
	 */
	public String viewTrazaEnviados() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		List<TrazabiFarma> trazabiFarmaList = transaccionManager.getTrazabiFarmaPorTransac(transac.getTransacNr());
		
		//gente = articuloManager.getGentePorPK(getUsuarioSesion().getGenteNr());
		
		transac = transaccionManager.getTransacByPK(transac.getTransacNr());
		
		//Obtengo OB
		List<ObraSocial> obraSocialList = transaccionManager.getAllObraSocial();
		
		// carga la lista de Obras Sociales
		ActionContext.getContext().getSession().put("obraSocialList", obraSocialList);
		
		request.setAttribute("trazabiFarmaList", trazabiFarmaList);
		
		nombre = getUsuarioSesion().getNombre();
		
		return "success";
	}

	/**
	 * Este Metodo ingresa los medicamentos por Remito a ANMAT
	 */
	public String recepcionarPorRemito() throws Exception {	        		
			
		HttpServletResponse response =(HttpServletResponse)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		
		Timestamp fecha_ = new Timestamp(System.currentTimeMillis());
		try{
			fecha_ = DateUtil.composeCanonicalFech(fecha);
		}catch(Exception e){
			ServletOutputStream sos = null;
			try {
				sos = response.getOutputStream();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			
			StringBuilder salida = new StringBuilder();
	        
			salida.append("Error en el formato de Fecha ingresado el formato debe ser (aaaammdd)");

			response.setContentType("text/html; charset=iso-8859-1");
	        //Imprime el resultado
	        try {
				sos.print(salida.toString());
			} catch (IOException yye) {
				yye.printStackTrace();
			}
			
			return null;	
		}
		
		String result = transaccionManager.sendRemitoAnmat(transac.getTransacNr(), getUsuarioSesion(), fecha_.getTime());	
		
		
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;	
		
	}
	
	
	/**
	 * Este metodo devuelve el remito en formato PDF
	 * @return 
	 * @author Carrascal
	 */
	public String downloadRemitoFarma(){
		
			HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);									
			
			byte[] fileDownload = reporteadorPdfManager.parametros_reporte("remitoFarma", nrStr, "remitoFarma");						
	    	
			int length   = 0;
			
			ServletOutputStream sos;
			try {
				sos = response.getOutputStream();
			
					
			response.setHeader("Content-disposition", "attachment; filename=" + nrStr + ".pdf");        
			response.setHeader("Pragma", "Public");        
			response.setContentType("application/octet-stream");   
			
			
			response.setContentType("application/pdf");
			OutputStream out=response.getOutputStream();
			out.write(fileDownload);
			out.flush();
			out.close();		
			}catch(Exception e){
				e.printStackTrace();
			}												
	
		return null;
	}
	
	
	/**
	 * Este metodo devuelve el remito en formato PDF
	 * @return 
	 * @author Carrascal
	 */
	public String downloadRemito(){
		
			HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);									
			
			byte[] fileDownload = reporteadorPdfManager.parametros_reporte("transacNr", transac.getTransacNr(), "remito");						
	    	
			int length   = 0;
			
			ServletOutputStream sos;
			try {
				sos = response.getOutputStream();
			
					
			response.setHeader("Content-disposition", "attachment; filename=" + transac.getTransacNr() + ".pdf");        
			response.setHeader("Pragma", "Public");        
			response.setContentType("application/octet-stream");   
			
			
			response.setContentType("application/pdf");
			OutputStream out=response.getOutputStream();
			out.write(fileDownload);
			out.flush();
			out.close();		
			}catch(Exception e){
				e.printStackTrace();
			}												
	
		return null;
	}

	
	/**
	 * Este Metodo envia los medicamentos por Remito a ANMAT
	 */
	public String enviarPorRemito() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		HttpServletResponse response =(HttpServletResponse)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		
		Timestamp fecha_ = new Timestamp(System.currentTimeMillis());
		try{
			fecha_ = DateUtil.composeCanonicalFech(fecha);
		}catch(Exception e){
			ServletOutputStream sos = null;
			try {
				sos = response.getOutputStream();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			
			StringBuilder salida = new StringBuilder();
	        
			salida.append("Error en el formato de Fecha ingresado el formato debe ser (aaaammdd)");

			response.setContentType("text/html; charset=iso-8859-1");
	        //Imprime el resultado
	        try {
				sos.print(salida.toString());
			} catch (IOException yye) {
				yye.printStackTrace();
			}
			
			return null;	
		}
		
		String result = transaccionManager.sendRemitoEgresoAnmat(transac.getTransacNr(), getUsuarioSesion(), datosTrazaWS,fecha_.getTime());						
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	/**
	 * Este Metodo envia los medicamentos por Remito a ANMAT
	 */
	public String enviarPorRemitoUnid() throws Exception {	        		
		
		HttpServletRequest request =(HttpServletRequest)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
				
		HttpServletResponse response =(HttpServletResponse)ActionContext.getContext().getActionInvocation().getInvocationContext().get(ServletActionContext.HTTP_RESPONSE);
		
		List<TrazabiFarma> trazabiFarmaSessionList = (List<TrazabiFarma>)request.getSession().getAttribute("trazabiFarmaList");
		
		String result = "";
		if (trazabiFarmaSessionList != null && trazabiFarmaSessionList.size() > 0){			
			result = transaccionManager.sendRemitoEgresoAnmatUnid(trazabiFarmaSessionList, getUsuarioSesion(), datosTrazaWS);								
		}else{
			result = "Debe ingresar al menos una caja";
		}
		
		ServletOutputStream sos = null;
		try {
			sos = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder salida = new StringBuilder();
        
		salida.append(result);

		response.setContentType("text/html; charset=iso-8859-1");
        //Imprime el resultado
        try {
			sos.print(salida.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}