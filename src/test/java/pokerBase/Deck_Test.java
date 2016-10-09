package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DeckBuildTest() {
		int jokers = 1;
		int wc = 1;
		ArrayList<Card> wildCards = new ArrayList<Card>(wc);
		ArrayList<Card> deckTester = new ArrayList<Card>(1);
		Deck d = new Deck(jokers, wildCards);
		assertEquals(d, deckTester);

	}
}
