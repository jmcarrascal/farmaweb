package jmc.skweb.core.model;

// Generated 22/09/2011 00:18:30 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Numeraciones generated by hbm2java
 */
@Entity
@Table(name = "Numeraciones", schema = "TransacSQL.dbo")
public class Numeraciones implements java.io.Serializable {

	private Integer nr;
	private String descrip;
	private Integer letraA;
	private Integer letraB;
	private Integer letraC;
	private Integer letraE;

	public Numeraciones() {
	}

	public Numeraciones(Integer nr, String descrip, Integer letraA, Integer letraB,
			Integer letraC, Integer letraE) {
		this.nr = nr;
		this.descrip = descrip;
		this.letraA = letraA;
		this.letraB = letraB;
		this.letraC = letraC;
		this.letraE = letraE;
	}

	@Id
	@Column(name = "Nr", unique = true, nullable = false)
	public Integer getNr() {
		return this.nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	@Column(name = "Descrip", nullable = false, length = 70)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Column(name = "LetraA", nullable = false, precision = 24, scale = 0)
	public Integer getLetraA() {
		return this.letraA;
	}

	public void setLetraA(Integer letraA) {
		this.letraA = letraA;
	}

	@Column(name = "LetraB", nullable = false, precision = 24, scale = 0)
	public Integer getLetraB() {
		return this.letraB;
	}

	public void setLetraB(Integer letraB) {
		this.letraB = letraB;
	}

	@Column(name = "LetraC", nullable = false, precision = 24, scale = 0)
	public Integer getLetraC() {
		return this.letraC;
	}

	public void setLetraC(Integer letraC) {
		this.letraC = letraC;
	}

	@Column(name = "LetraE", nullable = false, precision = 24, scale = 0)
	public Integer getLetraE() {
		return this.letraE;
	}

	public void setLetraE(Integer letraE) {
		this.letraE = letraE;
	}

}
