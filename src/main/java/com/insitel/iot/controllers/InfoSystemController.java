/**
 * 
 */
package com.insitel.iot.controllers;

import java.io.File;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insitel.iot.models.InfoSystemDTO;
import com.insitel.iot.services.InfoSystemService;

/**
 * @author Agustín Palomino Pardo
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/iot/info")
public class InfoSystemController {
	
	@Autowired
	InfoSystemService infoSystemService;
	
	/**
	 * Servicio para obtener la información del equipo donde se aloja el gateway 
	 * @return
	 */
	@RequestMapping(value = "sist", method = RequestMethod.GET)
	public ResponseEntity<InfoSystemDTO> obtenerDatosCPU() {
		
		Optional<InfoSystemDTO> sistema = infoSystemService.obtenerDatosCPU();
		if (sistema != null) {
			return ResponseEntity.ok(sistema.get());
		} else {
			return ResponseEntity.noContent().build();
		}
		
	}
	
	
	@RequestMapping(value = "pru", method = RequestMethod.GET)
	public static void prueba() {
		System.out.println("Procesadores disponibles (cores): " + Runtime.getRuntime().availableProcessors());
		System.out.println("Total Memoria: " + Runtime.getRuntime().totalMemory());
		System.out.println("Memoria libre: " + Runtime.getRuntime().freeMemory());
		System.out.println("Memoria Máxima: " + Runtime.getRuntime().maxMemory());
		System.out.println("Username: " + System.getProperty("user.name"));
		System.out.println("Sistema Operativo: " + System.getProperty("os.name"));
		System.out.println("Versión SO: " + System.getProperty("os.version"));
		System.out.println("Procesador: " + System.getenv("PROCESSOR_IDENTIFIER"));
		
		File [] unidades = File.listRoots();
        for(File f : unidades){
            System.out.println("Disco unidad: " + f + " Tamaño total: " + f.getTotalSpace()
            		+ ", Espacio disponible: " + f.getFreeSpace());
        }
        
        
        
	}
	

}
