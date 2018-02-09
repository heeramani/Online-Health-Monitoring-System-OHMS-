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
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class MultiplicativePolymorphicVirus extends PolymorphicVirusClass {
    
    /**
     * call super class PolymorphicVirusClass
     * @param number1 first number of MultiplicativePolymorphicVirus
     * @param number2 second number of MultiplicativePolymorphicVirus
     */
    public MultiplicativePolymorphicVirus(int number1, int number2) {
        super(number1, number2);
    }
    
    @Override
    public String execute() {
        int sum = this.getPolymorphicVirusSum();
        int number1;
        do {
            number1 = ThreadLocalRandom.current().nextInt(1, sum / 2 + 1);
        }while (sum %number1 != 0);
        int number2;
        number2 = number1 / sum;
        return (number1 + " * " + number2 + sum);
    }
    
}
