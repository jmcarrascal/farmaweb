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

import com.inssjp.mywebservice.business.IWebServiceStub;
import com.inssjp.mywebservice.business.IWebServiceStub.ConfirmacionTransaccionDTO;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadas;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadasE;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadasResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransacc;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransaccE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransaccResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.TransaccionPlainWS;
import com.inssjp.mywebservice.business.IWebServiceStub.WebServiceError;


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
			String error = null;
			String usr_pami = "BIKANER24";
			String pass_pami = "BIKANER12";
			String gtin = "07795367054522";
			String seriegtin = "64770791";
			
			//serviceClient.setOptions(o);
			
			security.addChild(userNameToken);				
			serviceClient.addHeader(security);
			
			GetTransaccionesNoConfirmadasE ge = new GetTransaccionesNoConfirmadasE();
			GetTransaccionesNoConfirmadas g = new GetTransaccionesNoConfirmadas();
			g.setArg0(usr_pami);
			g.setArg1(pass_pami);
			g.setArg6(gtin);
			g.setArg18(seriegtin);
			ge.setGetTransaccionesNoConfirmadas(g);
			
			GetTransaccionesNoConfirmadasResponseE geR = new GetTransaccionesNoConfirmadasResponseE();

			geR = service.getTransaccionesNoConfirmadas(ge);

			if (geR.getGetTransaccionesNoConfirmadasResponse().get_return()
					.getErrores() != null) {
				WebServiceError[] wseArray = geR
						.getGetTransaccionesNoConfirmadasResponse()
						.get_return().getErrores();
				for (WebServiceError wse : wseArray) {
					System.out.println(wse.get_d_error());
					error = wse.get_d_error();
				}
			}
			String idTransac = "";
			if (error == null && geR
					.getGetTransaccionesNoConfirmadasResponse()
					.get_return().getList() != null) {
				for (TransaccionPlainWS t : geR
						.getGetTransaccionesNoConfirmadasResponse()
						.get_return().getList()) {
					idTransac = t.get_id_transaccion();
				}
			}
			
			
			
			ConfirmacionTransaccionDTO[] series = new ConfirmacionTransaccionDTO[1];
			ConfirmacionTransaccionDTO serie = new ConfirmacionTransaccionDTO();
			serie.setP_ids_transac(Long.parseLong(idTransac));
			serie.setF_operacion("06/11/2015");;
			series[0] = serie;
			SendConfirmaTransaccE ge_ = new SendConfirmaTransaccE();
			SendConfirmaTransacc g_ = new SendConfirmaTransacc();
			
			
			
			
			g_.setArg0(usr_pami);
			g_.setArg1(pass_pami);
			g_.setArg2(series);
			ge_.setSendConfirmaTransacc(g_);
			
			SendConfirmaTransaccResponseE ger = new SendConfirmaTransaccResponseE();
			
			ger = service.sendConfirmaTransacc(ge_);
			
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


