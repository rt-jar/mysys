package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemopenstock database table.
 * 
 */
@Entity
@NamedQuery(name="Itemopenstock.findAll", query="SELECT i FROM Itemopenstock i")
public class Itemopenstock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ios_id")
	private long iosId;

	private String acctyear;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date entrydate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String remarks;

	private BigDecimal stockentryno;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department department;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemopenstock() {
	}

	public long getIosId() {
		return this.iosId;
	}

	public void setIosId(long iosId) {
		this.iosId = iosId;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
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

	public Date getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
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

	public BigDecimal getStockentryno() {
		return this.stockentryno;
	}

	public void setStockentryno(BigDecimal stockentryno) {
		this.stockentryno = stockentryno;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}