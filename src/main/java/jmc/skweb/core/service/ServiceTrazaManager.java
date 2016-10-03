package jmc.skweb.core.service;



import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosResponseE;

import jmc.skweb.core.model.traza.ResultSendMedicamento;



/**
 * 
 * @author Juan Manuel Carrascal
 */
public interface ServiceTrazaManager {
	
	public SendMedicamentosResponseE sendMedicamento(SendMedicamentosE request, String urlTraza) throws Exception ;
	
	public ResultSendMedicamento confifTransac(
			String gtin, String serieGtin, String usr_pami, String pass_pami, String urlTraza ) throws Exception;
	
	
}
