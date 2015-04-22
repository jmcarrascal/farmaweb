package jmc.skweb.core.service.impl.anmat.test;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

import com.inssjp.mywebservice.business_.IWebServiceStub;
import com.inssjp.mywebservice.business_.IWebServiceStub.ConfirmacionTransaccionDTO;
import com.inssjp.mywebservice.business_.IWebServiceStub.GetTransaccionesNoConfirmadasResponseE;
import com.inssjp.mywebservice.business_.IWebServiceStub.SendConfirmaTransacc;
import com.inssjp.mywebservice.business_.IWebServiceStub.SendConfirmaTransaccE;
import com.inssjp.mywebservice.business_.IWebServiceStub.SendConfirmaTransaccResponseE;


public class TestSendConfirMedicamento {

	public static void main(String[] args) {
		
		TestSendConfirMedicamento t = new TestSendConfirMedicamento();
		t.okMedicamento();
	}
	
	
	
	/**
	 * @param args
	 */
	public void okMedicamento() {
		IWebServiceStub service = null;
		try {
	
			service = new IWebServiceStub("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
			//service = new IWebServiceServiceStub("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
			 
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
			
			Options o = new Options();
			o.setTimeOutInMilliSeconds(100000);
			
			//serviceClient.setOptions(o);
			
			ConfirmacionTransaccionDTO[] series = new ConfirmacionTransaccionDTO[1];
			ConfirmacionTransaccionDTO serie = new ConfirmacionTransaccionDTO();
			serie.setP_ids_transac(1436552687l);
			serie.setF_operacion("03/11/2014");;
			series[0] = serie;
			SendConfirmaTransaccE ge = new SendConfirmaTransaccE();
			SendConfirmaTransacc g = new SendConfirmaTransacc();
			g.setArg0("ENTRERIOS205");
			g.setArg1("ORIEN2012");
			g.setArg2(series);
			ge.setSendConfirmaTransacc(g);
			
			SendConfirmaTransaccResponseE ger = new SendConfirmaTransaccResponseE();
			
			ger = service.sendConfirmaTransacc(ge);
			
//			WebServiceError[] wseArray = result.getSendMedicamentosDHSerieResponse().getReturn().getErroresArray();
//			for(WebServiceError wse: wseArray){
//				System.out.println(wse.getDError());				
//			}
//			System.out.println(result.getSendMedicamentosDHSerieResponse().getReturn().getCodigoTransaccion());
//			
			System.out.println("sd"); 
		    
		} catch (AxisFault e1) {

			e1.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}


	}


