package Nivell1Fase3;

public class Propulsors implements Runnable {
        
    //Declaració de variables de clase
    private int idPropulsor;
    private int potenciaMaxima;
    private int potenciaActual;
    private Coets coet;
    
    //Constructor i inicialtzacions de variabels de clase
    public Propulsors(int idPropulsor, int potenciaMaxima, Coets coet) {
	this.idPropulsor = idPropulsor; 
	this.potenciaMaxima = potenciaMaxima;
	this.coet = coet;
	potenciaActual = 0;
    }
	
    //Sobreescriptura de mètode
    @Override
    public void run() {
		
	if(coet.getAcelera()) {
			
            System.err.println("ACELERA PROPULSOR " + idPropulsor +
                                " DEL COET "+ coet.getIdCodi() + "!");
		for(int i=potenciaActual; i<=potenciaMaxima;i++) {
			
                    if(!coet.getAcelera()) break;
			potenciaActual=i;
			System.out.println("Potència del propulsor nº: " + 
                                idPropulsor + " del Coet -> " +
                                coet.getIdCodi() + ": " + potenciaActual +
                                " kW / " + potenciaMaxima + " kW");
			
                    if(potenciaActual==potenciaMaxima) System.err.println("\nPROPULSOR "
                            + idPropulsor + " DEL COET " + coet.getIdCodi() + 
                            " HA ACONSEGUIT LA POTÈNCIA MÀXIMA\n");
			
		try {
				Thread.sleep(400);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
            }
		
                    }else {
			
                            System.err.println("FRENA PROPULSOR " + idPropulsor +
                                "DEL COET "+coet.getIdCodi() + "!");
			
            for(int i=potenciaActual; i>=0;i--) {
                            
                    if(coet.getAcelera()) break;
			potenciaActual=i;
			System.err.println("Potència del propulsor nº : " + 
                            idPropulsor + " del Coet -> " + coet.getIdCodi() +
                            ": " + potenciaActual + " kW / " +
                            potenciaMaxima + " kW");
				
			if(potenciaActual==0) System.err.println("\nPROPULSOR " +
                            idPropulsor + " DEL COET " + coet.getIdCodi() + 
                            " ESTÀ ATURAT (POTENCIA ACTUAL -> 0)\n");
				
		try {
                    Thread.sleep(400);
		} catch (InterruptedException e) {
                    e.printStackTrace();
		}
            }
        }
    }
	
	public int getIdPropulsor() {//Getter
		return idPropulsor;
	}

	public void setIdPropulsor(int idPropulsor) {//Setter
		this.idPropulsor = idPropulsor;
	}

	public Coets getCoet() {//Getter
		return coet;
	}

	public void setCoet(Coets coet) {//Setter
		this.coet = coet;
	}

	public int getPotenciaMaxima() {//Getter
		return potenciaMaxima;
	}

	public void setPotenciaMaxima(int potenciaMaxima) {//Setter
		this.potenciaMaxima = potenciaMaxima;
	}

	public int getPotenciaActual() {//Getter
		return potenciaActual;
	}

	public void setPotenciaActual(int potenciaActual) {//Setter
		this.potenciaActual = potenciaActual;
	}

}


    
