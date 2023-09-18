
package static_binding_demo_g1;

//SuperClass
public class Parent {
    void display(){
        System.out.println("Parent's display method" );
    }
    
}

//SubClass
class Child extends Parent{
@Override
void display(){
        System.out.println("Child's display method" );
    }
}
