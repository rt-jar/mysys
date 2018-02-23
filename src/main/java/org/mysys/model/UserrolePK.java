package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the userrole database table.
 * 
 */
@Embeddable
public class UserrolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long userid;

	@Column(insertable=false, updatable=false)
	private long roleid;

	public UserrolePK() {
	}
	public long getUserid() {
		return this.userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getRoleid() {
		return this.roleid;
	}
	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserrolePK)) {
			return false;
		}
		UserrolePK castOther = (UserrolePK)other;
		return 
			(this.userid == castOther.userid)
			&& (this.roleid == castOther.roleid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.userid ^ (this.userid >>> 32)));
		hash = hash * prime + ((int) (this.roleid ^ (this.roleid >>> 32)));
		
		return hash;
	}
}