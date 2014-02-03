package jmc.skweb.core.service;



import com.inssjp.mywebservice.business.SendMedicamentosDocument;
import com.inssjp.mywebservice.business.SendMedicamentosResponseDocument;



/**
 * 
 * @author Juan Manuel Carrascal
 */
public interface ServiceTrazaManager {
	
	public SendMedicamentosResponseDocument sendMedicamento(SendMedicamentosDocument request, String urlTraza) throws Exception ;
	
}
