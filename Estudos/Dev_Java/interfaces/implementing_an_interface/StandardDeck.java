package implementing_an_interface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StandardDeck implements Deck {
    private List<Card> entireDeck;

    // Constructor, accessors

    // You need to add all the methods from Deck
    public void sort() {
        Collections.sort(entireDeck);
    }

    public void sort(
        Comparator<Card> c
    ) {
        Collections.sort(
            entireDeck,
            c
        );
    }

    // toString, equals, hashCode

    void main() {
        StandardDeck myDeck = new StandardDeck();

        myDeck.suffle();

        myDeck.sort(
            new SortByRankThenSuit()
        );
    }
}