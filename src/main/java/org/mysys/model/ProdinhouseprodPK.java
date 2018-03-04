package org.mysys.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prodinhouseprod database table.
 * 
 */
@Embeddable
public class ProdinhouseprodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pih_id", insertable=false, updatable=false)
	private long pihId;

	@Column(insertable=false, updatable=false)
	private long productid;

	public ProdinhouseprodPK() {
	}
	public long getPihId() {
		return this.pihId;
	}
	public void setPihId(long pihId) {
		this.pihId = pihId;
	}
	public long getProductid() {
		return this.productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProdinhouseprodPK)) {
			return false;
		}
		ProdinhouseprodPK castOther = (ProdinhouseprodPK)other;
		return 
			(this.pihId == castOther.pihId)
			&& (this.productid == castOther.productid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pihId ^ (this.pihId >>> 32)));
		hash = hash * prime + ((int) (this.productid ^ (this.productid >>> 32)));
		
		return hash;
	}
}