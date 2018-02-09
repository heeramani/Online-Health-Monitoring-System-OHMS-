/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package polymorphicvirus;

/**
 *
 *store information of PolymorphicVirusClass with number1 and number2
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class PolymorphicVirusClass {
    private int number1;
    private int number2;
    
    /**
     *
     * @param number1 first number of PolymorphicVirusClass
     * @param number2 second number of PolymorphicVirusClass
     */
    public PolymorphicVirusClass (int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    /**
     * this method Sum two number
     * @return sum of number1 and number2 as integer
     */
    public int getPolymorphicVirusSum() {
        return number1 + number2;
    }
    
    /**
     *  This method demonstrate information of PolymorphicVirusClass  and its sum with number1 and number2
     * @return information of PolymorphicVirusClass  and its sum with number as integer
     */
    public String execute() {
        String information;
        information = "Two number of Polymorphic Virus:\t" + number1 + " and " + number2 + ".\n" + "PolymorphicVirusSum:\t" + getPolymorphicVirusSum() + "\n";
        return information;
    }
    
}
