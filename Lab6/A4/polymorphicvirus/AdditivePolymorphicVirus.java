/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package polymorphicvirus;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 *store information of AdditivePolymorphicVirus and inherit PolymorphicVirusClass
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class AdditivePolymorphicVirus extends PolymorphicVirusClass{
    
    /**
     * Constructor for calling constructor of super class PolymorphicVirusClass
     * @param number1 first number of AdditivePolymorphicVirus
     * @param number2 second number of AdditivePolymorphicVirus
     */
    public AdditivePolymorphicVirus(int number1, int number2) {
        super(number1, number2);
    }
    
    public String execute() {
        int sum = getPolymorphicVirusSum();
        int number1 = ThreadLocalRandom.current().nextInt(1, sum + 1);
        int number2 = sum - number1;
        
        return (number1 + " + " + number2 + " = " + sum);
        
    }
    
}
