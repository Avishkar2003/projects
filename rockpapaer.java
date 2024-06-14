package classwork;

import java.util.Scanner;

public class rockpapaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        int userChoice;
	        int computerChoice;
	        String userChoiceString = null;
	        String computerChoiceString;

	        while (true) {
	            System.out.println("Rock Paper Scissors Game:");
	            System.out.println("1. Rock  \n 2.paper \n 3.scissors  \n 4.exit");
	            System.out.print("Enter your choice: ");
	            userChoice = scanner.nextInt();

	            switch (userChoice) {
	                case 1:
	                    userChoiceString = "Rock";
	                    break;
	                case 2:
	                    userChoiceString = "Paper";
	                    break;
	                case 3:
	                    userChoiceString = "Scissors";
	                    break;
	                case 4:
	                    System.out.println("Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }

	            computerChoice = (int) (Math.random() * 3) + 1;
	            switch (computerChoice) {
	                case 1:
	                    computerChoiceString = "Rock";
	                    break;
	                case 2:
	                    computerChoiceString = "Paper";
	                    break;
	                case 3:
	                    computerChoiceString = "Scissors";
	                    break;
	                default:
	                    computerChoiceString = "";
	            }

	            System.out.println("You chose: " + userChoiceString);
	            System.out.println("Computer chose: " + computerChoiceString);

	            if (userChoice == computerChoice) {
	                System.out.println("It's a tie!");
	            } else if ((userChoice == 1 && computerChoice == 3) ||
	                    (userChoice == 2 && computerChoice == 1) ||
	                    (userChoice == 3 && computerChoice == 2)) {
	                System.out.println("You win!");
	            } else {
	                System.out.println("Computer wins!");
	            }
	        }
	    }
	}