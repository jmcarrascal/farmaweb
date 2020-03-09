package jmc.skweb.core.model;

// Generated 22/09/2011 00:18:30 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Preferencias generated by hbm2java
 */
@Entity
//@Table(name = "Preferencias", schema = "Empresa1.dbo")
//@Table(name = "Preferencias", schema = "Plasticos.dbo")
@Table(name = "Preferencias", schema = "TransacSQL")

public class Preferencias implements java.io.Serializable {

	private Integer nr;
	private String descrip;
	private Double valor;

	public Preferencias() {
	}

	public Preferencias(Integer nr, Double valor) {
		this.nr = nr;
		this.valor = valor;
	}

	public Preferencias(Integer nr, String descrip, Double valor) {
		this.nr = nr;
		this.descrip = descrip;
		this.valor = valor;
	}

	@Id
	@Column(name = "Nr", unique = true, nullable = false)
	public Integer getNr() {
		return this.nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	@Column(name = "Descrip", length = 100)
	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Column(name = "Valor", nullable = false, precision = 24, scale = 0)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
