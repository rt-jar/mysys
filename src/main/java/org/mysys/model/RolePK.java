package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rolescreenaccess database table.
 * 
 */
@Embeddable
public class RolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long roleid;

	
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
		if (!(other instanceof RolePK)) {
			return false;
		}
		RolePK castOther = (RolePK)other;
		return 
			(this.roleid == castOther.roleid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleid ^ (this.roleid >>> 32)));
		return hash;
	}
}