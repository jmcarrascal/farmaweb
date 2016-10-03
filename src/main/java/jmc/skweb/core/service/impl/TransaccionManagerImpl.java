package jmc.skweb.core.service.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.WebServiceError;

import jmc.skweb.core.dao.ClieArticPrecioDAO;
import jmc.skweb.core.dao.DomiciliosDAO;
import jmc.skweb.core.dao.GenericDAO;
import jmc.skweb.core.dao.GenteDAO;
import jmc.skweb.core.dao.ItemsDAO;
import jmc.skweb.core.dao.StockDAO;
import jmc.skweb.core.dao.TransacDAO;
import jmc.skweb.core.dao.TrazabiDAO;
import jmc.skweb.core.dao.TrazabiFarmaDAO;
import jmc.skweb.core.model.ClieArticPrecio;
import jmc.skweb.core.model.Domicilios;
import jmc.skweb.core.model.DondeEstaFactuMail;
import jmc.skweb.core.model.EmpresaWeb;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Impuestos;
import jmc.skweb.core.model.Items;
import jmc.skweb.core.model.Numeraciones;
import jmc.skweb.core.model.Parametrizacion;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.TipoComprob;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.Usuario;
import jmc.skweb.core.model.UsuarioWeb;
import jmc.skweb.core.model.report.TipoReporte;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.traza.Despachos;
import jmc.skweb.core.model.traza.ObraSocial;
import jmc.skweb.core.model.traza.ResultSendMedicamento;
import jmc.skweb.core.model.traza.Trazabi;
import jmc.skweb.core.model.traza.TrazabiFarma;
import jmc.skweb.core.model.traza.report.DatosTrazaWS;
import jmc.skweb.core.service.ServiceTrazaManager;
import jmc.skweb.core.service.TransaccionManager;
import jmc.skweb.core.service.UsuarioManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.DateUtil;
import jmc.skweb.util.FormatUtil;
import jmc.skweb.util.MathUtil;
import jmc.skweb.util.PreferenciasUtil;
import jmc.skweb.util.email.Email;

/**
 * @author Juan Manuel Carrascal
 *
 */
/**
 * @author Administrator
 *
 */
/**
 * @author vaio
 * 
 */
public class TransaccionManagerImpl implements TransaccionManager {

	private GenteDAO extendedGenteDAO;
	private TransacDAO extendedTransacDAO;
	private DomiciliosDAO extendedDomiciliosDAO;
	private ItemsDAO extendedItemsDAO;
	private GenericDAO<TipoComprob> tipoComprobDAO;
	private GenericDAO<DondeEstaFactuMail> dondeEstaFactuMailDAO;
	private ClieArticPrecioDAO extendedClieArticPrecioDAO;
	private StockDAO extendedStockDAO;
	private GenericDAO<Numeraciones> numeracionesDAO;
	private UsuarioManager usuarioManager;
	private GenericDAO<Parametrizacion> parametrizacionDAO;
	private TrazabiDAO extendedTrazabiDAO;
	private TrazabiFarmaDAO extendedTrazabiFarmaDAO;
	private GenericDAO<Despachos> despachosDAO;
	private GenericDAO<EmpresaWeb> empresaWebDAO;
	private ServiceTrazaManager serviceTrazaManager;
	private GenericDAO<ObraSocial> obraSocialDAO;
	
	
	
	
	
	
	
	
	
	
	
	
	public GenericDAO<ObraSocial> getObraSocialDAO() {
		return obraSocialDAO;
	}

	public void setObraSocialDAO(GenericDAO<ObraSocial> obraSocialDAO) {
		this.obraSocialDAO = obraSocialDAO;
	}

	public ServiceTrazaManager getServiceTrazaManager() {
		return serviceTrazaManager;
	}

	public void setServiceTrazaManager(ServiceTrazaManager serviceTrazaManager) {
		this.serviceTrazaManager = serviceTrazaManager;
	}

	public GenericDAO<EmpresaWeb> getEmpresaWebDAO() {
		return empresaWebDAO;
	}

	public void setEmpresaWebDAO(GenericDAO<EmpresaWeb> empresaWebDAO) {
		this.empresaWebDAO = empresaWebDAO;
	}

	public GenericDAO<Despachos> getDespachosDAO() {
		return despachosDAO;
	}

	public void setDespachosDAO(GenericDAO<Despachos> despachosDAO) {
		this.despachosDAO = despachosDAO;
	}

	public TrazabiFarmaDAO getExtendedTrazabiFarmaDAO() {
		return extendedTrazabiFarmaDAO;
	}

	public void setExtendedTrazabiFarmaDAO(TrazabiFarmaDAO extendedTrazabiFarmaDAO) {
		this.extendedTrazabiFarmaDAO = extendedTrazabiFarmaDAO;
	}

	public TrazabiDAO getExtendedTrazabiDAO() {
		return extendedTrazabiDAO;
	}

	public void setExtendedTrazabiDAO(TrazabiDAO extendedTrazabiDAO) {
		this.extendedTrazabiDAO = extendedTrazabiDAO;
	}

	public GenericDAO<Parametrizacion> getParametrizacionDAO() {
		return parametrizacionDAO;
	}

	public void setParametrizacionDAO(GenericDAO<Parametrizacion> parametrizacionDAO) {
		this.parametrizacionDAO = parametrizacionDAO;
	}

	public UsuarioManager getUsuarioManager() {
		return usuarioManager;
	}

	public void setUsuarioManager(UsuarioManager usuarioManager) {
		this.usuarioManager = usuarioManager;
	}

	public GenericDAO<Numeraciones> getNumeracionesDAO() {
		return numeracionesDAO;
	}

	public void setNumeracionesDAO(GenericDAO<Numeraciones> numeracionesDAO) {
		this.numeracionesDAO = numeracionesDAO;
	}

	public StockDAO getExtendedStockDAO() {
		return extendedStockDAO;
	}

	public void setExtendedStockDAO(StockDAO extendedStockDAO) {
		this.extendedStockDAO = extendedStockDAO;
	}	
	
	public DomiciliosDAO getExtendedDomiciliosDAO() {
		return extendedDomiciliosDAO;
	}

	public void setExtendedDomiciliosDAO(DomiciliosDAO extendedDomiciliosDAO) {
		this.extendedDomiciliosDAO = extendedDomiciliosDAO;
	}

	public ClieArticPrecioDAO getExtendedClieArticPrecioDAO() {
		return extendedClieArticPrecioDAO;
	}

	public void setExtendedClieArticPrecioDAO(
			ClieArticPrecioDAO extendedClieArticPrecioDAO) {
		this.extendedClieArticPrecioDAO = extendedClieArticPrecioDAO;
	}

	public ItemsDAO getExtendedItemsDAO() {
		return extendedItemsDAO;
	}

