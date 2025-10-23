package dev.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Integer[] arrayList = {50, 25,80, 5, 15};
        Arrays.sort(arrayList);
        System.out.println(Arrays.toString(arrayList));
        Arrays.sort(arrayList, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayList));

        int[] arraySecondList = getRandomNumbers(5);
        Arrays.sort(arraySecondList);
        System.out.println(Arrays.toString(arraySecondList));
        Arrays.sort(arraySecondList, Collections.reverseOrder());
        System.out.println(Arrays.toString(arraySecondList));

    }

    public static int[] getRandomNumbers(int len){
        Random random = new Random();
        int[] newRandomNumber = new int[len];

        for(int i = 0; i < len; i++){
            newRandomNumber[i] = random.nextInt(1000);
        }
        return newRandomNumber;

    }

    private static int[] sortIntegers(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }

        return sortedArray;

    }
}
