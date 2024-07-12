package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player{
 //already has a hand because dealer extends player
//	do not add a getDeck method
	
	
	private Deck deck;
	
	public Dealer() {
		super();
		deck = new Deck();
	}
	
//	add dealer specific behaviors like deal card 
	public Card dealCard() {
		return deck.dealCard();
		
	}
	
}
