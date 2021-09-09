/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people? ");
        int num_people = Integer.parseInt(scan.nextLine());

        System.out.print("How many pizzas do you have? ");
        int num_pizzas = Integer.parseInt(scan.nextLine());

        System.out.print("How many slices per pizza? ");
        int num_slices = Integer.parseInt(scan.nextLine());

        int total_slices = num_pizzas * num_slices;
        int slices_per_person = total_slices / num_people;
        int leftover_slices = total_slices % num_people;

        System.out.println(num_people + " people with " + num_pizzas + " pizzas and " + total_slices + " slices.");
        System.out.println("Each person will get " + slices_per_person + " slices of pizza.");
        System.out.println("There are " + leftover_slices + " leftover slices");
    }
}
