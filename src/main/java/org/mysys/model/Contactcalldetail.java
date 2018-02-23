package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contactcalldetail database table.
 * 
 */
@Entity
@NamedQuery(name="Contactcalldetail.findAll", query="SELECT c FROM Contactcalldetail c")
public class Contactcalldetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long callid;

	@Temporal(TemporalType.DATE)
	private Date calldate;

	private String calldesc;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	@Temporal(TemporalType.DATE)
	private Date nextcalldate;

	private String purpose;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="contactid")
	private Contact contact;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Contactcalldetail() {
	}

	public long getCallid() {
		return this.callid;
	}

	public void setCallid(long callid) {
		this.callid = callid;
	}

	public Date getCalldate() {
		return this.calldate;
	}

	public void setCalldate(Date calldate) {
		this.calldate = calldate;
	}

	public String getCalldesc() {
		return this.calldesc;
	}

	public void setCalldesc(String calldesc) {
		this.calldesc = calldesc;
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

	public Date getNextcalldate() {
		return this.nextcalldate;
	}

	public void setNextcalldate(Date nextcalldate) {
		this.nextcalldate = nextcalldate;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}