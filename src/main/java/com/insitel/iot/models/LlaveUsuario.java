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
@Table(name = "iot_key_user")
public class LlaveUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kus_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "kus_key_id")
	private Long llaveId;
	
	@Column(name = "kus_usr_id")
	private Long usuarioId;
	
	//**Getters y setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getllaveId() {
		return llaveId;
	}

	public void setllaveId(Long llaveId) {
		this.llaveId = llaveId;
	}

	public Long getusuarioId() {
		return usuarioId;
	}

	public void setusuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "LlsveusuarioId [id=" + id + ", llaveId=" + llaveId + ", usuarioId=" + usuarioId + "]";
	}
	
}
