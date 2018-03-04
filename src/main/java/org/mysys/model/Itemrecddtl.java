package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemrecddtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemrecddtl.findAll", query="SELECT i FROM Itemrecddtl i")
public class Itemrecddtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemrecddtlPK id;

	private String acctyear;

	private BigDecimal amount;

	private BigDecimal convqty;

	private String convunit;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String incomingunit;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal qtyaccepted;

	private BigDecimal qtyrecd;

	private BigDecimal qtyrejected;

	private BigDecimal rate;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Itemrecd
	@ManyToOne
	@JoinColumn(name="ir_id",insertable=false,updatable=false)
	private Itemrecd itemrecd;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemrecddtl() {
	}

	public ItemrecddtlPK getId() {
		return this.id;
	}

	public void setId(ItemrecddtlPK id) {
		this.id = id;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getConvqty() {
		return this.convqty;
	}

	public void setConvqty(BigDecimal convqty) {
		this.convqty = convqty;
	}

	public String getConvunit() {
		return this.convunit;
	}

	public void setConvunit(String convunit) {
		this.convunit = convunit;
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

	public String getIncomingunit() {
		return this.incomingunit;
	}

	public void setIncomingunit(String incomingunit) {
		this.incomingunit = incomingunit;
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

	public BigDecimal getQtyaccepted() {
		return this.qtyaccepted;
	}

	public void setQtyaccepted(BigDecimal qtyaccepted) {
		this.qtyaccepted = qtyaccepted;
	}

	public BigDecimal getQtyrecd() {
		return this.qtyrecd;
	}

	public void setQtyrecd(BigDecimal qtyrecd) {
		this.qtyrecd = qtyrecd;
	}

	public BigDecimal getQtyrejected() {
		return this.qtyrejected;
	}

	public void setQtyrejected(BigDecimal qtyrejected) {
		this.qtyrejected = qtyrejected;
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

	public Itemrecd getItemrecd() {
		return this.itemrecd;
	}

	public void setItemrecd(Itemrecd itemrecd) {
		this.itemrecd = itemrecd;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}