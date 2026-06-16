public class Main {

    public static void main(String[] args){
        //Number1
        Customer customer = new Customer("Yuki Katayama1", 100999.99, "Yukikatayama@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        //Number2
        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());


//      Number3
        Customer customer1 = new Customer("YukiKatayam2", "Yukiaktayamatest2@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

    }
}
