
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
}
