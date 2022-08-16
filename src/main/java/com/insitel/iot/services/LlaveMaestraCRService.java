/**
 * 
 */
package com.insitel.iot.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insitel.iot.models.LlaveMaestraCR;
import com.insitel.iot.repositories.LlaveMaestraCRRepository;

/**
 * @author Agustín Palomino Pardo
 *
 */
@Service
public class LlaveMaestraCRService {
	
	@Autowired
	LlaveMaestraCRRepository llaveMaestraCRRepository;
	
	/**
	 * Método para obtener todas la llaves Maestras programadas en el CR
	 * @return
	 * @throws Exception
	 */
	public ArrayList<LlaveMaestraCR> obtenerTodasMaestras() throws Exception {
		return (ArrayList<LlaveMaestraCR>) llaveMaestraCRRepository.findAll();
	}
	
	/**
	 * Método para buscar por id una llave MAestra programada en el CR
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Optional<LlaveMaestraCR> obtenerLlaveMasterPorId(Long id) throws Exception {
		return llaveMaestraCRRepository.findById(id);
	}
	
	/**
	 * Método para guardar una llave maestra en la trabla de llaves programadas CR
	 * @param llave
	 * @return
	 * @throws Exception
	 */
	public LlaveMaestraCR guardarLlave(LlaveMaestraCR llave) throws Exception {
		return llaveMaestraCRRepository.save(llave);
	}

}
