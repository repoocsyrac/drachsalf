# Drachsalf – Java Flashcard App with Spaced Repetition

**Drachsalf** is a Java desktop app designed for students to efficiently study using spaced repetition. Inspired by Anki’s SM-2 algorithm.

## Features

### Core Functionality
- Create and manage custom flashcard decks
- Review cards in a spaced repetition schedule
- Rate recall difficulty ("Forgot", "Hard", "Medium", "Easy")
- Save/load decks locally with persistent data (JSON)
- JavaFX GUI

### Stretch Features
- Visual stats dashboard (daily streaks, cards due)
- Search and filter cards
- Markdown-style formatting for maths
- Import/export decks (CSV or JSON)
- Pomodoro study timer

## Spaced Repetition Algorithm

Based on a simplified version of the SM-2 algorithm:
- Each flashcard has an *ease factor* and *interval*
- After each review, the user rates the card:
  - "Easy": increases interval and ease
  - "Medium": increases interval slightly
  - "Hard"/"Forgot": resets interval, may lower ease
- Next review date is calculated accordingly

## Data Format

Decks are saved in JSON format:
```json
{
  "deckName": "Example Deck",
  "cards": [
    {
      "question": "What is a group in abstract algebra?",
      "answer": "A set with a binary operation satisfying closure, associativity, identity, and inverses.",
      "nextReview": "2025-04-10T12:00:00",
      "ease": 2.5,
      "interval": 6,
      "lastReviewed": "2025-04-06T14:00:00"
    }
  ]
}
