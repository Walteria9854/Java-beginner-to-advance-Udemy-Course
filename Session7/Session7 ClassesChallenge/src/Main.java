public class Main {

    public static void main(String[] args){
        Account account = new Account();
        account.setAccountNumber(1234556);
        account.setAccountBalance(1000);
        account.setCustomerName("YukiKatayama");
        account.setEmail("yukikatayama@gmail.com");
        account.setPhoneNumber("09088887777");

        System.out.println("Account Number is = " + account.getAccountNumber());
        System.out.println("Account balance is =" + account.getAccountBalance());
        System.out.println("Account Customer is = " + account.getCustomerName());
        System.out.println("Account Email is = " + account.getEmail());
        System.out.println("Account PhoneNumber is = " + account.getPhoneNumber());

        account.withdrawFunds(10000);
        account.depositFunds(250);


    }
}
