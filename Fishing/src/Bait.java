import java.util.ArrayList;
import java.util.Scanner;

public class Bait
	{
		static String userBait = "";
		static ArrayList<BaitPoJo>bait= new ArrayList<BaitPoJo>();	
		public static void bait()
			{	
			
				/*bait.add (new BaitPoJo("Worm" , true , 6));
				bait.add (new BaitPoJo("Nymphs" , false , 1));
				bait.add (new BaitPoJo("Mealworms" , true , 2));
				bait.add (new BaitPoJo("Leaches" , true , 2));
				bait.add (new BaitPoJo("Spinners" , false , 3)); 
				bait.add (new BaitPoJo("Lure" , false , 4));
				bait.add (new BaitPoJo("Minnows" , true , 3));
				bait.add (new BaitPoJo("Flies" , false , 1));
*/
				Object[] bait2 = {"Worm, live, 6in","Nymphs, not live, 1in", "Mealworms, live, 2in", "Leechs", "Spinners", "Lure", "Minnows","Flies" };
				System.out.println("Here are your Baits, and whether or not it is alive and its size.");
				for( BaitPoJo b : bait)
					{
						System.out.print(b.getTypesOfBait());
						System.out.print(", " + b.isAlive());
						System.out.print(", " + b.getSize());
						System.out.println();
					}
				System.out.println("Which bait would you like?");
				
				Scanner userBait = new Scanner (System.in);
				
				String bait = userBait.nextLine();
				System.out.println("You picked " + bait + ". Time to cast your rod.");
			}

	}
