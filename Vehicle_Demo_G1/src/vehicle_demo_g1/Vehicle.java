
package vehicle_demo_g1;
//Vehicle will represent the parent class / super class / base class
//A generalized class that will hold generic fields & methods which a child class will inherit 
public class Vehicle {
    String brand; //parent class fields
    int year; //parent class fields
    
    //parameterized constructor that passes along the above fields to the current object in use
   Vehicle(String brand, int year)
   {this.brand = brand;
     this.year = year;}
    
    //parent class methods
    void startEngine()
    {
            System.out.println("Starting the engine of " + brand);
    }
    
    void stopEngine()
    {
            System.out.println("Stopping the engine of " + brand);
    }    
}

//Subclass: Car (inherits from super class called Vehicle)
//syntax: class ChildClassName extends ParentClassName
class Car extends Vehicle{
//parameterized constructor for child class that comes from the parent class via keyword super
    public Car(String brand, int year) {
        super(brand, year);
    }
    
    void drive(){
        System.out.println("Driving the " + brand + " car. ");
    }
}

//Subclass: Bicycle (inherits from super class called Vehicle) 
class Bicycle extends Vehicle{

    public Bicycle(String brand, int year) {
        super(brand, year);
    }
    
    void pedal(){
        System.out.println("Pedaling the " + brand + " bicycle. ");
    }

} 