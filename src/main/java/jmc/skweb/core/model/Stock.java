package jmc.skweb.core.model;

// Generated 23/09/2011 12:11:03 by Hibernate Tools 3.2.0.b9

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Stock generated by hbm2java
 */
@Entity
//@Table(name = "Stock", schema = "ComunSql.dbo")
//Simpa
//@Table(name = "Stock", schema = "ArtPlas.dbo")
@Table(name = "Stock", schema = "ComunSql")
public class Stock implements java.io.Serializable {

	private String clave;
	private Integer nrArt;
	private String descripcion;
	private String observaciones;
	private String descriAmpliada;
	private Blob foto;
	private Long fam;
	private Long subFam;
	private BigDecimal precio1;
	private BigDecimal precio2;
	private BigDecimal precio3;
	private BigDecimal precioCosto;
	private BigDecimal precioFob;
	private Float minimoRepo;
	private Short grupo;
	private String uniCompra;
	private String uniVenta;
	private Float peso;
	private Float volumen;
	private Float alto;
	private Float ancho;
	private Short unidadesPak;
	private Float factorConv;
	private Short imputCont;
	private Short oferta;
	private Short tipoCalculo;
	private Short impInternos;
	//private Short ivaGravado;
	private Impuestos impuestos;
	private Integer proveedPrincip;
	private String otrosProveed;
	private Short noActualizaStock;
	private Short pr;
	private Float maximo;
	private BigDecimal precio4;
	private BigDecimal precio5;
	private BigDecimal precio6;
	private Float objVta;
	private String uniCosto;
	private Float convCosto;
	private BigDecimal preEsp1;
	private BigDecimal preEsp2;
	private BigDecimal preEsp3;
	private BigDecimal preEsp4;
	private BigDecimal preEsp5;
	private BigDecimal preEsp6;
	
	
	private String leye;
	private Float picking;
	private Integer unidadesBulto;
	private String codAfip;
	private String codBarras;
	private BigDecimal precioCompra;
	private String descuentos;
	private String famStr;
	private String subFamStr;
	private ArtMadre artMadre;
	private String descripC;

	public Stock() {
	}

	public Stock(String clave, Long subFam, BigDecimal precio2,
			BigDecimal precio3, BigDecimal precioCosto, BigDecimal precioFob,
			Float minimoRepo, Short grupo, Float peso, Float volumen,
			Float alto, Float ancho, Short unidadesPak, Float factorConv,
			Short imputCont, Short oferta, Short tipoCalculo,
			Short impInternos, Short ivaGravado, Integer proveedPrincip,
			Short noActualizaStock, Short pr, Float maximo, BigDecimal precio4,
			BigDecimal precio5, BigDecimal precio6, Float objVta,
			String uniCosto, Float convCosto, BigDecimal preEsp1,
			BigDecimal preEsp2, BigDecimal preEsp3, BigDecimal preEsp4,
			BigDecimal preEsp5, BigDecimal preEsp6) {
		this.clave = clave;
		this.subFam = subFam;
		this.precio2 = precio2;
		this.precio3 = precio3;
		this.precioCosto = precioCosto;
		this.precioFob = precioFob;
		this.minimoRepo = minimoRepo;
		this.grupo = grupo;
		this.peso = peso;
		this.volumen = volumen;
		this.alto = alto;
		this.ancho = ancho;
		this.unidadesPak = unidadesPak;
		this.factorConv = factorConv;
		this.imputCont = imputCont;
		this.oferta = oferta;
		this.tipoCalculo = tipoCalculo;
		this.impInternos = impInternos;

		this.proveedPrincip = proveedPrincip;
		this.noActualizaStock = noActualizaStock;
		this.pr = pr;
		this.maximo = maximo;
		this.precio4 = precio4;
		this.precio5 = precio5;
		this.precio6 = precio6;
		this.objVta = objVta;
		this.uniCosto = uniCosto;
		this.convCosto = convCosto;
		this.preEsp1 = preEsp1;
		this.preEsp2 = preEsp2;
		this.preEsp3 = preEsp3;
		this.preEsp4 = preEsp4;
		this.preEsp5 = preEsp5;
		this.preEsp6 = preEsp6;
	}

