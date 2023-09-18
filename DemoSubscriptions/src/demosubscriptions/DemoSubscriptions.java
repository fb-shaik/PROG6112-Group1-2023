
package demosubscriptions;

public class DemoSubscriptions {

    public static void main(String[] args) {
        //2 child objects each to test the setAddress method regarding the validation 
       PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
       PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
       
       OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
       OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription(); 
       
       pnsGood.setName("Joe");
       pnsGood.setAddress("23 Oak Avenue");
      display(pnsGood); 
      
      pnsBad.setName("Jake");
      pnsBad.setAddress("Maple Street");
      display(pnsBad);
      
      
      onsGood.setName("Carter");
      onsGood.setAddress("carter@gmail.com");
      display(onsGood);
      
      onsBad.setName("Mike");
      onsBad.setAddress("mike-gmail.com");
      display(onsBad); 
       
       
    }
    
    public static void display(NewspaperSubscription name)
    {
        System.out.println("Name: " + name.getName() + "         Address:  " + name.getAddress() + 
                                                "     Rate:   " + name.getRate() + "\n");
    }
    
}
