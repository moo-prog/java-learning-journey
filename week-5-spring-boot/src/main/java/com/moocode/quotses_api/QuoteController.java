package com.moocode.quotses_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class QuoteController {
    private final QuoteService quoteService;
    private final GreatingService  greatingService;

    public QuoteController(QuoteService quoteService, GreatingService greatingService) {
        this.quoteService = quoteService;
        this.greatingService = greatingService;
    }

    @GetMapping("/api/quotes")
    public List<Quote> getAllQuote() {
        return quoteService.getAllQuotes();
    }
    @GetMapping("/api/quotes/random")
    public Quote getQuote(){
        return quoteService.getQuote();
    }
    @GetMapping("/api/quotes/search")
    public List<Quote> searchQuotesByAuthor(@RequestParam String author){
        return quoteService.getQuotesByAuthor(author);
    }
    @GetMapping("/api/quotes/greating")
    public String greatingService(){
        return greatingService.getGreetingMessage();
    }}
