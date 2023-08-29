
package pettamagotchi_demo_g1;

public class PetTamagotchi_Demo_G1 {


    public static void main(String[] args) {
        // Create an instance of the child class Dog, Cat, Bird, Unicorn
        
        // className objectName = new Constructor(parameters);
        // (String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age)
        Dog dog = new Dog("Buddy", 4, 6, 2, true, "brown", 4); // Child class object for the Dog Class
        Cat cat = new Cat("Whiskers", 2, 3, 2, false, "grey", 2); // Child class object for the Cat Class
        Bird bird = new Bird("Penny", 5, 8, 9, true, "yellow", 6); // Child class object for the Bird Class
        Unicorn unicorn = new Unicorn("Rainbow", 3, 10, 10, true, "white", 12); // Child class object for the Unicorn Class
        
        // Method calls for the child classes
        System.out.println("My pet: " + dog.getName());
        dog.feed();
        dog.sleep();
        dog.bath();
        dog.printStatus();
        
        System.out.println("\nMy pet: " + cat.getName());
        cat.feed();
        cat.sleep();
        cat.bath();
        cat.printStatus();
        
        System.out.println("\nMy pet: " + bird.getName());
        bird.feed();
        bird.sleep();
        bird.bath();
        bird.printStatus();
        
        System.out.println("\nMy pet: " + unicorn.getName());
        unicorn.feed();
        unicorn.sleep();
        unicorn.bath();
        unicorn.printStatus();
    }
}

