package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {
    private String name;
    private ArrayList<Book> books;
    public BookCollection(String name){
        books = new ArrayList<>();
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public int getStars(){
        int promStars=0;
        for(Book book : books){
            promStars+=(int)book.getStars();
        }
        promStars = promStars/books.size();
        return promStars;
    }
}
