public class CheckingAccount extends Account{
    // C1
    private double overdraft;

    // C2
    public CheckingAccount(String name, double balance,double overdraft){
        super(name,balance);
        this.overdraft = overdraft;
    }
    // C3
    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }
    public double getOverdraft(){
        return overdraft;
    }
    // C4
    public void withdraw(double d){
        if( (accountBalance - d) >= -overdraft){
            accountBalance -= d;
        }else{
            System.out.println("Exceeds overdraft limits");
        }
    }
}
