package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemrecd database table.
 * 
 */
@Entity
@NamedQuery(name="Itemrecd.findAll", query="SELECT i FROM Itemrecd i")
public class Itemrecd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long recptno;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private BigDecimal challanno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String deptname;

	@Temporal(TemporalType.DATE)
	private Date invdate;

	private BigDecimal invoiceno;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	@Temporal(TemporalType.DATE)
	private Date podate;

	private BigDecimal pono;

	@Temporal(TemporalType.DATE)
	private Date recddate;

	private String remarks;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="recdfromid")
	private Contact contact;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="recdindeptid")
	private Department department;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemrecddtl
	@OneToMany(mappedBy="itemrecd")
	private List<Itemrecddtl> itemrecddtls;

	public Itemrecd() {
	}

	public long getRecptno() {
		return this.recptno;
	}

	public void setRecptno(long recptno) {
		this.recptno = recptno;
	}

	public Date getChallandate() {
		return this.challandate;
	}

	public void setChallandate(Date challandate) {
		this.challandate = challandate;
	}

	public BigDecimal getChallanno() {
		return this.challanno;
	}

	public void setChallanno(BigDecimal challanno) {
		this.challanno = challanno;
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

	public Date getInvdate() {
		return this.invdate;
	}

	public void setInvdate(Date invdate) {
		this.invdate = invdate;
	}

	public BigDecimal getInvoiceno() {
		return this.invoiceno;
	}

	public void setInvoiceno(BigDecimal invoiceno) {
		this.invoiceno = invoiceno;
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

	public Date getPodate() {
		return this.podate;
	}

	public void setPodate(Date podate) {
		this.podate = podate;
	}

	public BigDecimal getPono() {
		return this.pono;
	}

	public void setPono(BigDecimal pono) {
		this.pono = pono;
	}

	public Date getRecddate() {
		return this.recddate;
	}

	public void setRecddate(Date recddate) {
		this.recddate = recddate;
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

	public List<Itemrecddtl> getItemrecddtls() {
		return this.itemrecddtls;
	}

	public void setItemrecddtls(List<Itemrecddtl> itemrecddtls) {
		this.itemrecddtls = itemrecddtls;
	}

	public Itemrecddtl addItemrecddtl(Itemrecddtl itemrecddtl) {
		getItemrecddtls().add(itemrecddtl);
		itemrecddtl.setItemrecd(this);

		return itemrecddtl;
	}

	public Itemrecddtl removeItemrecddtl(Itemrecddtl itemrecddtl) {
		getItemrecddtls().remove(itemrecddtl);
		itemrecddtl.setItemrecd(null);

		return itemrecddtl;
	}

}