package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the errorlog database table.
 * 
 */
@Entity
@NamedQuery(name="Errorlog.findAll", query="SELECT e FROM Errorlog e")
public class Errorlog implements Serializable {
	private static final long serialVersionUID = 1L;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String errorcode;

	private String errordesc;

	@Temporal(TemporalType.DATE)
	private Date logdate;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal logid;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String program;

	private String remarks;

	private BigDecimal userid;

	private String username;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Errorlog() {
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

	public String getErrorcode() {
		return this.errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrordesc() {
		return this.errordesc;
	}

	public void setErrordesc(String errordesc) {
		this.errordesc = errordesc;
	}

	public Date getLogdate() {
		return this.logdate;
	}

	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}

	public BigDecimal getLogid() {
		return this.logid;
	}

	public void setLogid(BigDecimal logid) {
		this.logid = logid;
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

	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
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