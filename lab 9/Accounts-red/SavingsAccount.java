public class SavingsAccount extends Account{
    // B1
    private double intrest;
    // B2
    public SavingsAccount(String name, double balance, double i){
        super(name,balance);
        intrest = i;
    }
    // B3
    public void setInterest(double i){
        intrest = i;
    }
    public double getInterest(){
        return intrest;
    }
    // B4
    public void newBalance(){
        accountBalance = accountBalance+(accountBalance*intrest);
    }
}
