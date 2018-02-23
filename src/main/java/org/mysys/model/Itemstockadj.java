package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the itemstockadj database table.
 * 
 */
@Entity
@NamedQuery(name="Itemstockadj.findAll", query="SELECT i FROM Itemstockadj i")
public class Itemstockadj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adjno;

	@Temporal(TemporalType.DATE)
	private Date adjdate;

	private BigDecimal adjqty;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String deptname;

	private String itemcode;

	private String itemdesc;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal rate;

	private String unit;

	//bi-directional many-to-one association to Adjreason
	@ManyToOne
	@JoinColumn(name="adjreason")
	private Adjreason adjreasonBean;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department department;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid")
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemstockadj() {
	}

	public long getAdjno() {
		return this.adjno;
	}

	public void setAdjno(long adjno) {
		this.adjno = adjno;
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

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
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

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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