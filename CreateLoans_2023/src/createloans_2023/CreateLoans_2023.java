package createloans_2023;
/*
An application that creates an array of five Loans. 
Prompt the user for the current prime interest rate. 
Then, in a loop, prompt the user for a loan type and all relevant information for that loan. 
Store the created Loan objects in the array. 
When data entry is complete, display all the loans.
*/
import javax.swing.*;
public class CreateLoans_2023 implements LoanConstants{

    public static void main(String[] args) {
        final int MAX = 5;
        Loan[] loan = new Loan[MAX];
        int num;
        int x;
        String name;
        double amt, rate;
        int loanType;
        int term;
        String inStr, outString = COMPANY + "\n";
        
        inStr = JOptionPane.showInputDialog(null, "Welcome to " + COMPANY + "\nEnter current prime interest rate in a decimal format: " );
        rate = Double.parseDouble(inStr);
        
        for(x=0; x <MAX; ++x){
            inStr = JOptionPane.showInputDialog(null, "Is this a (1) Business Loan" + "\nor (2) Personal Loan");
            loanType = Integer.parseInt(inStr);
            inStr = JOptionPane.showInputDialog(null, "Enter account number: ");
            num = Integer.parseInt(inStr);
            
            
            
        
        }
        
        

    }
}

