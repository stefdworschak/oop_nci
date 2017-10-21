/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newemployeeapp;

import java.io.Serializable;

/**
 *
 * @author sofiane
 */
public class Employee implements Serializable {
    protected String name; 
    protected int empid; 
    
    public Employee(){
        this("", 0);
    }
    
    public Employee(String name, int empid){
        this.name = name;
        this.empid = empid;
    }
    
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return empid;
    }

    public void setId(int empid) {
        this.empid = empid;
    }
    
    public String getDetails() {
        return "Name: "+name+"\nID: "+empid;
    }
}
