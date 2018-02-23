package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the vendoritemmaster database table.
 * 
 */
@Entity
@NamedQuery(name="Vendoritemmaster.findAll", query="SELECT v FROM Vendoritemmaster v")
public class Vendoritemmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VendoritemmasterPK id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private BigDecimal jobrate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String remarks;

	@Temporal(TemporalType.DATE)
	private Date todate;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="contactid",insertable=false,updatable=false)
	private Contact contact;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Vendoritemmaster() {
	}

	public VendoritemmasterPK getId() {
		return this.id;
	}

	public void setId(VendoritemmasterPK id) {
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

	public BigDecimal getJobrate() {
		return this.jobrate;
	}

	public void setJobrate(BigDecimal jobrate) {
		this.jobrate = jobrate;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
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