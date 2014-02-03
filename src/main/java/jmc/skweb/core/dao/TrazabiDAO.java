package jmc.skweb.core.dao;

import java.util.List;

import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.Transac;
import jmc.skweb.core.model.report.TransacJoin;
import jmc.skweb.core.model.traza.Trazabi;



public interface TrazabiDAO extends GenericDAO<Trazabi> {

	List<Trazabi> getTrazabiPorComprobante(String comprob);

	List<Trazabi> getTrazabiPorTransac(Integer transacNr);

	List<Trazabi> getTrazabiPorGLN(String gln);

	List<Trazabi> getTrazabiPorTransac(Integer transacNr, String gln);



}
