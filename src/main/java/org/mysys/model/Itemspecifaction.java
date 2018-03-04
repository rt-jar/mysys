package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
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

	private BigDecimal displayseq;

	private String itemspecvalue;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="itemid",insertable=false,updatable=false)
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Itemspecmaster
	@ManyToOne
	@JoinColumn(name="itemspecid",insertable=false,updatable=false)
	private Itemspecmaster itemspecmaster;

	//bi-directional many-to-one association to Site
	@JsonIgnore
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

	public BigDecimal getDisplayseq() {
		return this.displayseq;
	}

	public void setDisplayseq(BigDecimal displayseq) {
		this.displayseq = displayseq;
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

	public Itemmaster getItemmaster() {
		return this.itemmaster;
	}

	public void setItemmaster(Itemmaster itemmaster) {
		this.itemmaster = itemmaster;
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