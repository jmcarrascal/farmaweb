package jmc.skweb.core.model;



// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Gente generated by hbm2java
 */
/**
 * @author vaio
 *
 */
@Entity
@Table(name = "UsuarioWeb", schema = "ComunSql.dbo")
public class UsuarioWeb implements java.io.Serializable {

	private Long idUsuarioWeb;	
	private Rol rol;
	private String empresa;
	private EmpresaWeb empresaWeb;
	private String relacion;
	private String nombre;
	private String apellido;
	private String usuario;
	private String password;
	private String email;
	private Integer vendedorNr;
	private Timestamp lastLogin;
	private Integer genteNr;
	private String descripGente;
	private Integer operadorNr;
	
	private String apyn;
	private Long idOficialCuenta;
	private String operadorDescrip;
	
	private String descripC;
	
	
	
	
	
	

	@Transient
	public String getOperadorDescrip() {
		return operadorDescrip;
	}
	public void setOperadorDescrip(String operadorDescrip) {
		this.operadorDescrip = operadorDescrip;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdUsuarioWeb() {
		return idUsuarioWeb;
	}
	public void setIdUsuarioWeb(Long idUsuarioWeb) {
		this.idUsuarioWeb = idUsuarioWeb;
	}

	
	
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEmpresaWeb")
	public EmpresaWeb getEmpresaWeb() {
		return empresaWeb;
	}
	public void setEmpresaWeb(EmpresaWeb empresaWeb) {
		this.empresaWeb = empresaWeb;
	}
	public String getRelacion() {
		return relacion;
	}
	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getVendedorNr() {
		return vendedorNr;
	}
	public void setVendedorNr(Integer vendedorNr) {
		this.vendedorNr = vendedorNr;
	}

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRol")
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Integer getGenteNr() {
		return genteNr;
	}
	public void setGenteNr(Integer genteNr) {
		this.genteNr = genteNr;
	}
	
	@Transient
	public String getDescripGente() {
		return descripGente;
	}
	public void setDescripGente(String descripGente) {
		this.descripGente = descripGente;
	}
	public Integer getOperadorNr() {
		return operadorNr;
	}
	public void setOperadorNr(Integer operadorNr) {
		this.operadorNr = operadorNr;
	}
	
	
	
	
	@Transient
	public String getApyn() {
		this.apyn = apellido.toUpperCase() + ", " + nombre; 
		return apyn;
	}
	public void setApyn(String apyn) {
		this.apyn = apyn;
	}
	
	
	public Long getIdOficialCuenta() {
		return idOficialCuenta;
	}
	public void setIdOficialCuenta(Long idOficialCuenta) {
		this.idOficialCuenta = idOficialCuenta;
	}
	@Transient
	public String getDescripC() {
		this.descripC = "[" + idUsuarioWeb + "] " + getApyn(); 
		return descripC;
	}

	public void setDescripC(String descripC) {
		this.descripC = descripC;
	}
	
}

