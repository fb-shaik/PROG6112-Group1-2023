package speedingfineapplication.g1;

/**
 *This is the parent class; it will be an abstract class 
 */
public abstract class Fine implements iFine {
    
    //fields for the Parent class; every child class will have access to these via inheritance
    private String citizenName;
    private int speed;
    private double finePayable;

//parameterized constructor that requires citizenName & speed as requested fields when creating objects
        public Fine(String citizenName, int speed) {
        this.citizenName = citizenName;
        this.speed = speed;
        this.finePayable = calculateFine(); 
    }

    public String getCitizenName() {
        return citizenName;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFinePayable() {
        return finePayable;
    }
    
    //abstract method to calculate the fine
    public abstract double calculateFine();
    
}
