
package zoo_app_interface_g1;
public class Zoo_App_interface_G1 {
 //demonstrate the use of the interfaces of the Animal Class (Lion, Elephant, Penguin)
    public static void main(String[] args) {
        //Created instances of the different animals
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal penguin = new Penguin();
        
        //Make of the interfaces
        System.out.println("Welcome to the Zoo! ");
        System.out.println("\n--- Lion ---");
        lion.speak();
        lion.eat();
        
        System.out.println("\n--- Elephant ---");
        elephant.speak();
        elephant.eat();
        
        System.out.println("\n--- Penguin ---");
        penguin.speak();
        penguin.eat();
        
        System.out.println("\nThank you for visting the Zoo! ");
        
    }
    
}
