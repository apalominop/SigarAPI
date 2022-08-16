/**
 * 
 */
package com.insitel.iot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Agustín Palomino Pardo
 *
 */

@Entity
@Table(name = "iot_masterkey_mcr")
public class LlaveMaestraCR {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mkc_id", unique = true, nullable = false)
	private Long id;

	@Column(name = "mkc_mcr_id")
	private Long crId;

	@Column(name = "mkc_key_id")
	private Long keyId;

	public Long getId() {
		return id;
	}

	
	//**Getters y setters
	public void setId(Long id) {
		this.id = id;
	}

	public Long getCrId() {
		return crId;
	}

	public void setCrId(Long crId) {
		this.crId = crId;
	}

	public Long getKeyId() {
		return keyId;
	}

	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	@Override
	public String toString() {
		return "LlaveMaestraCR [id=" + id + ", crId=" + crId + ", keyId=" + keyId + "]";
	}
	
}
