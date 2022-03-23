package no.ntnu.idatx2001.oblig3.cardgame;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

  ArrayList<PlayingCard> deck = new ArrayList<>();
  ArrayList<PlayingCard> residualCard = new ArrayList<>();
  ArrayList<PlayingCard> hand = new ArrayList<>();
  int numberOfCards;
  Random random = new Random();

  public DeckOfCards() {

    for(int cardNumber = 1; cardNumber <= 13; cardNumber++ ) {
      deck.add(new PlayingCard('H',cardNumber));
    }

    for(int cardNumber = 1; cardNumber <= 13; cardNumber++ ) {
      deck.add(new PlayingCard('S',cardNumber));
    }

    for(int cardNumber = 1; cardNumber <= 13; cardNumber++ ) {
      deck.add(new PlayingCard('D',cardNumber));
    }

    for(int cardNumber = 1; cardNumber <= 13; cardNumber++ ) {
      deck.add(new PlayingCard('C',cardNumber));
    }
  }

  public ArrayList<PlayingCard> dealHand(int numberOfCards) {

    while(hand.size() < numberOfCards) {
      PlayingCard card = getRandomPlayCard();
      hand.add(card);
      residualCard.add(card);
      deck.remove(card);
    }
    return hand;
  }

  public PlayingCard getRandomPlayCard() {

    int index = random.nextInt(deck.size());
    PlayingCard playCard = deck.get(index);

    return playCard;
  }

  public void fillDeckWithMissingCard() {

    for (PlayingCard card:residualCard) {
      deck.add(card);
      residualCard.remove(card);
    }
  }

  public void printHand() {
    for(PlayingCard card:hand) {
      System.out.println("Nr På Kortet: " + card.getFace());
      System.out.println("Type Kort: " + card.getSuit());
    }
  }

  public boolean hasQueenOfSpades() {
    return this.hand.stream().anyMatch(card -> card.getAsString().equals("S12"));
  }

//  public PlayingCard getHearts() {
//    return this.hand.stream().filter(card -> card.getSuit().equals('H'));
//  }
//
//  public boolean hasFiveCardsOfFlush() {
//    boolean result = false;
//
//    char largestNumberOfSuit = hand.stream().filter(card -> card.getSuit());

//  }



}
