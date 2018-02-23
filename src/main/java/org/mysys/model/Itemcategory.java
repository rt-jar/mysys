package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemcategory database table.
 * 
 */
@Entity
@NamedQuery(name="Itemcategory.findAll", query="SELECT i FROM Itemcategory i")
public class Itemcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemcatid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemcatname;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="itemcategory")
	private List<Itemmaster> itemmasters;

	//bi-directional many-to-one association to Itemspecmaster
	@OneToMany(mappedBy="itemcategory")
	private List<Itemspecmaster> itemspecmasters;

	public Itemcategory() {
	}

	public long getItemcatid() {
		return this.itemcatid;
	}

	public void setItemcatid(long itemcatid) {
		this.itemcatid = itemcatid;
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

	public String getItemcatname() {
		return this.itemcatname;
	}

	public void setItemcatname(String itemcatname) {
		this.itemcatname = itemcatname;
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

	public List<Itemmaster> getItemmasters() {
		return this.itemmasters;
	}

	public void setItemmasters(List<Itemmaster> itemmasters) {
		this.itemmasters = itemmasters;
	}

	public Itemmaster addItemmaster(Itemmaster itemmaster) {
		getItemmasters().add(itemmaster);
		itemmaster.setItemcategory(this);

		return itemmaster;
	}

	public Itemmaster removeItemmaster(Itemmaster itemmaster) {
		getItemmasters().remove(itemmaster);
		itemmaster.setItemcategory(null);

		return itemmaster;
	}

	public List<Itemspecmaster> getItemspecmasters() {
		return this.itemspecmasters;
	}

	public void setItemspecmasters(List<Itemspecmaster> itemspecmasters) {
		this.itemspecmasters = itemspecmasters;
	}

	public Itemspecmaster addItemspecmaster(Itemspecmaster itemspecmaster) {
		getItemspecmasters().add(itemspecmaster);
		itemspecmaster.setItemcategory(this);

		return itemspecmaster;
	}

	public Itemspecmaster removeItemspecmaster(Itemspecmaster itemspecmaster) {
		getItemspecmasters().remove(itemspecmaster);
		itemspecmaster.setItemcategory(null);

		return itemspecmaster;
	}

}