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
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class PolymorphicVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int x1;
       int x2;
       
       x1 = Integer.parseInt(args[0]);
       x2 = Integer.parseInt(args[1]);
       
       PolymorphicVirusClass[] viruses = new PolymorphicVirusClass[4];
       
       viruses[0] = new PolymorphicVirusClass(x1, x2);
       viruses[1] = new AdditivePolymorphicVirus(x1, x2);
       viruses[2] = new SubtractivePolymorficVirus(x1, x2);
       viruses[3] = new MultiplicativePolymorphicVirus(x1, x2);
       
       for(PolymorphicVirusClass virus : viruses) {
           for (int i = 1; i <= 5; i++) {
               System.out.println(virus.execute());
           }
       }
       
    }
    
}
