package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemmaster database table.
 * 
 */
@Entity
@NamedQuery(name="Itemmaster.findAll", query="SELECT i FROM Itemmaster i")
public class Itemmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemid;

	private BigDecimal conversionfactor;

	private BigDecimal conversionrate;

	private String conversionunit;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String hsncode;

	private String incomingunit;

	private String itemcode;

	private String itemdesc;

	@Column(name="max_level")
	private BigDecimal maxLevel;

	@Column(name="min_level")
	private BigDecimal minLevel;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String rackno;

	private BigDecimal rate;

	private String status;

	private BigDecimal taxrate;

	private BigDecimal weight;

	//bi-directional many-to-one association to Bom
	@OneToMany(mappedBy="itemmaster")
	private List<Bom> boms;

	//bi-directional many-to-one association to Bomitem
	@OneToMany(mappedBy="itemmaster")
	private List<Bomitem> bomitems;

	//bi-directional many-to-one association to Customerproductmaster
	@OneToMany(mappedBy="itemmaster")
	private List<Customerproductmaster> customerproductmasters;

	//bi-directional many-to-one association to Itemissuedforjobdtl
	@OneToMany(mappedBy="itemmaster")
	private List<Itemissuedforjobdtl> itemissuedforjobdtls;

	//bi-directional many-to-one association to Itemissuedtl
	@OneToMany(mappedBy="itemmaster")
	private List<Itemissuedtl> itemissuedtls;

	//bi-directional many-to-one association to Hsncode
	@ManyToOne
	@JoinColumn(name="hsncodeid")
	private Hsncode hsncodeBean;

	//bi-directional many-to-one association to Itemcategory
	@ManyToOne
	@JoinColumn(name="itemcatid")
	private Itemcategory itemcategory;

	//bi-directional many-to-one association to Itemgroup
	@ManyToOne
	@JoinColumn(name="itemgroupid")
	private Itemgroup itemgroup;

	//bi-directional many-to-one association to Itemunitmaster
	@ManyToOne
	@JoinColumn(name="conversionunitid")
	private Itemunitmaster itemunitmaster1;

	//bi-directional many-to-one association to Itemunitmaster
	@ManyToOne
	@JoinColumn(name="incomingunitid")
	private Itemunitmaster itemunitmaster2;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemrecdafterjobdtl
	@OneToMany(mappedBy="itemmaster")
	private List<Itemrecdafterjobdtl> itemrecdafterjobdtls;

	//bi-directional many-to-one association to Itemrecddtl
	@OneToMany(mappedBy="itemmaster")
	private List<Itemrecddtl> itemrecddtls;

	//bi-directional many-to-one association to Itemreturndtl
	@OneToMany(mappedBy="itemmaster")
	private List<Itemreturndtl> itemreturndtls;

	//bi-directional many-to-one association to Itemstockadj
	@OneToMany(mappedBy="itemmaster")
	private List<Itemstockadj> itemstockadjs;

	//bi-directional many-to-one association to Prodrecdafterjobdtl
	@OneToMany(mappedBy="itemmaster")
	private List<Prodrecdafterjobdtl> prodrecdafterjobdtls;

	//bi-directional many-to-one association to Supplieritemmaster
	@OneToMany(mappedBy="itemmaster")
	private List<Supplieritemmaster> supplieritemmasters;

	//bi-directional many-to-one association to Vendoritemadj
	@OneToMany(mappedBy="itemmaster")
	private List<Vendoritemadj> vendoritemadjs;

	//bi-directional many-to-one association to Vendoritemmaster
	@OneToMany(mappedBy="itemmaster")
	private List<Vendoritemmaster> vendoritemmasters;

	public Itemmaster() {
	}

	public long getItemid() {
		return this.itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public BigDecimal getConversionfactor() {
		return this.conversionfactor;
	}

	public void setConversionfactor(BigDecimal conversionfactor) {
		this.conversionfactor = conversionfactor;
	}

	public BigDecimal getConversionrate() {
		return this.conversionrate;
	}

	public void setConversionrate(BigDecimal conversionrate) {
		this.conversionrate = conversionrate;
	}

	public String getConversionunit() {
		return this.conversionunit;
	}

	public void setConversionunit(String conversionunit) {
		this.conversionunit = conversionunit;
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

	public String getHsncode() {
		return this.hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
	}

	public String getIncomingunit() {
		return this.incomingunit;
	}

	public void setIncomingunit(String incomingunit) {
		this.incomingunit = incomingunit;
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

	public BigDecimal getMaxLevel() {
		return this.maxLevel;
	}

	public void setMaxLevel(BigDecimal maxLevel) {
		this.maxLevel = maxLevel;
	}

	public BigDecimal getMinLevel() {
		return this.minLevel;
	}

	public void setMinLevel(BigDecimal minLevel) {
		this.minLevel = minLevel;
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

	public String getRackno() {
		return this.rackno;
	}

	public void setRackno(String rackno) {
		this.rackno = rackno;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTaxrate() {
		return this.taxrate;
	}

	public void setTaxrate(BigDecimal taxrate) {
		this.taxrate = taxrate;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public List<Bom> getBoms() {
		return this.boms;
	}

	public void setBoms(List<Bom> boms) {
		this.boms = boms;
	}

	public Bom addBom(Bom bom) {
		getBoms().add(bom);
		bom.setItemmaster(this);

		return bom;
	}

	public Bom removeBom(Bom bom) {
		getBoms().remove(bom);
		bom.setItemmaster(null);

		return bom;
	}

	public List<Bomitem> getBomitems() {
		return this.bomitems;
	}

	public void setBomitems(List<Bomitem> bomitems) {
		this.bomitems = bomitems;
	}

	public Bomitem addBomitem(Bomitem bomitem) {
		getBomitems().add(bomitem);
		bomitem.setItemmaster(this);

		return bomitem;
	}

	public Bomitem removeBomitem(Bomitem bomitem) {
		getBomitems().remove(bomitem);
		bomitem.setItemmaster(null);

		return bomitem;
	}

	public List<Customerproductmaster> getCustomerproductmasters() {
		return this.customerproductmasters;
	}

	public void setCustomerproductmasters(List<Customerproductmaster> customerproductmasters) {
		this.customerproductmasters = customerproductmasters;
	}

	public Customerproductmaster addCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().add(customerproductmaster);
		customerproductmaster.setItemmaster(this);

		return customerproductmaster;
	}

	public Customerproductmaster removeCustomerproductmaster(Customerproductmaster customerproductmaster) {
		getCustomerproductmasters().remove(customerproductmaster);
		customerproductmaster.setItemmaster(null);

		return customerproductmaster;
	}

	public List<Itemissuedforjobdtl> getItemissuedforjobdtls() {
		return this.itemissuedforjobdtls;
	}

	public void setItemissuedforjobdtls(List<Itemissuedforjobdtl> itemissuedforjobdtls) {
		this.itemissuedforjobdtls = itemissuedforjobdtls;
	}

	public Itemissuedforjobdtl addItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().add(itemissuedforjobdtl);
		itemissuedforjobdtl.setItemmaster(this);

		return itemissuedforjobdtl;
	}

	public Itemissuedforjobdtl removeItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().remove(itemissuedforjobdtl);
		itemissuedforjobdtl.setItemmaster(null);

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
		itemissuedtl.setItemmaster(this);

		return itemissuedtl;
	}

	public Itemissuedtl removeItemissuedtl(Itemissuedtl itemissuedtl) {
		getItemissuedtls().remove(itemissuedtl);
		itemissuedtl.setItemmaster(null);

		return itemissuedtl;
	}

	public Hsncode getHsncodeBean() {
		return this.hsncodeBean;
	}

	public void setHsncodeBean(Hsncode hsncodeBean) {
		this.hsncodeBean = hsncodeBean;
	}

	public Itemcategory getItemcategory() {
		return this.itemcategory;
	}

	public void setItemcategory(Itemcategory itemcategory) {
		this.itemcategory = itemcategory;
	}

	public Itemgroup getItemgroup() {
		return this.itemgroup;
	}

	public void setItemgroup(Itemgroup itemgroup) {
		this.itemgroup = itemgroup;
	}

	public Itemunitmaster getItemunitmaster1() {
		return this.itemunitmaster1;
	}

	public void setItemunitmaster1(Itemunitmaster itemunitmaster1) {
		this.itemunitmaster1 = itemunitmaster1;
	}

	public Itemunitmaster getItemunitmaster2() {
		return this.itemunitmaster2;
	}

	public void setItemunitmaster2(Itemunitmaster itemunitmaster2) {
		this.itemunitmaster2 = itemunitmaster2;
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
		itemrecdafterjobdtl.setItemmaster(this);

		return itemrecdafterjobdtl;
	}

	public Itemrecdafterjobdtl removeItemrecdafterjobdtl(Itemrecdafterjobdtl itemrecdafterjobdtl) {
		getItemrecdafterjobdtls().remove(itemrecdafterjobdtl);
		itemrecdafterjobdtl.setItemmaster(null);

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
		itemrecddtl.setItemmaster(this);

		return itemrecddtl;
	}

	public Itemrecddtl removeItemrecddtl(Itemrecddtl itemrecddtl) {
		getItemrecddtls().remove(itemrecddtl);
		itemrecddtl.setItemmaster(null);

		return itemrecddtl;
	}

	public List<Itemreturndtl> getItemreturndtls() {
		return this.itemreturndtls;
	}

	public void setItemreturndtls(List<Itemreturndtl> itemreturndtls) {
		this.itemreturndtls = itemreturndtls;
	}

	public Itemreturndtl addItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().add(itemreturndtl);
		itemreturndtl.setItemmaster(this);

		return itemreturndtl;
	}

	public Itemreturndtl removeItemreturndtl(Itemreturndtl itemreturndtl) {
		getItemreturndtls().remove(itemreturndtl);
		itemreturndtl.setItemmaster(null);

		return itemreturndtl;
	}

	public List<Itemstockadj> getItemstockadjs() {
		return this.itemstockadjs;
	}

	public void setItemstockadjs(List<Itemstockadj> itemstockadjs) {
		this.itemstockadjs = itemstockadjs;
	}

	public Itemstockadj addItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().add(itemstockadj);
		itemstockadj.setItemmaster(this);

		return itemstockadj;
	}

	public Itemstockadj removeItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().remove(itemstockadj);
		itemstockadj.setItemmaster(null);

		return itemstockadj;
	}

	public List<Prodrecdafterjobdtl> getProdrecdafterjobdtls() {
		return this.prodrecdafterjobdtls;
	}

	public void setProdrecdafterjobdtls(List<Prodrecdafterjobdtl> prodrecdafterjobdtls) {
		this.prodrecdafterjobdtls = prodrecdafterjobdtls;
	}

	public Prodrecdafterjobdtl addProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().add(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setItemmaster(this);

		return prodrecdafterjobdtl;
	}

	public Prodrecdafterjobdtl removeProdrecdafterjobdtl(Prodrecdafterjobdtl prodrecdafterjobdtl) {
		getProdrecdafterjobdtls().remove(prodrecdafterjobdtl);
		prodrecdafterjobdtl.setItemmaster(null);

		return prodrecdafterjobdtl;
	}

	public List<Supplieritemmaster> getSupplieritemmasters() {
		return this.supplieritemmasters;
	}

	public void setSupplieritemmasters(List<Supplieritemmaster> supplieritemmasters) {
		this.supplieritemmasters = supplieritemmasters;
	}

	public Supplieritemmaster addSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().add(supplieritemmaster);
		supplieritemmaster.setItemmaster(this);

		return supplieritemmaster;
	}

	public Supplieritemmaster removeSupplieritemmaster(Supplieritemmaster supplieritemmaster) {
		getSupplieritemmasters().remove(supplieritemmaster);
		supplieritemmaster.setItemmaster(null);

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
		vendoritemadj.setItemmaster(this);

		return vendoritemadj;
	}

	public Vendoritemadj removeVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().remove(vendoritemadj);
		vendoritemadj.setItemmaster(null);

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
		vendoritemmaster.setItemmaster(this);

		return vendoritemmaster;
	}

	public Vendoritemmaster removeVendoritemmaster(Vendoritemmaster vendoritemmaster) {
		getVendoritemmasters().remove(vendoritemmaster);
		vendoritemmaster.setItemmaster(null);

		return vendoritemmaster;
	}

}