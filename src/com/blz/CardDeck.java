package com.blz;

//import java.util.Arrays;
import java.util.Random;
public class CardDeck {
	
	static String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
	static String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	public static String[][] cards = new String[4][13];
	public static String[][] cardsShuf = new String[4][13];

	public static void main(String[] args) {
	
		cards = setDeck();		
		cardsShuf=shuffleCards(cards);


	}

	public static String[][] setDeck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++)
				cards[i][j]=SUITS[i]+RANKS[j];	
			
	}
		return cards;
	}
	
	public static String[][] shuffleCards(String[][] cards) {

		Random r = new Random();
		for(int i=0;i<SUITS.length;i++) {
			int x = r.nextInt(4);			
			for(int j=0;j<RANKS.length;j++) {
				int y = r.nextInt(13);
				String element=cards[x][y];
				while(ifPresent(cardsShuf,element)) {
					x = r.nextInt(4);
					y = r.nextInt(13);
					element=cards[x][y];
				}
				cardsShuf[i][j]=element;
			}	
	}
		return cardsShuf;
}
	
	public static boolean ifPresent(String[][] cardsShuf,String element) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				if(cardsShuf[i][j]==element)
					return true;
			}}
				return false;
			}
		
	
	
	public static void displayDeck(String[][] cardsDeck) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.println(cardsDeck[i][j]);
			}

	}
	}
}