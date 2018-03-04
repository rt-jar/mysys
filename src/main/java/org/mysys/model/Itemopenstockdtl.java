package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemopenstockdtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemopenstockdtl.findAll", query="SELECT i FROM Itemopenstockdtl i")
public class Itemopenstockdtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemopenstockdtlPK id;

	private BigDecimal amount;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal rate;

	private String remarks;

	private BigDecimal stockinhand;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemopenstockdtl() {
	}

	public ItemopenstockdtlPK getId() {
		return this.id;
	}

	public void setId(ItemopenstockdtlPK id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getStockinhand() {
		return this.stockinhand;
	}

	public void setStockinhand(BigDecimal stockinhand) {
		this.stockinhand = stockinhand;
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