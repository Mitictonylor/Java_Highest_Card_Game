import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

        Card card;

        @Before
        public void setup() {
            card = new Card(Suit.HEARTS, Rank.ACE);
        }

        @Test
        public void cardHasRank() {
            assertEquals(Rank.ACE, card.getRank());
        }

        @Test
        public void cardHasSuit() {
            assertEquals(Suit.HEARTS, card.getSuit());
        }

        @Test
        public void cardHasValue() {
            assertEquals(14, card.getValue());
        }


}
