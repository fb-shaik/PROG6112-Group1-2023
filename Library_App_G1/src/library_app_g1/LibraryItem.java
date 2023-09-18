
package library_app_g1;

//LibraryItem represents a Super/Parent Class
//will hold common properties of the library items
public class LibraryItem {
    
    private String title;

    //parameterized constructor
    public LibraryItem(String title) {
        this.title = title;
    }

    //will retrieve the item's title
    public String getTitle() {
        return title;
    }
    //display method used to display the info about the item
    public void displayInfo(){
        System.out.println("Title: " + title);
    }
    
}
