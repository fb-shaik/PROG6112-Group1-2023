package library_app_g1;
//Child class of the LibraryItem Parent Class
//Book class inheriting from the LibraryItem Class

public class Book extends LibraryItem{
    private String author; //exclusive field to the Book class
    
    public Book(String title, String author) {
        super(title); //Call the constructor of the superclass/parent class
        this.author = author; //needed for any Book objects created; exclusive to the Book objects only 
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo(); //Calls the superclass method as it exists within the Parent Class, no changes as yet
        System.out.println("Author: " + author);
        System.out.println("Type: Book");
    }
    
}
