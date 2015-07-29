package com.fpt.btjb.DeckOfCards;

// Demo Deck of Card
public class Main {
	public static void main(String[] Args){
		Deck deck = new Deck();
		deck.shuffing(100);
		deck.deal(4);
	}
}
