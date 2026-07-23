package com.moocode.quotses_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private final List<Quote> quotes = new ArrayList<>();
    Random random = new Random();
    public QuoteService() {
        // Steve Jobs
        quotes.add(new Quote(1, "The only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote(2, "Innovation distinguishes between a leader and a follower.", "Steve Jobs"));
        quotes.add(new Quote(3, "Stay hungry, stay foolish.", "Steve Jobs"));

        // Eleanor Roosevelt
        quotes.add(new Quote(4, "Future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"));
        quotes.add(new Quote(5, "No one can make you feel inferior without your consent.", "Eleanor Roosevelt"));

        // Albert Einstein
        quotes.add(new Quote(6, "Strive not to be a success, but rather to be of value.", "Albert Einstein"));
        quotes.add(new Quote(7, "Life is like riding a bicycle. To keep your balance, you must keep moving.", "Albert Einstein"));
        quotes.add(new Quote(8, "Imagination is more important than knowledge.", "Albert Einstein"));

        // Linus Torvalds
        quotes.add(new Quote(9, "Talk is cheap. Show me the code.", "Linus Torvalds"));
        quotes.add(new Quote(10, "Bad programmers worry about the code. Good programmers worry about data structures and their relationships.", "Linus Torvalds"));

        // Harold Abelson & Cory House & Edsger W. Dijkstra & Kent Beck
        quotes.add(new Quote(11, "Programs must be written for people to read, and only incidentally for machines to execute.", "Harold Abelson"));
        quotes.add(new Quote(12, "Code is like humor. When you have to explain it, it’s bad.", "Cory House"));
        quotes.add(new Quote(13, "Simplicity is prerequisite for reliability.", "Edsger W. Dijkstra"));
        quotes.add(new Quote(14, "Make it work, make it right, make it fast.", "Kent Beck"));

        // Francis Bacon
        quotes.add(new Quote(15, "Knowledge is everything.", "Francis Bacon"));
        quotes.add(new Quote(16, "Knowledge is power.", "Francis Bacon"));

        // Martin Fowler
        quotes.add(new Quote(17, "Any fool can write code that a computer can understand. Good programmers write code that humans can understand.", "Martin Fowler"));
        quotes.add(new Quote(18, "Refactoring is a controlled technique for improving the design of an existing codebase.", "Martin Fowler"));
    }

    public List<Quote> getAllQuotes() {
        return quotes;
    }

    public Quote getQuote(){
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }

    public List<Quote> getQuotesByAuthor(String author){

        List<Quote> matchingQuotes= new ArrayList<>();
        for (Quote q : quotes){
            if(q.getAuthor().equalsIgnoreCase(author)){
                matchingQuotes.add(q);
            }
        }
        return matchingQuotes;
    }

}
