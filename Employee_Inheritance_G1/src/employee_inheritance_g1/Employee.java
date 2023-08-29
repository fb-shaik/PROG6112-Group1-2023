package employee_inheritance_g1;

//SuperClass: Employee
public class Employee {
    String name;
    double salary;
    String empID;
   
    //parameterized constructor for the superclass
    Employee(String name, double salary, String empID)
    {
            this.name = name;
            this.salary = salary;
            this.empID = empID;
    }
    
    //superclass methods
    void introduce()
    {System.out.println("Hello, I'm " + name + " & I'm an employee at company X ");}
    
    void work()
    {System.out.println(name + " is a valued employee ");}
}
//syntax: class SubClass extends SuperClass
//Subclass: Manager
class Manager extends Employee{
String department; //exclusive field to this child class called Manager 

    public Manager(String name, double salary, String empID, String department) {
        super(name, salary, empID); //no need to add in the exculsive child field here. Parent does not inherit from child class
        this.department = department;
    }
    
@Override
    void introduce()
    {
            System.out.println("Hello, I'm " + name + " & I'm the manager for the " + department + " department. ");
    }
    
}
//Subclass: Developer
class Developer extends Employee{
    String programmingLanguage;//exclusive field to this child class called Developer 

    public Developer(String name, double salary, String empID, String programmingLanguage) {
        super(name, salary, empID);//no need to add in the exculsive child field here. Parent does not inherit from child class
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    void introduce()
    {
        System.out.println("Hi, I'm " + name + " & I'm a developer thats specializes in " + programmingLanguage + " . ");
    }
    

}