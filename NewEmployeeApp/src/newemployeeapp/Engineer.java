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
public class Engineer extends Employee {
    
    private double salary;
    
    public Engineer(String name, int empid, double salary){
        super(name, empid);
        this.salary = salary; 
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails()+"\nSalary: "+salary;
    }
    
}
