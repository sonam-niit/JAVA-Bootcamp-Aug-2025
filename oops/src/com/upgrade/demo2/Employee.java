package com.upgrade.demo2;

public class Employee {
    //Member variables
    private int empId;
    private String firstName;
    private String lastName;
    private double salary;

    //Default Constructor
    public Employee(){

    }
    //user-defined constructor
    public Employee(int empId, String firstName, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increment(float percentage){
        salary+=((salary*percentage)/100);
        System.out.println("Salary incremented "+salary);
    }
    public void increment(int bonus){
        salary+=bonus;
        System.out.println("Salary incremented "+salary);
    }
    //method as per the req
    public void printData(){
        System.out.println("***************Employee Id: "+empId+"**************");
        System.out.println("Salary: "+salary);
        System.out.println("Full Name: "+ firstName+" "+lastName);
    }
}
