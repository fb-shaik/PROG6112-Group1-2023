
package streamdemo_g1;

//import java.nio.file.*; (Import is the updated I/O package)
import java.io.*;  //(Legacy package)

public class StreamDemo_G1 {

    public static void main(String[] args) {
        String filename = "Stream_Demo.txt"; //save the data from the app in this file
        //this text file will be stored within the NetBeans project folder for this app
        String content = "Hello, Streams";
        
        //Write text data to the above file (Stream_Demo.txt) using OutputStream Class
        try(OutputStream out = new FileOutputStream(filename))
        {
                    out.write(content.getBytes());
                    System.out.println("Data written using OutputStream!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
//Read raw bytes from the above file using InputStream
 try (InputStream in = new FileInputStream(filename))
 { 
 int data;
        System.out.println("Data read using InputStream");
        //this will make sure everything in the file is read
        while((data = in.read()) !=-1) {
            System.out.println((char)data);
        }
 }
 catch(IOException e){
     e.printStackTrace();
 }
 
 //Read the text data from that file using Reader Class
 try(Reader reader = new FileReader(filename)){
  int data;
        System.out.println("Data read using Reader");
        //this will make sure everything in the file is read
        while((data = reader.read()) !=-1) {
            System.out.println((char)data);
        }
 }
 catch(IOException e){
 e.printStackTrace();
 }
 
    }
    
}
