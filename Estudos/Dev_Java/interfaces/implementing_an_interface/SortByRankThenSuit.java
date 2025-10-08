package implementing_an_interface;

import java.util.Comparator;

public class SortByRankThenSuit implements Comparator<Card> {
    public int compare(
        Card firstCard,
        Card secondCard
    ) {
        int compVal = firstCard.getRank().getValue() -
            secondCard.getRank().getValue();

        if (
            compVal != 0
        ) {
            return compVal;
        } else {
            return firstCard.getSuit().getValue() -
                secondCard.getSuit().getValue();
        }
    }
}