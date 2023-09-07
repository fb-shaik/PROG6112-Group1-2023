
package foodorderingapp_abstract_g1;

public class FoodOrderingApp_Abstract_G1 {

    public static void main(String[] args) {
       //create an instance of each concrete child class
       
//the abstract class is being used to create the child class object through the virtue of inheritance
       FoodItem pizza = new Pizza("Maragherita Pizza", 20.99);
       FoodItem burger = new Burger("Cheeseburger", 45.99);
       FoodItem salad = new Salad("Caesar Salad", 15.50);
       
       //display the above information that has been set via the parameterized constructor
        System.out.println("Food Items: ");
        displayFoodItemDetails(pizza);
        displayFoodItemDetails(burger);
        displayFoodItemDetails(salad);
    }
    
    //display method
    private static void displayFoodItemDetails(FoodItem item){
        System.out.println("Type: " + item.getType());
        System.out.println("Name: " + item.getName());
        System.out.println("Price: " + item.getPrice());
        System.out.println();
    }
    
}
