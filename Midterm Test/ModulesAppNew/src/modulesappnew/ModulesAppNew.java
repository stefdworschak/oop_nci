/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    i.               All modules have a name, a lecturer and a lecture day

             ii.     Business modules have a name, a lecturer, a lecture day and a tutorial day

            iii.     Technical modules have a name, a lecturer, a lecture day and lab day

*/

package modulesappnew;

import javax.swing.JFrame;

/**
 *
 * @author Stefan
 */
public class ModulesAppNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModulesGUI gui = new ModulesGUI();
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setResizable(false);
        
    }
    
}
