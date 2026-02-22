public class Main {

    public static void main(String[] args){

//        int count = 0;
//
//        for(int i = 1; count < 5 && i < 1000; i++ ){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("Printing out numbers" + i);
//                count++;
//                if(count < 5){
//                    System.out.println("Sum numbers" + i);
//                    break;
//                }
//            }
//        }

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for(int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if(loopNumber % 3 == 0 && loopNumber % 5 == 0){
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }

            if(countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
