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
 *
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class Bibliography_Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OnlineResource onlineresource = new OnlineResource("Oracle Java Documentation:Java SE 8","http://docs.oracle.com/javase/tutorial/index.html");
        Book book = new Book("Java The Complete Refrence", "Oracle Press", 2014, "Herbert Schildt", "978-93-392-1209-4", 1274);
        Journal journal = new Journal("Internet of Things", "IEEE", 2014, "Andrea Zanella,Nicola Bui and Angelo Castellani", 1, 1, 22, 32);
        
                System.out.println("---------------------OnlineResource---------------------------------");
		onlineresource.print();
		System.out.println("##############################\n");
                
                System.out.println("---------------------Book------------------------------------------");
		book.print();
		System.out.println("##############################\n");
		
                System.out.println("---------------------Journal---------------------------------------");
                journal.print();
		System.out.println("##############################\n");
    }
    
}
