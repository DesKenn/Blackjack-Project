package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	
//	do not add getcardsinhand() method.
	protected List<Card> cardsInHand;
	
	public AbstractHand() {
		this.cardsInHand = new ArrayList<>();
	}
	public abstract int getHandValue();
	
	//TODO add  method addCard(Card card)
	
	public void addCard(Card card) {
		
	}
	
	public void clearHand(){
		
	}
	
}


