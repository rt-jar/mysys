package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the statemaster database table.
 * 
 */
@Entity
@NamedQuery(name="Statemaster.findAll", query="SELECT s FROM Statemaster s")
public class Statemaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long stateid;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String gstcode;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String statename;

	private String tin;

	//bi-directional many-to-one association to Citymaster
	@OneToMany(mappedBy="statemaster", fetch=FetchType.EAGER)
	private List<Citymaster> citymasters;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Statemaster() {
	}

	public long getStateid() {
		return this.stateid;
	}

	public void setStateid(long stateid) {
		this.stateid = stateid;
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

	public String getGstcode() {
		return this.gstcode;
	}

	public void setGstcode(String gstcode) {
		this.gstcode = gstcode;
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

	public String getStatename() {
		return this.statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getTin() {
		return this.tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public List<Citymaster> getCitymasters() {
		return this.citymasters;
	}

	public void setCitymasters(List<Citymaster> citymasters) {
		this.citymasters = citymasters;
	}

	public Citymaster addCitymaster(Citymaster citymaster) {
		getCitymasters().add(citymaster);
		citymaster.setStatemaster(this);

		return citymaster;
	}

	public Citymaster removeCitymaster(Citymaster citymaster) {
		getCitymasters().remove(citymaster);
		citymaster.setStatemaster(null);

		return citymaster;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}