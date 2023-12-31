
package demosubscriptions;

/**
 *This class will be abstract & is the parent/super class
 */
public abstract class NewspaperSubscription {
    private String name;
    String address;
    double rate;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }
    
    public abstract void setAddress(String s);
    
}
