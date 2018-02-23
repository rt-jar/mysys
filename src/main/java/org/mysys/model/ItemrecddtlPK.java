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

	@Column(insertable=false, updatable=false)
	private long recptno;

	private String itemcode;

	public ItemrecddtlPK() {
	}
	public long getRecptno() {
		return this.recptno;
	}
	public void setRecptno(long recptno) {
		this.recptno = recptno;
	}
	public String getItemcode() {
		return this.itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
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
			(this.recptno == castOther.recptno)
			&& this.itemcode.equals(castOther.itemcode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.recptno ^ (this.recptno >>> 32)));
		hash = hash * prime + this.itemcode.hashCode();
		
		return hash;
	}
}