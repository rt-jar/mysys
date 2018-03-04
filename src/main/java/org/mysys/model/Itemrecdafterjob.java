package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemrecdafterjob database table.
 * 
 */
@Entity
@NamedQuery(name="Itemrecdafterjob.findAll", query="SELECT i FROM Itemrecdafterjob i")
public class Itemrecdafterjob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="irj_id")
	private long irjId;

	private String acctyear;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private BigDecimal challanno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String printannexureiv;

	@Temporal(TemporalType.DATE)
	private Date recddate;

	private BigDecimal recptno;

	private String remarks;

	private BigDecimal totaljobworkcost;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="sourcevendorid")
	private Contact contact;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemrecdafterjobdtl
	@OneToMany(mappedBy="itemrecdafterjob")
	private List<Itemrecdafterjobdtl> itemrecdafterjobdtls;

	//bi-directional many-to-one association to Prodrecdafterjobdtl
	@OneToMany(mappedBy="itemrecdafterjob")
	private List<Prodrecdafterjobdtl> prodrecdafterjobdtls;

	public Itemrecdafterjob() {
	}

	public long getIrjId() {
		return this.irjId;
	}

	public void setIrjId(long irjId) {
		this.irjId = irjId;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
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

	public String getPrintannexureiv() {
		return this.printannexureiv;
	}

	public void setPrintannexureiv(String printannexureiv) {
		this.printannexureiv = printannexureiv;
	}

	public Date getRecddate() {
		return this.recddate;
	}

	public void setRecddate(Date recddate) {
		this.recddate = recddate;
	}

	public BigDecimal getRecptno() {
		return this.recptno;
	}

	public void setRecptno(BigDecimal recptno) {
		this.recptno = recptno;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getTotaljobworkcost() {
		return this.totaljobworkcost;
	}

	public void setTotaljobworkcost(BigDecimal totaljobworkcost) {
		this.totaljobworkcost = totaljobworkcost;
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

	public List<Itemrecdafterjobdtl> getItemrecdafterjobdtls() {
		return this.itemrecdafterjobdtls;
	}

	public void setItemrecdafterjobdtls(List<Itemrecdafterjobdtl> itemrecdafterjobdtls) {
		this.itemrecdafterjobdtls = itemrecdafterjobdtls;
	}

	public Itemrecdafterjobdtl addItemrecdafterjobdtl(Itemrecdafterjobdtl itemrecdafterjobdtl) {
		getItemrecdafterjobdtls().add(itemrecdafterjobdtl);
		itemrecdafterjobdtl.setItemrecdafterjob(this);

		return itemrecdafterjobdtl;
	}

	public Itemrecdafterjobdtl removeItemrecdafterjobdtl(Itemrecdafterjobdtl itemrecdafterjobdtl) {
		getItemrecdafterjobdtls().remove(itemrecdafterjobdtl);
		itemrecdafterjobdtl.setItemrecdafterjob(null);

		return itemrecdafterjobdtl;
	}

	public List<Prodrecdafterjobdtl> getProdrecdafterjobdtls() {
		return this.prodrecdafterjobdtls;
	}

	public void setProdrecdafterjobdtls(List<Prodrecdafterjobdtl> prodrecdafterjobdtls) {
		this.prodrecdafterjobdtls = prodrecdafterjobdtls;
	}

	public Prodrecdafterjobdtl addProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().add(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setItemrecdafterjob(this);

		return prodrecdafterjobdtl;
	}

	public Prodrecdafterjobdtl removeProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().remove(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setItemrecdafterjob(null);

		return prodrecdafterjobdtl;
	}

}