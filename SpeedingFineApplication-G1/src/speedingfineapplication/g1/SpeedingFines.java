
package speedingfineapplication.g1;

/**
 *This is a child class of the Fine Class (Parent Class)
 * It will inherit any fields & methods within the Parent Class
 * This child class will also have to provide any implementation for any inherited abstract methods
 */

public class SpeedingFines extends Fine implements iFine {
    
    //create a parameterized constructor (citizenName & speed)
    public SpeedingFines(String citizenName, int speed){
        super(citizenName, speed);
    }
    
    //Implement the PrintFine Method that has been created in the iFine interface
public void PrintFine(){
    System.out.println("Citizen Name: " + getCitizenName());
    System.out.println("Speed: " + getSpeed() + " km/h");
    System.out.println("Fine Payable: R" + getFinePayable());
}    

//Implement the calculateFine Method that has been created in the Fine class 
public double calculateFine(){
if(getSpeed() >= 120){
    return getSpeed() *10.20;
    } 
    else{
        return 0.0;
        }
    }
}
