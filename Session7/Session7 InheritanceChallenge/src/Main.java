public class Main {

    public static void main(String[] args){

        Employee Tim = new Employee("Tim", "11/11/1985","01/01/2022");
        System.out.println(Tim);
        System.out.println("Age = " + Tim.getAge());
        System.out.println("Pay = " + Tim.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "11/11/1987", "01/01/2024", 35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = $" + Joe.collectPay());

        Joe.retire();
        System.out.println("Joe's pension check = $" + Joe.collectPay());

        HourlyEmployee Michelle = new HourlyEmployee("Michelle", "11/11/2000", "01/01/2023", 13);
        System.out.println(Michelle);
        System.out.println("Michelle's Paycheck is " + Michelle.collectPay());
        System.out.println("Michelle's Double Paycheck is " + Michelle.doubleCollectPay());




    }
}
