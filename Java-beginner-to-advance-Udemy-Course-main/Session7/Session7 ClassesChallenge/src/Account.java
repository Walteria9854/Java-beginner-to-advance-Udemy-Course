public class Account {

    private int accountNumber;

    private int accountBalance;

    private String customerName;

    private String email;

    private String phoneNumber;

    public Account(){
        this(56789, 2, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, int accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = email;
        phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(9999, 10000, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of yen" + depositAmount + "made. New balance is Yen" + this.accountBalance);

    }

    public void withdrawFunds(int withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have Yen" + accountBalance + "in your account");
        }else{
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed, Remaining balance is" + accountBalance + "Yen");
        }
    }


    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
