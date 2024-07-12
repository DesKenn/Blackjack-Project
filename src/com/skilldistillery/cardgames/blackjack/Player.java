package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;

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
}
