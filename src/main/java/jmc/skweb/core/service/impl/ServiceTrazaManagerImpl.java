package jmc.skweb.core.service.impl;



import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;

import com.inssjp.mywebservice.business.IWebServiceStub;
import com.inssjp.mywebservice.business.IWebServiceStub.ConfirmacionTransaccionDTO;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadas;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadasE;
import com.inssjp.mywebservice.business.IWebServiceStub.GetTransaccionesNoConfirmadasResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransacc;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransaccE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendConfirmaTransaccResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosE;
import com.inssjp.mywebservice.business.IWebServiceStub.SendMedicamentosResponseE;
import com.inssjp.mywebservice.business.IWebServiceStub.TransaccionPlainWS;
import com.inssjp.mywebservice.business.IWebServiceStub.WebServiceError;


import jmc.skweb.core.model.traza.ResultSendMedicamento;
import jmc.skweb.core.service.ParametrizacionManager;
import jmc.skweb.core.service.ServiceTrazaManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.DateUtil;


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
	
	public SendMedicamentosResponseE sendMedicamento(
			SendMedicamentosE request, String urlTraza) throws Exception  {
	
		SendMedicamentosResponseE result = null;
		IWebServiceStub service = new IWebServiceStub("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
		
			Long timeout = 5l * 60l * 1000l; // Cinco minutos		
		
			String url = urlTraza;
			
			String usr_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_USR_TRANSPRORTE_TRAZA).getValor();
			
			String pass_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_PASS_TRANSPRORTE_TRAZA).getValor();			
			
			
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
	
	
	public ResultSendMedicamento confifTransac(
			String gtin, String serieGtin, String usr_pami, String pass_pami, String urlTraza ) throws Exception  {
	
		IWebServiceStub service = null;
		ResultSendMedicamento result = new ResultSendMedicamento();
		try {
			
			service = new IWebServiceStub(urlTraza);
		
			Long timeout = 10l * 60l * 1000l; // Cinco minutos		
		
			String url = urlTraza;
			
			String usr_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_USR_TRANSPRORTE_TRAZA).getValor();
			
			String pass_transp_traza = parametrizacionManager.getParametrizacionByPrimaryKey(Constants.ID_PASS_TRANSPRORTE_TRAZA).getValor();			
			
			service._getServiceClient().getOptions().setTimeOutInMilliSeconds(timeout);
			//service._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, new Integer(timeout.intValue()));
			//service._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, new Integer(timeout.intValue()));
			 
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
			String error = null;
			GetTransaccionesNoConfirmadasE ge = new GetTransaccionesNoConfirmadasE();
			GetTransaccionesNoConfirmadas g = new GetTransaccionesNoConfirmadas();
			g.setArg0(usr_pami);
			g.setArg1(pass_pami);
			g.setArg6(gtin);
			g.setArg18(serieGtin);
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
			
			try{
			Long id_transac = Long.parseLong(idTransac);
			ConfirmacionTransaccionDTO[] series = new ConfirmacionTransaccionDTO[1];
			ConfirmacionTransaccionDTO serie = new ConfirmacionTransaccionDTO();
			serie.setP_ids_transac(id_transac);
			serie.setF_operacion(DateUtil.getFormatedSTDDate(new Timestamp(System.currentTimeMillis())));
			series[0] = serie;
			SendConfirmaTransaccE ge_ = new SendConfirmaTransaccE();
			SendConfirmaTransacc g_ = new SendConfirmaTransacc();
			g_.setArg0(usr_pami);
			g_.setArg1(pass_pami);
			g_.setArg2(series);
			ge_.setSendConfirmaTransacc(g_);
			
			
			SendConfirmaTransaccResponseE result_confirm = service.sendConfirmaTransacc(ge_);
			String id_transac_ = "";
			if (result_confirm.getSendConfirmaTransaccResponse().get_return()
					.getErrores() != null && result_confirm.getSendConfirmaTransaccResponse().get_return()
							.getErrores().length>0) {
				WebServiceError[] wseArray = result_confirm
						.getSendConfirmaTransaccResponse()
						.get_return().getErrores();
				for (WebServiceError wse : wseArray) {
					result.setExito(false);
					result.setErrores(wse.get_d_error());
				}
				
			}else{
				id_transac_ = result_confirm.getSendConfirmaTransaccResponse().get_return().getId_transac_asociada();
				result.setExito(true);
				result.setErrores("OK");
				result.setTransacNr(id_transac_);
				
			}
			
			
			}catch(Exception e){
				e.printStackTrace();
				result.setExito(false);
				result.setErrores("No se pudo obtener el id_transac_global");				
			}

		} catch (AxisFault e1) {
			e1.printStackTrace();
			result.setExito(false);
			result.setErrores("No se pudo obtener el id_transac_global");
			e1.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setExito(false);
			result.setErrores("No se pudo obtener el id_transac_global");
		}
		
		System.out.println(result.getErrores());
		System.out.println(result.getTransacNr());

			 
		return result;
	}

}
