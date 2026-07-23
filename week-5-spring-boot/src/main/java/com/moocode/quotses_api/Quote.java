package com.moocode.quotses_api;

import java.util.Objects;

public class Quote {
    private int id;
    private String text;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public Quote(int id, String text, String author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return id == quote.id && Objects.equals(text, quote.text) && Objects.equals(author, quote.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, author);
    }
}
