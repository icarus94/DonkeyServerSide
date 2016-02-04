package server.game.AI;

import java.util.LinkedList;

public class AI extends Thread {
	
	private static final Object Object = null;
	private volatile LinkedList<Object> robotsCards;
	private volatile boolean areCardsOnTheDeck = false;
	private volatile boolean possessionOfTwoOfClubs=false;
	
	public void run(){
		
	}
	/**
	 * Checks LinkedList for Card 2ofClubs (need to implement class of the same type of both side client-server)
	 * @return
	 */
	private boolean checkPossessionOfTwoOfClubs(){
		if(robotsCards.contains(Object)){
			possessionOfTwoOfClubs=true;
		}else{
			possessionOfTwoOfClubs=false;
		}
		return possessionOfTwoOfClubs;
	}
	private Object whichCardToForward(){
		return Object;
	}
	private boolean isThereARow(){
		if(checkPossessionOfTwoOfClubs())
			return false;
		return false;
	}
}
