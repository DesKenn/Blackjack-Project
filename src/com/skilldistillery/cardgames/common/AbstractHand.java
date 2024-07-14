package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Iterator;
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
		cardsInHand.add(card);
	}
//	display cards
//	 public Iterator<Card> iterator() {
//	        Iterator<Card> c =  cardsInHand.iterator();
//	        System.out.println(cardsInHand.iterator());
//			return c;
//	    }
//	 
//	
//	@Override
//	public String toString() {
//		return "AbstractHand [cardsInHand=" + cardsInHand + "]";
//	}
	public void displayHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}	
	
	
	public void clearHand(){
		cardsInHand.removeAll(cardsInHand);
	}
	
}


