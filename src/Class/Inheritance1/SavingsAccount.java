package Class.Inheritance1;
/*
Assume the existence of a BankAccount class.
Define a subclass, SavingsAccount that contains the following:
A double instance variable, interestRate.
A method getInterestRate that returns a value of interestRate.
A constructor that accepts a parameter of type double which is used to initialize the instance variable.
 */
public class SavingsAccount extends BankAccount {

    public double interestRate;

    public double getInterestRate () {
        return interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

}
