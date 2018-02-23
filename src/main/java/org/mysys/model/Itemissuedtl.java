package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemissuedtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemissuedtl.findAll", query="SELECT i FROM Itemissuedtl i")
public class Itemissuedtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemissuedtlPK id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date issuedate;

	private String itemcode;

	private String itemdesc;

	private String itemnit;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String operation;

	private BigDecimal qtyissued;

	private BigDecimal rate;

	//bi-directional many-to-one association to Itemissue
	@ManyToOne
	@JoinColumn(name="issueno",insertable=false, updatable=false)
	private Itemissue itemissue;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false, updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemissuedtl() {
	}

	public ItemissuedtlPK getId() {
		return this.id;
	}

	public void setId(ItemissuedtlPK id) {
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

	public Date getIssuedate() {
		return this.issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
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

	public String getItemnit() {
		return this.itemnit;
	}

	public void setItemnit(String itemnit) {
		this.itemnit = itemnit;
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

	public BigDecimal getQtyissued() {
		return this.qtyissued;
	}

	public void setQtyissued(BigDecimal qtyissued) {
		this.qtyissued = qtyissued;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Itemissue getItemissue() {
		return this.itemissue;
	}

	public void setItemissue(Itemissue itemissue) {
		this.itemissue = itemissue;
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