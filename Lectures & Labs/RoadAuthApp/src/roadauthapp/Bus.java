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
public class Bus extends Vehicle {
    
    private double fuelConsumption, standingCapacity;

    public Bus(String reg, String type, int wheels, int seats,double fuelConsumption, double standingCapacity) {
        super(reg, type, wheels,seats);
        this.fuelConsumption = fuelConsumption;
        this.standingCapacity = standingCapacity;
    }
    public Bus() {
        this("","",0,0,0.0,0.0);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getStandingCapacity() {
        return standingCapacity;
    }

    public void setStandingCapacity(double standingCapacity) {
        this.standingCapacity = standingCapacity;
    }
    @Override
    public String getDetails(){
    
        return super.getDetails()+", Fuel Consumption: "+fuelConsumption+", Standing Capacity: "+standingCapacity;
        
    }
    
    
}
