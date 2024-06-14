package classwork;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		double balance =0.0;
		
		while (true)
		{
			System.out.println("\n Welcome to simple Bank :  ");
			System.out.println("1. check balance \n 2.deposit money \n 3. withdraw money \n 4. Exit ");
			System.out.println("Enter your choice");
			
			int choice = scanner.nextInt();
			
			if (choice==1)
			{
				System.out.println("your curent balance is :   $  "+balance);
			}else if (choice ==2 ) {
				System.out.println("Enter the amount to deposit  :  ");
				double amount = scanner.nextDouble();
				if (amount > 0) {
					balance += amount;
					System.out.println("$" + amount + " deposited successfully.");
				} else {
					System.out.println("Invalid amount. ");
				}
			} else if (choice == 3) {
				System.out.println("Enter amount to withdraw");
				double amount = scanner.nextDouble();
				if (amount > 0 && amount <= balance ) {
					balance -= amount ;
					System.out.println("$" + amount + "withdrawn successfully");
				}else {
					System.out.println("Invalid amount or insufficient fund : ");
				}
			}else if (choice ==4) {
				System.out.println("Thank you for using bank : ");
				break ;
			} else {
				System.out.println("Invalid choice . ");
			}
		}
		
		scanner.close();
	}

}
