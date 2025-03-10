package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck(){
	    List<Card> deck = new ArrayList<>(52);
	    for(Suit s : Suit.values()) {
	      for(Rank r : Rank.values()) {
	        deck.add(new Card(r, s));
	      }
	    }
	    return deck;
	  }

	public int checkDealSize() {

		return cards.size();

	}
	public boolean isEmpty() {
		if(this.cards.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public Card dealCard() {
	    return cards.remove(0);
	  }

	public Object shuffleCards() {
		Collections.shuffle(cards);
		return cards;
	}
	
	

}
