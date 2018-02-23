package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the vendoritemadj database table.
 * 
 */
@Entity
@NamedQuery(name="Vendoritemadj.findAll", query="SELECT v FROM Vendoritemadj v")
public class Vendoritemadj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vendoradjno;

	@Temporal(TemporalType.DATE)
	private Date adjdate;

	private BigDecimal adjqty;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemcode;

	private String itemdesc;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String name;

	private BigDecimal rate;

	private String unit;

	//bi-directional many-to-one association to Adjreason
	@ManyToOne
	@JoinColumn(name="adjreason")
	private Adjreason adjreasonBean;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="contactid")
	private Contact contact;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid")
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Vendoritemadj() {
	}

	public long getVendoradjno() {
		return this.vendoradjno;
	}

	public void setVendoradjno(long vendoradjno) {
		this.vendoradjno = vendoradjno;
	}

	public Date getAdjdate() {
		return this.adjdate;
	}

	public void setAdjdate(Date adjdate) {
		this.adjdate = adjdate;
	}

	public BigDecimal getAdjqty() {
		return this.adjqty;
	}

	public void setAdjqty(BigDecimal adjqty) {
		this.adjqty = adjqty;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Adjreason getAdjreasonBean() {
		return this.adjreasonBean;
	}

	public void setAdjreasonBean(Adjreason adjreasonBean) {
		this.adjreasonBean = adjreasonBean;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
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