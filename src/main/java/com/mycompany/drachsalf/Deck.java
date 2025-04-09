
package com.mycompany.drachsalf;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private String name;
    private List<Card> cards;
    
    public Deck(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }
    
    // TODO: overload constructor to create Deck directly from file
    /*
    public Deck(Path file) throws IOException {
        // load deck data from file
    }
    */
    
    public void addCard(Card card) {
        this.cards.add(card);
    }
    
    public void removeCard(Card card) {
        this.cards.remove(card);
    }
    
    public List<Card> getAllCards() {
        return this.cards;
    }
    
    public List<Card> getAllDueCards() {
        List<Card> dueCards = new ArrayList<>();
        
        for(Card card : this.cards) {
            if(card.isDue()) {
                dueCards.add(card);
            }
        }
        
        return dueCards;
    }
    
    public String getName() {
        return this.name;
    }
    
    //TODO: save to file, load from file
}
