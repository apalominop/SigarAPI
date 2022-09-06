/**
 * 
 */
package com.insitel.iot.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insitel.iot.models.Grupo;

/**
 * @author Agustín Palomino Pardo
 *
 */

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Long> {

	@Query(value = "select g from Grupo g")
	public ArrayList<Grupo> traerTodos();
	
}
