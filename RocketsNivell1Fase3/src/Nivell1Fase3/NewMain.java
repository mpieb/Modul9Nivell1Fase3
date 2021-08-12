package Nivell1Fase3;

import java.util.*;

public class NewMain {

    public static void main(String[] args) {
        //Instanciació de objecte Scanner
        Scanner sc = new Scanner(System.in);
		
        //1 -> Acelera propulsors, 2 -> Frena propulsors, 3 -> Sortir
        int eleccio = 0; 
                
        //Instanciació de la clase Coets
        Coets coet = new Coets("32WESSDS");
	Coets coet2 = new Coets("LDSFJA32");

	//Instanciació de clase Propulsors per a primer coet
	Propulsors p1 = new Propulsors(1,10, coet);
	Propulsors p2 = new Propulsors(2, 30, coet);
	Propulsors p3 = new Propulsors(3, 80, coet);
		
	//Instanciació de clase Propulsors per a segon coet
	Propulsors p4 = new Propulsors(4, 30, coet2);
	Propulsors p5 = new Propulsors(5, 40, coet2);
	Propulsors p6 = new Propulsors(6, 50, coet2);
	Propulsors p7 = new Propulsors(7, 50, coet2);
	Propulsors p8 = new Propulsors(8, 30, coet2);
	Propulsors p9 = new Propulsors(9, 10, coet2);

	//Declaració de llista per els propulsors del primer coet
	List<Propulsors> propulsorsCoet = new ArrayList<>();
            propulsorsCoet.add(p1);
            propulsorsCoet.add(p2);
            propulsorsCoet.add(p3);
		
	//Declaració de llista per als propulsors del segon coet
	List<Propulsors> propulsorsCoet2 = new ArrayList<>();
            propulsorsCoet2.add(p4);
            propulsorsCoet2.add(p5);
            propulsorsCoet2.add(p6);
            propulsorsCoet2.add(p7);
            propulsorsCoet2.add(p8);
            propulsorsCoet2.add(p9);

	//Afegir dades als propulsors
            coet.setPropulsors(propulsorsCoet);
            coet2.setPropulsors(propulsorsCoet2);
                
        //Bucle per fer les accions al coet
	while(eleccio != 3) {
            System.out.println("Qué fem amb el  coet: \n1. Acelerar\n2. Frenar\n3. Sortir");
		eleccio = sc.nextInt();
		sc.nextLine();
                    if(eleccio == 1) {
			coet.acelerar();
			coet2.acelerar();
                    }else if(eleccio == 2){
			coet.frenar();
			coet2.frenar();
                    }else {
                    
                        try {
                            coet.wait();
                            coet2.wait();
			} catch (InterruptedException e) {
                            e.printStackTrace();
			}
			System.out.println("Sortim!");
			System.exit(0);
                    }
		
        }
        sc.close();
	
    }

}

    