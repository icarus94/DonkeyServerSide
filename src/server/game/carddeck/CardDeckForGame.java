package server.game.carddeck;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class CardDeckForGame {
	
	private LinkedList<Card> cardDeck;

	public CardDeckForGame(int howManyPlayers) {
		cardDeck = new LinkedList<Card>();
		cardDeck.add(new Card("Clubs", 2));
		for (int i = 0; i < howManyPlayers; i++) {
			cardDeck.add(new Card("Clubs", (13-i)));
			cardDeck.add(new Card("Diamonds", (13-i)));
			cardDeck.add(new Card("Hearts", (13-i)));
			cardDeck.add(new Card("Spides", (13-i)));
		}
		shuffle();
	}

	public LinkedList<Card> getShuffledCardDeck() {
		return cardDeck;
	}
	
	private void shuffle(){
		Collections.shuffle(cardDeck);
	}
	

}
