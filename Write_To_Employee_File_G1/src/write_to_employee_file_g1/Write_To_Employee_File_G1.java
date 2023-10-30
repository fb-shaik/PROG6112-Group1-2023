package write_to_employee_file_g1;

import java.io.*;
import java.util.Scanner; //used to capture keyboard input

public class Write_To_Employee_File_G1 {

    public static void main(String[] args) {
        //create an new scanner object for reading user input
        Scanner input = new Scanner(System.in);
        
        //Relative file path to the file we'll write user input to
        //If the file does not exist, it will be created in the project's root directory
        String filePath = "Employees.txt";
        
        //Variables to store employee data
        int id;
        String name;
        double payRate;
        String record = " "; //will be used to combine the individual variables above into a single string
        String delimiter = " , "; //This helps seperate the data as its stored into the single string; makes the text file be known as CSV file (comma-seperated values)
        final int QUIT = 999; //sentinal to quit capturing data & end the program
        
        try{
        //Create a FileWriter object to write to the file above (Employees.txt)
        FileWriter fw = new FileWriter(filePath, true);
        //BufferedWriter for efficiency 
        BufferedWriter writer = new BufferedWriter(fw);
        //Prompt user for data input
            System.out.println("Enter employee ID: ");
            id= input.nextInt();
            //while loop to continue data capture until the QUIT value is used
            while(id != QUIT){
            //prompt for name & pay-rate
                System.out.println("Enter name for employee # " + id + " : ");
                input.nextLine();
                name = input.nextLine();
                
                System.out.println("Enter pay rate for employee # " + id + ": ");
                payRate = input.nextDouble();
                
//Construct a 'record' for the above inputs (Record is a collection of related fields/inputs)
record = id + delimiter + name + delimiter + payRate; //(1, Joe, 5000)

//write the constructed record to the text file
writer.write(record);
writer.newLine(); //Move to the next line in the text file & place the next record there
System.out.println("Enter the next ID or : " + QUIT + " to quit: ");
id= input.nextInt();
            }
            //Close BufferWriter, which also closes the FileWriter
            writer.close();
        }
        catch(Exception e){
            System.out.println("Message " + e);
        }
       
    }
    
}
