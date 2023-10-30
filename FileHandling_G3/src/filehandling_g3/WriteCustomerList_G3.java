
package filehandling_g3;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;


public class WriteCustomerList_G3 {

    public static void main(String[] args) {
        //Define a path to the file where data will be saved
        Path file = Paths.get("C:\\Users\\fshai\\Desktop\\Chapter 13\\CustomerList.txt");
        //Create scanner object 
        Scanner kb = new Scanner(System.in);
        
        //String to hold the record as its captured
        String s = "";
        String delimiter = " , "; //seperates the fields in the record
        String id;
        String firstName;
        String lastName;
        double balance;
        final String QUIT = "ZZZ"; //sentinel to exit the loop of capturing customer data
        
        try{
        //Set up the output stream to write data to the text file
        OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        //Ask for user input
            System.out.println("Enter ID number or " + QUIT + " to quit: ");
            id = kb.nextLine();
            
            //Continue prompting until user enters ZZZ
            while (!id.equals(QUIT)){
                System.out.println("Enter first name: ");
                firstName = kb.nextLine();
                System.out.println("Enter last name: ");
                lastName = kb.nextLine();
                System.out.println("Enter balance: ");
                balance = kb.nextDouble();
                
                kb.nextLine();//Required because nextDouble() does not read the newLine character
                
                //Construct the customer data as string
                s = id + delimiter + firstName + delimiter + lastName + delimiter + balance;
                //write the customer data to file
                writer.write(s,0,s.length());
                writer.newLine();
                System.out.println("Enter ID Number or " + QUIT + " to quit: ");
                id = kb.nextLine();
            }
            //Close the writer stream
            writer.close();
        }
        catch(Exception e){
            System.out.println("Message " + e); //Print any errors that might occur during the file writing process 
        }
       
    }
    
}
