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
 *store information of TechnicalArchitect 
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class TechnicalArchitect extends Manager {
    
    /**
     * Constructor method for TechnicalArchitect
     * @param name name of the TechnicalArchitect
     * @param managernumber number of the subordinate of TechnicalArchitect
     */
    public TechnicalArchitect (String name, int managernumber) {
        super(name, managernumber);
        int technicalarchitectsalary = this.getSalary();
        this.setSalary((int)(1.5 * technicalarchitectsalary));
    }
    
}
