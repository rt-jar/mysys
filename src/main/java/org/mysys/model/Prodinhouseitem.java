package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the prodinhouseitem database table.
 * 
 */
@Entity
@NamedQuery(name="Prodinhouseitem.findAll", query="SELECT p FROM Prodinhouseitem p")
public class Prodinhouseitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProdinhouseitemPK id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal qty;

	//bi-directional many-to-one association to Bom
	@ManyToOne
	@JoinColumn(name="bom_id",insertable=false,updatable=false)
	private Bom bom;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Prodinhouse
	@ManyToOne
	@JoinColumn(name="pih_id",insertable=false,updatable=false)
	private Prodinhouse prodinhouse;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Prodinhouseitem() {
	}

	public ProdinhouseitemPK getId() {
		return this.id;
	}

	public void setId(ProdinhouseitemPK id) {
		this.id = id;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddt() {
		return this.createddt;
	}

	public void setCreateddt(Date createddt) {
		this.createddt = createddt;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifieddt() {
		return this.modifieddt;
	}

	public void setModifieddt(Date modifieddt) {
		this.modifieddt = modifieddt;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public Bom getBom() {
		return this.bom;
	}

	public void setBom(Bom bom) {
		this.bom = bom;
	}

	public Itemmaster getItemmaster() {
		return this.itemmaster;
	}

	public void setItemmaster(Itemmaster itemmaster) {
		this.itemmaster = itemmaster;
	}

	public Prodinhouse getProdinhouse() {
		return this.prodinhouse;
	}

	public void setProdinhouse(Prodinhouse prodinhouse) {
		this.prodinhouse = prodinhouse;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}