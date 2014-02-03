package jmc.skweb.core.dao.impl;


import java.util.List;

import jmc.skweb.core.dao.SubFamDAO;
import jmc.skweb.core.model.SubFam;

	/**
	 * 
	 * @author Juan Manuel
	 * 
	 */

	public class SubFamDAOImpl extends GenericDAOImpl<SubFam> implements SubFamDAO {

		public SubFamDAOImpl() {
			super(SubFam.class);		 
		}
		

		public List<SubFam> getSubFamEnable()throws Exception {
			List<SubFam> subFamList = null; 
			try{
				 	
					String SQL_QUERY ="select sf from SubFam sf where sf.desubfa <> '.' and sf.desubfa <> '....................'" ;
					subFamList = getHibernateTemplate().find(SQL_QUERY);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}


			return subFamList;
		}

}
