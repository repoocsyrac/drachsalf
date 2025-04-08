
package com.mycompany.drachsalf;

import java.util.Queue;

public class ReviewSession {
    private Deck deck;
    private Queue<Card> dueCards;
    
    public ReviewSession(Deck deck) {
        this.deck = deck;
        // this.dueCards = this.deck.getDueCards();
    }
}
