package jmc.skweb.core.service.impl;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jmc.skweb.core.dao.TrazabiFarmaDAO;
import jmc.skweb.core.service.ParametrizacionManager;
import jmc.skweb.core.service.ReporteadorPdfManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.FileUtil;
import jmc.skweb.util.FormatUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;




/**
 * Clase que implementa los servicios referentes a Reportes
 * @author Juan Manuel Carrascal.
 */
public class ReporteadorPdfManagerImpl implements ReporteadorPdfManager{	
	
	private ParametrizacionManager parametrizacionManager; 
	private TrazabiFarmaDAO extendedTrazabiFarmaDAO;
		 

	private byte[] ingresoReporte(Map parameters, String nombre_reporte)
    {
        byte[] reporte = null;
        Integer copias = 1;
        
        try{
        	String copiasStr = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_COPIAS).getValor();
        	copias = Integer.parseInt(copiasStr);
        }catch(Exception e){}
        
        List<byte[]> pdfs = new ArrayList<byte[]>();
        
        for (int i =0;i<copias;i++){	        	
	        byte[] pdfTemp = null;
	        try
	        {
	            String webAppsDir = FileUtil.getWebappsPath();
	            String sep = System.getProperty("file.separator");
	            String compile = (new StringBuilder()).append(webAppsDir).append(sep).append("farmaweb").append(sep).append("reports").append(sep).append(nombre_reporte).append(".jrxml").toString();
	            String run = (new StringBuilder()).append(webAppsDir).append(sep).append("farmaweb").append(sep).append("reports").append(sep).append(nombre_reporte).append(".jasper").toString();
	            JasperCompileManager.compileReportToFile(compile);
	            //System.out.println((new StringBuilder()).append("compile ").append(compile).toString());
	            System.out.println((new StringBuilder()).append("run ").append(run).toString());
	            File reportFile = new File(run);
	            java.sql.Connection conn = getConn();	            	            	          
	            pdfTemp = JasperRunManager.runReportToPdf(reportFile.getPath(), parameters, conn);
	            conn.close();
	            System.out.println("Salgo de Jasper");
	        }
	        catch(JRException e)
	        {
	            System.out.println((new StringBuilder()).append("Error:").append(e.getMessage()).toString());
	            System.out.println((new StringBuilder()).append("Error:").append(e.toString()).toString());
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            System.out.println((new StringBuilder()).append("Error2:").append(e.getMessage()).toString());
	            System.out.println((new StringBuilder()).append("Error2:").append(e.toString()).toString());
	        }
	        pdfs.add(pdfTemp);
        }
        if(pdfs != null && pdfs.size() > 1){
        	reporte = FormatUtil.concatPDFs(pdfs, false);
        }else{
        	if (pdfs != null && pdfs.size() == 1){
        		reporte = pdfs.get(0);
        	}
        }
        return reporte;
    }

    public byte[] parametros_reporte(String nombre_reporte)
    {
        Map parameters = new HashMap();
        return ingresoReporte(parameters, nombre_reporte);
    }

    public byte[] parametros_reporte(String parametro, String valor, String nombre_reporte)
    {
        Map parameters = new HashMap();
        parameters.put(parametro, valor);
        return ingresoReporte(parameters, nombre_reporte);
    }

    public byte[] parametros_reporte(String parametro, Long valor, String nombre_reporte)
    {
        Map parameters = new HashMap();
        parameters.put(parametro, valor);
        return ingresoReporte(parameters, nombre_reporte);
    }

    public byte[] parametros_reporte(String parametro, Integer valor, String nombre_reporte)
    {
        Map parameters = new HashMap();
        parameters.put(parametro, valor);        
        return ingresoReporte(parameters, nombre_reporte);
    }
    
    public byte[] parametros_reporte(String parametro, String valor, String parametro_1, String valor_1, String nombre_reporte)
    {
        Map parameters = new HashMap();
        parameters.put(parametro, valor);
        parameters.put(parametro_1, valor_1);
        return ingresoReporte(parameters, nombre_reporte);
    }

   

	public ParametrizacionManager getParametrizacionManager() {
		return parametrizacionManager;
	}

	public void setParametrizacionManager(
			ParametrizacionManager parametrizacionManager) {
		this.parametrizacionManager = parametrizacionManager;
	}

	public TrazabiFarmaDAO getExtendedTrazabiFarmaDAO() {
		return extendedTrazabiFarmaDAO;
	}

	public void setExtendedTrazabiFarmaDAO(TrazabiFarmaDAO extendedTrazabiFarmaDAO) {
		this.extendedTrazabiFarmaDAO = extendedTrazabiFarmaDAO;
	}
	
	private Connection getConn(){
			
		String urlBase = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_URL_SQL).getValor();
		String controlador = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_CONTROLADOR).getValor();
		String usr = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_USR_SQL).getValor();
		String password = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_PASS_SQL).getValor();
		
        String direccion = urlBase;
        try {
			Class.forName(controlador);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
        Connection conn = null;
		try {
			conn = DriverManager.getConnection(direccion, usr, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        try {
			conn.getAutoCommit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        return conn;
				
	}
    
    
}
