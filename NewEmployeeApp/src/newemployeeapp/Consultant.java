/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newemployeeapp;

/**
 *
 * @author sofiane
 */
public class Consultant extends Employee {
    
    private int hours; 
    private double rate; 
    
    public Consultant(String name, int empid, int hours, double rate){
        super(name, empid);
        this.hours = hours; 
        this.rate = rate; 
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails()+"\nHours: "+hours+"\nRate: "+rate;
    }
    
}
