package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemopenstockdtl database table.
 * 
 */
@Embeddable
public class ItemopenstockdtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ios_id")
	private long iosId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemopenstockdtlPK() {
	}
	public long getIosId() {
		return this.iosId;
	}
	public void setIosId(long iosId) {
		this.iosId = iosId;
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
		if (!(other instanceof ItemopenstockdtlPK)) {
			return false;
		}
		ItemopenstockdtlPK castOther = (ItemopenstockdtlPK)other;
		return 
			(this.iosId == castOther.iosId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.iosId ^ (this.iosId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}