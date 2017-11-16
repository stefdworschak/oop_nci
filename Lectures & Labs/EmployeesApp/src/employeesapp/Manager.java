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
public class Manager extends Employee {
        
    private double salary;
    public Manager(int id, String name, String dob, double salary) {
        super(id,name,dob);
        this.salary = salary;
    }
    public Manager(){
        this(0,"","",0.0);
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
}
