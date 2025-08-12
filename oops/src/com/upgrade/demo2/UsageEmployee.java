package com.upgrade.demo2;

public class UsageEmployee {
    public static void main(String[] args) {
        //created 2 object which calls constructors automatically
        Employee emp1 = new Employee(101,"Sonam","Soni",23456789);
        Employee emp2 = new Employee(102,"Ian","Jukes",98765432);
        emp1.printData(); //calling used defined method
        emp2.printData();

        Employee em3= new Employee(); //use default constructor
        em3.setEmpId(103); //using setter method
        em3.setFirstName("John");
        em3.setLastName("Doe");
        em3.setSalary(2345678);
        //using getter methods
        System.out.println(em3.getEmpId()+" "+em3.getFirstName());

        Manager manager= new Manager(203,"Nandita","Vora",234562,"HR");
        Developer developer= new Developer(204,"Devid","John",345678,"JAVA");

        manager.manageProject();
        manager.increment(4.5f);
        developer.writeCode();
        developer.increment(45000);

        manager.printData();
        developer.printData();

    }
}





