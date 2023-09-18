
package library_app_g1;

public class Library_App_G1 {

    public static void main(String[] args) {
        //Create an array of LibraryItem objects
        LibraryItem [] libraryitems = new LibraryItem[4];
        libraryitems[0] = new Book("The Great Gatsby", "F.Scott Fitzgerald");
        libraryitems[1] = new DVD("The Matrix", "Wachowskis");
        libraryitems[2] = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryitems[3] = new DVD("Interstellar", "Christopher Nolan");
        
        //create some patron objects
        Patron patron1 = new Patron("Alice");
        Patron patron2 = new Patron("Bob");
        
        //Method calls to the borrow & return methods 
        patron1.borrowItem(libraryitems[0]);
        System.out.println();
        patron2.borrowItem(libraryitems[2]);
        System.out.println();
        patron1.returnItem(libraryitems[1]);
        System.out.println();
        patron2.returnItem(libraryitems[3]);
    }
    
}
