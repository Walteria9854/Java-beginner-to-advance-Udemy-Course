package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args){

    Collection<String> list = new HashSet<>();

    String[] names = {"Anna", "Bob", "Charles", "David", "Edna"};
    list.addAll(Arrays.asList(names));
    System.out.println(Arrays.toString(names));

    list.add("Fred");
    list.addAll(Arrays.asList("George", "Gary", "Grace"));
    System.out.println(list);
    System.out.println("Gary is in the list? " + list.contains("Gary"));

    list.removeIf(s -> s.charAt(0) == 'G');
    System.out.println(list);
    System.out.println("Gary is in the list? " + list.contains("Gary"));

  }

}
