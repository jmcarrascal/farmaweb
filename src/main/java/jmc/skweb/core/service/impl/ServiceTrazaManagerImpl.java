package jmc.skweb.core.service.impl;



import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;





import jmc.skweb.core.service.ServiceTrazaManager;
import jmc.skweb.core.service.ParametrizacionManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.FileUtil;
import jmc.skweb.util.FormatUtil;
import jmc.skweb.util.exception.GenerationTimerException;




import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.axis2userguide.IWebServiceServiceStub;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;



import com.inssjp.mywebservice.business.MedicamentosDTO;
import com.inssjp.mywebservice.business.SendMedicamentos;
import com.inssjp.mywebservice.business.SendMedicamentosDocument;
import com.inssjp.mywebservice.business.SendMedicamentosResponseDocument;
import com.inssjp.mywebservice.business.WebServiceError;


/**
 * Clase que implementa los servicios referentes a Temas
 * 
 * @author Juan Manuel Carrascal.
 */
public class ServiceTrazaManagerImpl implements ServiceTrazaManager {

	
	private ParametrizacionManager parametrizacionManager; 

	public ParametrizacionManager getParametrizacionManager() {
		return parametrizacionManager;
	}

	public void setParametrizacionManager(
			ParametrizacionManager parametrizacionManager) {
		this.parametrizacionManager = parametrizacionManager;
	}
	
	public SendMedicamentosResponseDocument sendMedicamento(
			SendMedicamentosDocument request, String urlTraza) throws Exception  {
	
		SendMedicamentosResponseDocument result = null;
		IWebServiceServiceStub service = null;
		
			Long timeout = 5l * 60l * 1000l; // Cinco minutos		
		
			String url = urlTraza;
			
			String usr_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_USR_TRANSPRORTE_TRAZA).getValor();
			
			String pass_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_PASS_TRANSPRORTE_TRAZA).getValor();			
			
			service = new IWebServiceServiceStub(url);
			System.out.println(url);
			
			service._getServiceClient().getOptions().setTimeOutInMilliSeconds(timeout);
			service._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, new Integer(timeout.intValue()));
			service._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, new Integer(timeout.intValue()));
			 
			ServiceClient serviceClient = service._getServiceClient();									
			OMFactory omFactory = OMAbstractFactory.getOMFactory();
			
			OMElement security = omFactory.createOMElement(new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd","Security", "wsse"), null);
						
			OMNamespace omNs = omFactory.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "wsu");
	        OMElement userNameToken = omFactory.createOMElement("UsernameToken", omNs);
	        
	        OMElement userName = omFactory.createOMElement("Username", omNs);
	        userName.addChild(omFactory.createOMText("testwservice"));
	        
	        OMElement password = omFactory.createOMElement("Password", omNs);
	        password.addChild(omFactory.createOMText("testwservicepsw"));
	        
	        userNameToken.addChild(userName);
	        userNameToken.addChild(password);
				        
			security.addChild(userNameToken);				
			serviceClient.addHeader(security);

			result = service.sendMedicamentos(request);			
			 
		return result;
	}

}
