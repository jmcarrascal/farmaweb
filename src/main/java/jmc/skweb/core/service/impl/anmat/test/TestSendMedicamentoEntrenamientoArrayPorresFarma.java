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
import com.inssjp.mywebservice.business.MedicamentosDTODHSerie;
import com.inssjp.mywebservice.business.SendCancelacTransacc;
import com.inssjp.mywebservice.business.SendCancelacTransaccDocument;
import com.inssjp.mywebservice.business.SendCancelacTransaccResponseDocument;
import com.inssjp.mywebservice.business.SendMedicamentos;
import com.inssjp.mywebservice.business.SendMedicamentosDHSerie;
import com.inssjp.mywebservice.business.SendMedicamentosDHSerieDocument;
import com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponseDocument;
import com.inssjp.mywebservice.business.SendMedicamentosDocument;
import com.inssjp.mywebservice.business.SendMedicamentosResponseDocument;
import com.inssjp.mywebservice.business.WebServiceError;
import com.inssjp.mywebservice.business.WebServiceResult;
import com.inssjp.mywebservice.business.impl.MedicamentosDTOImpl;
import com.inssjp.mywebservice.business.impl.SendCancelacTransaccDocumentImpl;
import com.inssjp.mywebservice.business.impl.SendCancelacTransaccImpl;
import com.inssjp.mywebservice.business.impl.SendMedicamentosDocumentImpl;


public class TestSendMedicamentoEntrenamientoArrayPorresFarma {

	private String gnlUsu = "9991279900003";
	private String gnlFarmacia = "";
	private String gnlDrogueria = "7798167940002";
	private String gtin = "07795345003030";
	private String idEvento = "";
	private String numeroSerial = "";
	private String gnlOrigen = "";
	private String gnlDestino = "";
	private String serieDesde = "300";
	private String serieHasta = "320";
	
	public static void main(String[] args) {
		
		TestSendMedicamentoEntrenamientoArrayPorresFarma t = new TestSendMedicamentoEntrenamientoArrayPorresFarma();
		t.entrenar();
	}
	
	public void entrenar() {
		//Desde Un eslabon anterior
		
		gnlOrigen = gnlDrogueria;
		gnlDestino = gnlUsu;
		idEvento = "101";		
		sendMedicamento();
		
		//Debe informar un lote de 20 productos como entrega de producto en caracter de devolucion, a traves del WebService
		
		gnlOrigen = gnlUsu;
		gnlDestino = gnlDrogueria;
		idEvento = "105";
		sendMedicamento();
		
//		//Debe informar un lote de 20 productos como robados / extraviados, a traves del WebService
		
		gnlOrigen = gnlUsu;
		gnlDestino = null;
		idEvento = "112";
		sendMedicamento();
		

		//Desde Un eslabon anterior
		
		gnlOrigen = gnlDrogueria;
		gnlDestino = gnlUsu;
		idEvento = "101";	
		serieDesde = "400";
		serieHasta = "420";
		sendMedicamento();

		
		//Debe informar un lote de 20 productos como vencidos, a traves del WebService
		gnlOrigen = gnlUsu;
		gnlDestino = null;
		idEvento = "126";
		serieDesde = "400";
		serieHasta = "420";
		sendMedicamento();
		
	}
	
	/**
	 * @param args
	 */
	public void sendMedicamento() {
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
			
			SendMedicamentosDHSerieDocument req = SendMedicamentosDHSerieDocument.Factory.newInstance();
			
			
			//SendMedicamentosDocument req = new SendMedicamentosDocumentImpl();
			
			SendMedicamentosDHSerie ss = req.addNewSendMedicamentosDHSerie();
			
			MedicamentosDTODHSerie[] arg0Array = new MedicamentosDTODHSerie[1]; 
			
			
			MedicamentosDTODHSerie m = MedicamentosDTODHSerie.Factory.newInstance();
			
			m.setIdEvento(this.idEvento);
			m.setGtin(this.gtin);
			m.setGlnOrigen(this.gnlOrigen);
			m.setGlnDestino(this.gnlDestino);
			m.setNRemito("0001-00000001");
			//m.setCuitOrigen("20280377695");
			//m.setCuitDestino("20280377635");
			m.setDesdeNumeroSerial(serieDesde);
			m.setHastaNumeroSerial(serieHasta);
			m.setVencimiento("08/06/2014");
			m.setFEvento("09/06/2012");
			m.setLote("1");
			m.setHEvento("10:00");
			
			arg0Array[0] = m;
			
			ss.setArg0Array(arg0Array);
			ss.setArg1("7798171070009");
			ss.setArg2("Malabia1414");
			
			SendMedicamentosDHSerieResponseDocument result = service.sendMedicamentosDHSerie(req);
			
			WebServiceError[] wseArray = result.getSendMedicamentosDHSerieResponse().getReturn().getErroresArray();
			for(WebServiceError wse: wseArray){
				System.out.println(wse.getDError());				
			}
			System.out.println(result.getSendMedicamentosDHSerieResponse().getReturn().getCodigoTransaccion());
			
			//System.out.println(result.xmlText()); 
		    
		} catch (AxisFault e1) {

			e1.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}


	}


