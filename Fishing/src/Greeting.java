import java.util.Scanner;

public class Greeting
{
		public static void greeting()
		{
			Scanner userInput = new Scanner (System.in);
			Scanner userInput1 = new Scanner (System.in);
			Scanner userInput2 = new Scanner (System.in);
			
			System.out.println("Hello, welcome to fishing. Where you become a pro fishermen. What is your name?");
			
			String name = userInput1.nextLine();
			
			System.out.println("Hello " + name + ". Welcome to Fishing.");
			
			System.out.println("Would you like the rules? (1 = yes, 2 = no)");
			
			int rules = userInput2.nextInt();
			
			if( rules == 1)
				{
					System.out.println("Ok, this is how the game works!");
					System.out.println();
					System.out.println("You will be choosing a bait that you would want to use. ");
					System.out.println();
					System.out.println("Then you cast the rod and wait for a fish!");
					System.out.println();
					System.out.println("Its that easy!");
					System.out.println();
					System.out.println("Ready to play(1 = yes). If not you can continue to read the instructions.");
					
					int ready = userInput.nextInt();
					
					if (ready == 1)
					{
						System.out.println("Ok, Lets get started");
					}
				}
			else
				{
					System.out.println("Ok, let's get started");
				}
			
		}
	}