	public void setExtendedItemsDAO(ItemsDAO extendedItemsDAO) {
		this.extendedItemsDAO = extendedItemsDAO;
	}

	public GenericDAO<DondeEstaFactuMail> getDondeEstaFactuMailDAO() {
		return dondeEstaFactuMailDAO;
	}

	public void setDondeEstaFactuMailDAO(
			GenericDAO<DondeEstaFactuMail> dondeEstaFactuMailDAO) {
		this.dondeEstaFactuMailDAO = dondeEstaFactuMailDAO;
	}

	public GenericDAO<TipoComprob> getTipoComprobDAO() {
		return tipoComprobDAO;
	}

	public void setTipoComprobDAO(GenericDAO<TipoComprob> tipoComprobDAO) {
		this.tipoComprobDAO = tipoComprobDAO;
	}

	public GenteDAO getExtendedGenteDAO() {
		return extendedGenteDAO;
	}

	public void setExtendedGenteDAO(GenteDAO extendedGenteDAO) {
		this.extendedGenteDAO = extendedGenteDAO;
	}

	public TransacDAO getExtendedTransacDAO() {
		return extendedTransacDAO;
	}

	public void setExtendedTransacDAO(TransacDAO extendedTransacDAO) {
		this.extendedTransacDAO = extendedTransacDAO;
	}

