/**
 * @author Muaz
 * @date 06/07/2024
 * a fun cup cake homework small game
 */

package com.muaz;

import java.util.Scanner;

public class CupcakeParty {

    /**
     * Main method to run the CupcakeParty program.
     * Prompts the user to enter the number of regular and small boxes, then calculates the total number of cupcakes.
     * 
     * @param args The command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Variables for the regular and small boxes
        int numRegular = 0;
        int numSmall = 0;
        
        // Prompting the user for input
        Scanner userInput = new Scanner(System.in);
        
        // Asking the user for the number of regular boxes
        System.out.print("Enter the number of regular boxes: ");
        numRegular = userInput.nextInt();

        // Asking the user for the number of small boxes
        System.out.print("Enter the number of small boxes: ");
        numSmall = userInput.nextInt();
        
        // Calculating the total number of cupcakes
        int regularBox = numRegular * 8;
        int smallBox = numSmall * 3;
        int totalCupcakes = (regularBox + smallBox) % 28; // Modulo 28 to get the remainder after dividing by 28
        System.out.println("Total number of cupcakes: " + totalCupcakes);
    }
}
