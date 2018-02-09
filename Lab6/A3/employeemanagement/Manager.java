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
 *store information of manager 
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class Manager extends Employee {
    private int numberOfSubOrdinates;
    
    /**
     *
     * @param name name of the manager
     * @param subordinatenumber number of the subordinate
     */
    public Manager (String name, int subordinatenumber) {
        super(name);
        this.numberOfSubOrdinates = subordinatenumber;
        int employeesalary = (int)(Math.log(1 + subordinatenumber) * (this.getSalary()));
        this.setSalary(employeesalary);
    }
}
