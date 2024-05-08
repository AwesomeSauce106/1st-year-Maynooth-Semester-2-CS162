public class Account{
    protected String customerName;        // A1
    protected double accountBalance;      // A1
    // A2
    protected static int uid = 1000;
    protected int accountID;
    
    // A3
    public Account(String customerName, double accountBalance){
        this.customerName = customerName;
        if(accountBalance < 0.0){
            accountBalance = 0.0;
        }else{
            this.accountBalance = accountBalance;
        }
        uid++;
        accountID = uid;
    }
    // A4
    public void setCustomerName(String customerName){
        this.customerName = customerName; 
    }
    public String getCustomerName(){
        return customerName;
    }
    // A5
    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance; 
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public int getAccountID(){
        return accountID;
    }
    // A6
    public void deposit(double deposit){
        accountBalance += deposit;
    }
    // A7
    public void withdrawal(double withdrawal){
        if(accountBalance < withdrawal){
            System.out.println("Exceeds account's limits");
        }else{
            accountBalance -= withdrawal;
        }
    }
    // A8
    public void printDetails(){
        System.out.println("Account Name: " + customerName);
        System.out.println("Account Number: " + accountID);
        System.out.println("Balance: " + accountBalance);
    }
}
