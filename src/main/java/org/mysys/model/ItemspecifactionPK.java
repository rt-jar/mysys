package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemspecifaction database table.
 * 
 */
@Embeddable
public class ItemspecifactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long itemid;

	@Column(insertable=false, updatable=false)
	private long itemspecid;

	public ItemspecifactionPK() {
	}
	public long getItemid() {
		return this.itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
	public long getItemspecid() {
		return this.itemspecid;
	}
	public void setItemspecid(long itemspecid) {
		this.itemspecid = itemspecid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemspecifactionPK)) {
			return false;
		}
		ItemspecifactionPK castOther = (ItemspecifactionPK)other;
		return 
			(this.itemid == castOther.itemid)
			&& (this.itemspecid == castOther.itemspecid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		hash = hash * prime + ((int) (this.itemspecid ^ (this.itemspecid >>> 32)));
		
		return hash;
	}
}