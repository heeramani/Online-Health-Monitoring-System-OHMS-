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

public class TextProcessor {
    private static TextProcessor textProcessor =  null;
    /** Private constructor prevents anyone
     *else from instantiating this class 
     */ 
    
    private TextProcessor (){}
    
    /**
     * static "instance"
     * @return object or TextProcessor class
     */
    public static TextProcessor getInstance() {
        
        if (textProcessor == null) {
            textProcessor =new TextProcessor();
        }
        
        return textProcessor;
    }
    
    /**
     * an array from the input string
     * @param string desired text
     * @return array of words in the string
     */
    public String[] getWords  (String string) {
        return string.split(" ");
    }
    
    /**
     * Number of words present in input string
     * @param string desired text
     * @return integer the number of words present in the input string
     */
    public int getWordCount (String string) {
        //String[] arrayWords = getWords(string);
        return getWords(string).length; 
    }
    
    /**
     * an array containing the length of each word from input string
     * @param string
     * @return array of integers containing the length of each word in the string
     */
    public int[] getWordLengths (String string) {
        String[] arrayWords = getWords(string);
        int[] wordLength  = new int[arrayWords.length];
        for (int i = 0; i < arrayWords.length; i++ ) {
            wordLength[i] = arrayWords[i].length();
        }
        return wordLength;
    }
    
}
