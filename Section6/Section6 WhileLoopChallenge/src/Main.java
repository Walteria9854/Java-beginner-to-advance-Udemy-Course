public class Main {

    public static void main(String[] args){
        int number = 4;
        int oddNumberCount = 0;
        int evenNumberCount = 0;
        while(number <= 20){
            number++;
//            isEvenNumber(number);
            if (!isEvenNumber(number)) {
                oddNumberCount++;
              continue;
            }
            System.out.println("Even number" + number);
            evenNumberCount++;
            if(evenNumberCount >= 5){
                break;
            }

        }
        System.out.println("Odd number" + oddNumberCount);
        System.out.println("Total even numbers found" + evenNumberCount);

    }

    public static boolean isEvenNumber (int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }


}
