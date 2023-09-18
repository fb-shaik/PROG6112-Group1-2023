
package library_app_g1;

//Patron is a class to represent library patrons
public class Patron {
    private String name;
    
    //parameterized constructor for the Patron objects 
     public Patron(String name) {
        this.name = name;
    }
     
     //retrieve the Patron name
         public String getName() {
        return name;
    }
         //                                                 (ClassName object)
         public void borrowItem(LibraryItem item){
             System.out.println(name + " has borrowed this item:");
             item.displayInfo();
             
         }
         
         public void returnItem(LibraryItem item){
             System.out.println(name + " has returned the item:");
             item.displayInfo();
         
         }
    
}
