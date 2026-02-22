import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int validCount = 1;
        double sum = 0;

        while(validCount <= 5) {
            System.out.println("Enter number #" + validCount + ": ");
            String nextNumber = scanner.nextLine();
            try {
                // number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                validCount ++;
                sum += number;
            } catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }

        System.out.println("The Sum of the numbers = " + sum);

    }
}
