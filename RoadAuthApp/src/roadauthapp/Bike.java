/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadauthapp;

/**
 *
 * @author x15037835
 */
public class Bike extends Vehicle {
    private double topSpeed, stabilityFactor;

    public Bike(String reg, String type, int wheels, int seats,double topSpeed, double stabilityFactor) {
        super(reg, type, wheels, seats);
        this.topSpeed = topSpeed;
        this.stabilityFactor = stabilityFactor;
    }
    
    public Bike() {
        this("","",0,0,0.0,0.0);
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getStabilityFactor() {
        return stabilityFactor;
    }

    public void setStabilityFactor(double stabilityFactor) {
        this.stabilityFactor = stabilityFactor;
    }
    @Override
    public String getDetails(){
    
        return super.getDetails()+", Top Speed: "+topSpeed+", Stability Factor: "+stabilityFactor;
        
    }
}
