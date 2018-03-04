package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String rolename;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	private String status;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Rolescreenaccess
	@OneToMany(mappedBy="role")
	private List<Rolescreenaccess> rolescreenaccesses;

	//bi-directional many-to-one association to Userrole
	@OneToMany(mappedBy="role")
	private List<Userrole> userroles;

	public Role() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Rolescreenaccess> getRolescreenaccesses() {
		return this.rolescreenaccesses;
	}

	public void setRolescreenaccesses(List<Rolescreenaccess> rolescreenaccesses) {
		this.rolescreenaccesses = rolescreenaccesses;
	}

	public Rolescreenaccess addRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().add(rolescreenaccess);
		rolescreenaccess.setRole(this);

		return rolescreenaccess;
	}

	public Rolescreenaccess removeRolescreenaccess(Rolescreenaccess rolescreenaccess) {
		getRolescreenaccesses().remove(rolescreenaccess);
		rolescreenaccess.setRole(null);

		return rolescreenaccess;
	}

	public List<Userrole> getUserroles() {
		return this.userroles;
	}

	public void setUserroles(List<Userrole> userroles) {
		this.userroles = userroles;
	}

	public Userrole addUserrole(Userrole userrole) {
		getUserroles().add(userrole);
		userrole.setRole(this);

		return userrole;
	}

	public Userrole removeUserrole(Userrole userrole) {
		getUserroles().remove(userrole);
		userrole.setRole(null);

		return userrole;
	}

}