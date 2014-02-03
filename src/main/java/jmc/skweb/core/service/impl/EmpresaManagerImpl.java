package jmc.skweb.core.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.springframework.transaction.annotation.Transactional;


import jmc.skweb.core.dao.GenericDAO;
import jmc.skweb.core.dao.OperadoresDAO;
import jmc.skweb.core.dao.VendedorDAO;
import jmc.skweb.core.model.EmpresaWeb;
import jmc.skweb.core.model.Gente;
import jmc.skweb.core.model.Operadores;
import jmc.skweb.core.model.Parametrizacion;
import jmc.skweb.core.model.Preferencias;
import jmc.skweb.core.model.Rol;
import jmc.skweb.core.model.Usuario;
import jmc.skweb.core.model.UsuarioWeb;
import jmc.skweb.core.model.Vendedor;
import jmc.skweb.core.service.EmpresaManager;
import jmc.skweb.core.service.UsuarioManager;
import jmc.skweb.util.Constants;
import jmc.skweb.util.email.Email;
import jmc.skweb.util.email.SendEmailThread;






/**
 * @author Juan Manuel Carrascal
 *
 */
public class EmpresaManagerImpl implements EmpresaManager{

	
	private GenericDAO<UsuarioWeb> usuarioWebDAO;
	private GenericDAO<EmpresaWeb> empresaWebDAO;
	private GenericDAO<Parametrizacion> parametrizacionDAO;
	

	public GenericDAO<Parametrizacion> getParametrizacionDAO() {
		return parametrizacionDAO;
	}

	public void setParametrizacionDAO(GenericDAO<Parametrizacion> parametrizacionDAO) {
		this.parametrizacionDAO = parametrizacionDAO;
	}



	public GenericDAO<EmpresaWeb> getEmpresaWebDAO() {
		return empresaWebDAO;
	}

	public void setEmpresaWebDAO(GenericDAO<EmpresaWeb> empresaWebDAO) {
		this.empresaWebDAO = empresaWebDAO;
	}

	public GenericDAO<UsuarioWeb> getUsuarioWebDAO() {
		return usuarioWebDAO;
	}

	public void setUsuarioWebDAO(GenericDAO<UsuarioWeb> usuarioWebDAO) {
		this.usuarioWebDAO = usuarioWebDAO;
	}

	
	public void sendMail(Email email) {
		Properties props = getPropertiesEmail();		
		SendEmailThread emailManager = new SendEmailThread(props,email);		
		emailManager.start();
	}



	
	public List<UsuarioWeb> getUsuariosPorEmpresa(int idEmpresa) {
		HashMap<String, Object> res = new HashMap<String, Object>();
		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(idEmpresa);
		res.put("empresaWeb", empresaWeb);
		List<UsuarioWeb> usuarioWebList = usuarioWebDAO.findByObjectCriteria(res);
		return usuarioWebList;
	}

	public List<UsuarioWeb> getUsuarios() {
		List<UsuarioWeb> usuarioWebList = usuarioWebDAO.getAll();
		return usuarioWebList;
	}

	
	public boolean existeUsuario(String usuario)throws Exception {
		HashMap<String, Object> res = new HashMap<String, Object>();		
		res.put("usuario", usuario);
		List<UsuarioWeb> usuarioWebList = usuarioWebDAO.findByObjectCriteria(res);
		if (usuarioWebList.size() > 0)
			return true;
		else
			return false;
	}

	
	public void saveUsuarioWeb(UsuarioWeb usuarioWeb, int idEmpresa) throws Exception{
		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(idEmpresa);
		
		usuarioWeb.setEmpresaWeb(empresaWeb);
		usuarioWebDAO.save(usuarioWeb);		
	}

	
	public void setLastLogin(Usuario user) {
		UsuarioWeb userWeb = usuarioWebDAO.getByPrimaryKey(user.getIdUsuario());
		userWeb.setLastLogin(new Timestamp(System.currentTimeMillis()));
		usuarioWebDAO.update(userWeb);		
	}

	

	
	public void updateUsuario(UsuarioWeb usuarioWeb,int idEmpresa) throws Exception{
		EmpresaWeb empresaWeb = empresaWebDAO.getByPrimaryKey(idEmpresa);
		
		usuarioWeb.setEmpresaWeb(empresaWeb);
		usuarioWebDAO.update(usuarioWeb);
		
	}


	public void removeUsuario(Long idUsuarioWeb) {
		UsuarioWeb usuarioWeb = usuarioWebDAO.getByPrimaryKey(idUsuarioWeb);
		usuarioWebDAO.remove(usuarioWeb);		
	}

	public List<EmpresaWeb> getAllEmpresa() {		
		return empresaWebDAO.getAll();
	}

	
	public Properties getPropertiesEmail(){
		Properties props = new Properties();
		long i = 50l;
		while(i < 66){
			Parametrizacion parametrizacion = parametrizacionDAO.getByPrimaryKey(i);			
			if (parametrizacion!=null){
				props.put(parametrizacion.getDescrip().trim(), parametrizacion.getValor().trim());				
			}			
			i++;
		}			
		return props;
	}

	
	public boolean existeGln(String gln) {
		HashMap<String, Object> res = new HashMap<String, Object>();
		res.put("gln", gln);
		List<EmpresaWeb> empresaWebList = empresaWebDAO.findByObjectCriteria(res);
		if (empresaWebList.size() > 0)
			return true;
		else
			return false;
	}

	public void saveEmpresaWeb(EmpresaWeb empresaWeb) {
		int total = empresaWebDAO.getAll().size();
		empresaWeb.setIdEmpresaWeb(total + 10);
		empresaWeb.setUrlTraza("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
		empresaWeb.setEmpresaNrSk(1);
		empresaWebDAO.save(empresaWeb);
	}

	public void updateEmpresa(EmpresaWeb empresaWeb) {
		 empresaWeb.setUrlTraza("https://trazabilidad.pami.org.ar:9050/trazamed.WebService");
		 empresaWeb.setEmpresaNrSk(1);
		 empresaWebDAO.update(empresaWeb);
	}

	
	public List<EmpresaWeb> getEmpresas() {
		return empresaWebDAO.getAll();
	}

	
	public EmpresaWeb getEmpresaByPK(Integer idEmpresaWeb) {
		
		return empresaWebDAO.getByPrimaryKey(idEmpresaWeb);
	}
	
	

	


}
