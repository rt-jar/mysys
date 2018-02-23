package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rolescreenaccess database table.
 * 
 */
@Embeddable
public class RolescreenaccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long roleid;

	@Column(insertable=false, updatable=false)
	private long screenid;

	private long accesslevel;

	public RolescreenaccessPK() {
	}
	public long getRoleid() {
		return this.roleid;
	}
	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}
	public long getScreenid() {
		return this.screenid;
	}
	public void setScreenid(long screenid) {
		this.screenid = screenid;
	}
	public long getAccesslevel() {
		return this.accesslevel;
	}
	public void setAccesslevel(long accesslevel) {
		this.accesslevel = accesslevel;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolescreenaccessPK)) {
			return false;
		}
		RolescreenaccessPK castOther = (RolescreenaccessPK)other;
		return 
			(this.roleid == castOther.roleid)
			&& (this.screenid == castOther.screenid)
			&& (this.accesslevel == castOther.accesslevel);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleid ^ (this.roleid >>> 32)));
		hash = hash * prime + ((int) (this.screenid ^ (this.screenid >>> 32)));
		hash = hash * prime + ((int) (this.accesslevel ^ (this.accesslevel >>> 32)));
		
		return hash;
	}
}