package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemunitmaster database table.
 * 
 */
@Entity
@NamedQuery(name="Itemunitmaster.findAll", query="SELECT i FROM Itemunitmaster i")
public class Itemunitmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long unitid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String unitdisplayformat;

	private String unitname;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="itemunitmaster1")
	private List<Itemmaster> itemmasters1;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="itemunitmaster2")
	private List<Itemmaster> itemmasters2;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemunitmaster() {
	}

	public long getUnitid() {
		return this.unitid;
	}

	public void setUnitid(long unitid) {
		this.unitid = unitid;
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

	public String getUnitdisplayformat() {
		return this.unitdisplayformat;
	}

	public void setUnitdisplayformat(String unitdisplayformat) {
		this.unitdisplayformat = unitdisplayformat;
	}

	public String getUnitname() {
		return this.unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public List<Itemmaster> getItemmasters1() {
		return this.itemmasters1;
	}

	public void setItemmasters1(List<Itemmaster> itemmasters1) {
		this.itemmasters1 = itemmasters1;
	}

	public Itemmaster addItemmasters1(Itemmaster itemmasters1) {
		getItemmasters1().add(itemmasters1);
		itemmasters1.setItemunitmaster1(this);

		return itemmasters1;
	}

	public Itemmaster removeItemmasters1(Itemmaster itemmasters1) {
		getItemmasters1().remove(itemmasters1);
		itemmasters1.setItemunitmaster1(null);

		return itemmasters1;
	}

	public List<Itemmaster> getItemmasters2() {
		return this.itemmasters2;
	}

	public void setItemmasters2(List<Itemmaster> itemmasters2) {
		this.itemmasters2 = itemmasters2;
	}

	public Itemmaster addItemmasters2(Itemmaster itemmasters2) {
		getItemmasters2().add(itemmasters2);
		itemmasters2.setItemunitmaster2(this);

		return itemmasters2;
	}

	public Itemmaster removeItemmasters2(Itemmaster itemmasters2) {
		getItemmasters2().remove(itemmasters2);
		itemmasters2.setItemunitmaster2(null);

		return itemmasters2;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}