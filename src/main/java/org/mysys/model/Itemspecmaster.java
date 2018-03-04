package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the itemspecmaster database table.
 * 
 */
@Entity
@NamedQuery(name="Itemspecmaster.findAll", query="SELECT i FROM Itemspecmaster i")
public class Itemspecmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String itemspecname;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Itemspecifaction
	@OneToMany(mappedBy="itemspecmaster")
	private List<Itemspecifaction> itemspecifactions;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Itemspecmaster() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public String getItemspecname() {
		return this.itemspecname;
	}

	public void setItemspecname(String itemspecname) {
		this.itemspecname = itemspecname;
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

	public List<Itemspecifaction> getItemspecifactions() {
		return this.itemspecifactions;
	}

	public void setItemspecifactions(List<Itemspecifaction> itemspecifactions) {
		this.itemspecifactions = itemspecifactions;
	}

	public Itemspecifaction addItemspecifaction(Itemspecifaction itemspecifaction) {
		getItemspecifactions().add(itemspecifaction);
		itemspecifaction.setItemspecmaster(this);

		return itemspecifaction;
	}

	public Itemspecifaction removeItemspecifaction(Itemspecifaction itemspecifaction) {
		getItemspecifactions().remove(itemspecifaction);
		itemspecifaction.setItemspecmaster(null);

		return itemspecifaction;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}