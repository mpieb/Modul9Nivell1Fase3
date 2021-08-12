package Nivell1Fase3;

import java.util.List;

public class Coets {
    
        //Declaració de variables i llista de clase
        private String idCodi;
	private List<Propulsors> propulsors;
	private int nombrePropulsors; 
	private boolean acelera;
	
        //Constructor i inicialtzació de variables de clase
	public Coets(String idCodi) {
		this.idCodi = idCodi;
	}
	
        //Constructor i inicialtzació de variables i llista de clase
	public Coets(String idCodi, List<Propulsors> propulsors) throws Exception {
		this.idCodi = idCodi;
		this.propulsors = propulsors;
		nombrePropulsors = propulsors.size();
		acelera = false;
	}
	
	public List<Propulsors> getPropulsors() {//Getter
		return propulsors;
	}

	public void setPropulsors(List<Propulsors> propulsors) {//Setter
		this.propulsors = propulsors;
	}

	public String getIdCodi() {//Getter
		return idCodi;
	}
	public void setIdCodi(String idCodi) {//Setter
		this.idCodi = idCodi;
	}
	public int getNombrePropulsors() {//Getter
		return nombrePropulsors;
	}
	public void setNombrePropulsors(int nombrePropulsors) {//Setter
		this.nombrePropulsors = nombrePropulsors;
	}
	
	public boolean getAcelera() {//Getter
		return acelera;
	}

	public void setAcelera(boolean acelera) {//Setter
		this.acelera = acelera;
	}

	public void acelerar() {//Mètode
		acelera = true;
		for(Propulsors p: propulsors) {
			Thread acelerador = new Thread(p);
			acelerador.start();
		}
	}
	
	public void frenar() {//Mètode
		acelera = false;
		for(Propulsors p: propulsors) {
			Thread frenada = new Thread(p);
			frenada.start();
		}
	}

}

    