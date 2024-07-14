package com.skilldistillery.cardgames.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgames.blackjack.BlackJackHand;
import com.skilldistillery.cardgames.blackjack.Dealer;
import com.skilldistillery.cardgames.blackjack.Player;
import com.skilldistillery.cardgames.common.Deck;

public class BlackJackApp {
	// no list of cards, no deck (in dealer)
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp bja = new BlackJackApp();
		bja.run();

	}

	public void run() {
		System.out.println(" Welcome to the game BlackJack!");

		dealer.shuffle();

//		
		player.addCardToHand(dealer.dealCard());
		player.displayHand();
		dealer.addCardToHand(dealer.dealCard());
		dealer.displayHand();
		player.addCardToHand(dealer.dealCard());
		player.displayHand();
		dealer.addCardToHand(dealer.dealCard());
		dealer.displayHand();

		System.out.println("Your hand is " + player.getHandValue());
		System.out.println("Dealer's hand is  " + dealer.getHandValue());
		
		if (player.getHandValue() == 21) {
			System.out.println("YOU HIT BLACKJACK!");
			System.out.println("Your hand is " + player.getHandValue());
			}
		if  (dealer.getHandValue() == 21) {
			System.out.println("DEALER HIT BLACKJACK!");
			System.out.println("Dealer's hand is  " + dealer.getHandValue());
		}	else
			hitOrStand();
		dealerHitOrStand();
		
		
		
		

	}

	public void dealerHitOrStand() {
		if (dealer.getHandValue() > 17) {
			System.out.println("Dealer decides not to hit.");
			checkWin();
		} 		
{

			while (dealer.getHandValue() < 17 && dealer.getHandValue() < player.getHandValue()) {
				System.out.println("Dealer draws a card . . .");
				dealer.addCardToHand(dealer.dealCard());
				System.out.println("Dealer's hand is  " + dealer.getHandValue());
				checkWin();

			}
		}
		}

	public boolean hitOrStand() {
		System.out.println("1. Hit");
		System.out.println("2. Stand");
		System.out.println("3. Quit");
		int choice = 0;
		boolean userHits = false;
		while (true) {
			try {
				choice = kb.nextInt();
				if (choice == 1) {
					player.addCardToHand(dealer.dealCard());
					System.out.println("Your hand is " + player.getHandValue());
					System.out.println("Dealer's hand is  " + dealer.getHandValue());
					userHits = true;
					break;

				} else if (choice == 2) {
					userHits = false;
					dealerHitOrStand();
		
					break;

				} else if (choice == 3) {
					userHits = false;
					break;
				} else {
					throw new IllegalArgumentException();
				}

			} catch (IllegalArgumentException e) {
				System.err.println("Enter 1, 2, or 3.");
			}
		}		
		return userHits;

	}

	public void checkWin() {
		boolean userWin = false;
		boolean dealerWin = false;
		if (player.getHandValue() == 21) {
			System.out.println("YOU HIT BLACKJACK!");
			System.out.println("Your hand is " + player.getHandValue());

			userWin = true;
		}
		if (dealer.getHandValue() == 21) {
			System.out.println("DEALER HIT BLACKJACK!");
			System.out.println("Dealer's hand is  " + dealer.getHandValue());
			dealerWin = true;
		}

		if (player.getHandValue() > 21) {
			System.out.println("You busted :( ");
			dealerWin = true;

			if (dealer.getHandValue() > 21) {
				System.out.println("Dealer busted");
				userWin = true;
			}
		}
	}
}
