package demosubscriptions;

/**
 *Child class of the NewspaperSubscription Abstract Class
 * It will behave as a concrete class; we can create objects from this class
 */
public class OnlineNewspaperSubscription  extends NewspaperSubscription{

    @Override
    public void setAddress(String a) {
        boolean hasAtSign = false;
        address = a;
        for(int x = 0; x <a.length(); ++x)
            if(a.charAt(x) == '@')
                hasAtSign = true;
        if(hasAtSign)
            rate = 9.00;
        else
        {
            rate = 0;
            System.out.println("\nAdress must contain an at-sign (@)     ");
        }
    }

    
}
