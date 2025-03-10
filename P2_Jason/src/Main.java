//CS 2265 – Advanced Programming I

//Troy eCampus – Prof. Reggie Haseltine

//Program #2 – Simple Integer Math and Comparisons of 3 Numbers

//for an Interactive Program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter three integers
        System.out.println("Enter 3 integers");
        // Reading the three integers from the user
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Calculating the sum of the three integers
        int sum = num1 + num2 + num3;
        // Calculating the average of the three integers
        int avg = sum/3;
        // Calculating the product of the three integers
        int product = num1 * num2 * num3;

        // Determining the smallest of the three numbers
        int small = num1; // Assume num1 is the smallest initially
        if (num2 < small) {
            small = num2; // Update small if num2 is smaller
        }
        if (num3 < small) {
            small = num3; // Update small if num3 is smaller
        }

        // Determining the largest of the three numbers
        int large = num1; // Assume num1 is the largest initially
        if (num2 > large) {
            large = num2; // Update large if num2 is larger
        }
        if (num3 > large) {
            large = num3; // Update large if num3 is larger
        }


        System.out.println("Sum of 3 integers  = " + sum);
        System.out.println("Average of 3 integers  = " + avg);
        System.out.println("Product of 3 integers  = " + product);
        System.out.println("The smallest number is: " + small);
        System.out.println("The largest number is: " + large);
    }
}
