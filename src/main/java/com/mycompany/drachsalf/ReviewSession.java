
package com.mycompany.drachsalf;

import java.util.LinkedList;
import java.util.Queue;

public class ReviewSession {
    private Deck deck;
    private Queue<Card> dueCards;
    private Card currentCard;
    
    public ReviewSession(Deck deck) {
        this.deck = deck;
        this.dueCards = new LinkedList<>(this.deck.getAllDueCards());
    }
    
    public boolean hasNext() {
        return !this.dueCards.isEmpty();
    }
    
    public Card getCurrentCard() {
        return this.dueCards.peek();
    }
    
    public void submitReviw(int score) {
        Card card = this.dueCards.poll(); // Removes card from deck, it has been asnwered.
        if (card != null) {
            card.submitReview(score);
        }
    }
    
    public int getRemainingCount() {
        return this.dueCards.size();
    }
}
