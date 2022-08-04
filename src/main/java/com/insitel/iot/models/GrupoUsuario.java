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
@Table(name = "iot_group_user")
public class GrupoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gru_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name ="gru_grp_id")
	private Long grupoId;
	
	@Column(name ="gru_usr_id")
	private Long usuarioId;

	
	//**Getters y setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(Long grupoId) {
		this.grupoId = grupoId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "GrupoUsuario [id=" + id + ", grupoId=" + grupoId + ", usuarioId=" + usuarioId + "]";
	}

}
