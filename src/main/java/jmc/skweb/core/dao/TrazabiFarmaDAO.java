package jmc.skweb.core.dao;

import java.util.List;

import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.traza.Trazabi;
import jmc.skweb.core.model.traza.TrazabiFarma;



public interface TrazabiFarmaDAO extends GenericDAO<TrazabiFarma> {

	List<TrazabiFarma> getTrazabiFarmaPorTransac(Integer transacNr);

	List<TrazabiFarma> getRemitosEnviados(String gln);

	TrazabiFarma getBySerie(String serieGtin, String gtin, Integer transacNr, boolean procesoIngreso, boolean procesoEgreso, String string, Long nrTrazabi);

	List<TrazabiFarma> getTrazabiFarmaPorRemito(String nrRemitoPropio,
			String gln);
	
	public TrazabiFarma getBySerieGtinRecepcionado(String serieGtin, String gtin) ;

}
