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

	@Column(insertable=false, updatable=false)
	private long challanno;

	@Column(insertable=false, updatable=false)
	private long itemid;

	public ItemreturndtlPK() {
	}
	public long getChallanno() {
		return this.challanno;
	}
	public void setChallanno(long challanno) {
		this.challanno = challanno;
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
			(this.challanno == castOther.challanno)
			&& (this.itemid == castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.challanno ^ (this.challanno >>> 32)));
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		
		return hash;
	}
}