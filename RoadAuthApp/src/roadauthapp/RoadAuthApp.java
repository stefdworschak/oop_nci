/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadauthapp;

import javax.swing.JFrame;

/**
 *
 * @author x15037835
 */
public class RoadAuthApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Vehicle(reg, type, wheels, seats)
        //Car (reg, type, wheels, seats, topSpeed, fuelConsumption)
        //Bike (reg, type, wheels, seats, topSpeed, stabilityFactor)
        //Bus (reg, type, wheels, seats, fuelConsumption, standingCapacity)
        RoadAuthGUI gui = new RoadAuthGUI();
        gui.setVisible(true);
        
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Road Authority Application");
    }
    
}
