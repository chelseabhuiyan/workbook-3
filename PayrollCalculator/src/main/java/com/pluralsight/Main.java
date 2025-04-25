package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "employees.csv";


        //Load the file using a FileReader object
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            //Skip the first line
            reader.readLine();


            //Split into individual fields using the | character as the delimiter and repeat for each line in the input file
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");


                //Once the token has 4 values copy the values from the tokens array into variables that match the data. First to id, second to name, and third ot hours worked and fourth to pay rate.
                if (tokens.length == 4) {
                    String id = tokens[0];
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);


                    //create a new Employee object using the token values
                    Employee employee = new Employee(id, name, hoursWorked, payRate);


                    //Display the employee using a printf and by calling the employee's
                    //getEmployeeId(), getName(), and getGrossPay() methods
                    System.out.printf("ID: %s | Name: %s | Gross Pay: $%.2f%n",
                            employee.getEmployeeID(),
                            employee.getName(),
                            employee.getGrossPay());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}

