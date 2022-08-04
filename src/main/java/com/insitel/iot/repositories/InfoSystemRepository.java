/**
 * 
 */
package com.insitel.iot.repositories;

import java.io.File;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

/**
 * @author Agustín Palomino Pardo
 *
 */
@Repository
public class InfoSystemRepository {

	/**
	 * Método para obtener los datos de la CPU
	 * 
	 * @return
	 */
	public ArrayList<String> obtenerDatosSistema() {
		
		ArrayList<String> datos = new ArrayList<String>();
		
		datos.add("Procesador: " + System.getenv("PROCESSOR_IDENTIFIER"));
		datos.add("Procesadores disponibles (cores): " + Runtime.getRuntime().availableProcessors());
		datos.add("Total Memoria: " + Runtime.getRuntime().totalMemory());
		datos.add("Memoria Libre: " + Runtime.getRuntime().freeMemory());
		datos.add("Sistema Operativo: " + System.getProperty("os.name"));
		datos.add("Versión SO: " + System.getProperty("os.version"));
		//datos.add("Username: " + System.getProperty("user.name"));
		
		File [] unidades = File.listRoots();
        for(File f : unidades){
        	datos.add("Disco unidad: " + f + " Tamaño total: " + f.getTotalSpace()
            		+ ", Espacio disponible: " + f.getFreeSpace());
        }
		
		return datos;
	}
	
}
