package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemrecdafterjobdtl database table.
 * 
 */
@Embeddable
public class ItemrecdafterjobdtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="irj_id", insertable=false, updatable=false)
	private long irjId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemrecdafterjobdtlPK() {
	}
	public long getIrjId() {
		return this.irjId;
	}
	public void setIrjId(long irjId) {
		this.irjId = irjId;
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
		if (!(other instanceof ItemrecdafterjobdtlPK)) {
			return false;
		}
		ItemrecdafterjobdtlPK castOther = (ItemrecdafterjobdtlPK)other;
		return 
			(this.irjId == castOther.irjId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.irjId ^ (this.irjId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}