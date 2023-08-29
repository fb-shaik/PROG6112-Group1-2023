package vehicle_demo_g1;
public class Vehicle_Demo_G1 {

    public static void main(String[] args) {
       //Create objects from the Child class with use of the parameterized constructor 
       //from the Parent Class. 
       //We have 2 child classes (Car & Bicycle), create objects for both
       //Both objects have inherited the fields & methods of the Parent class
      Car car = new Car("Toyota", 2023);
      Bicycle bicycle = new Bicycle("Schwinn" , 2022);
      
      //use the objects above to interact with the Parent class methods
      car.startEngine(); //This is a parent class method
      car.drive(); //This is an exclusive method from the child class
      car.stopEngine();//This is a parent class method
        System.out.println();
        
        bicycle.pedal();
        
    }
    
}
