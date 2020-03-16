package auction;
import org.junit.*;
import static org.junit.Assert.*;


public class AuctionTest {
	// tolerance for floating point comparisons
	private static final double TOL = 1.0E-4;
	// test fixture for Auction
	private Auction auction;

	/** Create a "test fixture" that can be used in many tests. */
	@Before
	public void setUp() {
		// create a test fixture
		auction = new Auction("Java in Action");
		// set the auction variant to test
		auction.setAuctionType(3);
		// This is for testing. Remove it after verify working.
		System.out.println("Auction type is " + auction.getAuctionType());
	}

	/** Test that a new auction has no bids and bidding is disabled. */
	@Test
	public void testNewAuctionState() {
		assertEquals(0, auction.bestBid(), TOL);
		assertFalse( auction.isEnabled() );
	}

	/** Test that we can place a bid after auction is started. */
	@Test
	public void testCanBidInAuction() {
		auction.start();
		assertTrue("Auction should be enabled after start()", auction.isEnabled());
		double amount = 111.0;
		// Who is James Gosling?
		auction.bid("James Gosling", amount);
		assertEquals(amount, auction.bestBid(), 0.0); // fix this
		assertEquals("James Gosling", auction.winner());
	}
}
