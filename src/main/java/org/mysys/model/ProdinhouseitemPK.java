package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prodinhouseitem database table.
 * 
 */
@Embeddable
public class ProdinhouseitemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pih_id", insertable=false, updatable=false)
	private long pihId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ProdinhouseitemPK() {
	}
	public long getPihId() {
		return this.pihId;
	}
	public void setPihId(long pihId) {
		this.pihId = pihId;
	}
	public long getItemid() {
		return this.itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProdinhouseitemPK)) {
			return false;
		}
		ProdinhouseitemPK castOther = (ProdinhouseitemPK)other;
		return 
			(this.pihId == castOther.pihId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pihId ^ (this.pihId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}