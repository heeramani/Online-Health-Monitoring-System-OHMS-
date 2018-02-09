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
public class Journal extends OfflineResource {
    private String name;    //name of Journal
    private int volume; //volume  of Journal
    private int issue;  //issue  of Journal
    private int pageStart;  //startpage of Journal
    private int pageEnd;    //endpage of Journal
    
    /**
     *
     * @param title Title of the Journal
     * @param publisher Publisher of the Journal
     * @param year Year of Publication of the Journal
     * @param name name of the Journal
     * @param volume volume of the Journal
     * @param issue issueNo related to Journal
     * @param pageStart Starting page of the Journal
     * @param pageEnd Ending page of the Journal
     */
    public Journal(String title, String publisher, int year, String name, int volume,  int issue, int pageStart, int pageEnd ) {
        super(title, publisher, year);  
        this.issue = issue;
        this.name = name;
        this.pageEnd = pageEnd;
        this.pageStart = pageStart;
        this.volume = volume;
    }
    /**
     * Override the abstract method and print all attribute of journal.
     * @return attribute as String
     */
    @Override
    public String print() {
        String attribute = "Title of the Journal:\t" + getTitle() + "\n" +
                            "Publisher of the Journal:\t" + getPublisher() + "\n" +
                            "Year of publication:\t" + getYear() + "\n" +
                            "Name of the Journal:\t" + name + "\n" +
                            "Voume of the Journal:\t" + volume + "\n" +
                            "Issue of the Journal:\t" + issue + "\n" +
                            "Start page of the Journal:\t" + pageStart + "\n" +
                            "End page of the Journal:\t" + pageEnd + "\n";
        System.out.println(attribute);
        return attribute;
    }
}
