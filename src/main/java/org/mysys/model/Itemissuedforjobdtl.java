package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemissuedforjobdtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemissuedforjobdtl.findAll", query="SELECT i FROM Itemissuedforjobdtl i")
public class Itemissuedforjobdtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemissuedforjobdtlPK id;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String hsncode;

	private String itemcode;

	private String itemdesc;

	private BigDecimal itemqty;

	private String itemunit;

	private BigDecimal itemvalue;

	private BigDecimal jobrate;

	private BigDecimal jobworkamount;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String operation;

	private BigDecimal rate;

	//bi-directional many-to-one association to Hsncode
	@ManyToOne
	@JoinColumn(name="hsncodeid")
	private Hsncode hsncodeBean;

	//bi-directional many-to-one association to Itemissuedforjob
	@ManyToOne
	@JoinColumn(name="challanno",insertable=false,updatable=false)
	private Itemissuedforjob itemissuedforjob;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemissuedforjobdtl() {
	}

	public ItemissuedforjobdtlPK getId() {
		return this.id;
	}

	public void setId(ItemissuedforjobdtlPK id) {
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

	public String getHsncode() {
		return this.hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
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

	public BigDecimal getJobrate() {
		return this.jobrate;
	}

	public void setJobrate(BigDecimal jobrate) {
		this.jobrate = jobrate;
	}

	public BigDecimal getJobworkamount() {
		return this.jobworkamount;
	}

	public void setJobworkamount(BigDecimal jobworkamount) {
		this.jobworkamount = jobworkamount;
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

	public Hsncode getHsncodeBean() {
		return this.hsncodeBean;
	}

	public void setHsncodeBean(Hsncode hsncodeBean) {
		this.hsncodeBean = hsncodeBean;
	}

	public Itemissuedforjob getItemissuedforjob() {
		return this.itemissuedforjob;
	}

	public void setItemissuedforjob(Itemissuedforjob itemissuedforjob) {
		this.itemissuedforjob = itemissuedforjob;
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