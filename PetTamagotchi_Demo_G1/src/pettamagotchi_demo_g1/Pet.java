
package pettamagotchi_demo_g1;

//SuperClass: Pet
public class Pet {
    //Below represents the parent fields that all child classes will inherit
    private String name;

    private int hunger; // Scale: 0 (full) to 5 (starving)
    private int happiness; // Scale: 0 (unhappy) to 10 (ecstatic)
    private int tiredness; // Scale: 0 (rested) to 10 (exhausted)
    private boolean isClean; // Indicates if the pet is clean or dirty
    private String colour;
    private int age;

    //parameterized constructor to intialize the above fields for any instance of a pet object
    // as well as any instance of a child object created.
     public Pet(String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age) {
        this.name = name;
        this.hunger = hunger;
        this.happiness = happiness;
        this.tiredness = tiredness;
        this.isClean = isClean;
        this.colour = colour;
        this.age = age;
    }
     
     
    public String getName() {
        return name;
    }
    
    // Feed the pet if hunger level is below 2 and hunger scale is between 0 and 5
    public void feed() {
        if (hunger < 2 && hunger >= 0 && hunger <= 5) {
            System.out.println(name + " is being fed.");
            hunger = Math.max(0, hunger - 2);
        } else {
            System.out.println(name + " doesn't need to be fed right now.");
        }
    }

    // Put the pet to sleep if tiredness level and hunger level are both at 3, and happiness level is below 4
    public void sleep() {
        if (tiredness == 3 && hunger == 3 && happiness < 4) {
            System.out.println(name + " is going to sleep.");
            tiredness = 0;
            hunger = 0;
        } else {
            System.out.println(name + " doesn't want to sleep right now.");
        }
    }

    // Give the pet a bath to make it clean
    public void bath() {
        if (!isClean) {
            System.out.println(name + " is taking a bath.");
            isClean = true;
        } else {
            System.out.println(name + " is already clean.");
        }
    }
    
    // Display all the pet's levels for hunger, happiness, tiredness, and cleanliness
    public void printStatus() {
        System.out.println("Hunger Level: " + hunger);
        System.out.println("Happiness Level: " + happiness);
        System.out.println("Tiredness Level: " + tiredness);
        System.out.println("Is Clean: " + isClean);
    }
}

//The Dog class, inherits from the Pet class
class Dog extends Pet{

    public Dog(String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age) {
        super(name, hunger, happiness, tiredness, isClean, colour, age);
    }
}

//The Cat class, inherits from the Pet class
class Cat extends Pet{ 

    public Cat(String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age) {
        super(name, hunger, happiness, tiredness, isClean, colour, age);
    }
} 

//The Bird class, inherits from the Pet Class
class Bird extends Pet{

    public Bird(String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age) {
        super(name, hunger, happiness, tiredness, isClean, colour, age);
    }
}

//The Unicorn class inherits from the Pet class
class Unicorn extends Pet{

    public Unicorn(String name, int hunger, int happiness, int tiredness, boolean isClean, String colour, int age) {
        super(name, hunger, happiness, tiredness, isClean, colour, age);
    }
}
