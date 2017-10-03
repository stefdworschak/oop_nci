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
public class Employee {
    
    private int id;
    private String name,dob;
    
    public Employee(int id, String name, String dob) {
    
        this.id = id;
        this.name = name;
        this.dob = dob;
        
    }
    public Employee(){
        this(0,"","");
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    
}
