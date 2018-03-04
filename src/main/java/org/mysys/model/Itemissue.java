package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemissue database table.
 * 
 */
@Entity
@NamedQuery(name="Itemissue.findAll", query="SELECT i FROM Itemissue i")
public class Itemissue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long issueno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date issuedate;

	private String issuedeptname;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String recddeptname;

	private String remarks;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="issuefromdeptid")
	private Contact contact;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="recdindeptid")
	private Department department;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="personid")
	private User user;

	//bi-directional many-to-one association to Itemissuedtl
	@JsonIgnore
	@OneToMany(mappedBy="itemissue")
	private List<Itemissuedtl> itemissuedtls;

	public Itemissue() {
	}

	public long getIssueno() {
		return this.issueno;
	}

	public void setIssueno(long issueno) {
		this.issueno = issueno;
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

	public Date getIssuedate() {
		return this.issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public String getIssuedeptname() {
		return this.issuedeptname;
	}

	public void setIssuedeptname(String issuedeptname) {
		this.issuedeptname = issuedeptname;
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

	public String getRecddeptname() {
		return this.recddeptname;
	}

	public void setRecddeptname(String recddeptname) {
		this.recddeptname = recddeptname;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Itemissuedtl> getItemissuedtls() {
		return this.itemissuedtls;
	}

	public void setItemissuedtls(List<Itemissuedtl> itemissuedtls) {
		this.itemissuedtls = itemissuedtls;
	}

	public Itemissuedtl addItemissuedtl(Itemissuedtl itemissuedtl) {
		getItemissuedtls().add(itemissuedtl);
		itemissuedtl.setItemissue(this);

		return itemissuedtl;
	}

	public Itemissuedtl removeItemissuedtl(Itemissuedtl itemissuedtl) {
		getItemissuedtls().remove(itemissuedtl);
		itemissuedtl.setItemissue(null);

		return itemissuedtl;
	}

}