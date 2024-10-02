/** 

//*********************************************************************** 

'Project: Assignment 1 

'Programmer: Sohail Samar

'Company Info: ssamar@mymail.csmd.edu   

'Date: 01 10 2024 

'Description:  Problem Number 1.   

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

public class SS_P01 {

  public static int mealOption, dormOption = 0;
  public static int total = 0;

  public static void main(String[] args) {
    String dorms[] = { "Choose a dorm option:", "Allen Hall: S1,500", "Pike Hall: $1,600", "Farthing Hall: $1,200",
        "University Suites: $1,800" };
    String meals[] = { "Choose a meal option:", "7 meals per week: $560", "14 meals per week: $1,095",
        "Unlimited meals: $1,500" };

    final JComboBox mealPlan = new JComboBox(meals);
    final JComboBox dormPlan = new JComboBox(dorms);
    final JLabel totalLabel = new JLabel("Total: $" + total);

    ActionListener mealPlanListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int i = mealPlan.getSelectedIndex();
        switch (i) {
          case 0:
            mealOption = 0;
            break;
          case 1:
            mealOption = 560;
            break;
          case 2:
            mealOption = 1095;
            break;
          case 3:
            mealOption = 1500;
            break;
        }
        total = mealOption + dormOption;
        totalLabel.setText("Total: $" + total);
      }
    };

    ActionListener dormPlanListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int i = dormPlan.getSelectedIndex();
        switch (i) {
          case 0:
            dormOption = 0;
            break;
          case 1:
            dormOption = 1500;
            break;
          case 2:
            dormOption = 1600;
            break;
          case 3:
            dormOption = 1200;
            break;
          case 4:
            dormOption = 1800;
            break;
        }
        total = mealOption + dormOption;
        totalLabel.setText("Total: $" + total);
      }
    };

    mealPlan.addActionListener(mealPlanListener);
    dormPlan.addActionListener(dormPlanListener);

    mealPlan.setBounds(20, 20, 200, 30);
    dormPlan.setBounds(20, 100, 200, 30);
    totalLabel.setBounds(20, 150, 200, 30);

    JFrame frame = new JFrame("Dormitory and Meal Plans");
    frame.add(dormPlan);
    frame.add(mealPlan);
    frame.add(totalLabel);
    frame.setVisible(true);
    frame.setSize(400, 500);
  }
}
