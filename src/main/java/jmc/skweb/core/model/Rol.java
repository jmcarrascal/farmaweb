package jmc.skweb.core.model;

// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Fam generated by hbm2java
 */
@Entity
@Table(name = "Rol", schema = "ComunSql.dbo")
public class Rol implements java.io.Serializable {

	private Integer idRol;
	private String descrip;

	public Rol() {
	}

	@Id
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


}
