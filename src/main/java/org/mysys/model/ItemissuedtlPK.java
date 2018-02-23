package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the itemissuedtl database table.
 * 
 */
@Embeddable
public class ItemissuedtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long issueno;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemissuedtlPK() {
	}
	public long getIssueno() {
		return this.issueno;
	}
	public void setIssueno(long issueno) {
		this.issueno = issueno;
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
		if (!(other instanceof ItemissuedtlPK)) {
			return false;
		}
		ItemissuedtlPK castOther = (ItemissuedtlPK)other;
		return 
			(this.issueno == castOther.issueno)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.issueno ^ (this.issueno >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}