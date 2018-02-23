package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the itemspecifaction database table.
 * 
 */
@Entity
@NamedQuery(name="Itemspecifaction.findAll", query="SELECT i FROM Itemspecifaction i")
public class Itemspecifaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemspecifactionPK id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemcode;

	private String itemspecname;

	private String itemspecvalue;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Itemspecmaster
	@ManyToOne
	@JoinColumn(name="itemspecid",insertable=false,updatable=false)
	private Itemspecmaster itemspecmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemspecifaction() {
	}

	public ItemspecifactionPK getId() {
		return this.id;
	}

	public void setId(ItemspecifactionPK id) {
		this.id = id;
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

	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemspecname() {
		return this.itemspecname;
	}

	public void setItemspecname(String itemspecname) {
		this.itemspecname = itemspecname;
	}

	public String getItemspecvalue() {
		return this.itemspecvalue;
	}

	public void setItemspecvalue(String itemspecvalue) {
		this.itemspecvalue = itemspecvalue;
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

	public Itemspecmaster getItemspecmaster() {
		return this.itemspecmaster;
	}

	public void setItemspecmaster(Itemspecmaster itemspecmaster) {
		this.itemspecmaster = itemspecmaster;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}