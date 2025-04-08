
package com.mycompany.drachsalf;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Card {
    private String question;
    private String answer;
    private LocalDateTime nextReview;
    private double ease;
    private int interval;
    private int repetition;
    private LocalDateTime lastReviewed;
    private List<Integer> reviewHistory;
    
    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextReview = LocalDateTime.now();
        this.ease = 2.5;
        this.interval = 1;
        this.repetition = 0;
        this.lastReviewed = null;
        this.reviewHistory = new ArrayList<>();
    }
}
