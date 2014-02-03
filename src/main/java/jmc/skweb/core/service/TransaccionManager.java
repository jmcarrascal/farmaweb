package jmc.skweb.core.service;


import java.math.BigDecimal;
import java.util.List;

import jmc.skweb.core.model.ClieArticPrecio;
import jmc.skweb.core.model.Domicilios;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Items;
import jmc.skweb.core.model.TipoComprob;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.Usuario;
import jmc.skweb.core.model.report.TipoReporte;
import jmc.skweb.core.model.traza.ObraSocial;
import jmc.skweb.core.model.traza.Trazabi;
import jmc.skweb.core.model.traza.TrazabiFarma;
import jmc.skweb.core.model.traza.report.DatosTrazaWS;







/**
 * @author Juan Manuel Carrascal
 *
 */
public interface TransaccionManager {

	List<Items> addItem(List<Items> itemsSessionList, Items items, Usuario usuario);

	List<Items> removeItem(List<Items> itemsSessionList, Items items);

	Transac calculoTotales(List<Items> itemsSessionList);

	BigDecimal getPrecioClienteArticulo(Integer genteNr, String clave);

	String saveTransac_OP(List<Items> itemsSessionList, Integer genteNr, Integer i, String fechaEntrega, Transac transac, int tipoComprobNr, Usuario usuario) throws Exception;

	String getArticuloPorClave(String clave);

	BigDecimal getBonifPorCadena(String bonif1, String bonif2, String bonif3,
			String bonif4);

	String getFormatCadena(String bonif1, String bonif2, String bonif3,
			String bonif4);
	
	public List<Items> editItem(List<Items> itemsSessionList, Items items, Usuario usuario) ;
	List<TipoComprob> getTipoComprobEnable(Integer rol);

	TipoComprob getTipoComprobByPK(int nr);

	List<TipoComprob> getTipoComprobAll();

	List<TipoReporte> getTipoReporteAll();

	Gente getGenteConDomiPrinc(Integer genteNr);

	List<TipoReporte> getTipoReporteTesoreria();
	
	List<Trazabi> getTrazabiPorTransac(Integer transacNr) ;
	String getArticuloPorClave(String clave, boolean articuloActivo);

	String getTransacJoin(int nr, String clave, Usuario usuarioSesion);

	Transac getTransacByPK(Integer transacNr);

	Domicilios getDomiciliosAdm(Gente gente);

	List<Transac> getRemitosPendientesPorClienteTraza(Usuario usuarioSesion);

	List<Trazabi> getTrazabiPorComprobante(Integer transacNr);

	String sendRemitoAnmat(Integer transacNr, Usuario usuario);

	List<Transac> getRemitosAEnviarTraza(Usuario usuarioSesion);

	String sendRemitoEgresoAnmat(Integer transacNr, Usuario usuarioSesion, DatosTrazaWS datosTrazaWS);
	
	public List<TrazabiFarma> getTrazabiFarmaPorTransac(Integer transacNr) ;

	List<ObraSocial> getAllObraSocial();

	List<Transac> getRemitosEnviados(Usuario usuarioSesion);

	List<Trazabi> getTrazabiPorTransac(Integer transacNr, Usuario usuarioSesion);

	List<ObraSocial> getObraSocialPorNombre(String filter);

	List<TrazabiFarma> getTrazabiFarmaPorSerie(String filter, Usuario usuario);

	List<TrazabiFarma> addTrazabiFarma(
			List<TrazabiFarma> trazabiFarmaSessionList,
			TrazabiFarma trazabiFarma, Usuario usuarioSesion);

	String sendRemitoEgresoAnmatUnid(
			List<TrazabiFarma> trazabiFarmaSessionList, Usuario usuarioSesion,
			DatosTrazaWS datosTrazaWS);

	List<Trazabi> getTrazabiPorTransacPorTransac(Integer transacNr,
			Usuario usuarioSesion);

	List<TrazabiFarma> getRemitosEnviadosPorNr(Usuario usuarioSesion);

	List<TrazabiFarma> getTrazabiFarmaPorRemito(String nrRemitoPropio,
			Usuario usuarioSesion);

	}
