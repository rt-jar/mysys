package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contactemaildetail database table.
 * 
 */
@Entity
@NamedQuery(name="Contactemaildetail.findAll", query="SELECT c FROM Contactemaildetail c")
public class Contactemaildetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long sno;

	private String createdby;

	@Temporal(TemporalType.DATE)
	private Date createddt;

	private String emailbody;

	@Temporal(TemporalType.DATE)
	private Date emaildate;

	private String modifiedby;

	@Temporal(TemporalType.DATE)
	private Date modifieddt;

	private String subject;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="contactid")
	private Contact contact;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Contactemaildetail() {
	}

	public long getSno() {
		return this.sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
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

	public String getEmailbody() {
		return this.emailbody;
	}

	public void setEmailbody(String emailbody) {
		this.emailbody = emailbody;
	}

	public Date getEmaildate() {
		return this.emaildate;
	}

	public void setEmaildate(Date emaildate) {
		this.emaildate = emaildate;
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}