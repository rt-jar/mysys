package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the auditlog database table.
 * 
 */
@Entity
@NamedQuery(name="Auditlog.findAll", query="SELECT a FROM Auditlog a")
public class Auditlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date auditdate;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal auditid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String eventdesc;

	private String eventname;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String remarks;

	private BigDecimal userid;

	private String username;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Auditlog() {
	}

	public Date getAuditdate() {
		return this.auditdate;
	}

	public void setAuditdate(Date auditdate) {
		this.auditdate = auditdate;
	}

	public BigDecimal getAuditid() {
		return this.auditid;
	}

	public void setAuditid(BigDecimal auditid) {
		this.auditid = auditid;
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

	public String getEventdesc() {
		return this.eventdesc;
	}

	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}

	public String getEventname() {
		return this.eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
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

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}