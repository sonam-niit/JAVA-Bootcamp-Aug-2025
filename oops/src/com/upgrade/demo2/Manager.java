package com.upgrade.demo2;

public class Manager extends Employee{
    private String department;

    public Manager(int empId, String firstName, String lastName, double salary, String department) {
        super(empId, firstName, lastName, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void manageProject(){
        System.out.println(getFirstName()+" "+getLastName()+" is managing the "+
                department+ " Department");
    }
    @Override
    public void printData(){
        super.printData();//call parent class method
        System.out.println("Department: "+department);
    }
}
