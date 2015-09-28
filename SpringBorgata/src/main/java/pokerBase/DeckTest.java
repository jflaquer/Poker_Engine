//This Class is how we were testing our Deck and our Hand.

package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class DeckTest {

	
	public void test() {
		Deck myTest = new Deck ();
		assertTrue (myTest.getTotalCards () == 52);
	}
	
	public void testHand() {
		Card myCard1 = new Card(eSuit.SPADES, eRank.ACE, 0);
		Card myCard2 = new Card(eSuit.DIAMONDS, eRank.KING, 1);
		Card myCard3 = new Card(eSuit.CLUBS, eRank.QUEEN, 2);
		Card myCard4 = new Card(eSuit.HEARTS, eRank.JACK, 3);
		Card myCard5 = new Card(eSuit.SPADES, eRank.TEN, 4);
		Hand myHand = new Hand();
		myHand.AddCardToHand(myCard1);
		myHand.AddCardToHand(myCard2);
		myHand.AddCardToHand(myCard3);
		myHand.AddCardToHand(myCard4);
		myHand.AddCardToHand(myCard5);
		ArrayList<Card> testHand = myHand.getCards();
		ArrayList<Card> Straight = myHand.getBestHand();
		assertTrue(testHand==Straight);
	}

}
