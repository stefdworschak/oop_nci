/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesapp;

/**
 *
 * @author x15037835
 */
public class FloorStaff extends Employee {
    private double rate;
    
    public FloorStaff(int id, String name, String dob, double rate){
        super(id,name,dob);
        this.rate = rate; 
    }
    public FloorStaff(){
        this(0,"","",0.0);
    }
    
    public void setRate(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
    
}
