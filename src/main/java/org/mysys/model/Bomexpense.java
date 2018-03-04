package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the bomexpense database table.
 * 
 */
@Entity
@NamedQuery(name="Bomexpense.findAll", query="SELECT b FROM Bomexpense b")
public class Bomexpense implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private BigDecimal cost;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String expense;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	//bi-directional many-to-one association to Bom
	@ManyToOne
	@JoinColumn(name="bom_id")
	private Bom bom;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Bomexpense() {
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
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

	public String getExpense() {
		return this.expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
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

	public Bom getBom() {
		return this.bom;
	}

	public void setBom(Bom bom) {
		this.bom = bom;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}