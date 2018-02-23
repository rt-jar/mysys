package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the emailtemplate database table.
 * 
 */
@Entity
@NamedQuery(name="Emailtemplate.findAll", query="SELECT e FROM Emailtemplate e")
public class Emailtemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long templateid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String status;

	private String templatebody;

	private String templateclass;

	private String templatename;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Emailtemplate() {
	}

	public long getTemplateid() {
		return this.templateid;
	}

	public void setTemplateid(long templateid) {
		this.templateid = templateid;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplatebody() {
		return this.templatebody;
	}

	public void setTemplatebody(String templatebody) {
		this.templatebody = templatebody;
	}

	public String getTemplateclass() {
		return this.templateclass;
	}

	public void setTemplateclass(String templateclass) {
		this.templateclass = templateclass;
	}

	public String getTemplatename() {
		return this.templatename;
	}

	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}