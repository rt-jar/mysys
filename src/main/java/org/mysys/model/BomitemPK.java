package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bomitems database table.
 * 
 */
@Embeddable
public class BomitemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="bom_id", insertable=false, updatable=false)
	private long bomId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public BomitemPK() {
	}
	public long getBomId() {
		return this.bomId;
	}
	public void setBomId(long bomId) {
		this.bomId = bomId;
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
		if (!(other instanceof BomitemPK)) {
			return false;
		}
		BomitemPK castOther = (BomitemPK)other;
		return 
			(this.bomId == castOther.bomId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.bomId ^ (this.bomId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}