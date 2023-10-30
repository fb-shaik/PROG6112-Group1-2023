package paths_demo_g1;

/*Paths Class - Paths is a helper class that eliminates the need for creating a FileSystem object
 */
import java.nio.file.*;

public class Paths_Demo_G1 {
    public static void main(String[] args) {
        //Path objectName = Paths.get(file path);
    
//create a Path object to represent the file path

Path path = Paths.get("Chapter 13/Data.txt"); //relative path (has a single foward slash) 
//everybody's file path will be different****
System.out.println("The Relative path is: " + path.toString());

//get a count of the elements in the file path
int count = path.getNameCount();
        System.out.println("There are " + count + " elements in this file path. ");
        
        //print out the file path 
        System.out.println("Path to the text file is: " + path.toString());
        
        //print the last element in the file pat (the file being used in the app)
        System.out.println("The File name is: " + path.getFileName());
        
        //Loop through the file path & print each element
        for(int x = 0; x <count; ++x)
            System.out.println("Element " + x + " is " + path.getName(x));
        
        Path fullPath = path.toAbsolutePath();
        System.out.println("The Absolute Path is: " + fullPath.toString());
    
    }
    
}
