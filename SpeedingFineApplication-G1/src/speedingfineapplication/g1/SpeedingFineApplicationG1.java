
package speedingfineapplication.g1;

public class SpeedingFineApplicationG1 {

    public static void main(String[] args) {
       //capture citizen name & speed
       String citizenName = " John Doe";
       int speed = 150;
       
       //create an object from the child Class
       SpeedingFines speedingFine = new SpeedingFines(citizenName, speed);
       
       //Call the PrintFine method to display the fine details
       speedingFine.PrintFine();
    }
    
}
