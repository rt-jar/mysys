package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vendoritemadjdtl database table.
 * 
 */
@Embeddable
public class VendoritemadjdtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="via_id")
	private long viaId;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public VendoritemadjdtlPK() {
	}
	public long getViaId() {
		return this.viaId;
	}
	public void setViaId(long viaId) {
		this.viaId = viaId;
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
		if (!(other instanceof VendoritemadjdtlPK)) {
			return false;
		}
		VendoritemadjdtlPK castOther = (VendoritemadjdtlPK)other;
		return 
			(this.viaId == castOther.viaId)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.viaId ^ (this.viaId >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}