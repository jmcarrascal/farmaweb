package jmc.skweb.core.model;

// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Vendedor generated by hbm2java
 */
@Entity
@Table(name = "Vendedor", schema = "ComunSql")
public class Vendedor implements java.io.Serializable {

	private int nr;
	private String descrip;
	private String descripC;

	public Vendedor() {
	}

	public Vendedor(int nr) {
		this.nr = nr;
	}

	public Vendedor(int nr, String descrip) {
		this.nr = nr;
		this.descrip = descrip;
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

	@Transient
	public String getDescripC() {
		this.descripC = "[" + nr + "] " + descrip; 
		return descripC;
	}

	public void setDescripC(String descripC) {
		this.descripC = descripC;
	}
}
