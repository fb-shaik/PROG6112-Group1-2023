
package pricelistapplication_throws_g1;


public class PriceList {
    //an array of prices
    public static final double [] prices = {15.99, 27.89, 30.50, 45.23};
    
    public static void displayPrice(int item) throws IndexOutOfBoundsException 
    {
            System.out.println("The price is R: " + prices[item]);
    }
    
}
