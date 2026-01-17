/**
 * While.java
 * This program demonstrates the basic usage of a while loop in Java
 * by creating a simple countdown timer.
 */

// Add a package declaration if needed (remove this if you're not using packages)
// package com.example;

// Demonstrate the while loop.
public class While {
    public static void main(String args[]) {
        // Initialize counter variable
        int n = 10;
        
        System.out.println("Starting countdown:");
        
        // While loop that continues as long as n is greater than 0
        while(n > 0) {
            System.out.println("tick " + n);
            n--; // Decrement counter after each iteration
        }
        
        System.out.println("Countdown complete!");
    }
}