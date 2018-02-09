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
 *store information of employee class
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */
public class Employee {
    private int ID;
    private String name;
    private int salary = 30000;
    
    /**
     * This will increase whenever we needed it
     */
    public static int uniqueID = 1001;
    
    /**
     * Constructor for class employee
     * @param name name of the employee
     */
    public Employee (String name) {
        this.ID = uniqueID++;
        this.name = name;
    }
    
    /**
     * Get the salary of the employee
     * @return salary of the employee as integer
     */
    public int getSalary() {
        return this.salary;
    }
    
    /**
     * set the salary of the employee
     * @param salary salary of the employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    /**
     * get the uniqueID of the employee as integer
     * @return uniqueID of the employee as integer
     */
    public int getID() {
        return this.ID;
        
    }
    
    /**
     * get the name of the employee
     * @return name of the employee as String
     */
    public String getName() {
        return this.name;
    }
    
    
    
    
}
