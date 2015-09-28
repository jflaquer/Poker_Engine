package pokerBase;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void test() {
		Deck myTest = new Deck ();
		assertTrue (myTest.getTotalCards () == 52);
	}

}
