import java.util.*;
public class AccountDemo{
    public static void main(String[] args){
        // D1
        SavingsAccount joe = new SavingsAccount("Joe Bloggs", 3000.0, 0.05);
        // D2
        CheckingAccount mary = new CheckingAccount("Mary Smyth",500,150);
        // D3
        joe.deposit(300);
        // D4
        joe.newBalance();
        joe.withdrawal(345);
        // D5
        joe.setInterest(0.01);
        // D6
        mary.withdraw(700);
        // D7
        mary.setOverdraft(300);
        mary.withdraw(750);
        // D8
        mary.setCustomerName("Mary Smith");
        System.out.println(mary.getCustomerName());
        // D9
        joe.printDetails();
        System.out.println("Interest Rate: " + joe.getInterest());
        // D10
        mary.printDetails();
        System.out.println("Overdraft Limit: " + mary.getOverdraft());
    }
}
