package jmc.skweb.core.dao.impl;


import java.util.List;

import jmc.skweb.core.dao.StockDAO;
import jmc.skweb.core.model.Stock;

	/**
	 * 
	 * @author Juan Manuel
	 * 
	 */

	
	public class StockDAOImpl extends GenericDAOImpl<Stock> implements StockDAO {

		public StockDAOImpl() {
			super(Stock.class);		 
		}
		
		public List<Stock> getArticuloPorNombre(String filtro, boolean activos) throws Exception {
			String[] filtros = filtro.split("\\+");
			String whereSql = "";
			boolean primerReg = true;
			for(String filtroDet: filtros){
				if (primerReg){
					whereSql = "s.descripcion like '%"+ filtroDet +"%'";	
					primerReg = false;
				}else{
					whereSql = whereSql + " and s.descripcion like '%"+ filtroDet +"%'";
				}	
			}
						
			List<Stock> stockList = null; 
			try{
				String sql = "";
				if (activos)
					sql ="select s from Stock s where " + whereSql + " and preEsp6 <> -1 order by s.descripcion " ;				 
				else
					sql ="select s from Stock s where " + whereSql + " order by s.descripcion " ;
				
				stockList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return stockList;
		}


		public List<Stock> getArticuloPorNrSubFam(Long nrsubfam, boolean activos) {
			List<Stock> stockList = null; 
			try{
				
				String sql = "";
				if (activos)
					sql = "select s from Stock s where subFam = " + nrsubfam + " and preEsp6 <> -1 order by s.descripcion ";
				else
					sql = "select s from Stock s where subFam = " + nrsubfam + " order by s.descripcion ";
			      
				stockList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return stockList;
		}


		public List<Stock> getArticuloPorNrFamSubFam(Long nrfam, Long nrsubfam, boolean activos) {
			List<Stock> stockList = null; 
			try{
				
				String sql = "";
				if (activos)
					sql = "select s from Stock s where subFam = " + nrsubfam + " and fam = " + nrfam + " and preEsp6 <> -1 order by s.descripcion ";
				else
					sql = "select s from Stock s where subFam = " + nrsubfam + " and fam = " + nrfam + " order by s.descripcion ";
			      
				stockList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return stockList;
		}


		public List<Stock> getArticuloPorNrFam(Long nrfam, boolean activos) {
			List<Stock> stockList = null; 
			try{
				
				String sql = "";
				if(activos)
					sql = "select s from Stock s where fam = " + nrfam + " and preEsp6 <> -1 order by s.descripcion ";		
				else
					sql = "select s from Stock s where fam = " + nrfam + " order by s.descripcion ";
			      
				stockList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return stockList;
		}

		/**
		 * Obtiene los Articulos por proveedor
		 */
		public List<Stock> getArticuloPorNrProveedor(Integer genteNr, boolean activos) {
			List<Stock> stockList = null; 
			try{
				String sql = "";
				if (activos)
					sql ="select s from Stock s where proveedPrincip = " + genteNr + " and preEsp6 <> -1 order by s.descripcion ";				 
				else
					sql ="select s from Stock s where proveedPrincip = " + genteNr + " order by s.descripcion ";
				
				stockList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return stockList;
			
		}


		public List<Stock> getArticuloPorNombreLimit(String filter, int i) {
			return null;
			
		}

		
		public String getArticuloPorPK(String clave, boolean articuloActivo) {
			List<Stock> stockList = null; 
			String result = "";
			try{
				String sql = "";
				if (articuloActivo)
					sql ="select s from Stock s where s.clave = '" + clave + "' and preEsp6 <> -1";				 
				else
					sql ="select s from Stock s where s.clave = '" + clave + "'";
				
				stockList = getHibernateTemplate().find(sql);
				if(stockList.size() > 0)
					result  = stockList.get(0).getDescripC();
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return result;
		}		
}
