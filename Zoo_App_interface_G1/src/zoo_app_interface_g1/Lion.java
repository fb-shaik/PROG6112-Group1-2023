package zoo_app_interface_g1;

//Step One - Define the 'Animal' Interface
interface Animal{
void speak(); //Abstract method to make the 'animal' speak
void eat(); //Abstract method to make the 'animal' eat
}

//Lion - concrete class; child class of the above Animal Interface 
//ChildClass implements behaviour from interface Parent Class
//childClassName implement (interface) ParentClassName
public class Lion implements Animal {

    @Override
    public void speak() {
        System.out.println("Lion: Roars!");
    }
    @Override
    public void eat() {
         System.out.println("Lion: Eating meat.");}
}

class Elephant implements Animal 
{//Elephant class is child & will implement the interface Animal Class 
    @Override
    public void speak() {
        System.out.println("Elephant: Trumpet!");}
        
    @Override
    public void eat() {
        System.out.println("Elephant: Eating leaves & grass.");
}
}

class Penguin implements Animal{
//Penguin class is child & will implement the interface Animal Class 
    @Override
    public void speak() {
        System.out.println("Penguin: Squawk!");}
        
    @Override
    public void eat() {
        System.out.println("Penguin: Eating fish.");
}
}