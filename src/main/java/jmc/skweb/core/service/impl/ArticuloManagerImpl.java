package jmc.skweb.core.service.impl;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import jmc.skweb.core.dao.ArtMadreDAO;
import jmc.skweb.core.dao.ExiArtDAO;
import jmc.skweb.core.dao.FamDAO;
import jmc.skweb.core.dao.GenericDAO;
import jmc.skweb.core.dao.GenteBasicDAO;
import jmc.skweb.core.dao.GenteDAO;
import jmc.skweb.core.dao.ParametrizacionDAO;
import jmc.skweb.core.dao.StockDAO;
import jmc.skweb.core.dao.SubFamDAO;
import jmc.skweb.core.dao.TransacDAO;
import jmc.skweb.core.model.ArtMadre;
import jmc.skweb.core.model.DondeEstaFactuMail;
import jmc.skweb.core.model.ExiArt;
import jmc.skweb.core.model.Existencias;
import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Parametrizacion;
import jmc.skweb.core.model.Preferencias;
import jmc.skweb.core.model.shortEntities.GenteBasic;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.SubFam;
import jmc.skweb.core.model.Usuario;

import jmc.skweb.core.service.ArticuloManager;
import jmc.skweb.core.service.UsuarioManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.PreferenciasUtil;





/**
 * @author Juan Manuel Carrascal
 *
 */
/**
 * @author Administrator
 *
 */
//@Transactional
public class ArticuloManagerImpl implements ArticuloManager{

 	  	private GenericDAO<Existencias> existenciasDAO;
 	  	private GenericDAO<Fam> famDAO;
 	  	private GenericDAO<SubFam> subFamDAO;
 	  	private GenericDAO<Stock> stockDAO;
 	  	private GenericDAO<ExiArt> exiArtDAO;
 	  	private FamDAO extendedFamDAO;
 	  	private StockDAO extendedStockDAO;
 	  	private ExiArtDAO extendedExiArtDAO;
 	  	private SubFamDAO extendedSubFamDAO;
 	  	private GenteDAO extendedGenteDAO;
 	  	private TransacDAO extendedTransacDAO;
 	  	private ArtMadreDAO extendedArtMadreDAO;
 	  	private GenericDAO<DondeEstaFactuMail> dondeEstaFactuMailDAO;
 	  	private GenteBasicDAO extendedGenteBasicDAO;
 	  	private GenericDAO<Parametrizacion> parametrizacionDAO;
 	  	
 	  	
 	  	
 	  	 	  			
 	  	
 	  	
		
		public GenericDAO<Parametrizacion> getParametrizacionDAO() {
			return parametrizacionDAO;
		}
		public void setParametrizacionDAO(GenericDAO<Parametrizacion> parametrizacionDAO) {
			this.parametrizacionDAO = parametrizacionDAO;
		}
		public GenteBasicDAO getExtendedGenteBasicDAO() {
			return extendedGenteBasicDAO;
		}
		public void setExtendedGenteBasicDAO(GenteBasicDAO extendedGenteBasicDAO) {
			this.extendedGenteBasicDAO = extendedGenteBasicDAO;
		}
		public GenericDAO<DondeEstaFactuMail> getDondeEstaFactuMailDAO() {
			return dondeEstaFactuMailDAO;
		}
		public void setDondeEstaFactuMailDAO(
				GenericDAO<DondeEstaFactuMail> dondeEstaFactuMailDAO) {
			this.dondeEstaFactuMailDAO = dondeEstaFactuMailDAO;
		}
		public ArtMadreDAO getExtendedArtMadreDAO() {
			return extendedArtMadreDAO;
		}
		public void setExtendedArtMadreDAO(ArtMadreDAO extendedArtMadreDAO) {
			this.extendedArtMadreDAO = extendedArtMadreDAO;
		}
		public TransacDAO getExtendedTransacDAO() {
			return extendedTransacDAO;
		}
		public void setExtendedTransacDAO(TransacDAO extendedTransacDAO) {
			this.extendedTransacDAO = extendedTransacDAO;
		}
		public GenteDAO getExtendedGenteDAO() {
			return extendedGenteDAO;
		}
		public void setExtendedGenteDAO(GenteDAO extendedGenteDAO) {
			this.extendedGenteDAO = extendedGenteDAO;
		}
		public SubFamDAO getExtendedSubFamDAO() {
			return extendedSubFamDAO;
		}
		public void setExtendedSubFamDAO(SubFamDAO extendedSubFamDAO) {
			this.extendedSubFamDAO = extendedSubFamDAO;
		}
		public ExiArtDAO getExtendedExiArtDAO() {
			return extendedExiArtDAO;
		}
		public void setExtendedExiArtDAO(ExiArtDAO extendedExiArtDAO) {
			this.extendedExiArtDAO = extendedExiArtDAO;
		}
		public StockDAO getExtendedStockDAO() {
			return extendedStockDAO;
		}
		public void setExtendedStockDAO(StockDAO extendedStockDAO) {
			this.extendedStockDAO = extendedStockDAO;
		}
		public FamDAO getExtendedFamDAO() {
			return extendedFamDAO;
		}
		public void setExtendedFamDAO(FamDAO extendedFamDAO) {
			this.extendedFamDAO = extendedFamDAO;
		}
		public GenericDAO<Existencias> getExistenciasDAO() {
			return existenciasDAO;
		}
		public void setExistenciasDAO(GenericDAO<Existencias> existenciasDAO) {
			this.existenciasDAO = existenciasDAO;
		}
		public GenericDAO<Fam> getFamDAO() {
			return famDAO;
		}
		public void setFamDAO(GenericDAO<Fam> famDAO) {
			this.famDAO = famDAO;
		}
		public GenericDAO<SubFam> getSubFamDAO() {
			return subFamDAO;
		}
		public void setSubFamDAO(GenericDAO<SubFam> subFamDAO) {
			this.subFamDAO = subFamDAO;
		}
		public GenericDAO<Stock> getStockDAO() {
			return stockDAO;
		}
		public void setStockDAO(GenericDAO<Stock> stockDAO) {
			this.stockDAO = stockDAO;
		}
		public GenericDAO<ExiArt> getExiArtDAO() {
			return exiArtDAO;
		}
		public void setExiArtDAO(GenericDAO<ExiArt> exiArtDAO) {
			this.exiArtDAO = exiArtDAO;
		}
 	  	
