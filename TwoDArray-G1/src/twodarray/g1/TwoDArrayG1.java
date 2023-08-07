
package twodarray.g1;
import javax.swing.*;
//Simple app to illustrate 2D arrays
public class TwoDArrayG1 {
    public static void main(String[] args) {
/*
        1D array syntax: datatype arrayName[size] = {elements};
        2D array syntax: datatype arrayName[Rows][Columns] = {
                                                                                                                    {R1,R1,R1},
                                                                                                                    {R2,R2,R2},
                                                                                                                    {R3,R3,R3},
                                                                                                                    {R4, R4, R4}
                                                                                                                }
        */       
        
//declare a 2D array with 4 rows & 3 columns
int [][] rental = {
                                {400, 500,650}, //R1
                                {650, 800,950}, //R2
                                {1050, 1200,1450}, //R3
                                {1650, 1900,2450}, //R4
                              };
String userEntry; //used to hold the user prompt
int floors; // holds the user value for which floor they wish to rent on
int bedrooms; //holds the user value for number of bedrooms they want to rent

//JOptionPane prompt to ask the user which floor & number of bedrooms they wish to rent
userEntry = JOptionPane.showInputDialog("Enter which floor you wish to rent on (1-4) :");
floors = Integer.parseInt(userEntry);

userEntry = JOptionPane.showInputDialog("How many bedrooms would you like to have (1-3) :");
bedrooms = Integer.parseInt(userEntry);

//JOptionPane show message to display back to the user the rental price based on the above prompts
        JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + "  bedrooms " + " on the "  + floors + " floor will be R " + 
                rental[floors-1][bedrooms-1]);
       
    }
    
}
