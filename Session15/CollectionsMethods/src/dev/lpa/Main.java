package dev.lpa;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args){

    List<Card> deck = Card.getStandardDeck();
    Card.printDeck(deck);

    Card[] cardArray = new Card[13];
    Card aceofHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
    Arrays.fill(cardArray, aceofHearts);
    Card.printDeck(Arrays.asList(cardArray),"Hearts of information", 1);

  }

}
