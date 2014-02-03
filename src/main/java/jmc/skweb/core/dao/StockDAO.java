package jmc.skweb.core.dao;

import java.util.List;

import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Stock;



public interface StockDAO extends GenericDAO<Stock> {

	public List<Stock> getArticuloPorNombre(String filtro, boolean activos)throws Exception ;

	public List<Stock> getArticuloPorNrSubFam(Long nrsubfam, boolean activos);

	public List<Stock> getArticuloPorNrFamSubFam(Long nrfam, Long nrsubfam, boolean activos);

	public List<Stock> getArticuloPorNrFam(Long nrfam, boolean activos);

	public List<Stock> getArticuloPorNrProveedor(Integer genteNr, boolean activos);

	public List<Stock> getArticuloPorNombreLimit(String filter, int i);

	public String getArticuloPorPK(String clave, boolean articuloActivo);
}
