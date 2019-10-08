import java.util.ArrayList;

public class Bait
	{

		public static void bait()
			{
				ArrayList<BaitPoJo>bait= new ArrayList<BaitPoJo>();	
				bait.add (new BaitPoJo("Worm" , true , 6));
				bait.add (new BaitPoJo("Nymphs" , false , 1));
				bait.add (new BaitPoJo("Mealworms" , true , 2));
				bait.add (new BaitPoJo("Leaches" , true , 2));
				bait.add (new BaitPoJo("Spinners" , false , 3)); 
				bait.add (new BaitPoJo("Lure" , false , 4));
				bait.add (new BaitPoJo("Minnows" , true , 3));
				bait.add (new BaitPoJo("Flies" , false , 1));


				System.out.println(bait.get(0).getTypesOfBait());
				
				
				for( Baby b : nursery)
					{
						System.out.println(b.getName());
					}
				for( Baby b : nursery)
					{
						System.out.println(b.getWeight());
					}
				for( Baby b : nursery)
					{
						System.out.println(b.getGender());
					}
			}

	}
