/*

 * Copyright 2008 Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires.  All Rights Reserved

 * Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires Proprietary and Confidential.

 *

 * You agree to use Your best efforts to protect the software and documentation

 * from unauthorized copy or use. The software source code represents and embodies

 * trade secrets of Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires and/or its licensors.

 * The source code and embodied trade secrets are not licensed to you and any modification,

 * addition or deletion is strictly prohibited. You agree not to disassemble, decompile,

 * or otherwise reverse engineer the software in order to discover the source code and/or

 * the trade secrets contained in the source code.

 *

 *

 * Derecho de autor 2008 Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires.  Todos los derechos reservados.

 * Propiedad de Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires y Confidencial.

 *

 * Por la presente acuerdo hacer mi mayor esfuerzo para proteger el software y la documentaci�n

 * de la copia o el uso no autorizados. El c�digo fuente del software representa e incluye

 * secretos comerciales de Direcci�n Provincial de Inform�tica de la Provincia de Buenos Aires y/o sus licenciantes. 

 * No se le otorga licencia del c�digo fuente ni los secretos comerciales incluidos;

 * y cualquier modificaci�n, agregado o eliminaci�n se encuentra estrictamente prohibida.

 * Asimismo, por la presente me comprometo a no desarmar, descompilar, o de alguna forma utilizar

 * t�cnicas de ingenier�a inversa sobre el software para descubrir su fuente y/o los

 * secretos comerciales contenidos en el c�digo fuente.

 *

 */
package jmc.skweb.core.service;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.dao.DataAccessException;

import jmc.skweb.core.model.ArtMadre;
import jmc.skweb.core.model.ExiArt;
import jmc.skweb.core.model.Fam;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.shortEntities.GenteBasic;
import jmc.skweb.core.model.Stock;
import jmc.skweb.core.model.SubFam;
import jmc.skweb.core.model.Usuario;



/**
 * @author Juan Manuel Carrascal
 *
 */
public interface ArticuloManager {
			
	public List<Stock> getArticuloProNombre(String filtro, boolean activos);

	public Stock getArticuloPorPK(String nrArt);
	
	public List<ExiArt> getExistenciaPorArticulo(String clave, Usuario usuario);

	public List<Fam> getListFam();

	public List<SubFam> getListSubFam();

	public List<Stock> getArticuloPorFliaSubFlia(Long nrfam, Long nrsubfam, boolean activos);

	public List<Gente> getProveedorPorNombre(String nombreProveedor);

	public List<Stock> getArticuloPorProveedor(Integer genteNr, boolean activos);

	public List<ArtMadre> getArtMadrePorNombre(String descArtMad);	

	public List<Stock> getArticulosPorArtMadre(String codArtMad);

	public Gente getGentePorPK(Integer genteNr);

	public Fam getFamiliaPorPK(Long nrfam);

	public SubFam getSubFamiliaPorPK(Long nrsubfam);

	public ArtMadre getArtMadreProPK(String codArtMad);

	public List<Gente> getProveedorPorNombreVendedor(String nombreProveedor,
			Usuario usuario);

	public List<Stock> getArticuloProNombreLimit(String filter, int i);

	public List<GenteBasic> getProveedorBasicPorNombre(String filter, Usuario usuario);

	public GenteBasic getGentePorPKVendedor(Integer genteNr,
			Usuario usuarioSesion);

	public String getFormulaStock(String clave, Usuario usuarioSesion);
	
	
}
