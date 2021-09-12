/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("How many people? ");
        int people = keyboardInput.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = keyboardInput.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = keyboardInput.nextInt();

        int numSlices = ( people * pizzas );
        System.out.println( people + " people with " + pizzas + " pizzas" + " (" + numSlices + " slices)." );

        int eachPerson = (numSlices / people);
        System.out.println( "Each person get " + eachPerson + " pieces of pizzas. ");

        int leftOver = (numSlices % people);
        System.out.println( "There are " + leftOver + " leftover pieces. " );







    }
}
