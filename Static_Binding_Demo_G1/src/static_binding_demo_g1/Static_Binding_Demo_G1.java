
package static_binding_demo_g1;

//Static Binding 
public class Static_Binding_Demo_G1 {
    public static void main(String[] args) {
       Parent object = new Child();  //Upcasting 
       object.display(); // Static Bind - calls the Child's display method at compile time
    }
    
}
