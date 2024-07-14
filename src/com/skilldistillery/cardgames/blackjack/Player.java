package com.skilldistillery.cardgames.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Player {
//	Player has-a hand
//	dont add a get hand method
	private BlackJackHand hand;
	

	
//	 no list of cards, hand has one
	
	public Player() {
		this.hand = new BlackJackHand();
		
	}
	
	public void addCardToHand(Card card){
		hand.addCard(card);
	}
	
	public int getHandValue() {
		return hand.getHandValue();
		
	}
	public void displayHand() {
		List<Player> hand = new ArrayList<>();

		for (int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i)); 
		}
	}		
}
