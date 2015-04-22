package jmc.skweb.core.service;



import jmc.skweb.core.model.traza.ResultSendMedicamento;
import jmc.skweb.core.model.traza.TrazabiFarma;

import com.inssjp.mywebservice.business.SendMedicamentosDocument;
import com.inssjp.mywebservice.business.SendMedicamentosResponseDocument;



/**
 * 
 * @author Juan Manuel Carrascal
 */
public interface ServiceTrazaManager {
	
	public SendMedicamentosResponseDocument sendMedicamento(SendMedicamentosDocument request, String urlTraza) throws Exception ;
	
	public ResultSendMedicamento confifTransac(
			String gtin, String serieGtin, String usr_pami, String pass_pami, String urlTraza ) throws Exception;
	
	
}
