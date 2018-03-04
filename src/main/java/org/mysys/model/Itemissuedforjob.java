package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemissuedforjob database table.
 * 
 */
@Entity
@NamedQuery(name="Itemissuedforjob.findAll", query="SELECT i FROM Itemissuedforjob i")
public class Itemissuedforjob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="itj_id")
	private long itjId;

	private String acctyear;

	private String carriedby;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private BigDecimal challanno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String dispatchmode;

	private BigDecimal estimatedduration;

	private String identificationmarks;

	@Temporal(TemporalType.DATE)
	private Date issuetime;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String placingofprocessing;

	private String printannexureiv;

	private String processingunitnature;

	private String remarks;

	private BigDecimal totaljobworkcost;

	private BigDecimal totalmaterialcost;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="sourcedeptid")
	private Contact contact1;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="vendorid")
	private Contact contact2;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemissuedforjobdtl
	@OneToMany(mappedBy="itemissuedforjob")
	private List<Itemissuedforjobdtl> itemissuedforjobdtls;

	public Itemissuedforjob() {
	}

	public long getItjId() {
		return this.itjId;
	}

	public void setItjId(long itjId) {
		this.itjId = itjId;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
	}

	public String getCarriedby() {
		return this.carriedby;
	}

	public void setCarriedby(String carriedby) {
		this.carriedby = carriedby;
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

	public String getDispatchmode() {
		return this.dispatchmode;
	}

	public void setDispatchmode(String dispatchmode) {
		this.dispatchmode = dispatchmode;
	}

	public BigDecimal getEstimatedduration() {
		return this.estimatedduration;
	}

	public void setEstimatedduration(BigDecimal estimatedduration) {
		this.estimatedduration = estimatedduration;
	}

	public String getIdentificationmarks() {
		return this.identificationmarks;
	}

	public void setIdentificationmarks(String identificationmarks) {
		this.identificationmarks = identificationmarks;
	}

	public Date getIssuetime() {
		return this.issuetime;
	}

	public void setIssuetime(Date issuetime) {
		this.issuetime = issuetime;
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

	public String getPlacingofprocessing() {
		return this.placingofprocessing;
	}

	public void setPlacingofprocessing(String placingofprocessing) {
		this.placingofprocessing = placingofprocessing;
	}

	public String getPrintannexureiv() {
		return this.printannexureiv;
	}

	public void setPrintannexureiv(String printannexureiv) {
		this.printannexureiv = printannexureiv;
	}

	public String getProcessingunitnature() {
		return this.processingunitnature;
	}

	public void setProcessingunitnature(String processingunitnature) {
		this.processingunitnature = processingunitnature;
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

	public BigDecimal getTotalmaterialcost() {
		return this.totalmaterialcost;
	}

	public void setTotalmaterialcost(BigDecimal totalmaterialcost) {
		this.totalmaterialcost = totalmaterialcost;
	}

	public Contact getContact1() {
		return this.contact1;
	}

	public void setContact1(Contact contact1) {
		this.contact1 = contact1;
	}

	public Contact getContact2() {
		return this.contact2;
	}

	public void setContact2(Contact contact2) {
		this.contact2 = contact2;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Itemissuedforjobdtl> getItemissuedforjobdtls() {
		return this.itemissuedforjobdtls;
	}

	public void setItemissuedforjobdtls(List<Itemissuedforjobdtl> itemissuedforjobdtls) {
		this.itemissuedforjobdtls = itemissuedforjobdtls;
	}

	public Itemissuedforjobdtl addItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().add(itemissuedforjobdtl);
		itemissuedforjobdtl.setItemissuedforjob(this);

		return itemissuedforjobdtl;
	}

	public Itemissuedforjobdtl removeItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().remove(itemissuedforjobdtl);
		itemissuedforjobdtl.setItemissuedforjob(null);

		return itemissuedforjobdtl;
	}

}