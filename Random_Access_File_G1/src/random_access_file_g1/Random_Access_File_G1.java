
package random_access_file_g1;

//Simple App to demonstrate the Random Access File Handling behaviour

import java.io.*; //required import statement for File Handling. 

public class Random_Access_File_G1 {
                
    private static final String FILE_PATH = "random_text.txt"; //relative file path
        
    public static void main(String[] args) {
        try{
                    //Call methods to perform various actions/operations
                    writeData(); //Write data to the file
                    readData(); //Read data to the file
                   modifyData(); //Modify the data within the file
                   readData();  //Read the data within the file after modifying
        }
        catch(IOException e){
            //Handle any IO Exceptions that might occure & print the stack trace
            e.printStackTrace();
        }
    }

    //Method to write data to a file
    public static void writeData() throws IOException {
        //Open the file in a read-write mode using the RandomAccessFile
        try(RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw")){
                //Write integers from 0 to 4 to this file
                for(int i =0; i<5; i++){
                    raf.writeBytes(String.valueOf(i) + "\n"); //this writes the values as text to the file 
//raf.writeInt(i); //this write to the the random_text.txt the values within the loop 
                }
        }
           }

    //Method to read data from the file
    public static void readData() throws IOException {
        //Open the file read-only mode using the RandomAccessFile
        try(RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "r")){
            //Read & print the integers from the text file
                for (int i=0; i<5; i++){
                    System.out.println("Reading from position " + i + " : " + raf.readInt() );
                }
        }
    
}

    public static void modifyData()  throws IOException{
        //Open the file in read-write mode using the RandomAccessFile
        try(RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw")){
                //modify at position 2 of the data within the text file 
                //Move the pointer to position 2 (integer is 4 bytes so 2*4 = 8 bytes offset)
                raf.seek(8);
                System.out.println("Modifying at position 2....");
                //re-write/update the value at that position / the 3rd integer in the list
                raf.writeInt(99);
 
        }
   
    }
}
