package dev.lpa;

import dev.lpa.Card.Suit;
import java.util.*;

public class Main {

  public static void main(String[] args){

    Card[] cardArray = new Card[13];
    Card aceofHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
    Arrays.fill(cardArray, aceofHearts);
    Card.printDeck(Arrays.asList(cardArray),"Hearts of information", 1);

    List<Card> cards = new ArrayList<>(52);
    Collections.fill(cards, aceofHearts);
    System.out.println(cards);
    System.out.println("cards.size() = " + cards.size());

    List<Card> acesOfHearts = Collections.nCopies(13, aceofHearts);
    Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

    Card KingOfClub = Card.getFaceCard(Card.Suit.CLUB, 'K');
    List<Card> kingOfClubs = Collections.nCopies(13, KingOfClub);
    Card.printDeck(kingOfClubs, "King of CLUBS", 1);

    Collections.addAll(cards, cardArray);
    Collections.addAll(cards, cardArray);
    Card.printDeck(cards, "Card Collection with Aces added", 2);
    System.out.println(cards.size());

    Collections.copy(cards, kingOfClubs);
    Card.printDeck(cards, "All of the cards", 2);

    cards = List.copyOf(kingOfClubs);
    System.out.println(cards.size());
    Card.printDeck(cards, "List copy version", 1);

    List<Card> deck = Card.getStandardDeck();
    Card.printDeck(deck);

    Collections.shuffle(deck);
    Card.printDeck(deck, "Shuffled Deck", 4);

    Collections.reverse(deck);
    Card.printDeck(deck, "reverse deck", 4);

    var sortingAlgorithm = Comparator.comparing(Card::rank)
            .thenComparing(Card::suit);
    Collections.sort(deck, sortingAlgorithm);
    Card.printDeck(deck, "Sort information by rank and suit", 13);

    Collections.reverse(deck);
    Card.printDeck(deck, "Sort reverse version", 13);

    List<Card> kings = new ArrayList<>(deck.subList(4, 8));
    Card.printDeck(kings, "Kings in deck", 1);

    List<Card> tens = new ArrayList<>(deck.subList(16, 20));
    Card.printDeck(tens, "Tens of infomation", 1);

    int subListIndex = Collections.indexOfSubList(deck, tens);
    System.out.println("sublist index for tens = " + subListIndex);
    System.out.println("Contains = " + deck.containsAll(tens));

    boolean disjoint = Collections.disjoint(deck, tens);
    System.out.println("disjoint = " + disjoint);

    boolean disjoint2 = Collections.disjoint(kings, tens);
    System.out.println("disjoint2 = " + disjoint2);


    deck.sort(sortingAlgorithm);
    Card tenOfHearts = Card.getNumbericCard(Card.Suit.HEART, 10);
    int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
    System.out.println("foundIndex = " + foundIndex);
    System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
    System.out.println(deck.get(foundIndex));

    Card tenOfClubs = Card.getNumbericCard(Card.Suit.CLUB, 10);
    Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
    Card.printDeck(deck.subList(32, 36), "Tens of clubs", 1);

    Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
    Card.printDeck(deck.subList(32, 36), "Tens of clubs", 1);


    if(Collections.replaceAll(deck, tenOfHearts, tenOfClubs)){
      System.out.println("Tens of hearts replaced with tens of clubs");
    }else{
      System.out.println("No tens of hearts found in the list");
    }

    if(Collections.replaceAll(deck, tenOfClubs, tenOfHearts)){
      System.out.println("Tens of hearts replaced with tens of clubs");
    }else{
      System.out.println("No tens of hearts found in the list");
    }

    System.out.println("Ten of Clubs Cards = " +
        Collections.frequency(deck, tenOfClubs));

    System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
    System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithm));
  }

}
