package com.leapfrog.interestcalculator;

import com.leapfrog.interestcalculator.controller.Controller;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller controller = new Controller(input);
        controller.displayInfo();
    }
}
