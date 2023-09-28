package com.shpp.p2p.cs.vomelianchuk.assignment2;

import com.shpp.cs.a.console.TextProgram;

/**
 * File: Assignment2Part1.java
 * Solves a quadratic equation and derives real roots
 */
public class Assignment2Part1 extends TextProgram {
    @Override
    public void run() {
        // sets the coefficients of the equation
        double a = readDouble("Please enter a: ");
        double b = readDouble("Please enter b: ");
        double c = readDouble("Please enter c: ");

        // calculates the discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        calculateTheRoots(a, b, discriminant);
    }

    /**
     * Depending on the value of the discriminant,
     * a different number of roots is obtained,
     * which are calculated by formulas
     *
     * @param a The first coefficient is a quadratic equation
     * @param b The second coefficient is a quadratic equation
     * @param discriminant The discriminant of a quadratic equation
     */
    private void calculateTheRoots(double a, double b, double discriminant) {
        if (a == 0) {
            println("This equation is not quadratic");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            println("There are two roots: " + x1 + " and " + x2);
        } else if (discriminant == 0) {
            double x = (-b) / (2 * a);
            println("There is one root: " + x);
        } else {
            println("There are no real roots");
        }
    }
}