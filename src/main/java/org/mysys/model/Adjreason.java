package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the adjreason database table.
 * 
 */
@Entity
@NamedQuery(name="Adjreason.findAll", query="SELECT a FROM Adjreason a")
public class Adjreason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String adjreason;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemstockadj
	@OneToMany(mappedBy="adjreasonBean")
	private List<Itemstockadj> itemstockadjs;

	//bi-directional many-to-one association to Vendoritemadj
	@OneToMany(mappedBy="adjreasonBean")
	private List<Vendoritemadj> vendoritemadjs;

	public Adjreason() {
	}

	public String getAdjreason() {
		return this.adjreason;
	}

	public void setAdjreason(String adjreason) {
		this.adjreason = adjreason;
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

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Itemstockadj> getItemstockadjs() {
		return this.itemstockadjs;
	}

	public void setItemstockadjs(List<Itemstockadj> itemstockadjs) {
		this.itemstockadjs = itemstockadjs;
	}

	public Itemstockadj addItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().add(itemstockadj);
		itemstockadj.setAdjreasonBean(this);

		return itemstockadj;
	}

	public Itemstockadj removeItemstockadj(Itemstockadj itemstockadj) {
		getItemstockadjs().remove(itemstockadj);
		itemstockadj.setAdjreasonBean(null);

		return itemstockadj;
	}

	public List<Vendoritemadj> getVendoritemadjs() {
		return this.vendoritemadjs;
	}

	public void setVendoritemadjs(List<Vendoritemadj> vendoritemadjs) {
		this.vendoritemadjs = vendoritemadjs;
	}

	public Vendoritemadj addVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().add(vendoritemadj);
		vendoritemadj.setAdjreasonBean(this);

		return vendoritemadj;
	}

	public Vendoritemadj removeVendoritemadj(Vendoritemadj vendoritemadj) {
		getVendoritemadjs().remove(vendoritemadj);
		vendoritemadj.setAdjreasonBean(null);

		return vendoritemadj;
	}

}