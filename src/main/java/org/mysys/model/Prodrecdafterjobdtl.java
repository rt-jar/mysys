package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the prodrecdafterjobdtl database table.
 * 
 */
@Entity
@NamedQuery(name="Prodrecdafterjobdtl.findAll", query="SELECT p FROM Prodrecdafterjobdtl p")
public class Prodrecdafterjobdtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProdrecdafterjobdtlPK id;

	private String acctyear;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private BigDecimal itemqty;

	private String itemunit;

	private BigDecimal itemvalue;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String operation;

	private BigDecimal rate;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Itemrecdafterjob
	@ManyToOne
	@JoinColumn(name="prj_id",insertable=false,updatable=false)
	private Itemrecdafterjob itemrecdafterjob;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Prodrecdafterjobdtl() {
	}

	public ProdrecdafterjobdtlPK getId() {
		return this.id;
	}

	public void setId(ProdrecdafterjobdtlPK id) {
		this.id = id;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
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

	public String getItemunit() {
		return this.itemunit;
	}

	public void setItemunit(String itemunit) {
		this.itemunit = itemunit;
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

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Itemmaster getItemmaster() {
		return this.itemmaster;
	}

	public void setItemmaster(Itemmaster itemmaster) {
		this.itemmaster = itemmaster;
	}

	public Itemrecdafterjob getItemrecdafterjob() {
		return this.itemrecdafterjob;
	}

	public void setItemrecdafterjob(Itemrecdafterjob itemrecdafterjob) {
		this.itemrecdafterjob = itemrecdafterjob;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}