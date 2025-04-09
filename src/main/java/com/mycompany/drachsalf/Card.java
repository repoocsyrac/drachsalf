
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
    
    // Overloading constructor for loading card from file
    /*
    public Card(String question, String answer, LocalDateTime nextReview, double ease, int interval, int repetition, LocalDateTime lastReviewed, List<Integer> reviewHistory) {
        ...
    }

    */
    
    // Updates reviewHistory, ease, interval, etc, based on how well user remembered the card.
    // TODO: change from simplified SM2 alg to full version
    public void submitReview(int score) {
        this.reviewHistory.add(score);
        this.lastReviewed = LocalDateTime.now();
        
        
        if(score < 3) {    // Low score, not remembered
            this.repetition = 0;
            this.interval = 1;
        } else {    // High score, remembered
            this.repetition++;
            if (this.repetition == 1) {
                this.interval = 6;
            } else {
                this.interval = (int) (this.interval * this.ease);
            }
        }
        
        this.ease = this.ease + (0.1 - (5 - score) * (0.08 + (5 - score) * 0.02));
        if (this.ease < 1.3) {
            this.ease = 1.3;
        }
        
        this.nextReview = this.lastReviewed.plusDays(this.interval);
    }
    
    public void resetProgress() {
        this.nextReview = LocalDateTime.now();
        this.ease = 2.5;
        this.interval = 1;
        this.repetition = 0;
        this.lastReviewed = null;
        this.reviewHistory = new ArrayList<>();
    }
    
    public boolean isDue() {
        return !LocalDateTime.now().isBefore(this.nextReview);
    }
    
    // Getters & Setters
    public String getQuestion() {
        return this.question;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public LocalDateTime getNextReview() {
        return this.nextReview;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
}
