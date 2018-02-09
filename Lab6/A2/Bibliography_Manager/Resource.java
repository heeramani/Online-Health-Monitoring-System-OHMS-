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
 *This abstract Resource class of Bibliography Manager stores information about title with getTitle() and print() methods.
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public abstract class Resource {
    /**
     * Title name of Resource
     */
    private String title;
    
    /**
     *
     * @param title title of Resource
     */
    public Resource(String title) {
        this.title = title;
    }
    
    /**
     * This will provide title of Resource
     * @return title of Resource as String
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     * This is abstract method and this must be implemented in its non-abstract subclasses
     * @return information about Resource as String
     */
    public abstract String print();
    
}
