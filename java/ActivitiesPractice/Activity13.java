package ActivitiesPractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		   ArrayList<Integer> list = new ArrayList<>();

		
		        // Create Random object
		        Random indexGen = new Random();

		        // Accept number inputs from the user
		        System.out.println("Enter numbers (type 'done' to finish):");
		        while (scan.hasNext()) {
		            if (scan.hasNextInt()) {
		                int num = scan.nextInt();
		                list.add(num);
		            } else {
		                String input = scan.next();
		                if (input.equalsIgnoreCase("done")) {
		                    break;
		                } else {
		                    System.out.println("Please enter a number or 'done' to finish.");
		                }
		            }
		        }

		        // Check if the list is not empty
		        if (!list.isEmpty()) {
		            // Generate a random index
		            int randomIndex = indexGen.nextInt(list.size());

		            // Print the value at the generated index
		            System.out.println("Random index: " + randomIndex);
		            System.out.println("Value at random index: " + list.get(randomIndex));
		        } else {
		            System.out.println("No numbers were entered.");
		        }

		        // Close the scanner
		        scan.close();
		    }
	}


