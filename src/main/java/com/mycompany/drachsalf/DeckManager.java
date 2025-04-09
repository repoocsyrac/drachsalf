
package com.mycompany.drachsalf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckManager {
    private Map<String, Deck> decks;
    
    public DeckManager() {
        this.decks = new HashMap<>();
    }
    
    public void addDeck(Deck deck) {
        this.decks.put(deck.getName(), deck);
    }

    public void removeDeck(String name) {
        this.decks.remove(name);
    }

    public Deck getDeck(String name) {
        return this.decks.get(name);
    }

    public List<String> getDeckNames() {
        return new ArrayList<>(decks.keySet());
    }
    
    public boolean contains(String name) {
        return this.decks.containsKey(name);
    }
}
