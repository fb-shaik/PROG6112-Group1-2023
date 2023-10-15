
package pricelistapplication_throws_g1;

import java.util.*;
public class PriceListApplication_Throws_G1 {

    public static void main(String[] args) {
   int item;
   Scanner input = new Scanner(System.in);
   final int MAXITEM = 3;
        System.out.println("Enter an item number: ");
        item = input.nextInt();
        
        try{
                PriceList priceList = new PriceList();
                        PriceList.displayPrice(item);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(MAXITEM);
        }
   
    }
    
}
