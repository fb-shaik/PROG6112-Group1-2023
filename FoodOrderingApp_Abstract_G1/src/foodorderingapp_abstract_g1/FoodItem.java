/*
 *Abstract Class - FoodItem with a constructor that takes the name & price of the food item
This class serves as a blueprint for specific food item classes
 */
package foodorderingapp_abstract_g1;

public abstract class FoodItem {
    private String name;
    private double price;
    
    //abstract method to get the type of food item
    //abstract method does not have a method body & a set of {}
    abstract String getType(); 
    
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
      public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
   
}
