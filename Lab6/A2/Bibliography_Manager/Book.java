/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package bibliography_manager;


/**
 *
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */

public class Book extends OfflineResource {
    private String author; //author of book
    private String ISBN;    //ISBN number of book
    private int pages;  //pages in the book
    
    /**
     *
     * @param title The title of the book
     * @param publisher The publisher of the book
     * @param year The year of publication of the book
     * @param author The author of the book
     * @param ISBN The ISBN number of the book
     * @param pages Number of pages in the book
     */
    public Book (String title, String publisher, int year, String author, String ISBN, int pages){
        super(title, publisher, year);  //get argument from super class
        this.author = author;
        this.ISBN = ISBN;
        this.pages = pages;
    }
    /**
     * Override the abstract method and print all attribute of book.
     * @return attribute as String
     */
    @Override
    public String print() {
        String attribute = "Title of Book:\t " + getTitle() + "\n" + "Publisher of Book:\t" + getPublisher() + "\n"
                + "Year of publication:\t " + getYear() + "\n" + "Author of the book:\t" + author + "\n"
                + "ISBN number of book:\t " + ISBN + "\n" + "Pages in the book:\t " + pages + "\n";
        System.out.println(attribute);
        return attribute;
    }
    
}
