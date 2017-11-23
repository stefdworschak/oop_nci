package flightapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16102860
 */
public class FlightsGui extends javax.swing.JFrame {
    Flight flight;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    Date departureDate, returnDate;
    
    /**
     * Creates new form FlightsGui
     */
    public FlightsGui() {
        initComponents();
        
        
        
        returnRb.setSelected(true);
        lowFareRb.setSelected(true);
        
        
        baggageWeightLbl.setVisible(false);
        baggageWeightTxt.setVisible(false);
        inFlightMealLbl.setVisible(false);
        inFlightMealCb.setVisible(false);
        seatSelectionLbl.setVisible(false);
        seatSelectionCb.setVisible(false);
        priorityBoardingLbl.setVisible(false);
        priorityBoardingCb.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReturnGrp = new javax.swing.ButtonGroup();
        TypeGrp = new javax.swing.ButtonGroup();
        oneWayRb = new javax.swing.JRadioButton();
        returnRb = new javax.swing.JRadioButton();
        flightNumLbl = new javax.swing.JLabel();
        departureLbl = new javax.swing.JLabel();
        destinationLbl = new javax.swing.JLabel();
        flightNumTxt = new javax.swing.JTextField();
        departureTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        departureDateLbl = new javax.swing.JLabel();
        returnDateLbl = new javax.swing.JLabel();
        departureDateTxt = new javax.swing.JTextField();
        returnDateTxt = new javax.swing.JTextField();
        ticketTypeLbl = new javax.swing.JLabel();
        lowFareRb = new javax.swing.JRadioButton();
        flexFareRb = new javax.swing.JRadioButton();
        businessRb = new javax.swing.JRadioButton();
        baggageWeightLbl = new javax.swing.JLabel();
        baggageWeightTxt = new javax.swing.JTextField();
        inFlightMealLbl = new javax.swing.JLabel();
        inFlightMealCb = new javax.swing.JComboBox<>();
        priorityBoardingLbl = new javax.swing.JLabel();
        priorityBoardingCb = new javax.swing.JComboBox<>();
        seatSelectionLbl = new javax.swing.JLabel();
        seatSelectionCb = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        searchLbl = new javax.swing.JLabel();
        flightsScroll = new javax.swing.JScrollPane();
        flightsBox = new javax.swing.JList<>();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReturnGrp.add(oneWayRb);
        oneWayRb.setText("One Way");
        oneWayRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayRbActionPerformed(evt);
            }
        });

        ReturnGrp.add(returnRb);
        returnRb.setText("Return");
        returnRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnRbActionPerformed(evt);
            }
        });

        flightNumLbl.setText("Flight Number");

        departureLbl.setText("Departure");

        destinationLbl.setText("Destination");

        departureDateLbl.setText("Departure Date");

        returnDateLbl.setText("Return Date");

        ticketTypeLbl.setText("Ticket Type");

        TypeGrp.add(lowFareRb);
        lowFareRb.setText("Low Fare");
        lowFareRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowFareRbActionPerformed(evt);
            }
        });

        TypeGrp.add(flexFareRb);
        flexFareRb.setText("Flex Fare");
        flexFareRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flexFareRbActionPerformed(evt);
            }
        });

        TypeGrp.add(businessRb);
        businessRb.setText("Business");
        businessRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessRbActionPerformed(evt);
            }
        });

        baggageWeightLbl.setText("Baggage Weight");

        inFlightMealLbl.setText("In-Flight Meal");

        inFlightMealCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken", "Beef", "Fish", "Vegetarian", "Vegan" }));

        priorityBoardingLbl.setText("Priority Boarding");

        priorityBoardingCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        seatSelectionLbl.setText("Seat Selection");

        seatSelectionCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ailse", "Window", "Legroom" }));

        searchLbl.setText("Search");

        flightsBox.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        flightsScroll.setViewportView(flightsBox);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ticketTypeLbl)
                        .addGap(34, 34, 34)
                        .addComponent(lowFareRb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(departureLbl)
                                .addGap(30, 30, 30)
                                .addComponent(departureTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destinationLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(departureDateLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(departureDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(destinationTxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(71, 71, 71)
                                                    .addComponent(flexFareRb)
                                                    .addGap(51, 51, 51)
                                                    .addComponent(businessRb))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(returnDateLbl)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(returnDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(priorityBoardingCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(baggageWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(flightNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oneWayRb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(returnRb))
                                    .addComponent(flightNumTxt))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLbl)
                                .addGap(18, 18, 18)
                                .addComponent(searchTxt))
                            .addComponent(flightsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inFlightMealLbl)
                            .addComponent(seatSelectionLbl))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inFlightMealCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seatSelectionCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(baggageWeightLbl)
                                    .addComponent(priorityBoardingLbl))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneWayRb)
                            .addComponent(returnRb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLbl))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNumLbl)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureLbl)
                            .addComponent(departureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationLbl))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureDateLbl)
                            .addComponent(returnDateLbl)
                            .addComponent(departureDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(flightsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketTypeLbl)
                    .addComponent(lowFareRb)
                    .addComponent(flexFareRb)
                    .addComponent(businessRb))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inFlightMealLbl)
                    .addComponent(inFlightMealCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baggageWeightLbl)
                    .addComponent(baggageWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatSelectionLbl)
                    .addComponent(seatSelectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityBoardingLbl)
                    .addComponent(priorityBoardingCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lowFareRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowFareRbActionPerformed
        baggageWeightLbl.setVisible(false);
        baggageWeightTxt.setVisible(false);
        inFlightMealLbl.setVisible(false);
        inFlightMealCb.setVisible(false);
        seatSelectionLbl.setVisible(false);
        seatSelectionCb.setVisible(false);
        priorityBoardingLbl.setVisible(false);
        priorityBoardingCb.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_lowFareRbActionPerformed

    private void flexFareRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flexFareRbActionPerformed
        baggageWeightLbl.setVisible(true);
        baggageWeightTxt.setVisible(true);
        inFlightMealLbl.setVisible(true);
        inFlightMealCb.setVisible(true);
        seatSelectionLbl.setVisible(false);
        seatSelectionCb.setVisible(false);
        priorityBoardingLbl.setVisible(false);
        priorityBoardingCb.setVisible(false);
    }//GEN-LAST:event_flexFareRbActionPerformed

    private void businessRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessRbActionPerformed
        baggageWeightLbl.setVisible(false);
        baggageWeightTxt.setVisible(false);
        inFlightMealLbl.setVisible(false);
        inFlightMealCb.setVisible(false);
        seatSelectionLbl.setVisible(true);
        seatSelectionCb.setVisible(true);
        priorityBoardingLbl.setVisible(true);
        priorityBoardingCb.setVisible(true);
    }//GEN-LAST:event_businessRbActionPerformed

    private void oneWayRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayRbActionPerformed
        returnDateLbl.setVisible(false);
        returnDateTxt.setVisible(false);
    }//GEN-LAST:event_oneWayRbActionPerformed

    private void returnRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnRbActionPerformed
        returnDateLbl.setVisible(true);
        returnDateTxt.setVisible(true);
    }//GEN-LAST:event_returnRbActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
    if( 
        ((departureDateTxt.getText().equals("")
        || departureTxt.getText().equals("") 
        || destinationTxt.getText().equals("") 
        || flightNumTxt.getText().equals("")
        || returnDateTxt.getText().equals("")) && returnRb.isSelected())||
    
        ((departureDateTxt.getText().equals("") 
        || departureTxt.getText().equals("") 
        || destinationTxt.getText().equals("")
        || flightNumTxt.getText().equals("")) && oneWayRb.isSelected())
     ){
      JOptionPane.showMessageDialog(null,"All Fields must be completed");  }
    
       else if((flexFareRb.isSelected()) && (baggageWeightTxt.getText().equals(""))){
    JOptionPane.showMessageDialog(null,"All Fields must be completed");
    }
       else{
         try{
            if(oneWayRb.isSelected()){
                departureDate = df.parse(departureDateTxt.getText());
            } else {
                departureDate = df.parse(departureDateTxt.getText());
                returnDate = df.parse(returnDateTxt.getText());
            }
            
            if(lowFareRb.isSelected()){

                    flight = new Flight(flightNumTxt.getText(), departureTxt.getText(), destinationTxt.getText(),departureDate);
            }
            else if(flexFareRb.isSelected()){
                    try{
                        Double baggageWeight = Double.parseDouble(baggageWeightTxt.getText());
                        flight = new Flex(flightNumTxt.getText(), departureTxt.getText(), destinationTxt.getText(),departureDate,inFlightMealCb.getSelectedItem().toString(),baggageWeight);
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Please enter a number in the Baggage Weight field.");
                    }
            }
            
           } catch(ParseException e) {
               JOptionPane.showMessageDialog(null,"Date is entered incorrectly. Please enter a date in format MM/dd/yyyy.");
           }
         
       }
        
    }//GEN-LAST:event_saveBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(FlightsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightsGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ReturnGrp;
    private javax.swing.ButtonGroup TypeGrp;
    private javax.swing.JLabel baggageWeightLbl;
    private javax.swing.JTextField baggageWeightTxt;
    private javax.swing.JRadioButton businessRb;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel departureDateLbl;
    private javax.swing.JTextField departureDateTxt;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JTextField departureTxt;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JRadioButton flexFareRb;
    private javax.swing.JLabel flightNumLbl;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JList<String> flightsBox;
    private javax.swing.JScrollPane flightsScroll;
    private javax.swing.JComboBox<String> inFlightMealCb;
    private javax.swing.JLabel inFlightMealLbl;
    private javax.swing.JRadioButton lowFareRb;
    private javax.swing.JRadioButton oneWayRb;
    private javax.swing.JComboBox<String> priorityBoardingCb;
    private javax.swing.JLabel priorityBoardingLbl;
    private javax.swing.JLabel returnDateLbl;
    private javax.swing.JTextField returnDateTxt;
    private javax.swing.JRadioButton returnRb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox<String> seatSelectionCb;
    private javax.swing.JLabel seatSelectionLbl;
    private javax.swing.JLabel ticketTypeLbl;
    // End of variables declaration//GEN-END:variables
}