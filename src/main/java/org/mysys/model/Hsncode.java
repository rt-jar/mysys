package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the hsncode database table.
 * 
 */
@Entity
@NamedQuery(name="Hsncode.findAll", query="SELECT h FROM Hsncode h")
public class Hsncode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String hsncode;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private BigDecimal taxrate;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemissuedforjobdtl
	@OneToMany(mappedBy="hsncodeBean")
	private List<Itemissuedforjobdtl> itemissuedforjobdtls;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="hsncodeBean")
	private List<Itemmaster> itemmasters;

	public Hsncode() {
	}

	public String getHsncode() {
		return this.hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
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

	public BigDecimal getTaxrate() {
		return this.taxrate;
	}

	public void setTaxrate(BigDecimal taxrate) {
		this.taxrate = taxrate;
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
		itemissuedforjobdtl.setHsncodeBean(this);

		return itemissuedforjobdtl;
	}

	public Itemissuedforjobdtl removeItemissuedforjobdtl(Itemissuedforjobdtl itemissuedforjobdtl) {
		getItemissuedforjobdtls().remove(itemissuedforjobdtl);
		itemissuedforjobdtl.setHsncodeBean(null);

		return itemissuedforjobdtl;
	}

	public List<Itemmaster> getItemmasters() {
		return this.itemmasters;
	}

	public void setItemmasters(List<Itemmaster> itemmasters) {
		this.itemmasters = itemmasters;
	}

	public Itemmaster addItemmaster(Itemmaster itemmaster) {
		getItemmasters().add(itemmaster);
		itemmaster.setHsncodeBean(this);

		return itemmaster;
	}

	public Itemmaster removeItemmaster(Itemmaster itemmaster) {
		getItemmasters().remove(itemmaster);
		itemmaster.setHsncodeBean(null);

		return itemmaster;
	}

}