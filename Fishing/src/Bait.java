import java.util.ArrayList;

public class Bait
	{
		static String userBait = "";
		static ArrayList<BaitPoJo>bait= new ArrayList<BaitPoJo>();	
		public static void bait()
			{	
			
				bait.add (new BaitPoJo("Worm" , true , 6));
				bait.add (new BaitPoJo("Nymphs" , false , 1));
				bait.add (new BaitPoJo("Mealworms" , true , 2));
				bait.add (new BaitPoJo("Leaches" , true , 2));
				bait.add (new BaitPoJo("Spinners" , false , 3)); 
				bait.add (new BaitPoJo("Lure" , false , 4));
				bait.add (new BaitPoJo("Minnows" , true , 3));
				bait.add (new BaitPoJo("Flies" , false , 1));

				
				System.out.println("Here are your Baits, and whether or not it is alive and its size.");
				for( BaitPoJo b : bait)
					{
						System.out.print(b.getTypesOfBait());
						System.out.print(", " + b.isAlive());
						System.out.print(", " + b.getSize());
						System.out.println();
					}
				System.out.println("Which bait would you like?");
				
				
			}

	}
