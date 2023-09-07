/* Concrete class, which extends from the abstract FoodItem class.
 *Provides implementation for the getType() method to specify the type of food item
 */
package foodorderingapp_abstract_g1;
//SubClass extends from AbstractParent Class  (extends invokes the inheritance aspect)
public class Pizza extends FoodItem {

    public Pizza(String name, double price) {
        super(name, price);
    }
    
//this is the implementation of the abstract method via the concrete child class 
    @Override
    String getType() {
        return "Pizza";    
    }
    
}
