package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long moduleid;

	private String active;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String moduledisplayname;

	private String modulename;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Modulescreen
	@OneToMany(mappedBy="module")
	private List<Modulescreen> modulescreens;

	public Module() {
	}

	public long getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(long moduleid) {
		this.moduleid = moduleid;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
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

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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

	public String getModuledisplayname() {
		return this.moduledisplayname;
	}

	public void setModuledisplayname(String moduledisplayname) {
		this.moduledisplayname = moduledisplayname;
	}

	public String getModulename() {
		return this.modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Modulescreen> getModulescreens() {
		return this.modulescreens;
	}

	public void setModulescreens(List<Modulescreen> modulescreens) {
		this.modulescreens = modulescreens;
	}

	public Modulescreen addModulescreen(Modulescreen modulescreen) {
		getModulescreens().add(modulescreen);
		modulescreen.setModule(this);

		return modulescreen;
	}

	public Modulescreen removeModulescreen(Modulescreen modulescreen) {
		getModulescreens().remove(modulescreen);
		modulescreen.setModule(null);

		return modulescreen;
	}

}