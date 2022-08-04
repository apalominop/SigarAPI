/**
 * 
 */
package com.insitel.iot.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insitel.iot.message.FileMessage;
import com.insitel.iot.models.GrupoUsuario;
import com.insitel.iot.services.GrupoUsuarioService;

/**
 * @author Agustín Palomino Pardo
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/iot/grupousr")
public class GrupoUsuarioController {
	
	@Autowired
	GrupoUsuarioService grupoUsuarioService;
	
	/**
	 * Servicio para obtener todos los GrupoUsuario
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "obtenertodos", method = RequestMethod.GET)
	public ArrayList<GrupoUsuario> obtenerTodosGrupoUsr() throws Exception {
		return grupoUsuarioService.obtenerTodosGruposUsrs();
	}
	
	/**
	 * Servicio para Asignar un usuario a un grupo
	 * @param grupoUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public ResponseEntity<FileMessage> guardarGrupoUsuario(@RequestBody GrupoUsuario grupoUser) throws Exception {
		grupoUsuarioService.guardarGrupoUsuario(grupoUser);
		String message = "Se agregó el Usuario al Grupo exitosamente";
		return ResponseEntity.status(HttpStatus.OK).body(new FileMessage(message));
	}

}
