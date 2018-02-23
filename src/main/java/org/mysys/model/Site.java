package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the site database table.
 * 
 */
@Entity
@NamedQuery(name="Site.findAll", query="SELECT s FROM Site s")
public class Site implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long siteid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String sitename;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Adjreason
	@OneToMany(mappedBy="site")
	private List<Adjreason> adjreasons;

	//bi-directional many-to-one association to Bom
	@OneToMany(mappedBy="site")
	private List<Bom> boms;

	//bi-directional many-to-one association to Bomexpense
	@OneToMany(mappedBy="site")
	private List<Bomexpense> bomexpenses;

	//bi-directional many-to-one association to Bomitem
	@OneToMany(mappedBy="site")
	private List<Bomitem> bomitems;

	//bi-directional many-to-one association to Citymaster
	@OneToMany(mappedBy="site")
	private List<Citymaster> citymasters;

	//bi-directional many-to-one association to Contact
	@OneToMany(mappedBy="site")
	private List<Contact> contacts;

	//bi-directional many-to-one association to Contactcalldetail
	@OneToMany(mappedBy="site")
	private List<Contactcalldetail> contactcalldetails;

	//bi-directional many-to-one association to Contactcateg
	@OneToMany(mappedBy="site")
	private List<Contactcateg> contactcategs;

	//bi-directional many-to-one association to Contactemaildetail
	@OneToMany(mappedBy="site")
	private List<Contactemaildetail> contactemaildetails;

	//bi-directional many-to-one association to Contactperson
	@OneToMany(mappedBy="site")
	private List<Contactperson> contactpersons;

	//bi-directional many-to-one association to Contactrole
	@OneToMany(mappedBy="site")
	private List<Contactrole> contactroles;

	//bi-directional many-to-one association to Contacttype
	@OneToMany(mappedBy="site")
	private List<Contacttype> contacttypes;

	//bi-directional many-to-one association to Customerproductmaster
	@OneToMany(mappedBy="site")
	private List<Customerproductmaster> customerproductmasters;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="site")
	private List<Department> departments;

	//bi-directional many-to-one association to Displist
	@OneToMany(mappedBy="site")
	private List<Displist> displists;

	//bi-directional many-to-one association to Displistcol
	@OneToMany(mappedBy="site")
	private List<Displistcol> displistcols;

	//bi-directional many-to-one association to Emailtemplate
	@OneToMany(mappedBy="site")
	private List<Emailtemplate> emailtemplates;

	//bi-directional many-to-one association to Hsncode
	@OneToMany(mappedBy="site")
	private List<Hsncode> hsncodes;

	//bi-directional many-to-one association to Itemcategory
	@OneToMany(mappedBy="site")
	private List<Itemcategory> itemcategories;

	//bi-directional many-to-one association to Itemgroup
	@OneToMany(mappedBy="site")
	private List<Itemgroup> itemgroups;

	//bi-directional many-to-one association to Itemissue
	@OneToMany(mappedBy="site")
	private List<Itemissue> itemissues;

	//bi-directional many-to-one association to Itemissuedforjob
	@OneToMany(mappedBy="site")
	private List<Itemissuedforjob> itemissuedforjobs;

	//bi-directional many-to-one association to Itemissuedforjobdtl
	@OneToMany(mappedBy="site")
	private List<Itemissuedforjobdtl> itemissuedforjobdtls;

	//bi-directional many-to-one association to Itemissuedtl
	@OneToMany(mappedBy="site")
	private List<Itemissuedtl> itemissuedtls;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="site")
	private List<Itemmaster> itemmasters;

	//bi-directional many-to-one association to Itemrecd
	@OneToMany(mappedBy="site")
	private List<Itemrecd> itemrecds;

	//bi-directional many-to-one association to Itemrecdafterjob
	@OneToMany(mappedBy="site")
	private List<Itemrecdafterjob> itemrecdafterjobs;

	//bi-directional many-to-one association to Itemrecdafterjobdtl
	@OneToMany(mappedBy="site")
	private List<Itemrecdafterjobdtl> itemrecdafterjobdtls;

	//bi-directional many-to-one association to Itemrecddtl
	@OneToMany(mappedBy="site")
	private List<Itemrecddtl> itemrecddtls;

	//bi-directional many-to-one association to Itemreturn
	@OneToMany(mappedBy="site")
	private List<Itemreturn> itemreturns;

	//bi-directional many-to-one association to Itemreturndtl
	@OneToMany(mappedBy="site")
	private List<Itemreturndtl> itemreturndtls;

	//bi-directional many-to-one association to Itemspecifaction
	@OneToMany(mappedBy="site")
	private List<Itemspecifaction> itemspecifactions;

	//bi-directional many-to-one association to Itemspecmaster
	@OneToMany(mappedBy="site")
	private List<Itemspecmaster> itemspecmasters;

	//bi-directional many-to-one association to Itemstockadj
	@OneToMany(mappedBy="site")
	private List<Itemstockadj> itemstockadjs;

	//bi-directional many-to-one association to Itemunitmaster
	@OneToMany(mappedBy="site")
	private List<Itemunitmaster> itemunitmasters;

	//bi-directional many-to-one association to Module
	@OneToMany(mappedBy="site")
	private List<Module> modules;

	//bi-directional many-to-one association to Modulescreen
	@OneToMany(mappedBy="site")
	private List<Modulescreen> modulescreens;

	//bi-directional many-to-one association to Prodrecdafterjobdtl
	@OneToMany(mappedBy="site")
	private List<Prodrecdafterjobdtl> prodrecdafterjobdtls;

	//bi-directional many-to-one association to Role
	@OneToMany(mappedBy="site")
	private List<Role> roles;

	//bi-directional many-to-one association to Rolescreenaccess
	@OneToMany(mappedBy="site")
	private List<Rolescreenaccess> rolescreenaccesses;

	//bi-directional many-to-one association to Screen
	@OneToMany(mappedBy="site")
	private List<Screen> screens;

	//bi-directional many-to-one association to Statemaster
	@OneToMany(mappedBy="site")
	private List<Statemaster> statemasters;

	//bi-directional many-to-one association to Supplieritemmaster
	@OneToMany(mappedBy="site")
	private List<Supplieritemmaster> supplieritemmasters;

	//bi-directional many-to-one association to Userrole
	@OneToMany(mappedBy="site")
	private List<Userrole> userroles;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="site")
	private List<User> users;

	//bi-directional many-to-one association to Vendoritemadj
	@OneToMany(mappedBy="site")
	private List<Vendoritemadj> vendoritemadjs;

	//bi-directional many-to-one association to Vendoritemmaster
	@OneToMany(mappedBy="site")
	private List<Vendoritemmaster> vendoritemmasters;

	public Site() {
	}

	public long getSiteid() {
		return this.siteid;
	}

	public void setSiteid(long siteid) {
		this.siteid = siteid;
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

	public String getSitename() {
		return this.sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public List<Adjreason> getAdjreasons() {
		return this.adjreasons;
	}

	public void setAdjreasons(List<Adjreason> adjreasons) {
		this.adjreasons = adjreasons;
	}

	public Adjreason addAdjreason(Adjreason adjreason) {
		getAdjreasons().add(adjreason);
		adjreason.setSite(this);

		return adjreason;
	}

	public Adjreason removeAdjreason(Adjreason adjreason) {
		getAdjreasons().remove(adjreason);
		adjreason.setSite(null);

		return adjreason;
	}

	public List<Bom> getBoms() {
		return this.boms;
	}

	public void setBoms(List<Bom> boms) {
		this.boms = boms;
	}

	public Bom addBom(Bom bom) {
		getBoms().add(bom);
		bom.setSite(this);

		return bom;
	}

	public Bom removeBom(Bom bom) {
		getBoms().remove(bom);
		bom.setSite(null);

		return bom;
	}

	public List<Bomexpense> getBomexpenses() {
		return this.bomexpenses;
	}

	public void setBomexpenses(List<Bomexpense> bomexpenses) {
		this.bomexpenses = bomexpenses;
	}

	public Bomexpense addBomexpens(Bomexpense bomexpens) {
		getBomexpenses().add(bomexpens);
		bomexpens.setSite(this);

		return bomexpens;
	}

	public Bomexpense removeBomexpens(Bomexpense bomexpens) {
		getBomexpenses().remove(bomexpens);
		bomexpens.setSite(null);

		return bomexpens;
	}

	public List<Bomitem> getBomitems() {
		return this.bomitems;
	}

	public void setBomitems(List<Bomitem> bomitems) {
		this.bomitems = bomitems;
	}

	public Bomitem addBomitem(Bomitem bomitem) {
		getBomitems().add(bomitem);
		bomitem.setSite(this);

		return bomitem;
	}

	public Bomitem removeBomitem(Bomitem bomitem) {
		getBomitems().remove(bomitem);
		bomitem.setSite(null);

		return bomitem;
	}

	public List<Citymaster> getCitymasters() {
		return this.citymasters;
	}

	public void setCitymasters(List<Citymaster> citymasters) {
		this.citymasters = citymasters;
	}

	public Citymaster addCitymaster(Citymaster citymaster) {
		getCitymasters().add(citymaster);
		citymaster.setSite(this);

		return citymaster;
	}

	public Citymaster removeCitymaster(Citymaster citymaster) {
		getCitymasters().remove(citymaster);
		citymaster.setSite(null);

		return citymaster;
	}

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Contact addContact(Contact contact) {
		getContacts().add(contact);
		contact.setSite(this);

		return contact;
	}

	public Contact removeContact(Contact contact) {
		getContacts().remove(contact);
		contact.setSite(null);

		return contact;
	}

	public List<Contactcalldetail> getContactcalldetails() {
		return this.contactcalldetails;
	}

	public void setContactcalldetails(List<Contactcalldetail> contactcalldetails) {
		this.contactcalldetails = contactcalldetails;
	}

	public Contactcalldetail addContactcalldetail(Contactcalldetail contactcalldetail) {
		getContactcalldetails().add(contactcalldetail);
		contactcalldetail.setSite(this);

		return contactcalldetail;
	}

	public Contactcalldetail removeContactcalldetail(Contactcalldetail contactcalldetail) {
		getContactcalldetails().remove(contactcalldetail);
		contactcalldetail.setSite(null);

		return contactcalldetail;
	}

	public List<Contactcateg> getContactcategs() {
		return this.contactcategs;
	}

	public void setContactcategs(List<Contactcateg> contactcategs) {
		this.contactcategs = contactcategs;
	}

	public Contactcateg addContactcateg(Contactcateg contactcateg) {
		getContactcategs().add(contactcateg);
		contactcateg.setSite(this);

		return contactcateg;
	}

	public Contactcateg removeContactcateg(Contactcateg contactcateg) {
		getContactcategs().remove(contactcateg);
		contactcateg.setSite(null);

		return contactcateg;
	}

	public List<Contactemaildetail> getContactemaildetails() {
		return this.contactemaildetails;
	}

	public void setContactemaildetails(List<Contactemaildetail> contactemaildetails) {
		this.contactemaildetails = contactemaildetails;
	}

	public Contactemaildetail addContactemaildetail(Contactemaildetail contactemaildetail) {
		getContactemaildetails().add(contactemaildetail);
		contactemaildetail.setSite(this);

		return contactemaildetail;
	}

	public Contactemaildetail removeContactemaildetail(Contactemaildetail contactemaildetail) {
		getContactemaildetails().remove(contactemaildetail);
		contactemaildetail.setSite(null);

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
		contactperson.setSite(this);

		return contactperson;
	}

	public Contactperson removeContactperson(Contactperson contactperson) {
		getContactpersons().remove(contactperson);
		contactperson.setSite(null);

		return contactperson;
	}

	public List<Contactrole> getContactroles() {
		return this.contactroles;
	}

	public void setContactroles(List<Contactrole> contactroles) {
		this.contactroles = contactroles;
	}

	public Contactrole addContactrole(Contactrole contactrole) {
		getContactroles().add(contactrole);
		contactrole.setSite(this);

		return contactrole;
	}

	public Contactrole removeContactrole(Contactrole contactrole) {
		getContactroles().remove(contactrole);
		contactrole.setSite(null);

		return contactrole;
	}

	public List<Contacttype> getContacttypes() {
		return this.contacttypes;
	}

	public void setContacttypes(List<Contacttype> contacttypes) {
		this.contacttypes = contacttypes;
	}

	public Contacttype addContacttype(Contacttype contacttype) {
		getContacttypes().add(contacttype);
		contacttype.setSite(this);

		return contacttype;
	}

	public Contacttype removeContacttype(Contacttype contacttype) {
		getContacttypes().remove(contacttype);
		contacttype.setSite(null);

		return contacttype;
	}

	public List<Customerproductmaster> getCustomerproductmasters() {
		return this.customerproductmasters;
	}

	public void setCustomerproductmasters(List<Customerproductmaster> customerproductmasters) {
		this.customerproductmasters = customerproductmasters;
	}

	public Customerproductmaster addCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().add(customerproductmaster);
		customerproductmaster.setSite(this);

		return customerproductmaster;
	}

	public Customerproductmaster removeCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().remove(customerproductmaster);
		customerproductmaster.setSite(null);

		return customerproductmaster;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setSite(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setSite(null);

		return department;
	}

	public List<Displist> getDisplists() {
		return this.displists;
	}

	public void setDisplists(List<Displist> displists) {
		this.displists = displists;
	}

	public Displist addDisplist(Displist displist) {
		getDisplists().add(displist);
		displist.setSite(this);

		return displist;
	}

	public Displist removeDisplist(Displist displist) {
		getDisplists().remove(displist);
		displist.setSite(null);

		return displist;
	}

	public List<Displistcol> getDisplistcols() {
		return this.displistcols;
	}

	public void setDisplistcols(List<Displistcol> displistcols) {
		this.displistcols = displistcols;
	}

	public Displistcol addDisplistcol(Displistcol displistcol) {
		getDisplistcols().add(displistcol);
		displistcol.setSite(this);

		return displistcol;
	}

	public Displistcol removeDisplistcol(Displistcol displistcol) {
		getDisplistcols().remove(displistcol);
		displistcol.setSite(null);

		return displistcol;
	}

	public List<Emailtemplate> getEmailtemplates() {
		return this.emailtemplates;
	}

	public void setEmailtemplates(List<Emailtemplate> emailtemplates) {
		this.emailtemplates = emailtemplates;
	}

	public Emailtemplate addEmailtemplate(Emailtemplate emailtemplate) {
		getEmailtemplates().add(emailtemplate);
		emailtemplate.setSite(this);

		return emailtemplate;
	}

	public Emailtemplate removeEmailtemplate(Emailtemplate emailtemplate) {
		getEmailtemplates().remove(emailtemplate);
		emailtemplate.setSite(null);

		return emailtemplate;
	}

	public List<Hsncode> getHsncodes() {
		return this.hsncodes;
	}

	public void setHsncodes(List<Hsncode> hsncodes) {
		this.hsncodes = hsncodes;
	}

	public Hsncode addHsncode(Hsncode hsncode) {
		getHsncodes().add(hsncode);
		hsncode.setSite(this);

		return hsncode;
	}

	public Hsncode removeHsncode(Hsncode hsncode) {
		getHsncodes().remove(hsncode);
		hsncode.setSite(null);

		return hsncode;
	}

	public List<Itemcategory> getItemcategories() {
		return this.itemcategories;
	}

	public void setItemcategories(List<Itemcategory> itemcategories) {
		this.itemcategories = itemcategories;
	}

	public Itemcategory addItemcategory(Itemcategory itemcategory) {
		getItemcategories().add(itemcategory);
		itemcategory.setSite(this);

		return itemcategory;
	}

	public Itemcategory removeItemcategory(Itemcategory itemcategory) {
		getItemcategories().remove(itemcategory);
		itemcategory.setSite(null);

		return itemcategory;
	}

	public List<Itemgroup> getItemgroups() {
		return this.itemgroups;
	}

	public void setItemgroups(List<Itemgroup> itemgroups) {
		this.itemgroups = itemgroups;
	}

	public Itemgroup addItemgroup(Itemgroup itemgroup) {
		getItemgroups().add(itemgroup);
		itemgroup.setSite(this);

		return itemgroup;
	}

	public Itemgroup removeItemgroup(Itemgroup itemgroup) {
		getItemgroups().remove(itemgroup);
		itemgroup.setSite(null);

		return itemgroup;
	}

	public List<Itemissue> getItemissues() {
		return this.itemissues;
	}

	public void setItemissues(List<Itemissue> itemissues) {
		this.itemissues = itemissues;
	}

	public Itemissue addItemissue(Itemissue itemissue) {
		getItemissues().add(itemissue);
		itemissue.setSite(this);

		return itemissue;
	}

	public Itemissue removeItemissue(Itemissue itemissue) {
		getItemissues().remove(itemissue);
		itemissue.setSite(null);

		return itemissue;
	}

	public List<Itemissuedforjob> getItemissuedforjobs() {
		return this.itemissuedforjobs;
	}

	public void setItemissuedforjobs(List<Itemissuedforjob> itemissuedforjobs) {
		this.itemissuedforjobs = itemissuedforjobs;
	}

	public Itemissuedforjob addItemissuedforjob(Itemissuedforjob itemissuedforjob) {
		getItemissuedforjobs().add(itemissuedforjob);
		itemissuedforjob.setSite(this);

		return itemissuedforjob;
	}

	public Itemissuedforjob removeItemissuedforjob(Itemissuedforjob itemissuedforjob) {
		getItemissuedforjobs().remove(itemissuedforjob);
		itemissuedforjob.setSite(null);

		return itemissuedforjob;
	}

	public List<Itemissuedforjobdtl> getItemissuedforjobdtls() {
		return this.itemissuedforjobdtls;
	}

	public void setItemissuedforjobdtls(List<Itemissuedforjobdtl> itemissuedforjobdtls) {
		this.itemissuedforjobdtls = itemissuedforjobdtls;
	}

	public Itemissuedforjobdtl addItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().add(itemissuedforjobdtl);
		itemissuedforjobdtl.setSite(this);

		return itemissuedforjobdtl;
	}

	public Itemissuedforjobdtl removeItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().remove(itemissuedforjobdtl);
		itemissuedforjobdtl.setSite(null);

		return itemissuedforjobdtl;
	}

	public List<Itemissuedtl> getItemissuedtls() {
		return this.itemissuedtls;
	}

	public void setItemissuedtls(List<Itemissuedtl> itemissuedtls) {
		this.itemissuedtls = itemissuedtls;
	}

	public Itemissuedtl addItemissuedtl(Itemissuedtl itemissuedtl) {
		getItemissuedtls().add(itemissuedtl);
		itemissuedtl.setSite(this);

		return itemissuedtl;
	}

	public Itemissuedtl removeItemissuedtl(Itemissuedtl itemissuedtl) {
		getItemissuedtls().remove(itemissuedtl);
		itemissuedtl.setSite(null);

		return itemissuedtl;
	}

	public List<Itemmaster> getItemmasters() {
		return this.itemmasters;
	}

	public void setItemmasters(List<Itemmaster> itemmasters) {
		this.itemmasters = itemmasters;
	}

	public Itemmaster addItemmaster(Itemmaster itemmaster) {
		getItemmasters().add(itemmaster);
		itemmaster.setSite(this);

		return itemmaster;
	}

	public Itemmaster removeItemmaster(Itemmaster itemmaster) {
		getItemmasters().remove(itemmaster);
		itemmaster.setSite(null);

		return itemmaster;
	}

	public List<Itemrecd> getItemrecds() {
		return this.itemrecds;
	}

	public void setItemrecds(List<Itemrecd> itemrecds) {
		this.itemrecds = itemrecds;
	}

	public Itemrecd addItemrecd(Itemrecd itemrecd) {
		getItemrecds().add(itemrecd);
		itemrecd.setSite(this);

		return itemrecd;
	}

	public Itemrecd removeItemrecd(Itemrecd itemrecd) {
		getItemrecds().remove(itemrecd);
		itemrecd.setSite(null);

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
		itemrecdafterjob.setSite(this);

		return itemrecdafterjob;
	}

	public Itemrecdafterjob removeItemrecdafterjob(Itemrecdafterjob itemrecdafterjob) {
		getItemrecdafterjobs().remove(itemrecdafterjob);
		itemrecdafterjob.setSite(null);

		return itemrecdafterjob;
	}

	public List<Itemrecdafterjobdtl> getItemrecdafterjobdtls() {
		return this.itemrecdafterjobdtls;
	}

	public void setItemrecdafterjobdtls(List<Itemrecdafterjobdtl> itemrecdafterjobdtls) {
		this.itemrecdafterjobdtls = itemrecdafterjobdtls;
	}

	public Itemrecdafterjobdtl addItemrecdafterjobdtl(Itemrecdafterjobdtl itemrecdafterjobdtl) {
		getItemrecdafterjobdtls().add(itemrecdafterjobdtl);
		itemrecdafterjobdtl.setSite(this);

		return itemrecdafterjobdtl;
	}

	public Itemrecdafterjobdtl removeItemrecdafterjobdtl(Itemrecdafterjobdtl itemrecdafterjobdtl) {
		getItemrecdafterjobdtls().remove(itemrecdafterjobdtl);
		itemrecdafterjobdtl.setSite(null);

		return itemrecdafterjobdtl;
	}

	public List<Itemrecddtl> getItemrecddtls() {
		return this.itemrecddtls;
	}

	public void setItemrecddtls(List<Itemrecddtl> itemrecddtls) {
		this.itemrecddtls = itemrecddtls;
	}

	public Itemrecddtl addItemrecddtl(Itemrecddtl itemrecddtl) {
		getItemrecddtls().add(itemrecddtl);
		itemrecddtl.setSite(this);

		return itemrecddtl;
	}

	public Itemrecddtl removeItemrecddtl(Itemrecddtl itemrecddtl) {
		getItemrecddtls().remove(itemrecddtl);
		itemrecddtl.setSite(null);

		return itemrecddtl;
	}

	public List<Itemreturn> getItemreturns() {
		return this.itemreturns;
	}

	public void setItemreturns(List<Itemreturn> itemreturns) {
		this.itemreturns = itemreturns;
	}

	public Itemreturn addItemreturn(Itemreturn itemreturn) {
		getItemreturns().add(itemreturn);
		itemreturn.setSite(this);

		return itemreturn;
	}

	public Itemreturn removeItemreturn(Itemreturn itemreturn) {
		getItemreturns().remove(itemreturn);
		itemreturn.setSite(null);

		return itemreturn;
	}

	public List<Itemreturndtl> getItemreturndtls() {
		return this.itemreturndtls;
	}

	public void setItemreturndtls(List<Itemreturndtl> itemreturndtls) {
		this.itemreturndtls = itemreturndtls;
	}

	public Itemreturndtl addItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().add(itemreturndtl);
		itemreturndtl.setSite(this);

		return itemreturndtl;
	}

	public Itemreturndtl removeItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().remove(itemreturndtl);
		itemreturndtl.setSite(null);

		return itemreturndtl;
	}

	public List<Itemspecifaction> getItemspecifactions() {
		return this.itemspecifactions;
	}

	public void setItemspecifactions(List<Itemspecifaction> itemspecifactions) {
		this.itemspecifactions = itemspecifactions;
	}

	public Itemspecifaction addItemspecifaction(Itemspecifaction itemspecifaction) {
		getItemspecifactions().add(itemspecifaction);
		itemspecifaction.setSite(this);

		return itemspecifaction;
	}

	public Itemspecifaction removeItemspecifaction(Itemspecifaction itemspecifaction) {
		getItemspecifactions().remove(itemspecifaction);
		itemspecifaction.setSite(null);

		return itemspecifaction;
	}

	public List<Itemspecmaster> getItemspecmasters() {
		return this.itemspecmasters;
	}

	public void setItemspecmasters(List<Itemspecmaster> itemspecmasters) {
		this.itemspecmasters = itemspecmasters;
	}

	public Itemspecmaster addItemspecmaster(Itemspecmaster itemspecmaster) {
		getItemspecmasters().add(itemspecmaster);
		itemspecmaster.setSite(this);

		return itemspecmaster;
	}

	public Itemspecmaster removeItemspecmaster(Itemspecmaster itemspecmaster) {
		getItemspecmasters().remove(itemspecmaster);
		itemspecmaster.setSite(null);

		return itemspecmaster;
	}

	public List<Itemstockadj> getItemstockadjs() {
		return this.itemstockadjs;
	}

	public void setItemstockadjs(List<Itemstockadj> itemstockadjs) {
		this.itemstockadjs = itemstockadjs;
	}

	public Itemstockadj addItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().add(itemstockadj);
		itemstockadj.setSite(this);

		return itemstockadj;
	}

	public Itemstockadj removeItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().remove(itemstockadj);
		itemstockadj.setSite(null);

		return itemstockadj;
	}

	public List<Itemunitmaster> getItemunitmasters() {
		return this.itemunitmasters;
	}

	public void setItemunitmasters(List<Itemunitmaster> itemunitmasters) {
		this.itemunitmasters = itemunitmasters;
	}

	public Itemunitmaster addItemunitmaster(Itemunitmaster itemunitmaster) {
		getItemunitmasters().add(itemunitmaster);
		itemunitmaster.setSite(this);

		return itemunitmaster;
	}

	public Itemunitmaster removeItemunitmaster(Itemunitmaster itemunitmaster) {
		getItemunitmasters().remove(itemunitmaster);
		itemunitmaster.setSite(null);

		return itemunitmaster;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Module addModule(Module module) {
		getModules().add(module);
		module.setSite(this);

		return module;
	}

	public Module removeModule(Module module) {
		getModules().remove(module);
		module.setSite(null);

		return module;
	}

	public List<Modulescreen> getModulescreens() {
		return this.modulescreens;
	}

	public void setModulescreens(List<Modulescreen> modulescreens) {
		this.modulescreens = modulescreens;
	}

	public Modulescreen addModulescreen(Modulescreen modulescreen) {
		getModulescreens().add(modulescreen);
		modulescreen.setSite(this);

		return modulescreen;
	}

	public Modulescreen removeModulescreen(Modulescreen modulescreen) {
		getModulescreens().remove(modulescreen);
		modulescreen.setSite(null);

		return modulescreen;
	}

	public List<Prodrecdafterjobdtl> getProdrecdafterjobdtls() {
		return this.prodrecdafterjobdtls;
	}

	public void setProdrecdafterjobdtls(List<Prodrecdafterjobdtl> prodrecdafterjobdtls) {
		this.prodrecdafterjobdtls = prodrecdafterjobdtls;
	}

	public Prodrecdafterjobdtl addProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().add(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setSite(this);

		return prodrecdafterjobdtl;
	}

	public Prodrecdafterjobdtl removeProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().remove(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setSite(null);

		return prodrecdafterjobdtl;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.setSite(this);

		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.setSite(null);

		return role;
	}

	public List<Rolescreenaccess> getRolescreenaccesses() {
		return this.rolescreenaccesses;
	}

	public void setRolescreenaccesses(List<Rolescreenaccess> rolescreenaccesses) {
		this.rolescreenaccesses = rolescreenaccesses;
	}

	public Rolescreenaccess addRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().add(rolescreenaccess);
		rolescreenaccess.setSite(this);

		return rolescreenaccess;
	}

	public Rolescreenaccess removeRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().remove(rolescreenaccess);
		rolescreenaccess.setSite(null);

		return rolescreenaccess;
	}

	public List<Screen> getScreens() {
		return this.screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public Screen addScreen(Screen screen) {
		getScreens().add(screen);
		screen.setSite(this);

		return screen;
	}

	public Screen removeScreen(Screen screen) {
		getScreens().remove(screen);
		screen.setSite(null);

		return screen;
	}

	public List<Statemaster> getStatemasters() {
		return this.statemasters;
	}

	public void setStatemasters(List<Statemaster> statemasters) {
		this.statemasters = statemasters;
	}

	public Statemaster addStatemaster(Statemaster statemaster) {
		getStatemasters().add(statemaster);
		statemaster.setSite(this);

		return statemaster;
	}

	public Statemaster removeStatemaster(Statemaster statemaster) {
		getStatemasters().remove(statemaster);
		statemaster.setSite(null);

		return statemaster;
	}

	public List<Supplieritemmaster> getSupplieritemmasters() {
		return this.supplieritemmasters;
	}

	public void setSupplieritemmasters(List<Supplieritemmaster> supplieritemmasters) {
		this.supplieritemmasters = supplieritemmasters;
	}

	public Supplieritemmaster addSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().add(supplieritemmaster);
		supplieritemmaster.setSite(this);

		return supplieritemmaster;
	}

	public Supplieritemmaster removeSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().remove(supplieritemmaster);
		supplieritemmaster.setSite(null);

		return supplieritemmaster;
	}

	public List<Userrole> getUserroles() {
		return this.userroles;
	}

	public void setUserroles(List<Userrole> userroles) {
		this.userroles = userroles;
	}

	public Userrole addUserrole(Userrole userrole) {
		getUserroles().add(userrole);
		userrole.setSite(this);

		return userrole;
	}

	public Userrole removeUserrole(Userrole userrole) {
		getUserroles().remove(userrole);
		userrole.setSite(null);

		return userrole;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSite(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSite(null);

		return user;
	}

	public List<Vendoritemadj> getVendoritemadjs() {
		return this.vendoritemadjs;
	}

	public void setVendoritemadjs(List<Vendoritemadj> vendoritemadjs) {
		this.vendoritemadjs = vendoritemadjs;
	}

	public Vendoritemadj addVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().add(vendoritemadj);
		vendoritemadj.setSite(this);

		return vendoritemadj;
	}

	public Vendoritemadj removeVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().remove(vendoritemadj);
		vendoritemadj.setSite(null);

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
		vendoritemmaster.setSite(this);

		return vendoritemmaster;
	}

	public Vendoritemmaster removeVendoritemmaster(Vendoritemmaster vendoritemmaster) {
		getVendoritemmasters().remove(vendoritemmaster);
		vendoritemmaster.setSite(null);

		return vendoritemmaster;
	}

}