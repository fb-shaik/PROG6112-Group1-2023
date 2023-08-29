package employee_inheritance_g1;

public class Employee_Inheritance_G1 {
    
    public static void main(String[] args) {
        
        //create an object for all 3 class (1 object from the parent class, 2 objects from the 2 child class)
        //SuperClass - Employee
            Employee employee = new Employee("Joe", 10000, "Emp - 1");

        //Subclasses - Manager & Developer. Both child classes have exclusive fields used in the object build
        Manager manager = new Manager("Alice", 75000, "Mng - 1", "Sales"); 
        Developer developer = new Developer ("Jim", 100000, "Dev - 1", "Java");
        
        //we want to make use of metho overridding via the above object.method calls
        
        employee.introduce(); // SuperClass object that will call the superclass method
        employee.work();// SuperClass object that will call the superclass method
        
        manager.introduce(); // SubClass object that will call the over-ride subclass method
        developer.introduce();// SubClass object that will call the over-ride subclass method
        
        
        
        
       
    }
    
}
