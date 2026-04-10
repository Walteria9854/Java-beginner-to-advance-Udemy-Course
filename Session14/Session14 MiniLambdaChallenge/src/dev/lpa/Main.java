package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args){

    Consumer<String> printTheParts = new Consumer<String>() {
      @Override
      public void accept(String sentence) {
        String[] parts = sentence.split(" ");
        for(String part : parts){
          System.out.println(part);
        }
      }
    };

    Consumer<String> printLambda = (sentence) -> {
      String[] parts = sentence.split(" ");
      for(String part : parts){
        System.out.println(part);
      }
    };

    printTheParts.accept("Let's split this up into an array");
    printLambda.accept("Let's split this up into an array");

    Consumer<String> printWordForEach = sentence -> {
      String[] parts = sentence.split(" ");
      Arrays.asList(parts).forEach(s -> System.out.println(s));
    };

    printWordForEach.accept("Let's split this up into an array");

    Consumer<String> printWordConcise = sentence -> {
      Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
    };

    printWordConcise.accept("Let's split this up into an array");

    Function<String, String> everySecond = source -> {
      StringBuilder returnVal = new StringBuilder();
      for(int i = 0; i < source.length(); i++){
        if(i % 2 == 1){
          returnVal.append(source.charAt(i));
        }
      }
      return returnVal.toString();
    };

    System.out.println(everySecond.apply("1234567890"));

    String result = everySecondCharacter(everySecond,"1234567890");

    System.out.println(result);

    Supplier<String> iLoveJava = () -> "I love Java!";
    Supplier<String> iLoveJava2 = () -> {return "I love Java!";};

    System.out.println(iLoveJava.get());
    System.out.println(iLoveJava2.get());

  }

  public static String everySecond(String source) {

    StringBuilder returnVal = new StringBuilder();
    for(int i = 0; i < source.length(); i++){
      if(i % 2 == 1){
        returnVal.append(source.charAt(i));
      }
    }

    return returnVal.toString();
  }

  public static String everySecondCharacter(Function<String, String> func,
      String source){

    return func.apply(source);
  }




};


