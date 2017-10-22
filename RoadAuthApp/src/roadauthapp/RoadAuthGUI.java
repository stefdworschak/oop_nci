/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadauthapp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author x15037835
 */
public class RoadAuthGUI extends javax.swing.JFrame {
    
    private String regNum, type;
    private int wheels,seats;
    private double topSpeed,fuelConsumption, stabilityFactor, standingCapacity;
    private ArrayList<Vehicle> vList;
    private Pattern nums,doubs;
    private Matcher wMatch,sMatch, tsMatch, fcMatch, sfMatch, scMatch;  
    private Vehicle v;
    /**
     * Creates new form RoadAuthGUI
     */
    public RoadAuthGUI() {
        initComponents();
        setLocation(500,300);
        
        nums = Pattern.compile("['0-9]+");
        doubs = Pattern.compile("['0-9]+[.|,]?[0-9]+");
       
        regNum = "";
        type = "";
        wheels = 0;
        seats = 0;
        
        topSpeed=0.0;
        fuelConsumption=0.0;
        stabilityFactor=0.0; 
        standingCapacity=0.0;
        
        vList = new ArrayList<>();
        
        topSpeedTxt.setEditable(false);
        fuelConsumptionTxt.setEditable(false);
        stabilityFactorTxt.setEditable(false);
        standingCapacityTxt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeBtnGroup = new javax.swing.ButtonGroup();
        regLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        carRd = new javax.swing.JRadioButton();
        bikeRd = new javax.swing.JRadioButton();
        busRd = new javax.swing.JRadioButton();
        regTxt = new javax.swing.JTextField();
        topSpeedLbl = new javax.swing.JLabel();
        topSpeedTxt = new javax.swing.JTextField();
        fuelConsLbl = new javax.swing.JLabel();
        fuelConsumptionTxt = new javax.swing.JTextField();
        stabilityFacLbl = new javax.swing.JLabel();
        stabilityFactorTxt = new javax.swing.JTextField();
        StandingCapLbl = new javax.swing.JLabel();
        standingCapacityTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        viewAllBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        wheelsLbl = new javax.swing.JLabel();
        wheelsTxt = new javax.swing.JTextField();
        seatsLbl = new javax.swing.JLabel();
        seatsTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regLbl.setText("Reg Number");

        typeLbl.setText("Type");

        typeBtnGroup.add(carRd);
        carRd.setText("Car");
        carRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carRdActionPerformed(evt);
            }
        });

        typeBtnGroup.add(bikeRd);
        bikeRd.setText("Bike");
        bikeRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeRdActionPerformed(evt);
            }
        });

        typeBtnGroup.add(busRd);
        busRd.setText("Bus");
        busRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busRdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bikeRd, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(carRd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(busRd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(carRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bikeRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busRd))
        );

        topSpeedLbl.setText("Top Speed");

        fuelConsLbl.setText("Fuel Consumption");

        stabilityFacLbl.setText("Stability Factor");

        StandingCapLbl.setText("Standing Capacity");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        readBtn.setText("Read");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(readBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(readBtn)
                .addComponent(saveBtn))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        deleteBtn.setText("Delete");

        viewAllBtn.setText("View All");

        searchBtn.setText("Search");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAllBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(addBtn)
                    .addComponent(viewAllBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        wheelsLbl.setText("Wheels");

        seatsLbl.setText("Seats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(regLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(regTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(typeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(wheelsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(seatsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(wheelsTxt))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(topSpeedLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fuelConsLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(StandingCapLbl)
                                            .addComponent(stabilityFacLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(standingCapacityTxt)
                                    .addComponent(topSpeedTxt)
                                    .addComponent(fuelConsumptionTxt)
                                    .addComponent(stabilityFactorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seatsLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topSpeedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuelConsumptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuelConsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stabilityFactorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stabilityFacLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(standingCapacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StandingCapLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regLbl)
                            .addComponent(regTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topSpeedLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLbl)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wheelsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wheelsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatsLbl)
                            .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busRdActionPerformed
        // TODO add your handling code here:
        topSpeedTxt.setEditable(false);
        fuelConsumptionTxt.setEditable(true);
        stabilityFactorTxt.setEditable(false);
        standingCapacityTxt.setEditable(true);
    }//GEN-LAST:event_busRdActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void carRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carRdActionPerformed
        // TODO add your handling code here:
        topSpeedTxt.setEditable(true);
        fuelConsumptionTxt.setEditable(true);
        stabilityFactorTxt.setEditable(false);
        standingCapacityTxt.setEditable(false);
        
    }//GEN-LAST:event_carRdActionPerformed

    private void bikeRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeRdActionPerformed
        // TODO add your handling code here:
        topSpeedTxt.setEditable(true);
        fuelConsumptionTxt.setEditable(false);
        stabilityFactorTxt.setEditable(true);
        standingCapacityTxt.setEditable(false);
    }//GEN-LAST:event_bikeRdActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        regNum = regTxt.getText();
        wMatch = nums.matcher(wheelsTxt.getText());
        sMatch = nums.matcher(seatsTxt.getText());
        tsMatch = doubs.matcher(topSpeedTxt.getText());
        fcMatch = doubs.matcher(fuelConsumptionTxt.getText());
        sfMatch = doubs.matcher(stabilityFactorTxt.getText());
        scMatch = doubs.matcher(standingCapacityTxt.getText());  
        
        if(regNum.equals("") || wheelsTxt.getText().equals("") || seatsTxt.getText().equals("") || (!carRd.isSelected() && !bikeRd.isSelected() && !busRd.isSelected())) {
            JOptionPane.showMessageDialog(null, "Please enter a reg and select a type!");
        } else if(!wMatch.matches() || !sMatch.matches()) {
            JOptionPane.showMessageDialog(null, "Please enter numbers in the Wheels and Seats fields!");
        } else if(!tsMatch.matches() || !fcMatch.matches() || !sfMatch.matches() || !scMatch.matches()){
            JOptionPane.showMessageDialog(null, "Please enter numbers in the Wheels and Seats fields!");
        } else {
                
            wheels = Integer.parseInt(wheelsTxt.getText());
            seats = Integer.parseInt(seatsTxt.getText());
                
               if(carRd.isSelected() && (!topSpeedTxt.getText().equals("") && !fuelConsumptionTxt.getText().equals(""))) {
                   type = "Car";
                   topSpeed = Double.parseDouble(topSpeedTxt.getText());
                   fuelConsumption = Double.parseDouble(fuelConsumptionTxt.getText());
                   v = new Car(regNum, type, wheels, seats, 0.0,0.0);
               } else if(bikeRd.isSelected() && (!topSpeedTxt.getText().equals("") && !stabilityFactorTxt.getText().equals(""))){
                   type = "Bike";
                   topSpeed = Double.parseDouble(topSpeedTxt.getText());
                   stabilityFactor=Double.parseDouble(stabilityFactorTxt.getText());
                   v = new Bike(regNum, type, wheels, seats, 0.0,0.0);
               } else if(busRd.isSelected() && (!standingCapacityTxt.getText().equals("") && !fuelConsumptionTxt.getText().equals(""))) {
                   type = "Bus";
                   fuelConsumption = Double.parseDouble(fuelConsumptionTxt.getText());
                   standingCapacity=Double.parseDouble(standingCapacityTxt.getText());
                   v = new Bus(regNum, type, wheels, seats, 0.0,0.0);
               }
               
               vList.add(v);
        } 
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoadAuthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoadAuthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoadAuthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoadAuthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoadAuthGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StandingCapLbl;
    private javax.swing.JButton addBtn;
    private javax.swing.JRadioButton bikeRd;
    private javax.swing.JRadioButton busRd;
    private javax.swing.JRadioButton carRd;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel fuelConsLbl;
    private javax.swing.JTextField fuelConsumptionTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton readBtn;
    private javax.swing.JLabel regLbl;
    private javax.swing.JTextField regTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel seatsLbl;
    private javax.swing.JTextField seatsTxt;
    private javax.swing.JLabel stabilityFacLbl;
    private javax.swing.JTextField stabilityFactorTxt;
    private javax.swing.JTextField standingCapacityTxt;
    private javax.swing.JLabel topSpeedLbl;
    private javax.swing.JTextField topSpeedTxt;
    private javax.swing.ButtonGroup typeBtnGroup;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JButton viewAllBtn;
    private javax.swing.JLabel wheelsLbl;
    private javax.swing.JTextField wheelsTxt;
    // End of variables declaration//GEN-END:variables
}
