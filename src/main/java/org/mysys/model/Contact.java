package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long contactid;

	private String addr1;

	private String addr2;

	private String addr3;

	private BigDecimal cityid;

	private String contactroleid;

	private String country;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String displayname;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String gstno;

	private String mobile;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String name;

	private String phone;

	private String pincode;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	private BigDecimal stateid;

	private String status;

	private String transporter;

	private String vendorcode;

	//bi-directional many-to-one association to Contactcateg
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Contactcateg contactcateg;

	//bi-directional many-to-one association to Contacttype
	@ManyToOne
	@JoinColumn(name="contacttypeid")
	private Contacttype contacttype;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Contactcalldetail
	@OneToMany(mappedBy="contact")
	private List<Contactcalldetail> contactcalldetails;

	//bi-directional many-to-one association to Contactemaildetail
	@OneToMany(mappedBy="contact")
	private List<Contactemaildetail> contactemaildetails;

	//bi-directional many-to-one association to Contactperson
	@OneToMany(mappedBy="contact")
	private List<Contactperson> contactpersons;

	//bi-directional many-to-one association to Customerproductmaster
	@OneToMany(mappedBy="contact")
	private List<Customerproductmaster> customerproductmasters;

	//bi-directional many-to-one association to Itemissue
	@OneToMany(mappedBy="contact")
	private List<Itemissue> itemissues;

	//bi-directional many-to-one association to Itemissuedforjob
	@OneToMany(mappedBy="contact1")
	private List<Itemissuedforjob> itemissuedforjobs1;

	//bi-directional many-to-one association to Itemissuedforjob
	@OneToMany(mappedBy="contact2")
	private List<Itemissuedforjob> itemissuedforjobs2;

	//bi-directional many-to-one association to Itemrecd
	@OneToMany(mappedBy="contact")
	private List<Itemrecd> itemrecds;

	//bi-directional many-to-one association to Itemrecdafterjob
	@OneToMany(mappedBy="contact")
	private List<Itemrecdafterjob> itemrecdafterjobs;

	//bi-directional many-to-one association to Itemreturn
	@OneToMany(mappedBy="contact1")
	private List<Itemreturn> itemreturns1;

	//bi-directional many-to-one association to Itemreturn
	@OneToMany(mappedBy="contact2")
	private List<Itemreturn> itemreturns2;

	//bi-directional many-to-one association to Supplieritemmaster
	@OneToMany(mappedBy="contact")
	private List<Supplieritemmaster> supplieritemmasters;

	//bi-directional many-to-one association to Vendoritemadj
	@OneToMany(mappedBy="contact")
	private List<Vendoritemadj> vendoritemadjs;

	//bi-directional many-to-one association to Vendoritemmaster
	@OneToMany(mappedBy="contact")
	private List<Vendoritemmaster> vendoritemmasters;

	public Contact() {
	}

	public long getContactid() {
		return this.contactid;
	}

	public void setContactid(long contactid) {
		this.contactid = contactid;
	}

	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return this.addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	public BigDecimal getCityid() {
		return this.cityid;
	}

	public void setCityid(BigDecimal cityid) {
		this.cityid = cityid;
	}

	public String getContactroleid() {
		return this.contactroleid;
	}

	public void setContactroleid(String contactroleid) {
		this.contactroleid = contactroleid;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getGstno() {
		return this.gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public BigDecimal getStateid() {
		return this.stateid;
	}

	public void setStateid(BigDecimal stateid) {
		this.stateid = stateid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransporter() {
		return this.transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public String getVendorcode() {
		return this.vendorcode;
	}

	public void setVendorcode(String vendorcode) {
		this.vendorcode = vendorcode;
	}

	public Contactcateg getContactcateg() {
		return this.contactcateg;
	}

	public void setContactcateg(Contactcateg contactcateg) {
		this.contactcateg = contactcateg;
	}

	public Contacttype getContacttype() {
		return this.contacttype;
	}

	public void setContacttype(Contacttype contacttype) {
		this.contacttype = contacttype;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Contactcalldetail> getContactcalldetails() {
		return this.contactcalldetails;
	}

	public void setContactcalldetails(List<Contactcalldetail> contactcalldetails) {
		this.contactcalldetails = contactcalldetails;
	}

	public Contactcalldetail addContactcalldetail(Contactcalldetail contactcalldetail) {
		getContactcalldetails().add(contactcalldetail);
		contactcalldetail.setContact(this);

		return contactcalldetail;
	}

	public Contactcalldetail removeContactcalldetail(Contactcalldetail contactcalldetail) {
		getContactcalldetails().remove(contactcalldetail);
		contactcalldetail.setContact(null);

		return contactcalldetail;
	}

	public List<Contactemaildetail> getContactemaildetails() {
		return this.contactemaildetails;
	}

	public void setContactemaildetails(List<Contactemaildetail> contactemaildetails) {
		this.contactemaildetails = contactemaildetails;
	}

	public Contactemaildetail addContactemaildetail(Contactemaildetail contactemaildetail) {
		getContactemaildetails().add(contactemaildetail);
		contactemaildetail.setContact(this);

		return contactemaildetail;
	}

	public Contactemaildetail removeContactemaildetail(Contactemaildetail contactemaildetail) {
		getContactemaildetails().remove(contactemaildetail);
		contactemaildetail.setContact(null);

		return contactemaildetail;
	}

	public List<Contactperson> getContactpersons() {
		return this.contactpersons;
	}

	public void setContactpersons(List<Contactperson> contactpersons) {
		this.contactpersons = contactpersons;
	}

	public Contactperson addContactperson(Contactperson contactperson) {
		getContactpersons().add(contactperson);
		contactperson.setContact(this);

		return contactperson;
	}

	public Contactperson removeContactperson(Contactperson contactperson) {
		getContactpersons().remove(contactperson);
		contactperson.setContact(null);

		return contactperson;
	}

	public List<Customerproductmaster> getCustomerproductmasters() {
		return this.customerproductmasters;
	}

	public void setCustomerproductmasters(List<Customerproductmaster> customerproductmasters) {
		this.customerproductmasters = customerproductmasters;
	}

	public Customerproductmaster addCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().add(customerproductmaster);
		customerproductmaster.setContact(this);

		return customerproductmaster;
	}

	public Customerproductmaster removeCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().remove(customerproductmaster);
		customerproductmaster.setContact(null);

		return customerproductmaster;
	}

	public List<Itemissue> getItemissues() {
		return this.itemissues;
	}

	public void setItemissues(List<Itemissue> itemissues) {
		this.itemissues = itemissues;
	}

	public Itemissue addItemissue(Itemissue itemissue) {
		getItemissues().add(itemissue);
		itemissue.setContact(this);

		return itemissue;
	}

	public Itemissue removeItemissue(Itemissue itemissue) {
		getItemissues().remove(itemissue);
		itemissue.setContact(null);

		return itemissue;
	}

	public List<Itemissuedforjob> getItemissuedforjobs1() {
		return this.itemissuedforjobs1;
	}

	public void setItemissuedforjobs1(List<Itemissuedforjob> itemissuedforjobs1) {
		this.itemissuedforjobs1 = itemissuedforjobs1;
	}

	public Itemissuedforjob addItemissuedforjobs1(Itemissuedforjob itemissuedforjobs1) {
		getItemissuedforjobs1().add(itemissuedforjobs1);
		itemissuedforjobs1.setContact1(this);

		return itemissuedforjobs1;
	}

	public Itemissuedforjob removeItemissuedforjobs1(Itemissuedforjob itemissuedforjobs1) {
		getItemissuedforjobs1().remove(itemissuedforjobs1);
		itemissuedforjobs1.setContact1(null);

		return itemissuedforjobs1;
	}

	public List<Itemissuedforjob> getItemissuedforjobs2() {
		return this.itemissuedforjobs2;
	}

	public void setItemissuedforjobs2(List<Itemissuedforjob> itemissuedforjobs2) {
		this.itemissuedforjobs2 = itemissuedforjobs2;
	}

	public Itemissuedforjob addItemissuedforjobs2(Itemissuedforjob itemissuedforjobs2) {
		getItemissuedforjobs2().add(itemissuedforjobs2);
		itemissuedforjobs2.setContact2(this);

		return itemissuedforjobs2;
	}

	public Itemissuedforjob removeItemissuedforjobs2(Itemissuedforjob itemissuedforjobs2) {
		getItemissuedforjobs2().remove(itemissuedforjobs2);
		itemissuedforjobs2.setContact2(null);

		return itemissuedforjobs2;
	}

	public List<Itemrecd> getItemrecds() {
		return this.itemrecds;
	}

	public void setItemrecds(List<Itemrecd> itemrecds) {
		this.itemrecds = itemrecds;
	}

	public Itemrecd addItemrecd(Itemrecd itemrecd) {
		getItemrecds().add(itemrecd);
		itemrecd.setContact(this);

		return itemrecd;
	}

	public Itemrecd removeItemrecd(Itemrecd itemrecd) {
		getItemrecds().remove(itemrecd);
		itemrecd.setContact(null);

		return itemrecd;
	}

	public List<Itemrecdafterjob> getItemrecdafterjobs() {
		return this.itemrecdafterjobs;
	}

	public void setItemrecdafterjobs(List<Itemrecdafterjob> itemrecdafterjobs) {
		this.itemrecdafterjobs = itemrecdafterjobs;
	}

	public Itemrecdafterjob addItemrecdafterjob(Itemrecdafterjob itemrecdafterjob) {
		getItemrecdafterjobs().add(itemrecdafterjob);
		itemrecdafterjob.setContact(this);

		return itemrecdafterjob;
	}

	public Itemrecdafterjob removeItemrecdafterjob(Itemrecdafterjob itemrecdafterjob) {
		getItemrecdafterjobs().remove(itemrecdafterjob);
		itemrecdafterjob.setContact(null);

		return itemrecdafterjob;
	}

	public List<Itemreturn> getItemreturns1() {
		return this.itemreturns1;
	}

	public void setItemreturns1(List<Itemreturn> itemreturns1) {
		this.itemreturns1 = itemreturns1;
	}

	public Itemreturn addItemreturns1(Itemreturn itemreturns1) {
		getItemreturns1().add(itemreturns1);
		itemreturns1.setContact1(this);

		return itemreturns1;
	}

	public Itemreturn removeItemreturns1(Itemreturn itemreturns1) {
		getItemreturns1().remove(itemreturns1);
		itemreturns1.setContact1(null);

		return itemreturns1;
	}

	public List<Itemreturn> getItemreturns2() {
		return this.itemreturns2;
	}

	public void setItemreturns2(List<Itemreturn> itemreturns2) {
		this.itemreturns2 = itemreturns2;
	}

	public Itemreturn addItemreturns2(Itemreturn itemreturns2) {
		getItemreturns2().add(itemreturns2);
		itemreturns2.setContact2(this);

		return itemreturns2;
	}

	public Itemreturn removeItemreturns2(Itemreturn itemreturns2) {
		getItemreturns2().remove(itemreturns2);
		itemreturns2.setContact2(null);

		return itemreturns2;
	}

	public List<Supplieritemmaster> getSupplieritemmasters() {
		return this.supplieritemmasters;
	}

	public void setSupplieritemmasters(List<Supplieritemmaster> supplieritemmasters) {
		this.supplieritemmasters = supplieritemmasters;
	}

	public Supplieritemmaster addSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().add(supplieritemmaster);
		supplieritemmaster.setContact(this);

		return supplieritemmaster;
	}

	public Supplieritemmaster removeSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().remove(supplieritemmaster);
		supplieritemmaster.setContact(null);

		return supplieritemmaster;
	}

	public List<Vendoritemadj> getVendoritemadjs() {
		return this.vendoritemadjs;
	}

	public void setVendoritemadjs(List<Vendoritemadj> vendoritemadjs) {
		this.vendoritemadjs = vendoritemadjs;
	}

	public Vendoritemadj addVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().add(vendoritemadj);
		vendoritemadj.setContact(this);

		return vendoritemadj;
	}

	public Vendoritemadj removeVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().remove(vendoritemadj);
		vendoritemadj.setContact(null);

		return vendoritemadj;
	}

	public List<Vendoritemmaster> getVendoritemmasters() {
		return this.vendoritemmasters;
	}

	public void setVendoritemmasters(List<Vendoritemmaster> vendoritemmasters) {
		this.vendoritemmasters = vendoritemmasters;
	}

	public Vendoritemmaster addVendoritemmaster(Vendoritemmaster vendoritemmaster) {
		getVendoritemmasters().add(vendoritemmaster);
		vendoritemmaster.setContact(this);

		return vendoritemmaster;
	}

	public Vendoritemmaster removeVendoritemmaster(Vendoritemmaster vendoritemmaster) {
		getVendoritemmasters().remove(vendoritemmaster);
		vendoritemmaster.setContact(null);

		return vendoritemmaster;
	}

}