package com.leapfrog.interestcalculator.entity;

import com.leapfrog.interestcalculaor.util.SimpleInterest;

public class Customer {

    private String firstName, lastName;
    private SimpleInterest interest;

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

    public SimpleInterest getInterest() {
        return interest;
    }

    public void setInterest(SimpleInterest interest) {
        this.interest = interest;
    }

}
