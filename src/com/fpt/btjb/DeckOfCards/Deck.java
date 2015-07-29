package com.fpt.btjb.DeckOfCards;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;
	public Deck(){
		deck = new ArrayList<Card>();
			
		// Adding all card to deck
		for(int suit = 0; suit < 4; suit++){
			for(int rank = 0; rank < 12; rank++){
				deck.add(new Card(suit, rank));
			}
		}
	}
	
	/** Shuffling all card of deck
	 * 
	 * @param numOfTimes : Shuffling times
	 */
	public void shuffing(int numOfTimes){
		// Random variable to random index of deck
		Random generator = new Random();
		// index to swap two element of deck
		int index_1, index_2;
		for (int i = 0; i < numOfTimes; i++){
			// Generator index of deck and make sure that two elements are different
			index_1 = generator.nextInt(deck.size() - 1);
			index_2 = generator.nextInt(deck.size() - 1);
			while(deck.get(index_2).equals(deck.get(index_1))){
				index_1 = generator.nextInt(deck.size() - 1);
				index_2 = generator.nextInt(deck.size() - 1);
			}
			// Swap two elements
			Card temp = deck.get(index_2);
			deck.set(index_2, deck.get(index_1));
			deck.set(index_1, temp);
		}
	}
	
	/** Get number of card in deck
	 * 
	 * @return size of deck
	 */
	public int getTotalCard(){
		return this.deck.size();
	}
	
	/** Deal card of deck
	 * 
	 * @param numOfPlayer : Number of player
	 */
	public void deal(int numOfPlayer){
		if(deck.size() % numOfPlayer == 0){
			int sizeOfOnePlayer = deck.size() / numOfPlayer;
			for(int i = 0; i < numOfPlayer; i++){
				System.out.print("Player " + (i+1) + ": ");
				for(int j = 0; j < sizeOfOnePlayer; j++){
					System.out.print(deck.get(j + sizeOfOnePlayer*i) + "    ");					
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Can't be deal with number of Player !\nNumber of player must be divisble by number of card.");
		}
	}
}
