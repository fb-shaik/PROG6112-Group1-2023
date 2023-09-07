
package abstract_class_demo_g1;

public class Abstract_Class_Demo_G1 {

    public static void main(String[] args) {
      //create an instance of each child class
      Dog myDog = new Dog();
      Snake mySnake = new Snake();
      Capybara myCapybara = new Capybara();
      
      myDog.setName("My dog Spike");
      mySnake.setName("My snake Sammy");
      myCapybara.setName("My capybara Larry");
      
        System.out.println(myDog.getName() + " says ");
        myDog.speak(); //implementation of the abstract method via the concrete child class verison of the method
        
        System.out.println(mySnake.getName() + " says ");
        mySnake.speak();//implementation of the abstract method via the concrete child class verison of the method
        
        System.out.println(myCapybara.getName() + " says ");
        myCapybara.speak();//implementation of the abstract method via the concrete child class verison of the method
        
        
      
       
        
        
    }
    
}
