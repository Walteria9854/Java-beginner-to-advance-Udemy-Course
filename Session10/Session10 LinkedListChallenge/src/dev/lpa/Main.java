package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList<String, Integer> challenge = new LinkedList<>();
        challenge.add("Sydney", 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the information");
        System.out.println("Available actions");
        System.out.println("(F)orward");
        System.out.println("(B)ackward)");
        System.out.println("(L)ist Place");
        System.out.println("(M)enu");
        System.out.println("(Q)uit)");

        String name = scanner.nextLine();

        if(name.equals("F")){
            moveForward(challenge);

        }

        if(name.equals("B")){

        }

        if(name.equals("L")){

        }

        if(name.equals("M")){


        }

        if(name.equals("Q")){
            scanner.close();

        }

        private static void moveForward(LinkedList<String, int> challenge){


        }

    }
}
