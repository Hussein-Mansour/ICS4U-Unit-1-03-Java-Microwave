/* The "Microwave" that uses decision statements
*
* @author  Hussein
* @version 1.0
* @since 2020-11-18
*/

import java.util.Scanner;

/**
* This is the standard "Microwave" program.
*/

final class Microwave {

    /**
    * Declaring exponent variable.
    */
    public static final int NUMB = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting...
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Checks if there is an Invalid Input.
        try {

            // Input
            System.out.print("Are you heating sub, pizza, or soup?: ");
            // Create a scanner object
            final Scanner scanner = new Scanner(System.in);
            final String items = scanner.nextLine();

            // if for sub, pizza or soup
            if (items.equals("sub")) {
                // Input
                System.out.print("How many sub(s) are you cooking?(max:3): ");
                // Create a scanner object
                final Scanner nb0 = new Scanner(System.in);
                final int nbr = scanner.nextInt();
                // if for numbers
                if (nbr == 1) {
                    System.out.println("The total cook time is 1 minutes and 0 seconds.");
                } else if (nbr == 2) {
                    System.out.println("The total cook time is 1 minutes and 30 seconds.");
                } else if (nbr == NUMB) {
                    System.out.println("The total cook time is 3 minutes and 0 seconds.");
                } else {
                    System.out.println("The maximum quantity of food is 3.");
                }
            } else if (items.equals("pizza")) {
                // Input
                System.out.print("How many sub(s) are you cooking?(max:3): ");
                // Create a scanner object
                final Scanner nb1 = new Scanner(System.in);
                final int nbr1 = scanner.nextInt();
                // if for numbers
                if (nbr1 == 1) {
                    System.out.println("The total cook time is 0 minutes and 45 seconds.");
                } else if (nbr1 == 2) {
                    System.out.println("The total cook time is 1 minutes and 7.5 seconds.");
                } else if (nbr1 == NUMB) {
                    System.out.println("The total cook time is 2 minutes and 15 seconds.");
                } else {
                    System.out.println("The maximum quantity of food is 3.");
                }
            } else if (items.equals("soup")) {
                // Input
                System.out.print("How many sub(s) are you cooking?(max:3): ");
                // Create a scanner object
                final Scanner nb2 = new Scanner(System.in);
                final int nbr2 = scanner.nextInt();
                // if for numbers
                if (nbr2 == 1) {
                    System.out.println("The total cook time is 1 minutes and 45 seconds.");
                } else if (nbr2 == 2) {
                    System.out.println("The total cook time is 2 minutes and 37.5 seconds.");
                } else if (nbr2 == NUMB) {
                    System.out.println("The total cook time is 5 minutes and 15.4 seconds.");
                } else {
                    System.out.println("The maximum quantity of food is 3.");
                }
            } else {
              System.out.println("Only Sub, Pizza or Soup can be heated.");
            }
        } catch (java.util.InputMismatchException errorCode) { 
            // Invalid Input.
            System.out.println("Invalid Input.");
        }
        System.out.println("\nDone.");
    }
}
