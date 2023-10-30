
package usedcar_app_g1;

import javax.swing.*;

public class UsedCar {
String vin; //Vehicle Identification Number
String make; //Car make(e.g. Ford, Honda, Toyota...)
int year;//Year of car
int mileage; //Mileage of the car
int price; //Price of the car

//constants
public final static String DEFAULT_VIN = "999";
final int VIN_NUMBER_LENGTH = 4;
final int LOW_YEAR = 1997;
final int HIGH_YEAR = 2017;
final String[] MAKE = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};

//constructor that throws a custom exception
public UsedCar(String num, String carMake, int carYear, int miles, int pr) throws UsedCarException
{
     boolean isBad = false;
     boolean isGoodMake = false;
     int x; 
     
     //validation for the input paramters
     
     //Validation for the VIN (has to be 4 digits)
     if(num.length() != VIN_NUMBER_LENGTH)
         isBad = true;
     //Validation to check that all 4 digits in the VIN is a digit
     for(x=0; x<num.length(); ++x)
         if(!Character.isDigit(num.charAt(x)))
             isBad = true;
     
     //Validate the carMake against the array above 
     for(x=0; x < MAKE.length; ++x)
         if(carMake.equals(MAKE[x]))
             isGoodMake = true; //the car make is in the String array
             if(!isGoodMake)
                 isBad = true; //carMake is not part of the String array
             
      //Validation to check Year range (1997-2017), Price & Mileage
      if(carYear <LOW_YEAR || carYear >HIGH_YEAR || miles <0 || pr<0 )
          isBad = true;
      
      //if any validation checks failed, throw a custom exception
      if(isBad)
          throw new UsedCarException("Error in used car # " + num);
      
      //if validation checks passed, initialize the object's fields
      vin=num;
      make = carMake;
      year = carYear;
      mileage = miles;
      price = pr;  
}
//Default constructor
public UsedCar(){
    vin = DEFAULT_VIN;
    make = "XXX";
}

   public String getVin() {
        return vin;
    }
   
public String toString(){
    return "VIN:" + vin + " \nMake: " + make + " \nYear: " + year + "\nMileage: " + mileage + "\nPrice: R " + price;
}

}
