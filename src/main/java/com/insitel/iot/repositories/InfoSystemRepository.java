/**
 * 
 */
package com.insitel.iot.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.insitel.iot.models.InfoSystemDTO;

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
	public Optional<InfoSystemDTO> obtenerDatosSistema() {
		
		ArrayList<String> disco = new ArrayList<String>();
		InfoSystemDTO datos = new InfoSystemDTO();
		
		datos.setProcesador(System.getenv("PROCESSOR_IDENTIFIER"));
		datos.setProcDisponibles(Runtime.getRuntime().availableProcessors());
		datos.setMemTotal(Runtime.getRuntime().totalMemory());
		datos.setMemLibre(Runtime.getRuntime().freeMemory());
		datos.setSistOper(System.getProperty("os.name"));
		datos.setVerSO(System.getProperty("os.version"));
		
		
//		datos.add("Procesador: " + System.getenv("PROCESSOR_IDENTIFIER"));
//		datos.add("Procesadores disponibles (cores): " + Runtime.getRuntime().availableProcessors());
//		datos.add("Total Memoria: " + Runtime.getRuntime().totalMemory());
//		datos.add("Memoria Libre: " + Runtime.getRuntime().freeMemory());
//		datos.add("Sistema Operativo: " + System.getProperty("os.name"));
//		datos.add("Versión SO: " + System.getProperty("os.version"));
		//datos.add("Username: " + System.getProperty("user.name"));
		
		File [] unidades = File.listRoots();
        for(File f : unidades){
        	disco.add("Disco unidad: " + f + " Tamaño total: " + f.getTotalSpace()
            		+ ", Espacio disponible: " + f.getFreeSpace());
        }
		
        datos.setDiscos(disco);
        
		return Optional.of(datos);
	}
	
}
