package abstract_class_demo_g1;
public abstract class Animal {
    private String name; 
    //abstract method has no method body & no {}
    //the concrete subclass/child class will provide a method body
    public abstract void speak();
    
    public String getName() {
        return name;
    }
    public void setName(String animalName) {
        name = animalName;
    }
}
