package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the modulescreen database table.
 * 
 */
@Entity
@NamedQuery(name="Modulescreen.findAll", query="SELECT m FROM Modulescreen m")
public class Modulescreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long modulescreenid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String moduledisplayname;

	private String modulename;

	private String screendisplayname;

	private String screenname;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="moduleid")
	private Module module;

	//bi-directional many-to-one association to Screen
	@ManyToOne
	@JoinColumn(name="screenid")
	private Screen screen;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Modulescreen() {
	}

	public long getModulescreenid() {
		return this.modulescreenid;
	}

	public void setModulescreenid(long modulescreenid) {
		this.modulescreenid = modulescreenid;
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

	public String getScreendisplayname() {
		return this.screendisplayname;
	}

	public void setScreendisplayname(String screendisplayname) {
		this.screendisplayname = screendisplayname;
	}

	public String getScreenname() {
		return this.screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Screen getScreen() {
		return this.screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}