	public Stock(String clave, Integer nrArt, String descripcion,
			String observaciones, String descriAmpliada, Blob foto, Long fam,
			Long subFam, BigDecimal precio1, BigDecimal precio2,
			BigDecimal precio3, BigDecimal precioCosto, BigDecimal precioFob,
			Float minimoRepo, Short grupo, String uniCompra, String uniVenta,
			Float peso, Float volumen, Float alto, Float ancho,
			Short unidadesPak, Float factorConv, Short imputCont, Short oferta,
			Short tipoCalculo, Short impInternos, Short ivaGravado,
			Integer proveedPrincip, String otrosProveed, Short noActualizaStock,
			Short pr, Float maximo, BigDecimal precio4, BigDecimal precio5,
			BigDecimal precio6, Float objVta, String uniCosto, Float convCosto,
			BigDecimal preEsp1, BigDecimal preEsp2, BigDecimal preEsp3,
			BigDecimal preEsp4, BigDecimal preEsp5, BigDecimal preEsp6,
			String artMadre, Integer orden, String leye, Float picking,
			Integer unidadesBulto, String codAfip, String codBarras,
			BigDecimal precioCompra, String descuentos, Set exiArts) {
		this.clave = clave;
		this.nrArt = nrArt;
		this.descripcion = descripcion;
		this.observaciones = observaciones;
		this.descriAmpliada = descriAmpliada;
		this.foto = foto;
		this.fam = fam;
		this.subFam = subFam;
		this.precio1 = precio1;
		this.precio2 = precio2;
		this.precio3 = precio3;
		this.precioCosto = precioCosto;
		this.precioFob = precioFob;
		this.minimoRepo = minimoRepo;
		this.grupo = grupo;
		this.uniCompra = uniCompra;
		this.uniVenta = uniVenta;
		this.peso = peso;
		this.volumen = volumen;
		this.alto = alto;
		this.ancho = ancho;
		this.unidadesPak = unidadesPak;
		this.factorConv = factorConv;
		this.imputCont = imputCont;
		this.oferta = oferta;
		this.tipoCalculo = tipoCalculo;
		this.impInternos = impInternos;

		this.proveedPrincip = proveedPrincip;
		this.otrosProveed = otrosProveed;
		this.noActualizaStock = noActualizaStock;
		this.pr = pr;
		this.maximo = maximo;
		this.precio4 = precio4;
		this.precio5 = precio5;
		this.precio6 = precio6;
		this.objVta = objVta;
		this.uniCosto = uniCosto;
		this.convCosto = convCosto;
		this.preEsp1 = preEsp1;
		this.preEsp2 = preEsp2;
		this.preEsp3 = preEsp3;
		this.preEsp4 = preEsp4;
		this.preEsp5 = preEsp5;
		this.preEsp6 = preEsp6;
		
		
		this.leye = leye;
		this.picking = picking;
		this.unidadesBulto = unidadesBulto;
		this.codAfip = codAfip;
		this.codBarras = codBarras;
		this.precioCompra = precioCompra;
		this.descuentos = descuentos;
		
	}