	/**
	 * Agrega un Item a la Lista (non-Javadoc)
	 * 
	 * @see jmc.skweb.core.service.TransaccionManager#addItem(java.util.List,
	 *      jmc.skweb.core.model.Items)
	 */
	public List<Items> addItem(List<Items> itemsSessionList, Items items, Usuario usuario) {
		if (usuario.getRol() == Constants.ID_USR_CLIENTE){
			items.setPrecio(getPrecioClienteArticulo(usuario.getGenteSession().getGenteNr(), items.getClave()));
			items.setBonif(new BigDecimal(usuario.getGenteSession().getBonifStd()));
		}		
		Integer cantidad = itemsSessionList.size();
		items.setArticulo(items.getClave().toUpperCase());
		items.setTalle(".");
		try{
		items.setExi(PreferenciasUtil.comparePreferencia(usuario.getListPreferencias(), Constants.PREF_ID_EXISTENCIA_DEFAULT).intValue());
		}catch(NumberFormatException ne){
			ne.printStackTrace();
		}
		items.setColo(0);
		items.setFechaTransac(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		items.setFecha(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		items.setNrFabInt(".");
		items.setLetra("X");
		cantidad++;
		items.getId().setItemNr(cantidad);
		BigDecimal bonif = MathUtil.redondearEn4BD(items.getBonif().divide(
				new BigDecimal(100)));
		BigDecimal bruto = (items.getPrecio().multiply(items.getCant1()));
		BigDecimal totalItem = bruto.subtract(bruto.multiply(bonif));
		items.setNrCompInt(String.valueOf(MathUtil.redondearEn2BD(totalItem)));
		totalItem = MathUtil.redondearEn2BD(totalItem);
		items.setTotalItem(totalItem);
		// Calculo el impueto del Item
		items = generateImpuesto(items);
		itemsSessionList.add(items);
		return itemsSessionList;
	}

	/**
	 * Calculo impuesto de un articulo
	 */
	private Items generateImpuesto(Items item) {
		Stock articulo = extendedStockDAO.getByPrimaryKey(item.getArticulo());
		Impuestos impuesto = articulo.getImpuestos();
		item.setPorcentajeImpuesto(impuesto.getAlicuota());
		item.setTotalImpuesto(item.getTotalItem()
				.multiply(new BigDecimal(impuesto.getAlicuota()))
				.divide(new BigDecimal(100)));
		return item;
	}

	/**
	 * Elimina un Item
	 */
	public List<Items> removeItem(List<Items> itemsSessionList, Items items) {
		itemsSessionList.remove(items.getId().getItemNr() - 1);
		Integer i = 1;
		for (Items itemsL : itemsSessionList) {
			itemsL.getId().setItemNr(i);
			i++;
		}
		return itemsSessionList;
	}

	public Transac calculoTotales(List<Items> itemsSessionList) {
		Transac transac = new Transac();
		BigDecimal subTotal = new BigDecimal(0);
		BigDecimal totalImpuestos = new BigDecimal(0);
		for (Items itemsL : itemsSessionList) {
			subTotal = subTotal.add(itemsL.getTotalItem());
			totalImpuestos = totalImpuestos.add(itemsL.getTotalImpuesto());
		}
		subTotal = MathUtil.redondearEn2BD(subTotal);
		totalImpuestos = MathUtil.redondearEn2BD(totalImpuestos);
		transac.setNetoGrav(subTotal);
		transac.setIva(totalImpuestos);
		transac.setTotal(subTotal.add(totalImpuestos));
		return transac;
	}

	public BigDecimal getPrecioClienteArticulo(Integer genteNr, String clave) {
		BigDecimal precio = new BigDecimal(0);
		// Obtengo la lista de Precios
		Gente gente = extendedGenteDAO.getByPrimaryKey(genteNr);
		Integer listaPrecio = gente.getListaPrecio();

		ClieArticPrecio clieArticPrecio = extendedClieArticPrecioDAO
				.getPrecioClienteArticulo(genteNr, clave);

		if (clieArticPrecio != null) {
			switch (listaPrecio) {
			case 1:
				precio = clieArticPrecio.getP1();
				break;
			case 2:
				precio = clieArticPrecio.getP2();
				break;
			case 3:
				precio = clieArticPrecio.getP3();
				break;
			case 4:
				precio = clieArticPrecio.getP4();
				break;
			case 5:
				precio = clieArticPrecio.getP5();
				break;
			case 6:
				precio = clieArticPrecio.getP6();
				break;
			default:
				precio = new BigDecimal(0);
				break;
			}
		} else {
			Stock stock = extendedStockDAO.getByPrimaryKey(clave);
			switch (listaPrecio) {
			case 1:
				precio = stock.getPrecio1();
				break;
			case 2:
				precio = stock.getPrecio2();
				break;
			case 3:
				precio = stock.getPrecio3();
				break;
			case 4:
				precio = stock.getPrecio4();
				break;
			case 5:
				precio = stock.getPrecio5();
				break;
			case 6:
				precio = stock.getPrecio6();
				break;
			default:
				precio = new BigDecimal(0);
				break;
			}

		}
		return precio;
	}

	public String saveTransac_OP(List<Items> itemsSessionList, Integer genteNr,
			Integer empresaNrSk, String fechaEntrega, Transac transacRequest, int tipoComprobNr, Usuario usuario) throws Exception {
		Transac transac = new Transac();
		//
		// Obtengo el numero de transaccion
		Integer transacNr = getUltimaNumeracion(Constants.ID_NUMERACIONES_TRANSAC);
		transacNr = Integer.parseInt(String.valueOf(transacNr) + empresaNrSk);
		
		transac = buildTransac(itemsSessionList, transacNr, genteNr, tipoComprobNr, usuario);
		
		//Casteo la fecha entrega
		if (fechaEntrega != null && !fechaEntrega.trim().equals("")){
			transac.setFechaEntrega(DateUtil.composeCanonicalFechPresentation(fechaEntrega));
		}
		//Seteo las Observaciones
		transac.setObservaciones(transacRequest.getObservaciones());
		String result = "error";
		try {
			String oficialCuentaIdOpe= null;
			//Envoo el Mail al Oficial de Cuenta
			UsuarioWeb activUser = usuarioManager.getUsuarioByPK(usuario.getIdUsuario());
			String subject = "";
			String msg = "";					
			Email email = null;
			switch (usuario.getRol()) {
			case Constants.ID_USR_GERENTE:			
				subject = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_SUBJECT_NEW_TRANSAC).getValor().replace("@Vendedor", activUser.getDescripC()).replace("@tipoUsuario", "Operador");
				msg = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_NEW_TRANSAC).getValor().replace("@tipoComprob", transac.getTipoComprob().getDescripcion()).replace("@transacNr", String.valueOf(transac.getTransacNr()));					
				email = new Email(subject,msg,null,activUser.getEmail());
				oficialCuentaIdOpe = String.valueOf(activUser.getOperadorNr());
				usuarioManager.sendMail(email);													
				break;
			case Constants.ID_USR_OPERADOR:				
				subject = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_SUBJECT_NEW_TRANSAC).getValor().replace("@Vendedor", activUser.getDescripC()).replace("@tipoUsuario", "Operador");
				msg = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_NEW_TRANSAC).getValor().replace("@tipoComprob", transac.getTipoComprob().getDescripcion()).replace("@transacNr", String.valueOf(transac.getTransacNr()));					
				email = new Email(subject,msg,null,activUser.getEmail());
				usuarioManager.sendMail(email);									
				oficialCuentaIdOpe = String.valueOf(activUser.getOperadorNr());
				break;
			case Constants.ID_USR_VENDEDOR:						
				if (activUser != null){
					if (activUser.getRol().getIdRol() == Constants.ID_USR_VENDEDOR){
						UsuarioWeb oficialCuenta = usuarioManager.getUsuarioByPK(activUser.getIdOficialCuenta());
						if (oficialCuenta != null){					
							subject = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_SUBJECT_NEW_TRANSAC).getValor().replace("@Vendedor", activUser.getDescripC()).replace("@tipoUsuario", "Vendedor");
							msg = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_NEW_TRANSAC).getValor().replace("@tipoComprob", transac.getTipoComprob().getDescripcion()).replace("@transacNr", String.valueOf(transac.getTransacNr()));					
							email = new Email(subject,msg,null,oficialCuenta.getEmail());
							usuarioManager.sendMail(email);					
							oficialCuentaIdOpe = String.valueOf(oficialCuenta.getOperadorNr());
						}
					}
				}				
				break;		
			case Constants.ID_USR_CLIENTE:						
				if (activUser != null){
					String nombreCliente = extendedGenteDAO.getByPrimaryKey(activUser.getGenteNr()).getDescripC(); 
					// Buscar su vendedor 					
					UsuarioWeb vendedor = usuarioManager.getUsuarioByVendedor(activUser.getGenteNr());
					if (vendedor != null){
					//Envio Mail al vendedor
					subject = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_SUBJECT_NEW_TRANSAC).getValor().replace("@Vendedor", nombreCliente).replace("@tipoUsuario", "Cliente");
					msg = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_NEW_TRANSAC).getValor().replace("@tipoComprob", transac.getTipoComprob().getDescripcion()).replace("@transacNr", String.valueOf(transac.getTransacNr()));					
					email = new Email(subject,msg,null,vendedor.getEmail());
					usuarioManager.sendMail(email);													
					//Encuentro al Oficial de cuentas
						UsuarioWeb oficialCuenta = usuarioManager.getUsuarioByPK(vendedor.getIdOficialCuenta());
						if (oficialCuenta != null){					
							subject = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_SUBJECT_NEW_TRANSAC).getValor().replace("@Vendedor", nombreCliente).replace("@tipoUsuario", "Cliente");
							msg = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_NEW_TRANSAC).getValor().replace("@tipoComprob", transac.getTipoComprob().getDescripcion()).replace("@transacNr", String.valueOf(transac.getTransacNr()));					
							email = new Email(subject,msg,null,oficialCuenta.getEmail());
							usuarioManager.sendMail(email);					
							oficialCuentaIdOpe = String.valueOf(oficialCuenta.getOperadorNr());
						}					
					}
				}				
				break;		
			}
			transac.setProce(oficialCuentaIdOpe);
			extendedTransacDAO.save(transac);
			result = String.valueOf(transacNr);
			

			
			
			
			usuario.getIdUsuario();
		} catch (Exception e) {
			e.printStackTrace();
			result = "error";
		}
		return result;
	}

	public Transac buildTransac(List<Items> itemsSessionList,
			Integer transacNr, Integer genteNr, int tipoComprobNr, Usuario usuario) {
		Transac transac = calculoTotales(itemsSessionList);
		transac.setTransacNr(transacNr);
		// Obtengo el agendado
		Gente gente = extendedGenteDAO.getByPrimaryKey(genteNr);
		transac.setGente(gente);
		transac.setFecha(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		transac.setFechaTransac(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		// Obtengo el tipo de comprobante
		TipoComprob tipoComprob = tipoComprobDAO.getByPrimaryKey(tipoComprobNr);
		transac.setTipoComprob(tipoComprob);
		transac.setLetra("X");
		transac.setTranFactCred(0);
		transac.setObservaciones(".");
		// Agrego valores a los Items
		for (Items item : itemsSessionList) {
			item.setTipoComprob(tipoComprob);
			item.setFecha(new Date(System.currentTimeMillis()));
			item.setGenteNr(gente.getGenteNr());
			item.setFechaTransac(new Date(System.currentTimeMillis()));
			item.getId().setTransac(transac);
		}
		//Cargo Prfijo FIJO en 0000
		transac.setPrefijo("0000");
		transac.setVendedor(gente.getVendedorNr());
		transac.setCobrador(gente.getCobradorNr());
		transac.setCondiciones(gente.getCondVta());
		transac.setTipoIva(gente.getImpuestos().getNr());
		transac.setAlicuotaIva(gente.getImpuestos().getAlicuota());
		transac.setItemsList(itemsSessionList);
		transac.setSaldo(transac.getTotal());
		transac.setNrDomicilioEnt(extendedDomiciliosDAO.getDomicilioPrincipal(gente.getGenteNr()).getId().getDomiNr());
		Integer idNumeracionComprom = 0; 
			switch (tipoComprobNr) {
			case 8:
				idNumeracionComprom = getUltimaNumeracion(Constants.ID_NUMERACIONES_PEDIDO_VTA);
				break;
			case 15:
				idNumeracionComprom = getUltimaNumeracion(Constants.ID_NUMERACIONES_PEDIDO_COMPRA);
				break;
			case 16:
				idNumeracionComprom = getUltimaNumeracion(Constants.ID_NUMERACIONES_PROFORMA);
				break;
			}			
		transac.setNrComprob(FormatUtil.llenoConCeros(String.valueOf(idNumeracionComprom), 8));
		if (usuario.getOperadorNr() != null){
			transac.setNrOperador(usuario.getOperadorNr());
		}else{
			transac.setNrOperador(99);
		}		
		transac.setDestino(-5);
		return transac;
	}

	public Integer getUltimaNumeracion(Integer tipoNumeracion) {
		Numeraciones ultimaNumeracion = numeracionesDAO
				.getByPrimaryKey(tipoNumeracion);
		Integer valor = ultimaNumeracion.getLetraA() + 1;
		ultimaNumeracion.setLetraA(valor);
		numeracionesDAO.update(ultimaNumeracion);
		return valor;
	}

	public String getArticuloPorClave(String clave) {
		Stock stock = extendedStockDAO.getByPrimaryKey(clave);
		if (stock != null) {
			return stock.getDescripcion();
		} else {
			return "";
		}

	}

	public BigDecimal getBonifPorCadena(String bonif1, String bonif2,
			String bonif3, String bonif4) {
		BigDecimal[] cadena = new BigDecimal[4];
		BigDecimal cero = new BigDecimal(0);
		BigDecimal result = new BigDecimal(0);
		if (bonif1 == null || bonif1.trim().equals("")) {
			bonif1 = "0";
		}
		try {
			cadena[0] = new BigDecimal(bonif1);
		} catch (NumberFormatException ne) {
			cadena[0] = cero;
		}

		if (bonif2 == null || bonif2.trim().equals("")) {
			bonif2 = "0";
		}
		try {
			cadena[1] = new BigDecimal(bonif2);
		} catch (NumberFormatException ne) {
			cadena[1] = cero;
		}

		if (bonif3 == null || bonif3.trim().equals("")) {
			bonif3 = "0";
		}
		try {
			cadena[2] = new BigDecimal(bonif3);
		} catch (NumberFormatException ne) {
			cadena[2] = cero;
		}

		if (bonif4 == null || bonif4.trim().equals("")) {
			bonif4 = "0";
		}
		try {
			cadena[3] = new BigDecimal(bonif4);
		} catch (NumberFormatException ne) {
			cadena[3] = cero;
		}
		result = MathUtil.getPorcentajeEnCadena(cadena);
		return result;
	}

	public String getFormatCadena(String bonif1, String bonif2, String bonif3,
			String bonif4) {

		String result = FormatUtil.llenoDosCeros(bonif1) + "+"
				+ FormatUtil.llenoDosCeros(bonif2) + "+"
				+ FormatUtil.llenoDosCeros(bonif3) + "+"
				+ FormatUtil.llenoDosCeros(bonif4);
		return result;
	}

	
	public List<Items> editItem(List<Items> itemsSessionList, Items items, Usuario usuario) {
		if (usuario.getRol() == Constants.ID_USR_CLIENTE){
			items.setPrecio(getPrecioClienteArticulo(usuario.getGenteSession().getGenteNr(), items.getClave()));
			items.setBonif(new BigDecimal(usuario.getGenteSession().getBonifStd()));
		}
		
		items.setArticulo(items.getClave().toUpperCase());				
		BigDecimal bonif = MathUtil.redondearEn4BD(items.getBonif().divide(
				new BigDecimal(100)));
		BigDecimal bruto = (items.getPrecio().multiply(items.getCant1()));
		BigDecimal totalItem = bruto.subtract(bruto.multiply(bonif));
		items.setNrCompInt(String.valueOf(MathUtil.redondearEn2BD(totalItem)));
		totalItem = MathUtil.redondearEn2BD(totalItem);
		items.setTotalItem(totalItem);
		// Calculo el impueto del Item
		items.setTalle(".");
		try{
		items.setExi(PreferenciasUtil.comparePreferencia(usuario.getListPreferencias(), Constants.PREF_ID_EXISTENCIA_DEFAULT).intValue());
		}catch(NumberFormatException ne){
			ne.printStackTrace();
		}
		items.setColo(0);
		items.setFechaTransac(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		items.setFecha(DateUtil.composeCanonicalFechPresentationDate(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis()))));
		items.setNrFabInt(".");
		items.setLetra("X");
		items = generateImpuesto(items);
		List<Items> listItemsNueva = new ArrayList<Items>();
		for(Items itemsU:itemsSessionList){
			if(itemsU.getId().getItemNr() == items.getId().getItemNr()){
				listItemsNueva.add(items);
			}else{
				listItemsNueva.add(itemsU);
			}
		}
		return listItemsNueva;
	}

	
	public List<TipoComprob> getTipoComprobEnable(Integer rol) {
	List<TipoComprob> tipoComprobList = new ArrayList<TipoComprob>();
	switch (rol) {
	case Constants.ID_USR_GERENTE:
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(8));
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(15));
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(16));	
		break;

	case Constants.ID_USR_VENDEDOR:
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(8));
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(16));
		break;
		
	case Constants.ID_USR_CLIENTE:
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(8));
		tipoComprobList.add(tipoComprobDAO.getByPrimaryKey(16));
		break;
	default:
		break;
	}
		return tipoComprobList;
	}


	public TipoComprob getTipoComprobByPK(int nr) {
		TipoComprob tipoComprob = new TipoComprob();
		tipoComprob = tipoComprobDAO.getByPrimaryKey(nr);
		
		return tipoComprob; 
	}


	public List<TipoComprob> getTipoComprobAll() {
		List<TipoComprob> tipoComprobList = tipoComprobDAO.getAll();
		return tipoComprobList;
	}


	public List<TipoReporte> getTipoReporteAll() {
		TipoReporte tipoReporte1 = new TipoReporte(1, "Solo Impagos Ventas");
		TipoReporte tipoReporte2 = new TipoReporte(2, "Resumen Cuenta Corriente Ventas");
		TipoReporte tipoReporte3 = new TipoReporte(3, "Solo Impagos Compras");
		TipoReporte tipoReporte4 = new TipoReporte(4, "Resumen Cuenta Corriente Compras");
		List<TipoReporte> tipoReporteList = new ArrayList<TipoReporte>();
		tipoReporteList.add(tipoReporte1);
		tipoReporteList.add(tipoReporte2);
		tipoReporteList.add(tipoReporte3);
		tipoReporteList.add(tipoReporte4);
		return tipoReporteList;
	}

	
	public Gente getGenteConDomiPrinc(Integer genteNr) {
		Gente gente = extendedGenteDAO.getByPrimaryKey(genteNr);
		gente.setDomicilioPricipal(extendedDomiciliosDAO.getDomicilioPrincipal(genteNr));
		return gente;
	}

	
	public List<TipoReporte> getTipoReporteTesoreria() {
		TipoReporte tipoReporte1 = new TipoReporte(5, "Cheques Rechazados");
		List<TipoReporte> tipoReporteList = new ArrayList<TipoReporte>();
		tipoReporteList.add(tipoReporte1);
		return tipoReporteList;
	}

	
	public String getArticuloPorClave(String clave, boolean articuloActivo) {		
		return extendedStockDAO.getArticuloPorPK(clave, articuloActivo);
	}

	
	public String getTransacJoin(int nr, String clave, Usuario usuarioSesion) {
		List<TransacJoin> transacJoinList = extendedTransacDAO.getTransacJoin(nr,clave);
		String tipoComprob = tipoComprobDAO.getByPrimaryKey(nr).getDescripcion();
		String result = FormatUtil.getTableHTMLPedido(transacJoinList,tipoComprob);		
		return result;
	}

	public Transac getTransacByPK(Integer transacNr) {
		return extendedTransacDAO.getByPrimaryKey(transacNr);		
	}
	
	public Domicilios getDomiciliosAdm(Gente gente) {
		return extendedDomiciliosDAO.getDomicilioAdm(gente.getGenteNr());
	}
	
	public List<Transac> getRemitosPendientesPorClienteTraza(
			Usuario usuarioSesion) {
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		Integer transacDesde = 0;
		try{
			transacDesde = Integer.parseInt(parametrizacionDAO.getByPrimaryKey(Constants.ID_TRANSAC_DESDE).getValor());	
		}catch(NumberFormatException e){
			transacDesde = 0;
		}
		
		Gente gente = null;//extendedGenteDAO.getByPrimaryKey(usuarioSesion.getGenteNr());		
		List<Transac> transacList = extendedTransacDAO.getRemitosPendientesPorClienteTraza(gente,transacDesde, em.getGln());
		return transacList;
	}


	public List<Trazabi> getTrazabiPorComprobante(Integer transacNr) {
		Transac transac = extendedTransacDAO.getByPrimaryKey(transacNr);
		String comprob = transac.getPrefijo() + "-" + transac.getNrComprob();
		List<Trazabi> trazabiList = extendedTrazabiDAO.getTrazabiPorComprobante(comprob);
		return trazabiList;
	}

	
	public List<Trazabi> getTrazabiPorTransac(Integer transacNr) {
		List<Trazabi> trazabiList = extendedTrazabiDAO.getTrazabiPorTransac(transacNr);
		return trazabiList;
	}

	public List<TrazabiFarma> getTrazabiFarmaPorTransac(Integer transacNr) {
		Transac transac = extendedTransacDAO.getByPrimaryKey(transacNr);
		String comprob = transac.getPrefijo() + "-" + transac.getNrComprob();
		List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getTrazabiFarmaPorTransac(transac.getTransacNr());
		return trazabiFarmaList;
	}

	public String sendRemitoAnmat(Integer transacNr, Usuario usuario, Long fechaEvento) {
		String result = "";
		String resultFinal = "";
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuario.getIdEmpresa());
		//Copiar datos del Trazabi a TrazabiFarma
		Transac transac = extendedTransacDAO.getByPrimaryKey(transacNr);
		//Obtengo los datos de Trazabi
		List<Trazabi> trazabiList = extendedTrazabiDAO.getTrazabiPorTransac(transac.getTransacNr());
		//Castear Trazabi a TrazabiFarma
		List<TrazabiFarma> trazabiFarmaList = castTrazabiToFarma(trazabiList, usuario.getGenteNr(),fechaEvento);
		//Inserto los registros a TrazabiFarmaDAO
		FormatUtil fu = new FormatUtil();		
		
		for (TrazabiFarma trazabiFarma: trazabiFarmaList){
			TrazabiFarma verifTrazabiFarma = extendedTrazabiFarmaDAO.getBySerie(trazabiFarma.getSerieGtin(), trazabiFarma.getGtin(), trazabiFarma.getTransacNr(), true, false, trazabiFarma.getStock().getClave(), trazabiFarma.getNrTrazabi());
			boolean creoTrazabiFarma = false;
			if (verifTrazabiFarma == null){
				creoTrazabiFarma = true;
			}else{
				try{
					Long res = Long.parseLong(verifTrazabiFarma.getRespuestaIngreso());
					creoTrazabiFarma = false;
				}catch(NumberFormatException newe){
					extendedTrazabiFarmaDAO.remove(verifTrazabiFarma);
					creoTrazabiFarma = true;
				}
			}
			if (creoTrazabiFarma){
			//Cargo el Lote
				if (em.getTipoEmpresa() != null && em.getTipoEmpresa() == 1 ){
					//Es un Centro asistencial
					trazabiFarma.setCodEventoIng(74);
				}else{
					trazabiFarma.setCodEventoIng(101);
				}	
				
				trazabiFarma.setLoteStr(getLote(trazabiFarma.getNrlote()));			
				trazabiFarma.setProcesoIngreso(true);
				trazabiFarma.setProcesoEgreso(false);
				
				extendedTrazabiFarmaDAO.save(trazabiFarma);
				SendMedicamentosE sm = null;
				SendMedicamentosResponseE sr = null;
				ResultSendMedicamento r = null;
				if (trazabiFarma.getTrazaObli() == -1){
					try {					
							sm = fu.makeSendMedicamentosCompraDocument(trazabiFarma,em.getUsrPami().trim(),em.getPassPami().trim());					
						//Informar a ANMAT el ingreso de todos los medicamentos
						try {
							r = serviceTrazaManager.confifTransac(trazabiFarma.getGtin(), trazabiFarma.getSerieGtin(),em.getUsrPami().trim(),em.getPassPami().trim(), em.getUrlTraza());
						} catch (Exception e) {
							result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
							e.printStackTrace();
						}
					} catch (Exception e) {
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
						e.printStackTrace();
					}			
					if (r != null){
						if (r.getTransacNr() != null && !r.getTransacNr().equals("")){
							trazabiFarma.setRespuestaIngreso(r.getTransacNr());
							trazabiFarma.setErrores(r.getErrores());
							extendedTrazabiFarmaDAO.update(trazabiFarma);
							result = "OK";
						}else{
							result = r.getErrores();
						}
					}else{
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
					}	
				}else{
					result = "OK";
				}
				if (!result.equals("OK")){
					resultFinal = resultFinal + " [Serie: " + trazabiFarma.getSerieGtin()+ "] " + result + "<br>";
					extendedTrazabiFarmaDAO.remove(trazabiFarma);				
				}	
			}
		}
		
		if (resultFinal.equals("")){
			resultFinal = "OK";
		}
		return resultFinal;		
	}
	
	private ResultSendMedicamento getResult (SendMedicamentosResponseE smr){
		String resultado = "";
		ResultSendMedicamento r = new ResultSendMedicamento();
		if (!smr.getSendMedicamentosResponse().get_return().getResultado()) {
			if (smr.getSendMedicamentosResponse().get_return().getErrores() != null) {
				WebServiceError[] wseArray = smr.getSendMedicamentosResponse().get_return().getErrores();
				for (WebServiceError wse : wseArray) {
					System.out.println(wse.get_d_error());
					resultado = wse.get_d_error();
					r.setExito(false);
					r.setErrores(resultado);
				}
			}
		} else {
			// Actulizo trazabi
			r.setExito(true);
			r.setTransacNr(smr.getSendMedicamentosResponse().get_return().getCodigoTransaccion());	
			System.out.println("Nr Transac Respuesta: "+ smr.getSendMedicamentosResponse().get_return().getCodigoTransaccion());
		}

		return r;		
		
	}
	
	private String getLote(String nrLote){
		String result = "";
		try{
			String descrip = despachosDAO.getByPrimaryKey(Integer.parseInt(nrLote)).getDescrip();
			System.out.println("Despacho: " + descrip);
			result = FormatUtil.parseLote(descrip);
		}catch(Exception e){
			
		}
		
		return result;
	}
	
	private List<TrazabiFarma> castTrazabiToFarma(List<Trazabi> trazabiList, Integer genteNr, Long fechaEvento){
		List<TrazabiFarma> trazabiFarmaList = new ArrayList<TrazabiFarma>();
		for(Trazabi trazabi: trazabiList){
			TrazabiFarma trazabiFarma = new TrazabiFarma();
			trazabiFarma.setGlnorigenIng(trazabi.getGlnorigenSal());
			trazabiFarma.setGlndestinoIng(trazabi.getGlndestinoSal());
			trazabiFarma.setCuitOrigenIng(trazabi.getCuitOrigenSal());
			trazabiFarma.setCuitDestinoIng(trazabi.getCuitDestinoSal());
			trazabiFarma.setFechaIng(new Date(fechaEvento));
			trazabiFarma.setStock(trazabi.getStock());
			trazabiFarma.setGtin(trazabi.getGtin());
			trazabiFarma.setSerieGtin(trazabi.getSerieGtin());
			trazabiFarma.setCant(trazabi.getCant());
			trazabiFarma.setExinr(trazabi.getExinr());
			trazabiFarma.setNrlote(trazabi.getNrlote());
			trazabiFarma.setGenteNr(genteNr);
			trazabiFarma.setVencimLote(trazabi.getVencimLote());
			trazabiFarma.setUnico(trazabi.getUnico());
			//trazabiFarma.setCodEventoIng(101);
			trazabiFarma.setTrazaObli(trazabi.getTrazaObli());			
			trazabiFarma.setTransacNr(trazabi.getNrTransacSalida());
			trazabiFarma.setNrRemCompra(trazabi.getNrRemitoPropio());
			trazabiFarma.setNrTrazabi(trazabi.getNr().longValue());
			trazabiFarma.setIdAnmat(trazabi.getRespuestaSalida());
			trazabiFarmaList.add(trazabiFarma);
		}				
		return trazabiFarmaList;
		
	}


	public List<Transac> getRemitosAEnviarTraza(Usuario usuarioSesion) {
		//Tomar las transac que tiene  
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		
		Integer transacDesde = 0;
		try{
			transacDesde = Integer.parseInt(parametrizacionDAO.getByPrimaryKey(Constants.ID_TRANSAC_DESDE).getValor());	
		}catch(NumberFormatException e){
			transacDesde = 0;
		}
		
		Gente gente = null;//extendedGenteDAO.getByPrimaryKey(usuarioSesion.getGenteNr());		
		List<Transac> transacList = extendedTransacDAO.getRemitosAEnviarTraza(gente,transacDesde, em.getGln());
		return transacList;
}


	public String sendRemitoEgresoAnmat(Integer transacNr, Usuario usuario, DatosTrazaWS datos, Long fechaEvento) {
		String result = "";
		String resultFinal = "";
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuario.getIdEmpresa());
		//Copiar datos del Trazabi a TrazabiFarma
		Transac transac = extendedTransacDAO.getByPrimaryKey(transacNr);
		//Obtengo los datos de Trazabi
		List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getTrazabiFarmaPorTransac(transacNr);
		//Realizo Update los registros a TrazabiFarmaDAO
		FormatUtil fu = new FormatUtil();		
		
		for (TrazabiFarma trazabiFarma: trazabiFarmaList){
			//TrazabiFarma verifTrazabiFarma = extendedTrazabiFarmaDAO.getBySerie(trazabiFarma.getSerieGtin(), trazabiFarma.getGtin(), trazabiFarma.getTransacNr(), true, false);
			boolean updateTrazabiFarma = false;
			
			try{
				Long res = Long.parseLong(trazabiFarma.getRespuestaSalida());
				updateTrazabiFarma = false;
			}catch(NumberFormatException newe){
				updateTrazabiFarma = true;
			}
			
			if (updateTrazabiFarma){
				TrazabiFarma trazabiFarmaOrig = extendedTrazabiFarmaDAO.getByPrimaryKey(trazabiFarma.getNr());								
				
				String idOS = datos.getIdObraSocial();
				if(datos.getIdObraSocial() != null && idOS.equals("0")){
					idOS = "";
					//datos.setIdObraSocial(null);
					trazabiFarmaOrig.setNombrePaciente(datos.getNombrePaciente());
				}else{
					if(idOS == null){
						idOS = "";
						trazabiFarmaOrig.setNombrePaciente(datos.getNombrePaciente());
					}else{
						trazabiFarmaOrig.setNombrePaciente(datos.getNroAsociado());
					}
				}
				trazabiFarmaOrig.setIdObraSocialSal(idOS);
				trazabiFarmaOrig.setNrRemitoPropio(datos.getNroRemito());
				trazabiFarmaOrig.setNroAfiliadoSal(datos.getNroAsociado());
				trazabiFarmaOrig.setGlnorigenSal(trazabiFarmaOrig.getGlndestinoIng());
				
				if (datos.getGlnDestinatario() != null && !datos.getGlnDestinatario().equals("")){					
					//Es un Centro asistencial
					trazabiFarmaOrig.setGlndestinoSal(datos.getGlnDestinatario());
					trazabiFarmaOrig.setCodEventoSal(98);
				}else{
					trazabiFarmaOrig.setCodEventoSal(111);	
				}
				
				trazabiFarmaOrig.setObs(datos.getObs());
				trazabiFarmaOrig.setFechaSalida(new Date(fechaEvento));			
				extendedTrazabiFarmaDAO.update(trazabiFarmaOrig);
				SendMedicamentosE sm = null;
				SendMedicamentosResponseE sr = null;
				ResultSendMedicamento r = null;
				if (trazabiFarma.getTrazaObli() == -1){
					try {					
							sm = fu.makeSendMedicamentosEgresoDocument(trazabiFarmaOrig,em.getUsrPami().trim(),em.getPassPami().trim(), datos);					
						//Informar a ANMAT el ingreso de todos los medicamentos
						try {
							sr = serviceTrazaManager.sendMedicamento(sm,em.getUrlTraza());
							r = getResult(sr);
						} catch (Exception e) {
							result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
							e.printStackTrace();
						}
					} catch (Exception e) {
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
						e.printStackTrace();
					}			
					if (r != null){
						if (r.getTransacNr() != null && !r.getTransacNr().equals("")){
							trazabiFarmaOrig.setProcesoEgreso(true);
							trazabiFarmaOrig.setRespuestaSalida(r.getTransacNr());
							trazabiFarmaOrig.setErroresSal(r.getErrores());
							extendedTrazabiFarmaDAO.update(trazabiFarma);
							result = "OK";
						}else{
							result = r.getErrores();
						}
					}else{
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
					}
					if (!result.equals("OK")){
						resultFinal = resultFinal + " [Serie: " + trazabiFarma.getSerieGtin()+ "] " + result + "<br>";				
					}
				}else{
					trazabiFarmaOrig.setProcesoEgreso(true);
					extendedTrazabiFarmaDAO.update(trazabiFarma);
					result = "OK";
				}					
			}
		}
		if (resultFinal.equals("")){
			resultFinal = "OK";
		}
		
	return resultFinal;
	}

	
	public List<ObraSocial> getAllObraSocial() {
		//List<ObraSocial> obList = oraSocialDAO.getAll();
		HashMap<String, Object> res = new HashMap<String, Object>();
		res.put("activo", -1);
		List<ObraSocial> obList = obraSocialDAO.findByObjectCriteria(res);

		for(ObraSocial ob : obList){
			if (ob.getNombre().length() > 125){
				ob.setNombre(ob.getNombre().substring(0,124));
			}
		}
		Collections.sort(obList);
		return obraSocialDAO.getAll();
	}

	
	public List<Transac> getRemitosEnviados(Usuario usuarioSesion) {
		//Tomar las transac que tiene  
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		
		Integer transacDesde = 0;
		try{
			transacDesde = Integer.parseInt(parametrizacionDAO.getByPrimaryKey(Constants.ID_TRANSAC_DESDE).getValor());	
		}catch(NumberFormatException e){
			transacDesde = 0;
		}
		
		Gente gente = null; //extendedGenteDAO.getByPrimaryKey(usuarioSesion.getGenteNr());		
		
		List<Transac> transacList = extendedTransacDAO.getRemitosEnviados(gente,transacDesde, em.getGln());
		
//		for(Transac transac: transacList){
//			List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getTrazabiFarmaPorTransac(transac.getTransacNr()); 
//			if (trazabiFarmaList != null && trazabiFarmaList.size() > 0){
//				TrazabiFarma tf = trazabiFarmaList.get(0); 	
//				transac.setNrComprob(tf.getNrRemitoPropio());
//				transac.setFecha(tf.getFechaSalida());				
//			}				
//		}
				
		return transacList;		
		
	}

	public List<Trazabi> getTrazabiPorTransac(Integer transacNr,
			Usuario usuarioSesion) {

		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		List<Trazabi> trazabiList = extendedTrazabiDAO.getTrazabiPorTransac(transacNr, empresaWeb.getGln());
		return trazabiList;

	}

	public List<ObraSocial> getObraSocialPorNombre(String filter) {
		List<ObraSocial> listObraSocial = obraSocialDAO.getListbyQuery("select o from ObraSocial o where nombre like '%" + filter + "%' and activo = -1");
		return listObraSocial;
	}

	public List<TrazabiFarma> getTrazabiFarmaPorSerie(String filter,
			Usuario usuario) {
		EmpresaWeb empresa = empresaWebDAO.getByPrimaryKey(usuario.getIdEmpresa());
		
		List<TrazabiFarma> listTrazabiFarma = extendedTrazabiFarmaDAO.getListbyQuery("select t from TrazabiFarma t where serieGtin like '%" + filter + "%' and glndestinoIng = '" + empresa.getGln() + "' and procesoIngreso = true and procesoEgreso = false");
		
		return listTrazabiFarma;
	}

	public List<TrazabiFarma> addTrazabiFarma(
			List<TrazabiFarma> trazabiFarmaSessionList,
			TrazabiFarma trazabiFarma, Usuario usuarioSesion) {
		TrazabiFarma trazabiFarmaKey = extendedTrazabiFarmaDAO.getByPrimaryKey(trazabiFarma.getNr());
		if (trazabiFarmaSessionList == null)
			trazabiFarmaSessionList = new ArrayList<TrazabiFarma>();
		boolean existente = false;
		for(TrazabiFarma tf : trazabiFarmaSessionList){
			if (tf.getNr().equals(trazabiFarmaKey.getNr())){
				existente = true;
			}
		}
		if (!existente){
			trazabiFarmaSessionList.add(trazabiFarmaKey);	
		}
		
		return trazabiFarmaSessionList;
	}

	public String sendRemitoEgresoAnmatUnid(
			List<TrazabiFarma> trazabiFarmaList, Usuario usuario,
			DatosTrazaWS datos) {
		String result = "";
		String resultFinal = "";
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuario.getIdEmpresa());
		//Realizo Update los registros a TrazabiFarmaDAO
		FormatUtil fu = new FormatUtil();		
		
		for (TrazabiFarma trazabiFarma: trazabiFarmaList){
			//TrazabiFarma verifTrazabiFarma = extendedTrazabiFarmaDAO.getBySerie(trazabiFarma.getSerieGtin(), trazabiFarma.getGtin(), trazabiFarma.getTransacNr(), true, false);
			boolean updateTrazabiFarma = false;
			
			try{
				Long res = Long.parseLong(trazabiFarma.getRespuestaSalida());
				updateTrazabiFarma = false;
			}catch(NumberFormatException newe){
				updateTrazabiFarma = true;
			}
			
			if (updateTrazabiFarma){
				TrazabiFarma trazabiFarmaOrig = extendedTrazabiFarmaDAO.getByPrimaryKey(trazabiFarma.getNr());								
				
				String idOS = datos.getIdObraSocial();
				if(datos.getIdObraSocial() != null && idOS.equals("0")){
					idOS = "0";
					datos.setIdObraSocial(null);
					trazabiFarmaOrig.setNombrePaciente(datos.getNombrePaciente());
				}else{
					if(idOS == null){
						idOS = "0";
						trazabiFarmaOrig.setNombrePaciente(datos.getNombrePaciente());
					}else{
						trazabiFarmaOrig.setNombrePaciente(datos.getNroAsociado());
					}
				}
				trazabiFarmaOrig.setIdObraSocialSal(idOS);
				trazabiFarmaOrig.setNrRemitoPropio(datos.getNroRemito());
				trazabiFarmaOrig.setNroAfiliadoSal(datos.getNroAsociado());
				trazabiFarmaOrig.setGlnorigenSal(trazabiFarmaOrig.getGlndestinoIng());
				trazabiFarmaOrig.setCodEventoSal(111);
				trazabiFarmaOrig.setObs(datos.getObs());
				trazabiFarmaOrig.setFechaSalida(new Date(System.currentTimeMillis()));			
				extendedTrazabiFarmaDAO.update(trazabiFarmaOrig);
				SendMedicamentosE sm = null;
				SendMedicamentosResponseE sr = null;
				ResultSendMedicamento r = null;
				if (trazabiFarma.getTrazaObli() == -1){
					try {					
							sm = fu.makeSendMedicamentosEgresoDocument(trazabiFarmaOrig,em.getUsrPami().trim(),em.getPassPami().trim(), datos);					
						//Informar a ANMAT el ingreso de todos los medicamentos
						try {
							sr = serviceTrazaManager.sendMedicamento(sm,em.getUrlTraza());
							r = getResult(sr);
						} catch (Exception e) {
							result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
							e.printStackTrace();
						}
					} catch (Exception e) {
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
						e.printStackTrace();
					}			
					if (r != null){
						if (r.getTransacNr() != null && !r.getTransacNr().equals("")){
							trazabiFarmaOrig.setProcesoEgreso(true);
							trazabiFarmaOrig.setRespuestaSalida(r.getTransacNr());
							trazabiFarmaOrig.setErroresSal(r.getErrores());
							extendedTrazabiFarmaDAO.update(trazabiFarmaOrig);
							result = "OK";
						}else{
							result = r.getErrores();
						}
					}else{
						result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
					}
					if (!result.equals("OK")){
						resultFinal = resultFinal + " [Serie: " + trazabiFarma.getSerieGtin()+ "] " + result + "<br>";				
					}
				}
					
			}
		}
		if (resultFinal.equals("")){
			resultFinal = "OK";
		}
		
	return resultFinal;
	}

	public List<Trazabi> getTrazabiPorTransacPorTransac(Integer transacNr,
			Usuario usuarioSesion) {
		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		List<Trazabi> trazabiList = extendedTrazabiDAO.getTrazabiPorTransac(transacNr, empresaWeb.getGln());
		return trazabiList;
	}


	public List<TrazabiFarma> getRemitosEnviadosPorNr(Usuario usuarioSesion) {
		//Tomar las transac que tiene  
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
				
		//List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getRemitosEnviadosPorNr(em.getGln());
		
//		for(Transac transac: transacList){
//			List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getTrazabiFarmaPorTransac(transac.getTransacNr()); 
//			if (trazabiFarmaList != null && trazabiFarmaList.size() > 0){
//				TrazabiFarma tf = trazabiFarmaList.get(0); 	
//				transac.setNrComprob(tf.getNrRemitoPropio());
//				transac.setFecha(tf.getFechaSalida());				
//			}				 
//		}
				
		return null;
	}

	public List<TrazabiFarma> getTrazabiFarmaPorRemito(String nrRemitoPropio,
			Usuario usuarioSesion) {
		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(usuarioSesion.getIdEmpresa());
		
		List<TrazabiFarma> trazabiFarmaList = extendedTrazabiFarmaDAO.getTrazabiFarmaPorRemito(nrRemitoPropio, empresaWeb.getGln());

		return trazabiFarmaList;
	}

	public TrazabiFarma getBySerieGtinRecepcionado(TrazabiFarma trazabiFarma) {
		
		return extendedTrazabiFarmaDAO.getBySerieGtinRecepcionado(trazabiFarma.getSerieGtin(), trazabiFarma.getGtin());
		
	}
	
	public String sendDevolucionAnmat(Usuario usuario, TrazabiFarma trazabiFarma) {
		String result = "";
		String resultFinal = "";
		//Obtengo los datos de la empresa
		EmpresaWeb em = empresaWebDAO.getByPrimaryKey(usuario.getIdEmpresa());
		
		
		//Inserto los registros a TrazabiFarmaDAO
		FormatUtil fu = new FormatUtil();		
		
		
		
		
		trazabiFarma.setLoteStr(getLote(trazabiFarma.getNrlote()));			
		//trazabiFarma.setProcesoIngreso(true);
		//trazabiFarma.setProcesoEgreso(false);
		
		//extendedTrazabiFarmaDAO.save(trazabiFarma);
		SendMedicamentosE sm = null;
		SendMedicamentosResponseE sr = null;
		ResultSendMedicamento r = null;
		if (trazabiFarma.getTrazaObli() == -1){
			try {					
					sm = fu.makeSendMedicamentosDevolucionDocument(trazabiFarma,em.getUsrPami().trim(),em.getPassPami().trim());					
				//Informar a ANMAT el ingreso de todos los medicamentos
				try {
					sr = serviceTrazaManager.sendMedicamento(sm,em.getUrlTraza());
					r = getResult(sr);
					if (r.isExito()){
						//Elimino
						extendedTrazabiFarmaDAO.remove(trazabiFarma);
						result = "Se ha realizado con exito la devolucion con el Codigo de Transaccion N: " + r.getTransacNr();
						return result;
					}
 
				} catch (Exception e) {
					result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
					e.printStackTrace();
				}
			} catch (Exception e) {
				result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
				e.printStackTrace();
			}			
			if (r != null){
				if (r.getTransacNr() != null && !r.getTransacNr().equals("")){
					trazabiFarma.setRespuestaIngreso(r.getTransacNr());
					trazabiFarma.setErrores(r.getErrores());
					extendedTrazabiFarmaDAO.update(trazabiFarma);
					result = "OK";
				}else{
					result = r.getErrores();
				}
			}else{
				result = "Hubo un problema en la cominicacion con el servidor de ANMAT, por favor intente nuevamente en otro momento";
			}	
		}else{
			result = "OK";
		}
		if (!result.equals("OK")){
			resultFinal = resultFinal + " [Serie: " + trazabiFarma.getSerieGtin()+ "] " + result + "<br>";
			extendedTrazabiFarmaDAO.remove(trazabiFarma);				
		}	
		
		
		
		if (resultFinal.equals("")){
			resultFinal = "OK";
		}
		return resultFinal;		
	}

}
