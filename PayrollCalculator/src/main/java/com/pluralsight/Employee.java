package com.pluralsight;

public class Employee {
    //Attributes
    private String employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;
    //Parameterized constructors
    public Employee(String employeeID,String name, double hoursWorked, double payRate){
        this.employeeID=employeeID;
        this.name=name;
        this.hoursWorked=hoursWorked;
        this.payRate=payRate;
    }
    //Getters and Setters
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //grossPay calculating method
    public double getGrossPay(){
        return hoursWorked*payRate;
    }
}

