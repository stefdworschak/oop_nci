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
public class Vehicle {
    
    protected String reg, type;
    protected int wheels, seats;

    public Vehicle(String reg, String type, int wheels, int seats) {
        this.reg = reg;
        this.type = type;
        this.wheels = wheels;
    }

    public Vehicle() {
        this("","",0,0);
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public String getDetails(){
    
        return "Reg Number: "+reg+", Type: "+type+", Number of Wheels: "+wheels+", Number of Seats: "+seats;
        
    }
    
    
}
