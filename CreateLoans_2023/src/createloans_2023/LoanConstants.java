package createloans_2023;
/*
An Interface can only declare abstract methods & all methods declared
in an interface are implicitly public & abstract
Interfaces do not have instance variables, only constants (public static final fields)
Classes can implement multiple interfaces, allowing for multiple inheritance of type
*/
public interface LoanConstants {
    
    public static final int MAXLOAN = 100000;
    public static final int SHORT_TERM = 1;
    public static final int MEDIUM_TERM = 3;
    public static final int LONG_TERM = 5;
    public static final String COMPANY = "Sanchez Construction"; 

}
