
package createloans_2023;
//SubClass of the Loan (Parent) Class
public class BusinessLoan extends Loan {
    //parameterized constructor; set interest rate to 1%+ current prime int rate
    public BusinessLoan(int num, String name, double amt, int yrs, double prime){
    super(num,name, amt,yrs);
    rate = prime + 0.01;
    
    }
}
