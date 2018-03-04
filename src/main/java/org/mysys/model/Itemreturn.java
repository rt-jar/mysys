package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemreturn database table.
 * 
 */
@Entity
@NamedQuery(name="Itemreturn.findAll", query="SELECT i FROM Itemreturn i")
public class Itemreturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="itr_id")
	private long itrId;

	private String acctyear;

	@Temporal(TemporalType.DATE)
	private Date challandate;

	private BigDecimal challanno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String deliverymode;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String remarks;

	private String vehicleregnno;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="customerid")
	private Contact contact1;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="sourcedeptid")
	private Contact contact2;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemreturndtl
	@OneToMany(mappedBy="itemreturn")
	private List<Itemreturndtl> itemreturndtls;

	public Itemreturn() {
	}

	public long getItrId() {
		return this.itrId;
	}

	public void setItrId(long itrId) {
		this.itrId = itrId;
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

	public String getDeliverymode() {
		return this.deliverymode;
	}

	public void setDeliverymode(String deliverymode) {
		this.deliverymode = deliverymode;
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

	public String getVehicleregnno() {
		return this.vehicleregnno;
	}

	public void setVehicleregnno(String vehicleregnno) {
		this.vehicleregnno = vehicleregnno;
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

	public List<Itemreturndtl> getItemreturndtls() {
		return this.itemreturndtls;
	}

	public void setItemreturndtls(List<Itemreturndtl> itemreturndtls) {
		this.itemreturndtls = itemreturndtls;
	}

	public Itemreturndtl addItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().add(itemreturndtl);
		itemreturndtl.setItemreturn(this);

		return itemreturndtl;
	}

	public Itemreturndtl removeItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().remove(itemreturndtl);
		itemreturndtl.setItemreturn(null);

		return itemreturndtl;
	}

}