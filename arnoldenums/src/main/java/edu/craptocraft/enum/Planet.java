package main.java.arnoldenums.enums;

import java.util.EnumSet;


public enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double massPlanet;
    private final double radius;
    private final double G = 6.67300E-11;

    Planet(double massPlanet, double radius) {
        this.massPlanet = massPlanet;
        this.radius = radius;
    }

    public double getMass(){
        return this.massPlanet;
    }

    public double getRadius(){
        return this.radius;
    }
    
    public double gravitySurface(Planet planet){
        return G * planet.getMass() / (planet.getRadius() * planet.getRadius());
    }

    public double getPlanetsGravitySurface(){
        return G * this.massPlanet / Math.pow(this.radius, 2);
    }


    public double humanMass(double weightHuman){
        return weightHuman / this.gravitySurface(EARTH);
    }
    
    public double weightSurfacePlanets(double weight){
        return humanMass(weight) * this.getPlanetsGravitySurface();
    }


    public static EnumSet<Planet> getTerrestialPlanets(){
        return EnumSet.range(MERCURY, MARS);
    }

    public static EnumSet<Planet> getGasGiants(){
        return EnumSet.complementOf(getTerrestialPlanets());
    } // return a set with the previous EnumSet that werent include before.

}
