package com.leapfrog.interestcalculator.controller;

import com.leapfrog.interestcalculaor.util.SimpleInterest;
import com.leapfrog.interestcalculator.entity.Customer;
import java.util.Scanner;

public class Controller {

    Scanner input;
    Customer customer = new Customer();
    SimpleInterest simpleInterest = new SimpleInterest();

    public Controller(Scanner input) {
        this.input = input;
    }

    private void getInputs() {

        System.out.println("Enter Customer First Name: ");
        customer.setFirstName(input.next());
        System.out.println("Enter Customer Second Name: ");
        customer.setLastName(input.next());
        System.out.println("Enter Principle: ");
        simpleInterest.setPrinciple(input.nextDouble());
        System.out.println("Enter Rate: ");
        simpleInterest.setRate(input.nextDouble());
        System.out.println("Enter Time in Years: ");
        simpleInterest.setTime(input.nextDouble());
    }

    public void displayInfo() {

        while (true) {
            getInputs();
            System.out.println("===========================");
            System.out.println("Customer Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Principle : Rs." + simpleInterest.getPrinciple());
            System.out.println("Rate: " + simpleInterest.getRate());
            System.out.println("Time in Years: " + simpleInterest.getTime());
            System.out.println("Simple Interest: Rs." + simpleInterest.calculate());
            System.out.println("");
            System.out.println("Do you want to continue? [Y/N]: ");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

}
