package dev.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Integer[] arrayList = {50, 25, 80, 5, 15};
        Arrays.sort(arrayList);
        System.out.println(Arrays.toString(arrayList));
        Arrays.sort(arrayList, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayList));

        int[] firstArray = getRandomArray(5);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));


        int[] sortedArray = sortIntegers(new int[] {7, 30 ,35});
        System.out.println(Arrays.toString(sortedArray));

        Integer[] secondArray = getRandomArray(5);

        Arrays.sort(secondArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(secondArray));


    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++ ){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
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
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
