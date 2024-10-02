/** 

//*********************************************************************** 

'Project: Assignment 1 

'Programmer: Sohail Samar

'Company Info: ssamar@mymail.csmd.edu   

'Date: 01 10 2024 

'Description:  Problem Number 2.

'     

'   LINE 1 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

'   LINE 2 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

'   LINE 3 AT LEAST 3 LINES OF PROGRAM DESCRIPTION 

' 

'	-------------------------------------------------------------------------- 

'   							HONOR CODE:  

'	I pledge that this program represents my own program code, I have received  

'	help from no one and I have given help to no one. 

'	 

'								OR 

' 

'	I received help from NAME OR NO ONE in designing and debugging my program. 

'	I given help to NAME OR NO ONE in designing and debugging my program. 

'----------------------------------------------------------------------------- 

' 

'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS 

'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS 

'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE 

0........1.........2.........3.........4.........5.........6.........7.........8 

12345678901234567890123456789012345678901234567890123456789012345678901234567890 

*/ 

import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class SS_P02 {

  public static void main(String[] args) {

    // Create the frame and layout constraint
    JFrame frame = new JFrame("Business calculator");
    frame.setLayout(new GridBagLayout());
    GridBagConstraints layoutConst = new GridBagConstraints();

    // Trip field days
    layoutConst.gridx = 0;
    layoutConst.gridy = 0;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel tripDaysLabel = new JLabel("Days on trip:");
    frame.add(tripDaysLabel, layoutConst);

    final JTextField tripDaysField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.gridy = 0;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(tripDaysField, layoutConst);

    // Airfare
    layoutConst.gridx = 0;
    layoutConst.gridy = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel airfareLabel = new JLabel("Airfare in $:");
    frame.add(airfareLabel, layoutConst);

    final JTextField airfareField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(airfareField, layoutConst);

    // Car rental fees
    layoutConst.gridx = 0;
    layoutConst.gridy = 2;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel carRentalLabel = new JLabel("Car rental fees in $:");
    frame.add(carRentalLabel, layoutConst);

    final JTextField carRentalField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(carRentalField, layoutConst);

    // Miles driven from private vehicle
    layoutConst.gridx = 0;
    layoutConst.gridy = 3;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel milesDrivenLabel = new JLabel("Miles driven from private vehicle:");
    frame.add(milesDrivenLabel, layoutConst);

    final JTextField milesDrivenField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(milesDrivenField, layoutConst);

    // Parking fees
    layoutConst.gridx = 0;
    layoutConst.gridy = 4;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel parkingFeesLabel = new JLabel("Parking fees in $:");
    frame.add(parkingFeesLabel, layoutConst);

    final JTextField parkingFeesField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(parkingFeesField, layoutConst);

    // Taxi charges
    layoutConst.gridx = 0;
    layoutConst.gridy = 5;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel taxiChargesLabel = new JLabel("Taxi charges in $:");
    frame.add(taxiChargesLabel, layoutConst);

    final JTextField taxiChargesField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(taxiChargesField, layoutConst);

    // Conference/Seminar fees
    layoutConst.gridx = 0;
    layoutConst.gridy = 6;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel conferenceFeesLabel = new JLabel("Conference/Seminar fees in $:");
    frame.add(conferenceFeesLabel, layoutConst);

    final JTextField conferenceFeesField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(conferenceFeesField, layoutConst);

    // Nightly lodging charges
    layoutConst.gridx = 0;
    layoutConst.gridy = 7;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JLabel nightlyLodgingLabel = new JLabel("Lodging charges per night in $:");
    frame.add(nightlyLodgingLabel, layoutConst);

    final JTextField nightlyLodgingField = new JTextField(10);
    layoutConst.gridx = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    frame.add(nightlyLodgingField, layoutConst);

    // Calculate button
    layoutConst.gridx = 0;
    layoutConst.gridy = 8;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    JButton calculateButton = new JButton("Calculate");
    frame.add(calculateButton, layoutConst);

    // Expenses label
    layoutConst.gridx = 2;
    layoutConst.gridy = 0;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    final JLabel expensesLabel = new JLabel("Expenses: $0.00");
    frame.add(expensesLabel, layoutConst);

    // Allowable expenses label
    layoutConst.gridy = 1;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    final JLabel allowableExpensesLabel = new JLabel("Allowable expenses: $0.00");
    frame.add(allowableExpensesLabel, layoutConst);

    // Expenses to be paid
    layoutConst.gridy = 2;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    final JLabel expensesToBePaidLabel = new JLabel("Expenses to be paid: $0.00");
    frame.add(expensesToBePaidLabel, layoutConst);

    // Amount saved
    layoutConst.gridy = 3;
    layoutConst.insets = new Insets(10, 10, 10, 10);
    final JLabel amountSavedLabel = new JLabel("Amount saved: $0.00");
    frame.add(amountSavedLabel, layoutConst);

    // Calculate button action listener
    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int days = Integer.parseInt(tripDaysField.getText());

        // Fees
        double airfare = Double.parseDouble(airfareField.getText());
        double carRental = Double.parseDouble(carRentalField.getText());
        int miles = Integer.parseInt(milesDrivenField.getText());
        double parkingFees = Double.parseDouble(parkingFeesField.getText());
        double taxiCharges = Double.parseDouble(taxiChargesField.getText());
        double conferenceFees = Double.parseDouble(conferenceFeesField.getText());
        double nightlyLodging = Double.parseDouble(nightlyLodgingField.getText());

        double totalExpenses = airfare + carRental + parkingFees + taxiCharges + conferenceFees
            + (nightlyLodging * days);
        String expenseRound = String.format("%.2f", totalExpenses);
        expensesLabel.setText("Expenses: $" + expenseRound);

        double reimbursement = (37 * days) + (10 * days) + (20 * days) + (95.40 * days) + (0.27 * miles);
        String reimbursementRound = String.format("%.2f", reimbursement);
        allowableExpensesLabel.setText("Allowable expenses: $" + reimbursementRound);

        if (totalExpenses > reimbursement) {
          String difference = String.format("%.2f", totalExpenses - reimbursement);
          expensesToBePaidLabel.setText("Expenses to be paid: $" + difference);
        } else if (totalExpenses < reimbursement) {
          String difference = String.format("%.2f", reimbursement - totalExpenses);
          amountSavedLabel.setText("Amount saved: $" + difference);
        }
      }
    });

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
