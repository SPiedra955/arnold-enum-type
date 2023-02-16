package arnoldenums;

import main.java.arnoldenums.enums.Planet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		 
        double peso = 1.0; // kg
        
        for(Planet planeta : Planet.values()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
        
        System.out.println("\nYour weight only on the terrestrial planets: ");
        for(Planet planeta: Planet.getPlanetasTerrestres()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
        
        System.out.println("\nYour weight only on the gas giant planets: ");
        for(Planet planeta: Planet.getGigantesGaseosos()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}
