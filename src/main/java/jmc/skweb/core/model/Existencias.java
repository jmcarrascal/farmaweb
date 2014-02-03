package jmc.skweb.core.model;

// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Existencias generated by hbm2java
 */
@Entity
//@Table(name = "Existencias", schema = "ComunSql.dbo")
//Simpa
//@Table(name = "Existencias", schema = "ArtPlas.dbo")
@Table(name = "Existencias", schema = "ComunSql.dbo")
public class Existencias implements java.io.Serializable {

	private int nr;
	private String descrip;
	private String domicilio;
	private String localidad;
	private String provincia;
	private String telefono;
	private String contacto;
	private String observaciones;

	public Existencias() {
	}

	public Existencias(int nr) {
		this.nr = nr;
	}

	public Existencias(int nr, String descrip, String domicilio,
			String localidad, String provincia, String telefono,
			String contacto, String observaciones) {
		this.nr = nr;
		this.descrip = descrip;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.provincia = provincia;
		this.telefono = telefono;
		this.contacto = contacto;
		this.observaciones = observaciones;
	}

	@Id
	@Column(name = "nr", unique = true, nullable = false)
	public int getNr() {
		return this.nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	@Column(name = "descrip", length = 30)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Column(name = "Domicilio", length = 50)
	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Column(name = "Localidad", length = 50)
	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Column(name = "Provincia", length = 50)
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Column(name = "Telefono", length = 50)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "Contacto", length = 50)
	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Column(name = "Observaciones", length = 16)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}