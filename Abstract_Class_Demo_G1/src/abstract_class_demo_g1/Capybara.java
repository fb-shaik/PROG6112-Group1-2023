
package abstract_class_demo_g1;
//SubClass(Child Class) will be a concrete class
//We can build objects from this class
//It will be an extension / inherited class from the abstract Animal
public class Capybara extends Animal{

    @Override
    public void speak() {
        System.out.println("Squeak!!!");
    }
    
}
