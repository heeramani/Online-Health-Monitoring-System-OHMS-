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
 *This class is for Employee management 
 *@author <a href = "mailTo:heeramani.15342@iitkgp.ac.in">Heeramani Prasad</a>
 *@version 1.0
 */

public class EmployeeManagement {

    /**
     * method to start the programs
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] employees = new Employee[8];
        employees[0] = new Employee("Heeramani Prasad");
        employees[1] = new Employee("Navneet Gupta");
        
        employees[2] = new Manager("D. Samanta", 501);
        employees[3] = new Manager("S. Mishra", 1001);
        
        employees[4] = new OnsiteManager("Narendra Modi", 502, 70);
        employees[5] = new OnsiteManager("Amit Shah", 1002, 80);
        
        employees[6] = new TechnicalArchitect("Ilora Maity", 999);
        employees[7] = new TechnicalArchitect("Barun Saha", 1099);
        
        int TotalCost = 0;
        for(Employee employee : employees) {
            System.out.println("UniqueID of employee:\t" + employee.getID() + "\n" + "Name of the employee:\t" + employee.getName() + "\n" + "Salary of the employee:\t" + employee.getSalary() + "\n");
            TotalCost += employee.getSalary();
        }
        
        System.out.println("Total Cost:\t" + TotalCost + "\n");
    }
    
}
