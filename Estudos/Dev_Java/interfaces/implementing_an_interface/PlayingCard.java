package implementing_an_interface;

public class PlayingCard implements Card {
    private Rank rank;
    private Suit suit;

    // Constructor

    // Implementations of Card abstract methods
    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    // Implementation of hashCode method
    public int hashCode() {
        return (
            (suit.getValue() - 1) * 13
        ) + rank.getValue();
    }

    // Implementation of Comparable<Card> method
    public int compareTo(
        Card o
    ) {
        return this.hashCode() - o.hashCode();
    }

    // toString, equals
}