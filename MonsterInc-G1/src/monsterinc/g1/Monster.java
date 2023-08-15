
package monsterinc.g1;
//Class to hold the details about our monsters
public class Monster {
    private String name;
    private String[] abilities; //array to store the many abilities of our monsters
    
    //Create a parameterised constructor
    public Monster (String name, String[] abilities)
    {
            this.name = name; 
            this.abilities = abilities;
    }
    
    public String getName()
    {return name;}
    
    public String[] getAbilities()
    {return abilities;}
}
