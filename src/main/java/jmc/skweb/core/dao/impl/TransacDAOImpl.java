package jmc.skweb.core.dao.impl;


import java.math.BigDecimal;
import java.util.List;

import jmc.skweb.core.dao.TransacDAO;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.traza.TrazabiFarma;
import jmc.skweb.util.Constants;

	/**
	 * 
	 * @author Juan Manuel
	 * 
	 */

	public class TransacDAOImpl extends GenericDAOImpl<Transac> implements TransacDAO {

		public TransacDAOImpl() {
			super(Transac.class);		 
		}

		
		public List<Transac> getCuentaCorrienteVenta(
				Integer[] listTipoComprVentas, Integer genteNr) {
			List<Transac> transacList = null; 
			Boolean primerReg = true;
			String whereTipoComprSql = "";
			for(Integer tipoCompr: listTipoComprVentas){
				if (primerReg){
					whereTipoComprSql = "(t.tipoComprob = "+ tipoCompr ;	
					primerReg = false;
				}else{
					whereTipoComprSql = whereTipoComprSql + " or t.tipoComprob = "+ tipoCompr ;
				}	
				
			}
			whereTipoComprSql = whereTipoComprSql + ")";
			try{				
				String sql ="select t from Transac t where t.gente.genteNr = " + genteNr + " and t.saldo <> 0 and " + whereTipoComprSql + " order by t.transacNr asc";				 
			      
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;

		}

		public List<Transac> getResumenCuentaCorriente(
				Integer[] listTipoComprVentas, Integer genteNr,
				String fechaDesde, String fechaHasta) {
			List<Transac> transacList = null; 
			Boolean primerReg = true;
			String whereTipoComprSql = "";
			for(Integer tipoCompr: listTipoComprVentas){
				if (primerReg){
					whereTipoComprSql = "(t.tipoComprob = "+ tipoCompr ;	
					primerReg = false;
				}else{
					whereTipoComprSql = whereTipoComprSql + " or t.tipoComprob = "+ tipoCompr ;
				}	
				
			}
			whereTipoComprSql = whereTipoComprSql + ")";
			try{								
				String sql ="select t from Transac t where t.gente.genteNr = " + genteNr + 
				" and " + whereTipoComprSql + "and fecha >= convert(smalldatetime,CONVERT(varchar(6),'" + fechaDesde + 
				"',112),112) and fecha <= convert(smalldatetime,CONVERT(varchar(6),'"+ fechaHasta + "', 112),112) order by t.transacNr asc";				 
			      
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;


		}

	
		public Double getSaldoPorAgendadoTipoCompr(Integer tipoCompr,
				Integer genteNr, String fechaDesde) {
			Double saldo = 0d;
			try{								
				String sql ="select SUM(t.saldo) from Transac t where t.gente.genteNr = " + genteNr + 
				" and fecha < convert(smalldatetime,CONVERT(varchar(6),'" + fechaDesde + 
				"',112),112) and t.tipoComprob.nr = " + tipoCompr;				 
			      
				List<BigDecimal> saldoList= getHibernateTemplate().find(sql);
				saldo = saldoList.get(0).doubleValue();
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return saldo;

		}
		
		public Double getTotalPorAgendadoTipoCompr(Integer tipoCompr,
				Integer genteNr, String fechaDesde) {
			Double saldo = 0d;
			try{								
				String sql ="select SUM(t.total) from Transac t where t.gente.genteNr = " + genteNr + 
				" and fecha < convert(smalldatetime,CONVERT(varchar(6),'" + fechaDesde + 
				"',112),112) and t.tipoComprob.nr = " + tipoCompr;				 
			      
				List<BigDecimal> saldoList= getHibernateTemplate().find(sql);
				saldo = saldoList.get(0).doubleValue();
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return saldo;

		}


		public List<Transac> getPedidos(Integer genteNr, int idPedido) {
			
			List<Transac> transacList = null; 
			Boolean primerReg = true;
			try{								
				String sql ="select t from Transac t where t.gente.genteNr = " + genteNr + "and t.tipoComprob = " +idPedido;   
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}


		public List<Transac> getTransacPorTipoComprob(Integer genteNr, int nr, String fechaDesde, String fechaHasta) {
			List<Transac> transacList = null; 
			try{								 	
				String sql ="select t from Transac t where t.gente.genteNr = " + genteNr + 
				" and t.tipoComprob.nr = " + nr + " and fecha >= convert(smalldatetime,CONVERT(varchar(6),'" + fechaDesde + 
				"',112),112) and fecha <= convert(smalldatetime,CONVERT(varchar(6),'"+ fechaHasta + "', 112),112) order by t.transacNr asc";				 			      
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}



		public Double getTotalDisponibleByArtComprob(String clave,
				Integer idTipoCompPedidoCompra) {
			Double saldo = 0d;
			try{								
				String sql ="SELECT  SUM(I.cant1-I.cant1entregado) " +
						"FROM Items I, Transac T WHERE I.id.transac.transacNr = T.transacNr AND ((I.cant1 - I.cant1entregado) > 0 ) " +
						"AND I.articulo = '"+ clave+ "' " +
						"AND (T.tipoComprob.nr = " + idTipoCompPedidoCompra + ") " +
						"AND (T.destino= -1) "; 
								 
			      
				List<BigDecimal> saldoList = getHibernateTemplate().find(sql);
				saldo = saldoList.get(0).doubleValue();
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return saldo;
			
		}


		
		public List<TransacJoin> getTransacJoin(int nr, String clave) {
			List<TransacJoin> transacList = null; 
			try{						
				
				String sql ="select new jmc.skweb.core.model.report.TransacJoin(T.gente.genteNr, G.razonSocial," +
						" T.nrComprob, T.transacNr, T.fecha, I.nrInt, I.cant1, I.cant1entregado, T.fechaEntrega) " +
						"FROM Items I, Transac T, Gente G WHERE " +
						"I.id.transac.transacNr = T.transacNr " +
						"AND T.gente.genteNr = G.genteNr " +
						"AND ((I.cant1 - I.cant1entregado) > 0 ) " +
						"AND I.articulo = '"+ clave +"' " +
						"AND (T.tipoComprob.nr = " + nr +" ) " +
						"AND (T.destino= -1)";	  
				
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}


		public List<Transac> getRemitosPendientesPorClienteTraza(
				Gente genteSession, Integer transacNrDesde, String gln) {
			List<Transac> transacList = null; 
			try{				
//				String sql = "select tr from Transac tr where tr.transacNr in (select distinct(t.transacNr) from Transac t, Trazabi i " +
//						"where i.glndestinoSal = '" + gln + "' " +
//						"and t.tipoComprob.nr = " + Constants.ID_TIPO_COMP_REMITO+ " " +
//						"and ( t.transacNr = i.nrTransacSalida)) " +
//						"and tr.transacNr not in (select tf.transacNr from TrazabiFarma tf) " +
//						"and tr.transacNr > " + transacNrDesde;
//Solo Drofar
				String sql = "select tr from Transac tr where tr.transacNr in (select distinct(t.transacNr) from Transac t, Trazabi i " +
				"where i.glndestinoSal = '" + gln + "' " +
				"and t.tipoComprob.nr = " + Constants.ID_TIPO_COMP_REMITO+ " " +
				"and ( t.transacNr = i.nrTransacSalida) " +
				"and ( i.trazaObli = -1)) " +
				"and tr.transacNr not in (select tf.transacNr from TrazabiFarma tf) " +
				"and tr.transacNr > " + transacNrDesde;

				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}

		public List<Transac> getRemitosAEnviarTraza(
				Gente genteSession, Integer transacNrDesde, String gln) {
			List<Transac> transacList = null; 
			try{				
				String sql = "select tr from Transac tr where tr.transacNr in (select distinct(t.transacNr) from Transac t, TrazabiFarma i " +
						//"where i.genteNr = " + genteSession.getGenteNr() + " " +
						"where i.glndestinoIng = '" + gln + "' " +
						"and t.tipoComprob.nr = " + Constants.ID_TIPO_COMP_REMITO+ " " +
						"and ( t.transacNr = i.transacNr) and i.procesoEgreso = false and i.procesoIngreso = true) ";										
				transacList = getHibernateTemplate().find(sql);
				System.out.println("la llamada es: " + sql);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}
		

		public List<Transac> getRemitosEnviados(Gente genteSession, Integer transacNrDesde, String gln) {
			List<Transac> transacList = null; 
			try{				
				String sql = "select tr from Transac tr where tr.transacNr in (select distinct(t.transacNr) from Transac t, TrazabiFarma i " +
						//"where i.genteNr = " + genteSession.getGenteNr() + " " +
						"where i.glndestinoIng = '" + gln + "' " +
						"and t.tipoComprob.nr = " + Constants.ID_TIPO_COMP_REMITO+ " " +
						"and ( t.transacNr = i.transacNr) and i.procesoEgreso = true and i.procesoIngreso = true) ";										
				transacList = getHibernateTemplate().find(sql);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}finally{
				}
			return transacList;
		}


		@Override
		public List<TrazabiFarma> getRemitosEnviadosPorNr(String gln) {
			// TODO Auto-generated method stub
			return null;
		}
		

	}
