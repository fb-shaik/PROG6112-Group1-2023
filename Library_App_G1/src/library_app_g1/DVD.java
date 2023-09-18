
package library_app_g1;

//Child class of the LibraryItem Parent Class
public class DVD extends LibraryItem {
    //director field thats exclusive to the DVD class; Parent nor Book class have access to this field
    private String director;
    
    public DVD(String title, String director) {
        super(title); //Calls the constructor of the superclass
        this.director = director;
    }
    
    @Override
    public void displayInfo(){
    super.displayInfo(); //Call the super class verion of this override method
        System.out.println("Director: " + director);
        System.out.println("Type: DVD ");
    }
    
}
