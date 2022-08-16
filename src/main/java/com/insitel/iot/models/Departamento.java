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
@Table(name = "iot_department") 
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "dep_name", length = 100)
	private String nombre;
	
	@Column(name = "dep_cmp_id")
	private Long ciaId;
	
	//**Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCiaId() {
		return ciaId;
	}

	public void setCiaId(Long ciaId) {
		this.ciaId = ciaId;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", ciaId=" + ciaId + "]";
	}

}
