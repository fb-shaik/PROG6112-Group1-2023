
package demosubscriptions;

/**
 *Child class of the NewspaperSubscription Abstract Class
 * It will behave as a concrete class; we can create objects from this class
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String a) {
       boolean hasDigit = false;
       address = a ;
       for(int x = 0; x < a.length(); ++x)
       if(Character.isDigit(a.charAt(x)))
               hasDigit = true;
       if(hasDigit)
                rate = 15.00;
                else{ 
               rate =0;
               System.out.println("\nAddress must contain a digit  ");
               }
                
    }
    
}
