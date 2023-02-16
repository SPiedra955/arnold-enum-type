package edu.craptocraft;

import main.java.arnoldenums.enums.Planet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		 
        double weight = 175.0; // kg
        
        for(Planet planet : Planet.values()){
            System.out.printf("Your weight on %s is %f N%n", planet.name(), planet.weightSurface(weight));
        }
        
        System.out.println("\nYour weight only on the terrestrial planets: ");
        for(Planet planet: Planet.getTerrestialPlanets()){
            System.out.printf("Your weight on %s is %f N%n", planet.name(), planet.weightSurface(weight));
        }
        
        System.out.println("\nYour weight only on the gas giant planets: ");
        for(Planet planet: Planet.getGasGiants()){
            System.out.printf("Your weight on %s is %f N%n", planet.name(), planet.weightSurface(weight));
        }
    }

}
