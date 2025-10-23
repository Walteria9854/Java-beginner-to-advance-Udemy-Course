package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){

                case 1 -> additems(groceries);
                case 2 -> removeitems(groceries);
                default -> flag = false;

            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void additems(ArrayList<String> groceries){
        System.out.println("add item(s) [separate items by comma] : ");
        String[] items = scanner.nextLine().split(",");
        groceries.addAll(List.of(items));

        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeitems(ArrayList<String> groceries){
        String[] items = scanner.nextLine().split(",");
        groceries.addAll(List.of(items));

        for(String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);

        }
    }

    private static void printActions(){
        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do :""";
        System.out.print(textBlock + " ");
    }




















//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int scanned = scanner.nextInt();
//
//        System.out.println("Available actions");
//        System.out.println("0 - to shutdown");
//        System.out.println("1 - to add item(s) to list (comma delimited list)");
//        System.out.println("2 - to remove any items (comma delimited list)");
//        System.out.println("Enter a number for which action you want to do :");
//        scanner.nextInt();
//
//        if(){
//
//        }
//    }


    //my answer
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Available actions:");
//        System.out.println(arrayListChallenge());
//        System.out.println("enter a number for which action you want to do");
//        scanner.nextInt();
//
//
//    }
//
//    private static ArrayList<String> arrayListChallenge() {
//        ArrayList<String> arrayChallenge = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Available actions:");
//        arrayChallenge.add(0, "0 - to shutdown");
//        arrayChallenge.add(1, "1 - to add item(s) to list (comma delimited list)");
//        arrayChallenge.add(2, "2 - to remove any items (comma delimited list)");
//        System.out.println("enter a number for which action you want to do");
//        scanner.nextInt();
//
//        return arrayChallenge;
//
//    }
}
