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
//@Table(name = "Fam", schema = "ComunSql.dbo")
//Simpa
//@Table(name = "Fam", schema = "ArtPlas.dbo")
@Table(name = "Fam", schema = "ComunSql")
public class Fam implements java.io.Serializable {

	private Long nrfam;
	private String desfam;

	public Fam() {
	}

	public Fam(Long nrfam) {
		this.nrfam = nrfam;
	}

	public Fam(Long nrfam, String desfam) {
		this.nrfam = nrfam;
		this.desfam = desfam;
	}

	@Id
	@Column(name = "nrfam", unique = true, nullable = false)
	public Long getNrfam() {
		return this.nrfam;
	}

	public void setNrfam(Long nrfam) {
		this.nrfam = nrfam;
	}

	@Column(name = "desfam", length = 50)
	public String getDesfam() {
		return this.desfam;
	}

	public void setDesfam(String desfam) {
		this.desfam = desfam;
	}

}
