package try_catch_block_demo_g1;
/**
 *Try_Catch_Block is used to handle exceptions in Java
 * Syntax: 
 * try{
 *              //code that is normally to occur
 *          }
 * catch(Exception e){
 *          //code to handle the exception that has occured
 *          }
 * finally{
 *          //finally block always executes
 *          // this is an optional aspect to add in
 *          //For every try block there can only be one finally block
 *          }
 */
public class Try_Catch_Block_Demo_G1 {

    public static void main(String[] args) {
        try{
                //code placed here is the normal run of the program
                //this code can generate an exception which will be caught by the catch block & handled there
                int divideByZero = 25/0;
                System.out.println("The resut of the the above is: " + divideByZero);
        }
        //within the catch block create an instance of the exception class 
        catch(ArithmeticException e){
                //provide a way to handle the exception caught from the try block
                System.out.println("Arithmetic Exception => " + e.getMessage());
        }
        finally{
                    System.out.println("This is a finally block; it will always run (exception or no exception occuring).");
        }
    }
    
}

