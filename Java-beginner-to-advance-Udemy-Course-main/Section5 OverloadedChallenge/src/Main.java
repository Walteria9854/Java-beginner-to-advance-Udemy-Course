public class Main {

    public static void main(String[] args){
        System.out.println(converToCentimeters(68));
        System.out.println(converToCentimeters(5, 8));

    }

    public static double converToCentimeters(int num1){
        double centimetersHeight = num1 * 2.54;
        return centimetersHeight;
    }

    public static double converToCentimeters(int num2, int num3){
        double centimeterFeetHeight = ((num2 * 12) + num3) * 2.54;
        return centimeterFeetHeight;
    }
}
