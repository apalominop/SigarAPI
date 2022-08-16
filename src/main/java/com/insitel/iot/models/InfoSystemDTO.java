/**
 * 
 */
package com.insitel.iot.models;

import java.util.ArrayList;

/**
 * @author Agustín Palomino Pardo
 *
 */
public class InfoSystemDTO {

	public InfoSystemDTO() {
		super();
	}

	private String procesador;
	private int procDisponibles;
	private Long MemTotal;
	private Long MemLibre;
	private String SistOper;
	private String verSO;
	private ArrayList<String> Discos;

	// ***Getters y Setters
	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getProcDisponibles() {
		return procDisponibles;
	}

	public void setProcDisponibles(int procDisponibles) {
		this.procDisponibles = procDisponibles;
	}

	public Long getMemTotal() {
		return MemTotal;
	}

	public void setMemTotal(Long memTotal) {
		MemTotal = memTotal;
	}

	public Long getMemLibre() {
		return MemLibre;
	}

	public void setMemLibre(Long memLibre) {
		MemLibre = memLibre;
	}

	public String getSistOper() {
		return SistOper;
	}

	public void setSistOper(String sistOper) {
		SistOper = sistOper;
	}

	public String getVerSO() {
		return verSO;
	}

	public void setVerSO(String verSO) {
		this.verSO = verSO;
	}

	public ArrayList<String> getDiscos() {
		return Discos;
	}

	public void setDiscos(ArrayList<String> discos) {
		Discos = discos;
	}

	@Override
	public String toString() {
		return "InfoSystemDTO [procesador=" + procesador + ", procDisponibles=" + procDisponibles + ", MemTotal="
				+ MemTotal + ", MemLibre=" + MemLibre + ", SistOper=" + SistOper + ", verSO=" + verSO + ", Discos="
				+ Discos + "]";
	}

	

}
