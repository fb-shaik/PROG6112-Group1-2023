
package usedcar_app_g1;

public class UsedCar_App_G1 {

    public static void main(String[] args) {
       UsedCar[] cars = new UsedCar[7]; //array of 7 objects
       String [] vins = {"1234", "1245","aa12", "4567", "4568", "7896","12222"};
       String[] makes = {"Ford", "Honda", "Toyota", "Chrysler", "BMW", "MINI", "Other"};
       int [] years = {2002, 2011, 2000, 1998, 1993, 1997, 2017};
       int [] mileages = {150000, 20000, -190000, 322, 21312, 99000,5555};
       int [] prices = {1200, 213, 12320, 7890,23123,66781,9809};
       int x;
       
       //Create an array of the UsedCar objects
       for (x = 0 ; x <cars.length; x++)
           cars[x] = new UsedCar();
       
//Attempt to create the UsedCar objects based on provided data & handle any exceptions found
for (x=0; x <cars.length; ++x){
    try{
        cars[x] = new UsedCar(vins[x], makes[x], years[x], mileages[x], prices[x]);        
    }
    catch(UsedCarException error){
        System.out.println("Error: " + error.getMessage());
    }

      //Print details of all the valid objects that were created
        System.out.println("\\nGood Used car values: ");
        for(x=0; x<cars.length; ++x){
            if(!cars[x].getVin().equals(UsedCar.DEFAULT_VIN))
                System.out.println(cars[x].toString());
        }
    }
    }
    
}
