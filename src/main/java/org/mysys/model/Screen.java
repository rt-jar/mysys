package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the screen database table.
 * 
 */
@Entity
@NamedQuery(name="Screen.findAll", query="SELECT s FROM Screen s")
public class Screen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long screenid;

	private String active;

	private BigDecimal checker;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String screendisplayname;

	private String screenname;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Modulescreen
	@OneToMany(mappedBy="screen")
	private List<Modulescreen> modulescreens;

	//bi-directional many-to-one association to Rolescreenaccess
	@OneToMany(mappedBy="screen")
	private List<Rolescreenaccess> rolescreenaccesses;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Screen() {
	}

	public long getScreenid() {
		return this.screenid;
	}

	public void setScreenid(long screenid) {
		this.screenid = screenid;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public BigDecimal getChecker() {
		return this.checker;
	}

	public void setChecker(BigDecimal checker) {
		this.checker = checker;
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

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public List<Modulescreen> getModulescreens() {
		return this.modulescreens;
	}

	public void setModulescreens(List<Modulescreen> modulescreens) {
		this.modulescreens = modulescreens;
	}

	public Modulescreen addModulescreen(Modulescreen modulescreen) {
		getModulescreens().add(modulescreen);
		modulescreen.setScreen(this);

		return modulescreen;
	}

	public Modulescreen removeModulescreen(Modulescreen modulescreen) {
		getModulescreens().remove(modulescreen);
		modulescreen.setScreen(null);

		return modulescreen;
	}

	public List<Rolescreenaccess> getRolescreenaccesses() {
		return this.rolescreenaccesses;
	}

	public void setRolescreenaccesses(List<Rolescreenaccess> rolescreenaccesses) {
		this.rolescreenaccesses = rolescreenaccesses;
	}

	public Rolescreenaccess addRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().add(rolescreenaccess);
		rolescreenaccess.setScreen(this);

		return rolescreenaccess;
	}

	public Rolescreenaccess removeRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().remove(rolescreenaccess);
		rolescreenaccess.setScreen(null);

		return rolescreenaccess;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}