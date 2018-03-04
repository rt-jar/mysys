package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemgroup database table.
 * 
 */
@Entity
@NamedQuery(name="Itemgroup.findAll", query="SELECT i FROM Itemgroup i")
public class Itemgroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemgroupid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemgroupname;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Itemmaster
	@OneToMany(mappedBy="itemgroup")
	private List<Itemmaster> itemmasters;

	public Itemgroup() {
	}

	public long getItemgroupid() {
		return this.itemgroupid;
	}

	public void setItemgroupid(long itemgroupid) {
		this.itemgroupid = itemgroupid;
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

	public String getItemgroupname() {
		return this.itemgroupname;
	}

	public void setItemgroupname(String itemgroupname) {
		this.itemgroupname = itemgroupname;
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
		itemmaster.setItemgroup(this);

		return itemmaster;
	}

	public Itemmaster removeItemmaster(Itemmaster itemmaster) {
		getItemmasters().remove(itemmaster);
		itemmaster.setItemgroup(null);

		return itemmaster;
	}

}