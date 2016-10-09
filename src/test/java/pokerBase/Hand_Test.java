package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Hand_Test {

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
	public void TestRoyalFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));            //dont change
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.RoyalFlush.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.ACE.getiRankNbr());
		
	}
	

	@Test
	public void TestFiveOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FOUR,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FiveOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.FOUR.getiRankNbr());
		
	}
	
	@Test
	public void TestStraightFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));    //dont change
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.NINE,1));
		
		try {
			h.EvaulateHand();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(h.getHs().getHandStrength());
	}
	
	
	@Test
	public void TestFourOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN,1));           //dont change
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
		
	}
	
	@Test
	public void TestFullHouse() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FullHouse.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
		
	}

	@Test
	public void TestFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.SEVEN,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.Flush.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.ACE.getiRankNbr());
		
	}
	

	@Test
	public void TestStraight() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TWO,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.THREE,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SIX,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.Straight.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.SIX.getiRankNbr());
		
	}
	
	@Test
	public void TestThreeOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.ThreeOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.ACE.getiRankNbr());
		
	}
	
	@Test
	public void TestTwoPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.SEVEN,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SEVEN,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.TwoPair.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.KING.getiRankNbr());
		
	}
	
	@Test
	public void TestPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.FOUR,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SEVEN,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.NINE,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.KING,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.Pair.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.KING.getiRankNbr());
		
	}
	
	@Test
	public void TestHighCard() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.FIVE,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.SIX,1));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SEVEN,1));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.HighCard.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.ACE.getiRankNbr());
		
	}

}
