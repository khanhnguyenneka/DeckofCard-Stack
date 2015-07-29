package com.fpt.btjb.DeckOfCards;

public class Card
{
	private int rank, suit;

	private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
	private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


	Card(int suit, int rank)
	{
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public String toString()
	{
		  return "[" +ranks[rank] + " of " + suits[suit] + "]";
	}

	public int getRank() {
		 return rank;
	}

	public int getSuit() {
		return suit;
	}

}


