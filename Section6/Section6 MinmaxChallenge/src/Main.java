import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while(true) {
          System.out.println("Enter a number");
          String nextEntry = scanner.nextLine();
             try {
                 double validNum = Double.parseDouble(nextEntry);
                 if(loopCount == 0 || validNum < min) {
                     min = validNum;
                 }
                 if(loopCount == 0 || validNum > max ){
                     max = validNum;
                 }
                 loopCount++;
             }catch(NumberFormatException e){
               System.out.println("invalid number");
               break;
             }
        }

        if (loopCount > 0){
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}

// 1 define
// user enter number or not
// try {
// }catch(NumberExpectionError e){
// System.out.println("invalid number");
// quit the loop
// scanner.close();
// }

//3.keep track of minimum number entered.
//double max = Double MAX_VALUE;
//double min = Double.MIN_VALUE;
//
