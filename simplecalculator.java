package classwork;

import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Declare variables to store user input and result
		int a,b,ans,choice;
		
		
		 // Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		
		
		// Display welcome message and options to the user
		System.out.println("Welcome to calculator ||||");
		System.out.println("Press 1.Addition.  \n Press 2.Substraction \n 3.multiplication. \n 4. division");
		System.out.println("Enter your choice ");
		choice=sc.nextInt();
		
		// Use switch statement to perform different operations based on user choice
		switch(choice)
		{
		  
		
		case 1:
			//perform addition
			System.out.println("Enter two numbers :  ");
			a=sc.nextInt();
			b=sc.nextInt();
			ans=a+b;
			System.out.println("The addition is :  "+ans);
			
			break;
			
		case 2:
			//perform substraction
			System.out.println("Enter two numbers :  ");
			a=sc.nextInt();
			b=sc.nextInt();
			ans=a-b;
			System.out.println("The substraction is :  "+ans);
			
			break;
		
		case 3:
			
			//perform multiplication
			System.out.println("Enter two numbers :  ");
			a=sc.nextInt();
			b=sc.nextInt();
			ans=a*b;
			System.out.println("The multiplicitaion is :  "+ans);
			
			break;
			
		case 4:
			
			//perform division
			System.out.println("Enter two numbers :  ");
			a=sc.nextInt();
			b=sc.nextInt();
			ans=a/b;
			System.out.println("The division is :  "+ans);
			
			break;
			
			default:
				// Handle invalid user input
				System.out.println("Invalid choice pls try again ");
				
				break;
				
				
		}
	}

}
