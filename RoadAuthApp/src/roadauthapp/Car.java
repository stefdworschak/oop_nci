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
public class Car extends Vehicle {
    
    private double topSpeed, fuelConsumption;

    public Car(String reg, String type, int wheels, int seats,double topSpeed, double fuelConsumption) {
        super(reg, type, wheels,seats);
        this.topSpeed = topSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {
        this("","",0,0,0.0,0.0);
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    
    @Override
    public String getDetails(){
    
        return super.getDetails()+", Top Speed: "+topSpeed+", Fuel Consumption: "+fuelConsumption;
        
    }
    
}