	@Id
	@Column(name = "Clave", unique = true, nullable = false, length = 13)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "NrArt")
	public Integer getNrArt() {
		return this.nrArt;
	}

	public void setNrArt(Integer nrArt) {
		this.nrArt = nrArt;
	}

	@Column(name = "Descripcion", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "Observaciones", length = 50)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "DescriAmpliada", length = 1024)
	public String getDescriAmpliada() {
		return this.descriAmpliada;
	}

	public void setDescriAmpliada(String descriAmpliada) {
		this.descriAmpliada = descriAmpliada;
	}
	
	@Transient
	@Column(name = "Foto")
	public Blob getFoto() {
		return this.foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	@Column(name = "Fam")
	public Long getFam() {
		return this.fam;
	}

	public void setFam(Long fam) {
		this.fam = fam;
	}

	@Column(name = "SubFam", nullable = false)
	public Long getSubFam() {
		return this.subFam;
	}

	public void setSubFam(Long subFam) {
		this.subFam = subFam;
	}

	@Column(name = "Precio1", scale = 4)
	public BigDecimal getPrecio1() {
		return this.precio1;
	}

	public void setPrecio1(BigDecimal precio1) {
		this.precio1 = precio1;
	}

	@Column(name = "Precio2", nullable = false, scale = 4)
	public BigDecimal getPrecio2() {
		return this.precio2;
	}

	public void setPrecio2(BigDecimal precio2) {
		this.precio2 = precio2;
	}

	@Column(name = "Precio3", nullable = false, scale = 4)
	public BigDecimal getPrecio3() {
		return this.precio3;
	}

	public void setPrecio3(BigDecimal precio3) {
		this.precio3 = precio3;
	}

	@Column(name = "PrecioCosto", nullable = false, scale = 4)
	public BigDecimal getPrecioCosto() {
		return this.precioCosto;
	}

	public void setPrecioCosto(BigDecimal precioCosto) {
		this.precioCosto = precioCosto;
	}

	@Column(name = "PrecioFob", nullable = false, scale = 4)
	public BigDecimal getPrecioFob() {
		return this.precioFob;
	}

	public void setPrecioFob(BigDecimal precioFob) {
		this.precioFob = precioFob;
	}

	@Column(name = "MinimoRepo", nullable = false, precision = 24, scale = 0)
	public Float getMinimoRepo() {
		return this.minimoRepo;
	}

	public void setMinimoRepo(Float minimoRepo) {
		this.minimoRepo = minimoRepo;
	}

	@Column(name = "Grupo", nullable = false)
	public Short getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Short grupo) {
		this.grupo = grupo;
	}

	@Column(name = "UniCompra", length = 5)
	public String getUniCompra() {
		return this.uniCompra;
	}

	public void setUniCompra(String uniCompra) {
		this.uniCompra = uniCompra;
	}

	@Column(name = "UniVenta", length = 5)
	public String getUniVenta() {
		return this.uniVenta;
	}

	public void setUniVenta(String uniVenta) {
		this.uniVenta = uniVenta;
	}

	@Column(name = "Peso", nullable = false, precision = 24, scale = 0)
	public Float getPeso() {
		return this.peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Column(name = "Volumen", nullable = false, precision = 24, scale = 0)
	public Float getVolumen() {
		return this.volumen;
	}

	public void setVolumen(Float volumen) {
		this.volumen = volumen;
	}

	@Column(name = "Alto", nullable = false, precision = 24, scale = 0)
	public Float getAlto() {
		return this.alto;
	}

	public void setAlto(Float alto) {
		this.alto = alto;
	}

	@Column(name = "Ancho", nullable = false, precision = 24, scale = 0)
	public Float getAncho() {
		return this.ancho;
	}

	public void setAncho(Float ancho) {
		this.ancho = ancho;
	}

	@Column(name = "UnidadesPak", nullable = false)
	public Short getUnidadesPak() {
		return this.unidadesPak;
	}

	public void setUnidadesPak(Short unidadesPak) {
		this.unidadesPak = unidadesPak;
	}

	@Column(name = "FactorConv", nullable = false, precision = 24, scale = 0)
	public Float getFactorConv() {
		return this.factorConv;
	}

	public void setFactorConv(Float factorConv) {
		this.factorConv = factorConv;
	}

	@Column(name = "ImputCont", nullable = false)
	public Short getImputCont() {
		return this.imputCont;
	}

	public void setImputCont(Short imputCont) {
		this.imputCont = imputCont;
	}

	@Column(name = "Oferta", nullable = false)
	public Short getOferta() {
		return this.oferta;
	}

	public void setOferta(Short oferta) {
		this.oferta = oferta;
	}

	@Column(name = "TipoCalculo", nullable = false)
	public Short getTipoCalculo() {
		return this.tipoCalculo;
	}

	public void setTipoCalculo(Short tipoCalculo) {
		this.tipoCalculo = tipoCalculo;
	}

	@Column(name = "ImpInternos", nullable = false)
	public Short getImpInternos() {
		return this.impInternos;
	}

	public void setImpInternos(Short impInternos) {
		this.impInternos = impInternos;
	}



	@Column(name = "ProveedPrincip", nullable = false)
	public Integer getProveedPrincip() {
		return this.proveedPrincip;
	}

	public void setProveedPrincip(Integer proveedPrincip) {
		this.proveedPrincip = proveedPrincip;
	}

	@Column(name = "OtrosProveed", length = 16)
	public String getOtrosProveed() {
		return this.otrosProveed;
	}

	public void setOtrosProveed(String otrosProveed) {
		this.otrosProveed = otrosProveed;
	}

	@Column(name = "NoActualizaStock", nullable = false)
	public Short getNoActualizaStock() {
		return this.noActualizaStock;
	}

	public void setNoActualizaStock(Short noActualizaStock) {
		this.noActualizaStock = noActualizaStock;
	}

	@Column(name = "PR", nullable = false)
	public Short getPr() {
		return this.pr;
	}

	public void setPr(Short pr) {
		this.pr = pr;
	}

	@Column(name = "maximo", nullable = false, precision = 24, scale = 0)
	public Float getMaximo() {
		return this.maximo;
	}

	public void setMaximo(Float maximo) {
		this.maximo = maximo;
	}

	@Column(name = "Precio4", nullable = false, scale = 4)
	public BigDecimal getPrecio4() {
		return this.precio4;
	}

	public void setPrecio4(BigDecimal precio4) {
		this.precio4 = precio4;
	}

	@Column(name = "Precio5", nullable = false, scale = 4)
	public BigDecimal getPrecio5() {
		return this.precio5;
	}

	public void setPrecio5(BigDecimal precio5) {
		this.precio5 = precio5;
	}

	@Column(name = "Precio6", nullable = false, scale = 4)
	public BigDecimal getPrecio6() {
		return this.precio6;
	}

	public void setPrecio6(BigDecimal precio6) {
		this.precio6 = precio6;
	}

	@Column(name = "ObjVta", nullable = false, precision = 24, scale = 0)
	public Float getObjVta() {
		return this.objVta;
	}

	public void setObjVta(Float objVta) {
		this.objVta = objVta;
	}

	@Column(name = "UniCosto", nullable = false, length = 5)
	public String getUniCosto() {
		return this.uniCosto;
	}

	public void setUniCosto(String uniCosto) {
		this.uniCosto = uniCosto;
	}

	@Column(name = "ConvCosto", nullable = false, precision = 24, scale = 0)
	public Float getConvCosto() {
		return this.convCosto;
	}

	public void setConvCosto(Float convCosto) {
		this.convCosto = convCosto;
	}

	@Column(name = "PreEsp1", nullable = false, scale = 4)
	public BigDecimal getPreEsp1() {
		return this.preEsp1;
	}

	public void setPreEsp1(BigDecimal preEsp1) {
		this.preEsp1 = preEsp1;
	}

	@Column(name = "PreEsp2", nullable = false, scale = 4)
	public BigDecimal getPreEsp2() {
		return this.preEsp2;
	}

	public void setPreEsp2(BigDecimal preEsp2) {
		this.preEsp2 = preEsp2;
	}

	@Column(name = "PreEsp3", nullable = false, scale = 4)
	public BigDecimal getPreEsp3() {
		return this.preEsp3;
	}

	public void setPreEsp3(BigDecimal preEsp3) {
		this.preEsp3 = preEsp3;
	}

	@Column(name = "PreEsp4", nullable = false, scale = 4)
	public BigDecimal getPreEsp4() {
		return this.preEsp4;
	}

	public void setPreEsp4(BigDecimal preEsp4) {
		this.preEsp4 = preEsp4;
	}

	@Column(name = "PreEsp5", nullable = false, scale = 4)
	public BigDecimal getPreEsp5() {
		return this.preEsp5;
	}

	public void setPreEsp5(BigDecimal preEsp5) {
		this.preEsp5 = preEsp5;
	}

	@Column(name = "PreEsp6", nullable = false, scale = 4)
	public BigDecimal getPreEsp6() {
		return this.preEsp6;
	}

	public void setPreEsp6(BigDecimal preEsp6) {
		this.preEsp6 = preEsp6;
	}



	@Transient
	public String getLeye() {
		return this.leye;
	}

	public void setLeye(String leye) {
		this.leye = leye;
	}

	@Column(name = "Picking", precision = 24, scale = 0)
	public Float getPicking() {
		return this.picking;
	}

	public void setPicking(Float picking) {
		this.picking = picking;
	}

	@Column(name = "UnidadesBulto")
	public Integer getUnidadesBulto() {
		return this.unidadesBulto;
	}

	public void setUnidadesBulto(Integer unidadesBulto) {
		this.unidadesBulto = unidadesBulto;
	}

	@Column(name = "CodAfip", length = 6)
	public String getCodAfip() {
		return this.codAfip;
	}

	public void setCodAfip(String codAfip) {
		this.codAfip = codAfip;
	}

	@Column(name = "CodBarras", length = 13)
	public String getCodBarras() {
		return this.codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	@Column(name = "PrecioCompra", scale = 4)
	public BigDecimal getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	@Column(name = "Descuentos", length = 60)
	public String getDescuentos() {
		return this.descuentos;
	}

	public void setDescuentos(String descuentos) {
		this.descuentos = descuentos;
	}
	@Transient
	public String getFamStr() {
		return famStr;
	}

	public void setFamStr(String famStr) {
		this.famStr = famStr;
	}
	@Transient
	public String getSubFamStr() {
		return subFamStr;
	}

	public void setSubFamStr(String subFamStr) {
		this.subFamStr = subFamStr;
	}

	@ManyToOne(fetch=FetchType.LAZY,targetEntity=ArtMadre.class) 
	@JoinColumn(name="ArtMadre")
	public ArtMadre getArtMadre() {
		return artMadre;
	}

	public void setArtMadre(ArtMadre artMadre) {
		this.artMadre = artMadre;
	}

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ivaGravado")
	public Impuestos getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(Impuestos impuestos) {
		this.impuestos = impuestos;
	}

	@Transient
	public String getDescripC() {
		this.descripC = "[" + clave + "] " + descripcion;
		return descripC;
	}

	public void setDescripC(String descripC) {
		this.descripC = descripC;
	}
	
	

}
