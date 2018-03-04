package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemrecddtl database table.
 * 
 */
@Embeddable
public class ItemrecddtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ir_id", insertable=false, updatable=false)
	private long irId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemrecddtlPK() {
	}
	public long getIrId() {
		return this.irId;
	}
	public void setIrId(long irId) {
		this.irId = irId;
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
		if (!(other instanceof ItemrecddtlPK)) {
			return false;
		}
		ItemrecddtlPK castOther = (ItemrecddtlPK)other;
		return 
			(this.irId == castOther.irId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.irId ^ (this.irId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}