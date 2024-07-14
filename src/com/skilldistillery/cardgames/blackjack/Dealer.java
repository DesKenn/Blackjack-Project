package com.skilldistillery.cardgames.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {
	// already has a hand because dealer extends player
//	do not add a getDeck method

	List<Player> hand = new ArrayList<>();
	private Deck deck;

	public Dealer() {
		super();
		deck = new Deck();
	}

//	add dealer specific behaviors like deal card 
	public Card dealCard() {
		Card card = deck.dealCard();
		return card;

	}

	@Override
	public void addCardToHand(Card card) {
		super.addCardToHand(card);

	}

	@Override
	public int getHandValue() {
		return super.getHandValue();
				}

	@Override
	public void displayHand() {
		super.displayHand();
		List<Player> hand = new ArrayList<>();

		
		for (int i = 0; i < hand.size(); i++) {
		System.out.println(hand.get(i));	
		}

	}	
	
	public Object shuffle() {
		return deck.shuffleCards();
	}

}
