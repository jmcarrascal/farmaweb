package jmc.skweb.core.service.impl.anmat.test;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMNode;
import org.apache.axis2.AxisFault;
import org.apache.axis2.axis2userguide.IWebServiceServiceStub;
import org.apache.axis2.client.ServiceClient;


import com.inssjp.mywebservice.business.MedicamentosDTO;
import com.inssjp.mywebservice.business.SendCancelacTransacc;
import com.inssjp.mywebservice.business.SendCancelacTransaccDocument;
import com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument;
import com.inssjp.mywebservice.business.SendMedicamentos;
import com.inssjp.mywebservice.business.SendMedicamentosDocument;
import com.inssjp.mywebservice.business.SendMedicamentosResponseDocument;
import com.inssjp.mywebservice.business.WebServiceError;
import com.inssjp.mywebservice.business.WebServiceResult;
import com.inssjp.mywebservice.business.impl.MedicamentosDTOImpl;
import com.inssjp.mywebservice.business.impl.SendCancelacTransaccDocumentImpl;
import com.inssjp.mywebservice.business.impl.SendCancelacTransaccImpl;
import com.inssjp.mywebservice.business.impl.SendMedicamentosDocumentImpl;
 

public class TestSendMedicamentoTransac1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IWebServiceServiceStub service = null;
		try {
			service = new IWebServiceServiceStub("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
			 
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
			
			SendMedicamentosDocument req = SendMedicamentosDocument.Factory.newInstance();
			
			
			//SendMedicamentosDocument req = new SendMedicamentosDocumentImpl();
			
			SendMedicamentos ss = req.addNewSendMedicamentos();
			
			MedicamentosDTO[] arg0Array = new MedicamentosDTO[1]; 
			
			
			MedicamentosDTO m = MedicamentosDTO.Factory.newInstance();
			
			m.setIdEvento("138");
			m.setGtin("GTIN1");
			m.setGlnOrigen("7798168190000");
			m.setGlnDestino("glnws");
			m.setCuitOrigen("20280377695");
			m.setCuitDestino("20280377635");
			m.setNumeroSerial("001");
			m.setVencimiento("20120101");
			m.setFEvento("20111111");
			m.setLote("1");
			m.setHEvento("10:00");
			
			arg0Array[0] = m;
			
			ss.setArg0Array(arg0Array);
			ss.setArg1("9991083500000");
			ss.setArg2("DONBOSCOUNO4222290");
			
			SendMedicamentosResponseDocument result = service.sendMedicamentos(req);
			
			WebServiceError[] wseArray = result.getSendMedicamentosResponse().getReturn().getErroresArray();
			for(WebServiceError wse: wseArray){
				System.out.println(wse.getDError());				
			}
			System.out.println(result.getSendMedicamentosResponse().getReturn().getCodigoTransaccion());
			
			//System.out.println(result.xmlText()); 
		    
		} catch (AxisFault e1) {

			e1.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}


	}


