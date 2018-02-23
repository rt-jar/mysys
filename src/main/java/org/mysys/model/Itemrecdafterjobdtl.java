package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemrecdafterjobdtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemrecdafterjobdtl.findAll", query="SELECT i FROM Itemrecdafterjobdtl i")
public class Itemrecdafterjobdtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemrecdafterjobdtlPK id;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemcode;

	private String itemdesc;

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
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Itemrecdafterjob
	@ManyToOne
	private Itemrecdafterjob itemrecdafterjob;

	//bi-directional many-to-one association to Site
	@ManyToOne
	private Site site;

	public Itemrecdafterjobdtl() {
	}

	public ItemrecdafterjobdtlPK getId() {
		return this.id;
	}

	public void setId(ItemrecdafterjobdtlPK id) {
		this.id = id;
	}

	public Date getChallandate() {
		return this.challandate;
	}

	public void setChallandate(Date challandate) {
		this.challandate = challandate;
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

	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemdesc() {
		return this.itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
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