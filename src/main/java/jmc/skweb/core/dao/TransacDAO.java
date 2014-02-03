package jmc.skweb.core.dao;

import java.util.List;

import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.traza.TrazabiFarma;



public interface TransacDAO extends GenericDAO<Transac> {

	List<Transac> getCuentaCorrienteVenta(Integer[] listTipoComprVentas,
			Integer genteNr);

	List<Transac> getResumenCuentaCorriente(Integer[] listTipoComprVentas,
			Integer genteNr, String fechaDesde, String fechaHasta);

	Double getSaldoPorAgendadoTipoCompr(Integer tipoCompr, Integer genteNr,
			String fechaDesde);
	
	public Double getTotalPorAgendadoTipoCompr(Integer tipoCompr,
			Integer genteNr, String fechaDesde) ;


	List<Transac> getTransacPorTipoComprob(Integer genteNr, int nr, String fechaDesde, String fechaHasta);

	Double getTotalDisponibleByArtComprob(String clave,
			Integer idTipoCompPedidoCompra);

	List<TransacJoin> getTransacJoin(int nr, String clave);

	List<Transac> getRemitosPendientesPorClienteTraza(Gente genteSession, Integer transsacNrDesde, String gln);

	List<Transac> getRemitosAEnviarTraza(Gente gente, Integer transacDesde, String gln);
	
	public List<Transac> getRemitosEnviados(Gente genteSession, Integer transacNrDesde, String gln);

	List<TrazabiFarma> getRemitosEnviadosPorNr(String gln);


}
