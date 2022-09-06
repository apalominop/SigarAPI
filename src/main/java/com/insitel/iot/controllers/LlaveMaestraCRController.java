/**
 * 
 */
package com.insitel.iot.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insitel.iot.message.FileMessage;
import com.insitel.iot.models.LlaveMaestraCR;
import com.insitel.iot.services.LlaveMaestraCRService;

/**
 * @author Agustín Palomino Pardo
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/iot/maestra")
public class LlaveMaestraCRController {
	
	@Autowired
	LlaveMaestraCRService llaveMaestraCRService;
	
	/**
	 * Servicio para obtener todas las Llaves Maestras del CR
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "obtenertodas", method = RequestMethod.GET)
	public ArrayList<LlaveMaestraCR> obtenerTodasMaestras() throws Exception {
		return llaveMaestraCRService.obtenerTodasMaestras();
	}

	/**
	 * Servicio para actualizar las llaves Maestras del CR
	 * @param llave
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "actualizar", method = RequestMethod.POST)
	public ResponseEntity<FileMessage> actualizarMasterCR(@RequestBody LlaveMaestraCR llave) throws Exception {
		String message = "";
		Long id = llave.getId();
		Long cr = llave.getCrId();
		Long key = llave.getKeyId();
		
		Optional<LlaveMaestraCR> encontrada = llaveMaestraCRService.obtenerLlaveMasterPorId(id);
		if (encontrada.isPresent()) {
			LlaveMaestraCR aGrabar = encontrada.get();
			aGrabar.setCrId(cr);
			aGrabar.setKeyId(key);
			llaveMaestraCRService.guardarLlave(llave);
			message = "Se actualizó la Llave Maestra exitosamente";
			return ResponseEntity.status(HttpStatus.OK).body(new FileMessage(message));
		}else {
			message = "Error al grabar Llave Maestra";
			return ResponseEntity.internalServerError().body(new FileMessage(message));
		}
	}
	
	
	
}