 	  	public List<Fam> getFamEnable(){
 	  		List<Fam> famList = null;
			try {
				famList = extendedFamDAO.getFamEnable();
			} catch (Exception e) {
				e.printStackTrace();
			}
 	  		return famList;
 	  	}
 	  	//@Transactional(readOnly = true)
 	  	public List<Stock> getArticuloProNombre(String filtro, boolean activos){
 	  		List<Stock> stockList = null;
			try {
				stockList = extendedStockDAO.getArticuloPorNombre(filtro,activos);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
 	  		return stockList;
 	  	}
		
		public Stock getArticuloPorPK(String clave) {		
			Stock stock = extendedStockDAO.getByPrimaryKey(clave); 
			stock.setFamStr(famDAO.getByPrimaryKey(stock.getFam()).getDesfam());
			stock.setSubFamStr(subFamDAO.getByPrimaryKey(stock.getSubFam()).getDesubfa());
			return stock;
		}
		
		public List<ExiArt> getExistenciaPorArticulo(String clave, Usuario usuario){			
			
			List<ExiArt> listArt = null;
			Double idPreferenciaDefault = PreferenciasUtil.comparePreferencia(usuario.getListPreferencias(), Constants.PREF_ID_EXISTENCIA_DEFAULT);
			Preferencias p = null;
			try {
				listArt = this.extendedExiArtDAO.getExistenciaPorNombre(clave, idPreferenciaDefault);
			} catch (Exception e) {

				e.printStackTrace();
			}
			
			return listArt;
		}

		public List<Fam> getListFam() {			
			List<Fam> listFam = null;
			try {
				listFam = extendedFamDAO.getFamEnable();
			} catch (Exception e) {

				e.printStackTrace();
			} 
			List<Fam> listFamOri = new ArrayList<Fam>();
			Fam fam = new Fam();
			fam.setNrfam(0l);
			fam.setDesfam("Seleccione una Familia");
			listFamOri.add(fam);
			listFamOri.addAll(listFam);			

			return listFamOri;
		}
		
		public List<SubFam> getListSubFam() {
			List<SubFam> listSubFam = null;
			try {
				listSubFam = extendedSubFamDAO.getSubFamEnable();
			} catch (Exception e) {

				e.printStackTrace();
			} 
			List<SubFam> listSubFamOri = new ArrayList<SubFam>();
			SubFam subFam = new SubFam();
			subFam.setNrsubfam(0l);
			subFam.setDesubfa("Seleccione una SubFamilia");
			listSubFamOri.add(subFam);
			listSubFamOri.addAll(listSubFam);			
			return listSubFamOri;
		}
		
		/**
		 * Obtiene los articulos por Fam o SubFam
		 */
		public List<Stock> getArticuloPorFliaSubFlia(Long nrfam, Long nrsubfam, boolean activos) {
			List<Stock> listArt = null;
			if(nrfam == 0 && nrsubfam != 0){
				listArt = extendedStockDAO.getArticuloPorNrSubFam(nrsubfam,activos);
			}
			if(nrfam != 0 && nrsubfam != 0){
				listArt = extendedStockDAO.getArticuloPorNrFamSubFam(nrfam, nrsubfam, activos);
			}
			if(nrfam != 0 && nrsubfam == 0){
				listArt = extendedStockDAO.getArticuloPorNrFam(nrfam,activos);
			}
			return listArt;
		}
		
		public List<Gente> getProveedorPorNombre(String nombreProveedor) {
			List<Gente> listGente = null;
			try {
				listGente = extendedGenteDAO.getProveedorPorNombre(nombreProveedor);
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return listGente;
		}

		public List<Gente> getProveedorPorNombreVendedor(String nombreProveedor, Usuario usuario) {
			List<Gente> listGente = null;
			try {
				listGente = extendedGenteDAO.getProveedorPorNombreVendedor(nombreProveedor, usuario.getVendedorNr());
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return listGente;
		}

		/**
		 * Obtiene los Articulos por el Proceedor
		 */		
		public List<Stock> getArticuloPorProveedor(Integer genteNr, boolean activos) {
			List<Stock> stockList = extendedStockDAO.getArticuloPorNrProveedor(genteNr,activos);			
			return stockList;
		}
		
		/**
		 * Lista los articulos madre por nombre de descripcion
		 */
		public List<ArtMadre> getArtMadrePorNombre(String descArtMad) {
			List<ArtMadre> artMadreList = extendedArtMadreDAO.getArtMadrePorDesc(descArtMad);
			return artMadreList;
		}
		
		/**
		 * Obtiene Articulos Hijos
		 */
		public List<Stock> getArticulosPorArtMadre(String codArtMad) {
			ArtMadre artMadre = extendedArtMadreDAO.getByPrimaryKey(codArtMad);
			return artMadre.getArticulosHijos();
		}

		public Gente getGentePorPK(Integer genteNr) {
			return extendedGenteDAO.getByPrimaryKey(genteNr);
		}
		
		public Fam getFamiliaPorPK(Long nrfam) {
			if (nrfam != null && nrfam != 0){
				return extendedFamDAO.getByPrimaryKey(nrfam);
			}else{
				return new Fam(nrfam);
			}			
		}
		
		public SubFam getSubFamiliaPorPK(Long nrsubfam) {
			if (nrsubfam != null && nrsubfam != 0){
				return extendedSubFamDAO.getByPrimaryKey(nrsubfam);
			}else{
				return new SubFam(nrsubfam);
			}			
		}

		public ArtMadre getArtMadreProPK(String codArtMad) {
				
			return extendedArtMadreDAO.getByPrimaryKey(codArtMad);
		}
		
		public List<Stock> getArticuloProNombreLimit(String filter, int i) {
 	  		List<Stock> stockList = null;
			try {
				stockList = extendedStockDAO.getArticuloPorNombreLimit(filter, i);
			} catch (Exception e) {
				e.printStackTrace();
			}			
 	  		return stockList;

		}

		public List<GenteBasic> getProveedorBasicPorNombre(String filter, Usuario usuario ) {
			List<GenteBasic> listGente = null;
			try { 
				if (usuario.getRol() == Constants.ID_USR_GERENTE){
					listGente = extendedGenteBasicDAO.getProveedorBasicPorNombre(filter);
				}
				if (usuario.getRol() == Constants.ID_USR_VENDEDOR){
					listGente = extendedGenteBasicDAO.getProveedorBasicPorNombreVendedor(filter, usuario.getVendedorNr());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return listGente;
		}
		
		public GenteBasic getGentePorPKVendedor(Integer genteNr,
				Usuario usuario) {
			GenteBasic genteBasic = null;
			try {
				if (usuario.getRol() == Constants.ID_USR_GERENTE){
					genteBasic = extendedGenteBasicDAO.getByPrimaryKey(genteNr);
				}
				if (usuario.getRol() == Constants.ID_USR_VENDEDOR){
					genteBasic = extendedGenteBasicDAO.getProveedorBasicPorCodVendedor(genteNr, usuario.getVendedorNr());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return genteBasic;

		}

		public String getFormulaStock(String clave, Usuario usuarioSesion) {
			
			String result = "Disponible(<b>130</b>) = Stock(50) - PedidoVta(10) + PedidoCompra(90)";										
			
			//String result = "Disponible(<b>@resultante</b>) = Stock(@stock) - PedidoVta(@pedidoVta) + PedidoCompra(@pedidoCompra)";
			
			result = parametrizacionDAO.getByPrimaryKey(Constants.ID_PARAM_MSG_VISTA_STOCK).getValor();
			
			Double idExistencia = PreferenciasUtil.comparePreferencia(usuarioSesion.getListPreferencias(), Constants.PREF_ID_EXISTENCIA_DEFAULT);
			
			Double stock = extendedExiArtDAO.getStockByExiClave(idExistencia, clave);
			
			Double cantidadPedidoCompra = extendedTransacDAO.getTotalDisponibleByArtComprob(clave, Constants.ID_TIPO_COMP_PEDIDO_COMPRA);
			
			Double cantidadPedidoVenta = extendedTransacDAO.getTotalDisponibleByArtComprob(clave, Constants.ID_TIPO_COMP_PEDIDO_VENTA);
			
			Double resultante = (stock - cantidadPedidoVenta) + cantidadPedidoCompra;
			
			result = result.replace("@resultante", String.valueOf(resultante)).replace("@stock", String.valueOf(stock)).replace("@pedidoVta", String.valueOf(cantidadPedidoVenta)).replace("@pedidoCompra", String.valueOf(cantidadPedidoCompra));
			
			return result;
		}

}
