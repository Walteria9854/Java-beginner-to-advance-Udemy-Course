public class Account {

    private int accountNumber;

    private int accountBalance;

    private String customerName;

    private String email;

    private String phoneNumber;

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
