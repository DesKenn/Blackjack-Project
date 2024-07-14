package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackHand extends AbstractHand {

// HAS NO FIELDS

	@Override
	public int getHandValue() {
		int totalValue = 0;

		for (int i = 0; i < cardsInHand.size(); i++) {
			Card c = cardsInHand.get(i);
			totalValue += c.getValue();
		}
		return totalValue;
	}

	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;

		}
		return false;
	}
	public void hitOrStand() {
		
	}
}
