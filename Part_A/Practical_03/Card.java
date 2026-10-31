import java.util.*;
public class Card {
    private final String suit, rank;
    public Card(String suit, String rank) { this.suit=suit; this.rank=rank; }
    @Override public boolean equals(Object obj) {
        return obj instanceof Card c && suit.equals(c.suit) && rank.equals(c.rank);
    }
    @Override public int hashCode() { return Objects.hash(suit, rank); }
    public static void main(String[] args) {
        List<Card> hand = List.of(new Card("Hearts","A"), new Card("Spades","K"), new Card("Hearts","A"));
        System.out.println("Duplicate card present: " + (new HashSet<>(hand).size() < hand.size()));
    }
}
