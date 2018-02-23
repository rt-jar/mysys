package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long deptid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String deptname;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemissue
	@OneToMany(mappedBy="department")
	private List<Itemissue> itemissues;

	//bi-directional many-to-one association to Itemrecd
	@OneToMany(mappedBy="department")
	private List<Itemrecd> itemrecds;

	//bi-directional many-to-one association to Itemstockadj
	@OneToMany(mappedBy="department")
	private List<Itemstockadj> itemstockadjs;

	public Department() {
	}

	public long getDeptid() {
		return this.deptid;
	}

	public void setDeptid(long deptid) {
		this.deptid = deptid;
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

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Itemissue> getItemissues() {
		return this.itemissues;
	}

	public void setItemissues(List<Itemissue> itemissues) {
		this.itemissues = itemissues;
	}

	public Itemissue addItemissue(Itemissue itemissue) {
		getItemissues().add(itemissue);
		itemissue.setDepartment(this);

		return itemissue;
	}

	public Itemissue removeItemissue(Itemissue itemissue) {
		getItemissues().remove(itemissue);
		itemissue.setDepartment(null);

		return itemissue;
	}

	public List<Itemrecd> getItemrecds() {
		return this.itemrecds;
	}

	public void setItemrecds(List<Itemrecd> itemrecds) {
		this.itemrecds = itemrecds;
	}

	public Itemrecd addItemrecd(Itemrecd itemrecd) {
		getItemrecds().add(itemrecd);
		itemrecd.setDepartment(this);

		return itemrecd;
	}

	public Itemrecd removeItemrecd(Itemrecd itemrecd) {
		getItemrecds().remove(itemrecd);
		itemrecd.setDepartment(null);

		return itemrecd;
	}

	public List<Itemstockadj> getItemstockadjs() {
		return this.itemstockadjs;
	}

	public void setItemstockadjs(List<Itemstockadj> itemstockadjs) {
		this.itemstockadjs = itemstockadjs;
	}

	public Itemstockadj addItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().add(itemstockadj);
		itemstockadj.setDepartment(this);

		return itemstockadj;
	}

	public Itemstockadj removeItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().remove(itemstockadj);
		itemstockadj.setDepartment(null);

		return itemstockadj;
	}

}