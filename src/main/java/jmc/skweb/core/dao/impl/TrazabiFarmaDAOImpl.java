package jmc.skweb.core.dao.impl;


import java.util.List;

import jmc.skweb.core.dao.TrazabiFarmaDAO;
import jmc.skweb.core.model.traza.TrazabiFarma;

	/**
	 * 
	 * @author Juan Manuel
	 * 
	 */

	public class TrazabiFarmaDAOImpl extends GenericDAOImpl<TrazabiFarma> implements TrazabiFarmaDAO {

		public TrazabiFarmaDAOImpl() {
			super(TrazabiFarma.class);		 
		}


		public List<TrazabiFarma> getTrazabiFarmaPorTransac(Integer transacNr) {
			List<TrazabiFarma> trazabiFarmaList = null; 
			try{				
				String sql = "select tr from TrazabiFarma tr where tr.transacNr = " + transacNr + " " ;
				
				trazabiFarmaList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			
			return trazabiFarmaList;
		}


		public List<TrazabiFarma> getRemitosEnviados(String gln) {			
			return null;
		}


		public TrazabiFarma getBySerie(String serieGtin, String gtin,
				Integer transacNr, boolean procesoIngreso, boolean procesoEgreso, String clave, Long nrTrazabi) {
			List<TrazabiFarma> trazabiFarmaList = null; 
			try{				
				String sql = "select tr from TrazabiFarma tr where tr.serieGtin = '" + serieGtin + "' and tr.gtin = '" + gtin + "' and tr.transacNr = " + transacNr + " and procesoIngreso = " + procesoIngreso + " and procesoEgreso = " + procesoEgreso + " and stock.clave = '" + clave +"' and nrTrazabi = " + nrTrazabi   ;
				
				trazabiFarmaList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			if (trazabiFarmaList.size() > 0){
				return trazabiFarmaList.get(0);
			}else{
				return null;
			}
		}

		public TrazabiFarma getBySerieGtinRecepcionado(String serieGtin, String gtin) {
			List<TrazabiFarma> trazabiFarmaList = null; 
			try{				
				String sql = "select tr from TrazabiFarma tr where tr.serieGtin = '" + serieGtin + "' and tr.gtin = '" + gtin + "' and tr.procesoIngreso = 1 and tr.procesoEgreso = 0 "   ;
				
				trazabiFarmaList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			if (trazabiFarmaList.size() > 0){
				return trazabiFarmaList.get(0);
			}else{
				return new TrazabiFarma();
			}
		}
		
		public List<TrazabiFarma> getTrazabiFarmaPorRemito(
				String nrRemitoPropio, String gln) {
			List<TrazabiFarma> trazabiFarmaList = null; 
			try{				
				String sql = "select tr from TrazabiFarma tr where tr.nrRemitoPropio = '" + nrRemitoPropio + "' and tr.glndestinoIng = '" + gln +"'" ;
				
				trazabiFarmaList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			
			return trazabiFarmaList;
		}		

	}
