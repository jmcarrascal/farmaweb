package jmc.skweb.core.dao.impl;


import java.util.List;

import jmc.skweb.core.dao.GenteBasicDAO;
import jmc.skweb.core.model.shortEntities.GenteBasic;

	/**
	 * 
	 * @author Juan Manuel
	 * 
	 */

	public class GenteBasicDAOImpl extends GenericDAOImpl<GenteBasic> implements GenteBasicDAO {

		public GenteBasicDAOImpl() {
			super(GenteBasic.class);		 
		}
	

		public List<GenteBasic> getProveedorBasicPorNombre(String nombre)
				throws Exception {
			List<GenteBasic> genteList = null; 
			try{
				String[] filtros = nombre.split("\\+");
				String whereSql = "";
				boolean primerReg = true;
				for(String filtroDet: filtros){
					if (primerReg){
						whereSql = "g.razonSocial like '%"+ filtroDet +"%'";	
						primerReg = false;
					}else{
						whereSql = whereSql + " and g.razonSocial like '%"+ filtroDet +"%'";
					}	
				}

					String SQL_QUERY ="select g from GenteBasic g where " + whereSql ;
					genteList = getHibernateTemplate().find(SQL_QUERY);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return genteList;
		}


		
		public List<GenteBasic> getProveedorBasicPorNombreVendedor(
				String nombreProveedor, Integer vendedorNr) {
			List<GenteBasic> genteList = null; 
			try{
				String[] filtros = nombreProveedor.split("\\+");
				String whereSql = "";
				boolean primerReg = true;
				for(String filtroDet: filtros){
					if (primerReg){
						whereSql = "g.razonSocial like '%"+ filtroDet +"%'";	
						primerReg = false;
					}else{
						whereSql = whereSql + " and g.razonSocial like '%"+ filtroDet +"%'";
					}	
				}

					String SQL_QUERY ="select g from GenteBasic g where " + whereSql + " and g.vendedorNr = " + vendedorNr;
					genteList = getHibernateTemplate().find(SQL_QUERY);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return genteList;
		}


		
		

		@Override
		public GenteBasic getProveedorBasicPorCodVendedor(
				Integer genteNr, Integer vendedorNr) {
			List<GenteBasic> genteList = null;
			GenteBasic genteBasic = null;
			try{

					String SQL_QUERY ="select g from GenteBasic g where g.genteNr = " + genteNr + " and g.vendedorNr = " + vendedorNr;
					genteList = getHibernateTemplate().find(SQL_QUERY);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			if (genteList.size() > 0 )
				genteBasic = genteList.get(0);
			
			return genteBasic;
		}

}
