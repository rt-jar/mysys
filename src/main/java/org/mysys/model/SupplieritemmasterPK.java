package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the supplieritemmaster database table.
 * 
 */
@Embeddable
public class SupplieritemmasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long itemid;

	@Column(insertable=false, updatable=false)
	private long contactid;

	@Temporal(TemporalType.DATE)
	private java.util.Date fromdate;

	public SupplieritemmasterPK() {
	}
	public long getItemid() {
		return this.itemid;
	}
	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
	public long getContactid() {
		return this.contactid;
	}
	public void setContactid(long contactid) {
		this.contactid = contactid;
	}
	public java.util.Date getFromdate() {
		return this.fromdate;
	}
	public void setFromdate(java.util.Date fromdate) {
		this.fromdate = fromdate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupplieritemmasterPK)) {
			return false;
		}
		SupplieritemmasterPK castOther = (SupplieritemmasterPK)other;
		return 
			(this.itemid == castOther.itemid)
			&& (this.contactid == castOther.contactid)
			&& this.fromdate.equals(castOther.fromdate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.itemid ^ (this.itemid >>> 32)));
		hash = hash * prime + ((int) (this.contactid ^ (this.contactid >>> 32)));
		hash = hash * prime + this.fromdate.hashCode();
		
		return hash;
	}
}