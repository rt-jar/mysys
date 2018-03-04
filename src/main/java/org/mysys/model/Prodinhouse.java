package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the prodinhouse database table.
 * 
 */
@Entity
@NamedQuery(name="Prodinhouse.findAll", query="SELECT p FROM Prodinhouse p")
public class Prodinhouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pih_id")
	private long pihId;

	private String acctyear;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	@Temporal(TemporalType.DATE)
	private Date proddate;

	private BigDecimal prodno;

	private String remarks;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department department;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Prodinhouseitem
	@OneToMany(mappedBy="prodinhouse")
	private List<Prodinhouseitem> prodinhouseitems;

	//bi-directional many-to-one association to Prodinhouseprod
	@OneToMany(mappedBy="prodinhouse")
	private List<Prodinhouseprod> prodinhouseprods;

	public Prodinhouse() {
	}

	public long getPihId() {
		return this.pihId;
	}

	public void setPihId(long pihId) {
		this.pihId = pihId;
	}

	public String getAcctyear() {
		return this.acctyear;
	}

	public void setAcctyear(String acctyear) {
		this.acctyear = acctyear;
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

	public Date getProddate() {
		return this.proddate;
	}

	public void setProddate(Date proddate) {
		this.proddate = proddate;
	}

	public BigDecimal getProdno() {
		return this.prodno;
	}

	public void setProdno(BigDecimal prodno) {
		this.prodno = prodno;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Prodinhouseitem> getProdinhouseitems() {
		return this.prodinhouseitems;
	}

	public void setProdinhouseitems(List<Prodinhouseitem> prodinhouseitems) {
		this.prodinhouseitems = prodinhouseitems;
	}

	public Prodinhouseitem addProdinhouseitem(Prodinhouseitem prodinhouseitem) {
		getProdinhouseitems().add(prodinhouseitem);
		prodinhouseitem.setProdinhouse(this);

		return prodinhouseitem;
	}

	public Prodinhouseitem removeProdinhouseitem(Prodinhouseitem prodinhouseitem) {
		getProdinhouseitems().remove(prodinhouseitem);
		prodinhouseitem.setProdinhouse(null);

		return prodinhouseitem;
	}

	public List<Prodinhouseprod> getProdinhouseprods() {
		return this.prodinhouseprods;
	}

	public void setProdinhouseprods(List<Prodinhouseprod> prodinhouseprods) {
		this.prodinhouseprods = prodinhouseprods;
	}

	public Prodinhouseprod addProdinhouseprod(Prodinhouseprod prodinhouseprod) {
		getProdinhouseprods().add(prodinhouseprod);
		prodinhouseprod.setProdinhouse(this);

		return prodinhouseprod;
	}

	public Prodinhouseprod removeProdinhouseprod(Prodinhouseprod prodinhouseprod) {
		getProdinhouseprods().remove(prodinhouseprod);
		prodinhouseprod.setProdinhouse(null);

		return prodinhouseprod;
	}

}