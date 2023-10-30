
package usedcar_app_g1;

/*
This class UsedCarException inherits from the Exception class
This means that USedCarException is a type of exception that can be thrown in your code
Exception Class is a built-in class that is automatically available
*/

public class UsedCarException extends Exception {
    
    //This is the constructore for the UsedCarException class
    //Takes a single argument (String s) that will be used to display the custom error msg when invoked / exception is caught
    public UsedCarException(String s){
        
            super(s);
            //this will invoke the constructor of the parent class (Exception) when provided an error message via s
    }
}
