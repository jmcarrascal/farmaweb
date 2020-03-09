package jmc.skweb.core.service.impl.anmat.test;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.xml.namespace.QName;

import jmc.skweb.core.model.traza.ResultSendMedicamento;
import jmc.skweb.util.DateUtil;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
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

public class TestGetStock {

	private String gnlUsu = "9991137700028";
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

		TestGetStock t = new TestGetStock();
		t.entrenar();
	}

	public void entrenar() {
		// Desde Un eslabon anterior

		gnlOrigen = gnlDrogueria;
		gnlDestino = gnlUsu;
		idEvento = "101";
		sendMedicamento();

		

	}

	/**
	 * @param args
	 */
	public void sendMedicamento() {
		IWebServiceStub service = null;
		ResultSendMedicamento result = new ResultSendMedicamento();
		try {
			
			System.out.println("Inicio: " + new Timestamp(System.currentTimeMillis()));
			service = new IWebServiceStub(
					"https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
			// service = new
			// IWebServiceServiceStub("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");

			ServiceClient serviceClient = service._getServiceClient();

			OMFactory omFactory = OMAbstractFactory.getOMFactory();

			OMElement security = omFactory
					.createOMElement(
							new QName(
									"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
									"Security", "wsse"), null);

			OMNamespace omNs = omFactory
					.createOMNamespace(
							"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
							"wsu");
			OMElement userNameToken = omFactory.createOMElement(
					"UsernameToken", omNs);

			OMElement userName = omFactory.createOMElement("Username", omNs);
			userName.addChild(omFactory.createOMText("testwservice"));

			OMElement password = omFactory.createOMElement("Password", omNs);
			password.addChild(omFactory.createOMText("testwservicepsw"));

			userNameToken.addChild(userName);
			userNameToken.addChild(password);

			security.addChild(userNameToken);
			serviceClient.addHeader(security);

			serviceClient.getOptions().setTimeOutInMilliSeconds(1000000);

			// serviceClient.setOptions(o);

			String error = null;
			GetTransaccionesNoConfirmadasE ge = new GetTransaccionesNoConfirmadasE();
			GetTransaccionesNoConfirmadas g = new GetTransaccionesNoConfirmadas();
			g.setArg0("DROGUERIAORIEN");
			g.setArg1("ORIEN1152");
			
			
			g.setArg6("07795312001427");
			//g.setArg18("8137306466");
			ge.setGetTransaccionesNoConfirmadas(g);

			GetTransaccionesNoConfirmadasResponseE geR = new GetTransaccionesNoConfirmadasResponseE();

			System.out.println("Voy a llmar a getTransaccionesNoConfirmadas " + new Timestamp(System.currentTimeMillis()));
			geR = service.getTransaccionesNoConfirmadas(ge);
			System.out.println(geR.getGetTransaccionesNoConfirmadasResponse().get_return().getList().length);
			System.out.println("Llame a getTransaccionesNoConfirmadas " + new Timestamp(System.currentTimeMillis()));
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
			g_.setArg0("ENTRERIOS205");
			g_.setArg1("ORIEN2012");
			g_.setArg2(series);
			ge_.setSendConfirmaTransacc(g_);
			
			System.out.println("Voy a llmar a sendConfirmaTransacc " + new Timestamp(System.currentTimeMillis()));
			SendConfirmaTransaccResponseE result_confirm = service.sendConfirmaTransacc(ge_);
			System.out.println("llame a sendConfirmaTransacc " + new Timestamp(System.currentTimeMillis()));
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
				result.setExito(false);
				result.setErrores("No se pudo obtener el id_transac_global");				
			}

		} catch (AxisFault e1) {
			result.setExito(false);
			result.setErrores("No se pudo obtener el id_transac_global");
			e1.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.setExito(false);
			result.setErrores("No se pudo obtener el id_transac_global");
		}
		System.out.println(result.getErrores());
		System.out.println(result.getTransacNr());
		System.out.println("Fin: " + new Timestamp(System.currentTimeMillis()));

	}

}
