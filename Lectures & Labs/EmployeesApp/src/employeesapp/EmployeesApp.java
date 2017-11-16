/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author x15037835
 */
public class EmployeesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        ArrayList<Employee> eList = new ArrayList();
        boolean isLoop = true;
        String name, dob, checkLoop, checkPrint,search;
        int id = 1;
        int checkSearch = 0;
        
        Scanner key = new Scanner(System.in);
        Employee emp;
        
        do{
            
            System.out.println("Name: ");
            name=key.next();
            System.out.println("Date of Birth: ");
            dob=key.next();
            
            emp = new Employee(id,name, dob);
            eList.add(emp);
            id++;
            
            System.out.println("Do you want to enter another employee? Yes/No");
            checkLoop=key.next();
            
            //System.out.println(checkLoop.charAt(0) == 'N');
            if(checkLoop.charAt(0) != 'Y') {
                isLoop = false;
            }
        
        } while(isLoop);
        
        System.out.println("Do you want to print out all of your Employees? Y/N");
        checkPrint=key.next();
        if(checkPrint.charAt(0) == 'Y') {
            for(int i = 0; i < eList.size(); i++) {

                System.out.println("ID: "+eList.get(i).getId()+"Name: "+eList.get(i).getName()+"\n Date of Birth: "+eList.get(i).getDob());

            }
        } else {
            System.out.println("Enter a name to search your Database:");
            search=key.next();
            
            for(int i = 0; i < eList.size(); i++) {
                if(eList.get(i).getName().indexOf(search) > -1) {
                    System.out.println("ID: "+eList.get(i).getId()+"\nName: "+eList.get(i).getName()+"\n Date of Birth: "+eList.get(i).getDob());
                    checkSearch = 1;
                } 
                
            }
            if(checkSearch == 0) {
                System.out.println("No entries found.");
            }
            
        
        
        }
    }
    
}
