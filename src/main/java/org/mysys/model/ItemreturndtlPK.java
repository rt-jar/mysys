package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemreturndtl database table.
 * 
 */
@Embeddable
public class ItemreturndtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="itr_id", insertable=false, updatable=false)
	private long itrId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemreturndtlPK() {
	}
	public long getItrId() {
		return this.itrId;
	}
	public void setItrId(long itrId) {
		this.itrId = itrId;
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
		if (!(other instanceof ItemreturndtlPK)) {
			return false;
		}
		ItemreturndtlPK castOther = (ItemreturndtlPK)other;
		return 
			(this.itrId == castOther.itrId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itrId ^ (this.itrId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}