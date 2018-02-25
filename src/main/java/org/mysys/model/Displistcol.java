package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the displistcol database table.
 * 
 */
@Entity
@NamedQuery(name="Displistcol.findAll", query="SELECT d FROM Displistcol d")
public class Displistcol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DisplistcolPK id;

	private String colformat;

	private String colorencoding;

	private String columnalias;

	private String columncateg;

	private String columnname;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_dt")
	private Date createdDt;

	private BigDecimal datalength;

	private BigDecimal dataprecision;

	private BigDecimal datascale;

	private String datatype;

	private String defaultcol;

	private String description;

	private String displayname;

	private String dispmask;

	private String dispvalifnull;

	private BigDecimal dispwidth;

	private BigDecimal editable;

	private String hidden;

	private BigDecimal langcode;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="modified_dt")
	private Date modifiedDt;

	private String nullable;

	private String sortable;

	private String sortorder;

	private String uniquekey;

	//bi-directional many-to-one association to Displist
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="dispid",insertable=false,updatable=false)
	private Displist displist;

	//bi-directional many-to-one association to Site
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Displistcol() {
	}

	public DisplistcolPK getId() {
		return this.id;
	}

	public void setId(DisplistcolPK id) {
		this.id = id;
	}

	public String getColformat() {
		return this.colformat;
	}

	public void setColformat(String colformat) {
		this.colformat = colformat;
	}

	public String getColorencoding() {
		return this.colorencoding;
	}

	public void setColorencoding(String colorencoding) {
		this.colorencoding = colorencoding;
	}

	public String getColumnalias() {
		return this.columnalias;
	}

	public void setColumnalias(String columnalias) {
		this.columnalias = columnalias;
	}

	public String getColumncateg() {
		return this.columncateg;
	}

	public void setColumncateg(String columncateg) {
		this.columncateg = columncateg;
	}

	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
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

	public BigDecimal getDatalength() {
		return this.datalength;
	}

	public void setDatalength(BigDecimal datalength) {
		this.datalength = datalength;
	}

	public BigDecimal getDataprecision() {
		return this.dataprecision;
	}

	public void setDataprecision(BigDecimal dataprecision) {
		this.dataprecision = dataprecision;
	}

	public BigDecimal getDatascale() {
		return this.datascale;
	}

	public void setDatascale(BigDecimal datascale) {
		this.datascale = datascale;
	}

	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getDefaultcol() {
		return this.defaultcol;
	}

	public void setDefaultcol(String defaultcol) {
		this.defaultcol = defaultcol;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getDispmask() {
		return this.dispmask;
	}

	public void setDispmask(String dispmask) {
		this.dispmask = dispmask;
	}

	public String getDispvalifnull() {
		return this.dispvalifnull;
	}

	public void setDispvalifnull(String dispvalifnull) {
		this.dispvalifnull = dispvalifnull;
	}

	public BigDecimal getDispwidth() {
		return this.dispwidth;
	}

	public void setDispwidth(BigDecimal dispwidth) {
		this.dispwidth = dispwidth;
	}

	public BigDecimal getEditable() {
		return this.editable;
	}

	public void setEditable(BigDecimal editable) {
		this.editable = editable;
	}

	public String getHidden() {
		return this.hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public BigDecimal getLangcode() {
		return this.langcode;
	}

	public void setLangcode(BigDecimal langcode) {
		this.langcode = langcode;
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

	public String getNullable() {
		return this.nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public String getSortable() {
		return this.sortable;
	}

	public void setSortable(String sortable) {
		this.sortable = sortable;
	}

	public String getSortorder() {
		return this.sortorder;
	}

	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}

	public String getUniquekey() {
		return this.uniquekey;
	}

	public void setUniquekey(String uniquekey) {
		this.uniquekey = uniquekey;
	}

	public Displist getDisplist() {
		return this.displist;
	}

	public void setDisplist(Displist displist) {
		this.displist = displist;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}