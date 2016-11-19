package com.leapfrog.interestcalculaor.util;

public class SimpleInterest {

    private double principle, time, rate;
    private boolean daily, monthly, yearly;

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isDaily() {
        return daily;
    }

    public void setDaily(boolean daily) {
        this.daily = daily;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public void setMonthly(boolean monthly) {
        this.monthly = monthly;
    }

    public boolean isYearly() {
        return yearly;
    }

    public void setYearly(boolean yearly) {
        this.yearly = yearly;
    }

    public double calculate() {
        int t = 1;
        if (daily) {
            t = 365;
        }
        if (monthly) {
            t = 12;
        }
        return (principle * time * rate) / (100 * t);
    }

}
