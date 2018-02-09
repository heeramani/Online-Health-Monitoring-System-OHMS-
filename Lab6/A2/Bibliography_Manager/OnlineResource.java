/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package bibliography_manager;

/**
 *Inherit Resource class in the OnlineResource class
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class OnlineResource extends Resource {
    private String url;
    
    /**
     * This constructor calls super class constructor
     * @param url url of the Online Resources
     * @param title title of the Online Resources
     */
    public OnlineResource(String url, String title) { 
        super(title);
        this.url = url;
        
    }
     /**
     * Override the abstract method and print all attribute of Online Resources.
     * @return attribute as String
     */
    @Override
    public String print() {
        String attribute = "Title of resource:\t" + getTitle() + "\n" + "url of resource:\t" + url;
        System.out.println(attribute);
        return attribute;
    }
}
