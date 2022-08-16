/**
 * 
 */
package com.insitel.iot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insitel.iot.models.InfoSystemDTO;
import com.insitel.iot.repositories.InfoSystemRepository;

/**
 * @author Agustín Palomino Pardo
 *
 */
@Service
public class InfoSystemService {
	
	@Autowired
	InfoSystemRepository infoSystemRepository;
	
	/**
	 * Método para obtener datos de la CPU
	 * @return
	 */
	public Optional<InfoSystemDTO> obtenerDatosCPU() {
		return infoSystemRepository.obtenerDatosSistema();
	}
	

}
