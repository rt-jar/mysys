package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemreturndtl database table.
 * 
 */
@Entity
@NamedQuery(name="Itemreturndtl.findAll", query="SELECT i FROM Itemreturndtl i")
public class Itemreturndtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemreturndtlPK id;

	private String acctyear;

	private BigDecimal amount;

	private String controlno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String customerchallanno;

	private BigDecimal itemqty;

	private String itemunit;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String operation;

	private BigDecimal rate;

	private String returnable;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Itemreturn
	@ManyToOne
	@JoinColumn(name="itr_id",insertable=false,updatable=false)
	private Itemreturn itemreturn;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemreturndtl() {
	}

	public ItemreturndtlPK getId() {
		return this.id;
	}

	public void setId(ItemreturndtlPK id) {
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

	public String getControlno() {
		return this.controlno;
	}

	public void setControlno(String controlno) {
		this.controlno = controlno;
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

	public String getCustomerchallanno() {
		return this.customerchallanno;
	}

	public void setCustomerchallanno(String customerchallanno) {
		this.customerchallanno = customerchallanno;
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

	public String getReturnable() {
		return this.returnable;
	}

	public void setReturnable(String returnable) {
		this.returnable = returnable;
	}

	public Itemmaster getItemmaster() {
		return this.itemmaster;
	}

	public void setItemmaster(Itemmaster itemmaster) {
		this.itemmaster = itemmaster;
	}

	public Itemreturn getItemreturn() {
		return this.itemreturn;
	}

	public void setItemreturn(Itemreturn itemreturn) {
		this.itemreturn = itemreturn;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}