package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the bomitems database table.
 * 
 */
@Entity
@Table(name="bomitems")
@NamedQuery(name="Bomitem.findAll", query="SELECT b FROM Bomitem b")
public class Bomitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BomitemPK id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private BigDecimal itemqty;

	private BigDecimal itemvalue;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal rate;

	//bi-directional many-to-one association to Bom
	@ManyToOne
	@JoinColumn(name="bom_id",insertable=false,updatable=false)
	private Bom bom;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Bomitem() {
	}

	public BomitemPK getId() {
		return this.id;
	}

	public void setId(BomitemPK id) {
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

	public BigDecimal getItemqty() {
		return this.itemqty;
	}

	public void setItemqty(BigDecimal itemqty) {
		this.itemqty = itemqty;
	}

	public BigDecimal getItemvalue() {
		return this.itemvalue;
	}

	public void setItemvalue(BigDecimal itemvalue) {
		this.itemvalue = itemvalue;
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

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
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

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}