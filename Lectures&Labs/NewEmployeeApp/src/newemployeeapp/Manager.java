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
public class Manager extends Employee {
        
    private double salary;
    private String dept; 
    
    public Manager(String name, int empid, double salary, String dept){
        super(name, empid);
        this.salary = salary; 
        this.dept = dept; 
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return dept;
    }

    public void setDepartment(String dept) {
        this.dept = dept;
    }
    @Override
    public String getDetails() {
        return super.getDetails()+"\nSalary: "+salary+"\nDepartment: "+dept;
    }
    
}
