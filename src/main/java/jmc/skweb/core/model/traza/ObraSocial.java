package jmc.skweb.core.model.traza;




import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Despachos generated by hbm2java
 */
@Entity
@Table(name = "ObraSocial", schema = "Farmacias.dbo")
public class ObraSocial implements java.io.Serializable, Comparable<ObraSocial> {

	private Integer idObraSocial;
	private String nombre;
	private String descripC;
	private Integer activo;
	
	public ObraSocial() {
	}

	@Id	
	public Integer getIdObraSocial() {
		return idObraSocial;
	}

	public void setIdObraSocial(Integer idObraSocial) {
		this.idObraSocial = idObraSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Transient
	public String getDescripC() {
		String d = "[" + idObraSocial + "] " + nombre;
		return d;
	}

	public void setDescripC(String descripC) {
		this.descripC = descripC;
	}

	@Override
	public int compareTo(ObraSocial o) {		
		return this.idObraSocial.compareTo(o.idObraSocial);
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	

}
