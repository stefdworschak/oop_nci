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
public class Director extends Employee {
    
    private double salary;
    private String dept; 
    private double budget;
    
    public Director(String name, int empid, double salary, String dept
            , double budget){
        super(name, empid);
        this.salary = salary; 
        this.dept = dept; 
        this.budget = budget; 
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
    
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    @Override
    public String getDetails() {
        return super.getDetails()+"\nSalary: "+salary+"\nDepartment: "+dept+"\nBudget: "+budget;
    }

}
