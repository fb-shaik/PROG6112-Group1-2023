package throw_throws_demo_g1;

/**
Throw - is used to explicity throw a single exception
Throws - is used to declare the type of exceptions that might occur within the method; It is used in the method declaration 
 */
public class Throw_Throws_Demo_G1 {

    public static void main(String[] args) {
          try{
                //using the throw keyword to manually throw an exception
                throw new ArithmeticException(" This is an ArithemtricException.");
          }
          catch(ArithmeticException e){
                    System.out.println("Caught ArithmetricException: " + e);
          }
          
          try{
                //using the throws keyword in the method to specify potential exceptions
                int result = divide(10, 0);
                System.out.println("Result: " + result);
          }
          catch(ArithmeticException e){
              System.out.println("Caught ArithmetricException: " + e);
          }
         
}
    //using the throws keyword in the method to specify potential exceptions
    public static int divide(int dividend, int divisor) throws ArithmeticException{
            if(divisor == 0){
                    throw new ArithmeticException("Division by Zero is not allowed. ");
            }
            return dividend/divisor;
    }
    {
    
    
    }
    
}
