import java.util.Scanner;

public class Greeting
{
		public static void greeting()
		{
			Scanner userInput1 = new Scanner (System.in);
			Scanner userInput2 = new Scanner (System.in);
			
			System.out.println("Hello, welcome to fishing. Were you become a pro fishermen. What is your name?");
			
			String name = userInput1.nextLine();
			
			System.out.println("Hello " + name + ". Welcome to Fishing.");
			
			System.out.println("Would you like the rules? (1 = yes, 2 = no)");
			
			int rules = userInput2.nextInt();
			
			if( rules == 1)
				{
					System.out.println("vdfgkdhfgjkl");
				}
			else
				{
					System.out.println("Ok, let's get started");
				}
		}
	}
