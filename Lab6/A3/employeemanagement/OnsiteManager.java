/*
 * Copyright (c) 2017, Heeramani.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification.
 */
package employeemanagement;

/**
 *
 *This OnsiteManager class inherit from Manager class
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class OnsiteManager extends Manager {
    /**
     * number of months at onsite
     */
    private int numberOfMonthsAtOnsite;
    
    /**
     *
     * @param name name of employee
     * @param number1 number of the subordinate of the manager
     * @param onsitemonthnumber number of months when onsite manager was on onsite
     */
    public OnsiteManager (String name, int number1, int onsitemonthnumber) {
        super(name, number1);
        this.numberOfMonthsAtOnsite = onsitemonthnumber;
        int onsitemanagersalary = (int)(Math.log(1 + onsitemonthnumber) + (this.getSalary()));
        
        this.setSalary(onsitemanagersalary);
    }
    
}
