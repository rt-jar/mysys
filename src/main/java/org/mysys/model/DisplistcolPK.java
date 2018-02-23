package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the displistcol database table.
 * 
 */
@Embeddable
public class DisplistcolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long dispid;

	private long columnid;

	public DisplistcolPK() {
	}
	public long getDispid() {
		return this.dispid;
	}
	public void setDispid(long dispid) {
		this.dispid = dispid;
	}
	public long getColumnid() {
		return this.columnid;
	}
	public void setColumnid(long columnid) {
		this.columnid = columnid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DisplistcolPK)) {
			return false;
		}
		DisplistcolPK castOther = (DisplistcolPK)other;
		return 
			(this.dispid == castOther.dispid)
			&& (this.columnid == castOther.columnid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.dispid ^ (this.dispid >>> 32)));
		hash = hash * prime + ((int) (this.columnid ^ (this.columnid >>> 32)));
		
		return hash;
	}
}