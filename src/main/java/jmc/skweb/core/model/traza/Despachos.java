package jmc.skweb.core.model.traza;



// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Despachos generated by hbm2java
 */
@Entity
@Table(name = "Despachos", schema = "ComunSql")
public class Despachos implements java.io.Serializable {

	private int despaNr;
	private String descrip;
	private Date fechaIng;
	private String obser;

	public Despachos() {
	}

	public Despachos(int despaNr) {
		this.despaNr = despaNr;
	}

	public Despachos(int despaNr, String descrip, Date fechaIng, String obser) {
		this.despaNr = despaNr;
		this.descrip = descrip;
		this.fechaIng = fechaIng;
		this.obser = obser;
	}

	@Id
	@Column(name = "DespaNr", unique = true, nullable = false)
	public int getDespaNr() {
		return this.despaNr;
	}

	public void setDespaNr(int despaNr) {
		this.despaNr = despaNr;
	}

	@Column(name = "Descrip", length = 25)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Column(name = "FechaIng", length = 16)
	public Date getFechaIng() {
		return this.fechaIng;
	}

	public void setFechaIng(Date fechaIng) {
		this.fechaIng = fechaIng;
	}

	@Column(name = "Obser", length = 50)
	public String getObser() {
		return this.obser;
	}

	public void setObser(String obser) {
		this.obser = obser;
	}

}
