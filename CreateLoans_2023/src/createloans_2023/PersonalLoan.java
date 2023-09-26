
package createloans_2023;
//SubClass of the Loan (Parent Class)
public class PersonalLoan extends Loan {

    public PersonalLoan(int num, String name, double amt, int yrs, double prime) {
        super(num, name, amt, yrs);
        rate = prime + 0.02;
    }
    
    }   

