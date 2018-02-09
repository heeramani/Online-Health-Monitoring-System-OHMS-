/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package bibliography_manager;

/**
 *Inherit Resource class in the OfflineResource class
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public abstract class OfflineResource extends Resource {
    private String publisher;   //publisher of OfflineResource
    private int year;   //year of the publication of OfflineResource
    
    /**
     *
     * @param title Title of the OfflineResource
     * @param publisher Publisher of the OfflineResource
     * @param year  Year of the publication of the OfflineResource
     */
    public OfflineResource (String title, String publisher, int year){
        super(title);
        this.year = year;
        this.publisher = publisher;
    }
    
    /**
     * This method provide Publisher of the OfflineResource
     * @return Publisher of the OfflineResource as String
     */
    public String getPublisher(){
        return publisher;
    }
    
    /**
     * This method provide year of publication of the OfflineResource
     * @return year of publication of the OfflineResource as String
     */
    public String getYear() {
        return Integer.toString(year);
    }
}
