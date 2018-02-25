package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the displist database table.
 * 
 */
@Entity
@NamedQuery(name="Displist.findAll", query="SELECT d FROM Displist d")
public class Displist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long dispid;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_dt")
	private Date createdDt;

	private String dispdesc;

	private String dispname;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="modified_dt")
	private Date modifiedDt;

	private String sortclause;

	private String tablename;

	private String whereclause;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Displistcol
	@OneToMany(mappedBy="displist",fetch=FetchType.EAGER)
	private List<Displistcol> displistcols;

	public Displist() {
	}

	public long getDispid() {
		return this.dispid;
	}

	public void setDispid(long dispid) {
		this.dispid = dispid;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getDispdesc() {
		return this.dispdesc;
	}

	public void setDispdesc(String dispdesc) {
		this.dispdesc = dispdesc;
	}

	public String getDispname() {
		return this.dispname;
	}

	public void setDispname(String dispname) {
		this.dispname = dispname;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDt() {
		return this.modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	public String getSortclause() {
		return this.sortclause;
	}

	public void setSortclause(String sortclause) {
		this.sortclause = sortclause;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getWhereclause() {
		return this.whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Displistcol> getDisplistcols() {
		return this.displistcols;
	}

	public void setDisplistcols(List<Displistcol> displistcols) {
		this.displistcols = displistcols;
	}

	public Displistcol addDisplistcol(Displistcol displistcol) {
		getDisplistcols().add(displistcol);
		displistcol.setDisplist(this);

		return displistcol;
	}

	public Displistcol removeDisplistcol(Displistcol displistcol) {
		getDisplistcols().remove(displistcol);
		displistcol.setDisplist(null);

		return displistcol;
	}

}