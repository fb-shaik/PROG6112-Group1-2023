
package file_path_class_demo_g1;

//This package imports all the classes & interfaces from the java new input/output package
//Allows for file operations to be applied to this program
import java.nio.file.*;


public class File_Path_Class_Demo_G1 {

    public static void main(String[] args) {
/*
        Path - This is a helper class
        Paths
        
        FileSystem - used to create the object
        FileSystems - contains the factory methods which assist in object creation 
        **The above are different classes
        Object creation: ClassName objectName = new Constructor(parameter)
        */
        
//Obtain the default FileSystem for the current environment
FileSystem fs = FileSystems.getDefault();

//Create a Path object representing the file path (everybody's file pat will be different)
Path path = fs.getPath("C:\\Users\\fshai\\Desktop\\Chapter 13\\Data.txt");

//print the information about the default FileSystem
System.out.println(fs);
    }
    
}
