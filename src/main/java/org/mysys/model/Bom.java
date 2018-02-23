package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the bom database table.
 * 
 */
@Entity
@NamedQuery(name="Bom.findAll", query="SELECT b FROM Bom b")
public class Bom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bomno;

	@Temporal(TemporalType.DATE)
	private Date bomdate;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String proddesc;

	private String productcode;

	private String produnit;

	private String remarks;

	private BigDecimal totalitemcost;

	private BigDecimal totalprodexpense;

	//bi-directional many-to-one association to Itemmaster
	@ManyToOne
	@JoinColumn(name="productid")
	private Itemmaster itemmaster;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Bomexpense
	@OneToMany(mappedBy="bom")
	private List<Bomexpense> bomexpenses;

	//bi-directional many-to-one association to Bomitem
	@OneToMany(mappedBy="bom")
	private List<Bomitem> bomitems;

	public Bom() {
	}

	public long getBomno() {
		return this.bomno;
	}

	public void setBomno(long bomno) {
		this.bomno = bomno;
	}

	public Date getBomdate() {
		return this.bomdate;
	}

	public void setBomdate(Date bomdate) {
		this.bomdate = bomdate;
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

	public String getProddesc() {
		return this.proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProdunit() {
		return this.produnit;
	}

	public void setProdunit(String produnit) {
		this.produnit = produnit;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getTotalitemcost() {
		return this.totalitemcost;
	}

	public void setTotalitemcost(BigDecimal totalitemcost) {
		this.totalitemcost = totalitemcost;
	}

	public BigDecimal getTotalprodexpense() {
		return this.totalprodexpense;
	}

	public void setTotalprodexpense(BigDecimal totalprodexpense) {
		this.totalprodexpense = totalprodexpense;
	}

	public Itemmaster getItemmaster() {
		return this.itemmaster;
	}

	public void setItemmaster(Itemmaster itemmaster) {
		this.itemmaster = itemmaster;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Bomexpense> getBomexpenses() {
		return this.bomexpenses;
	}

	public void setBomexpenses(List<Bomexpense> bomexpenses) {
		this.bomexpenses = bomexpenses;
	}

	public Bomexpense addBomexpens(Bomexpense bomexpens) {
		getBomexpenses().add(bomexpens);
		bomexpens.setBom(this);

		return bomexpens;
	}

	public Bomexpense removeBomexpens(Bomexpense bomexpens) {
		getBomexpenses().remove(bomexpens);
		bomexpens.setBom(null);

		return bomexpens;
	}

	public List<Bomitem> getBomitems() {
		return this.bomitems;
	}

	public void setBomitems(List<Bomitem> bomitems) {
		this.bomitems = bomitems;
	}

	public Bomitem addBomitem(Bomitem bomitem) {
		getBomitems().add(bomitem);
		bomitem.setBom(this);

		return bomitem;
	}

	public Bomitem removeBomitem(Bomitem bomitem) {
		getBomitems().remove(bomitem);
		bomitem.setBom(null);

		return bomitem;
	}

}