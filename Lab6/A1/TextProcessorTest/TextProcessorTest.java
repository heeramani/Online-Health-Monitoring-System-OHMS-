/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */

package textprocessortest;

/**
 *
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class TextProcessorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextProcessor textProcessor = TextProcessor.getInstance();
         
        String string = args[0];
        
        String[] arrayWord = textProcessor.getWords(string);
        int numberOfWords = textProcessor.getWordCount(string);
        int[] wordLengths = textProcessor.getWordLengths(string);
        
        System.out.println("Number of words(String) in sentence:\t" + numberOfWords );
        
        for (int i = 0; i <numberOfWords; i++) {
            System.out.println("This word ### " + arrayWord[i] +" ### has lengths " + wordLengths[i]);
            
        }
    }
    
}
