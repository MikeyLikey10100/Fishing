import java.util.ArrayList;
import java.util.Random;

public class Fishes {

	
	private static Random random = new Random();
	
	public static void fishes()
	{
		int fishWeight1 = (int) (Math.random() *10 + 1);
		int fishSize1 = (int) (Math.random() *6 + 1);
		int fishWeight2 = (int) (Math.random() *10 + 1);
		int fishSize2 = (int) (Math.random() *6 + 1);
		int fishWeight3 = (int) (Math.random() *10 + 1);
		int fishSize3 = (int) (Math.random() *6 + 1);
		int fishWeight4 = (int) (Math.random() *10 + 1);
		int fishSize4 = (int) (Math.random() *6 + 1);
		int fishWeight5 = (int) (Math.random() *10 + 1);
		int fishSize5 = (int) (Math.random() *6+ 1);
		int fishWeight6 = (int) (Math.random() *10 + 1);
		int fishSize6 = (int) (Math.random() *6 + 1);
		int fishWeight7 = (int) (Math.random() *10 + 1);
		int fishSize7 = (int) (Math.random() *6 + 1);
		int fishWeight8 = (int) (Math.random() *10 + 1);
		int fishSize8 = (int) (Math.random() *6 + 1);
		int fishWeight9 = (int) (Math.random() *10 + 1);
		int fishSize9 = (int) (Math.random() *6 + 1);
		int fishWeight10 = (int) (Math.random() *10 + 1);
		int fishSize10 = (int) (Math.random() *6 + 1);
		int fishWeight11 = (int) (Math.random() *10 + 1);
		int fishSize11 = (int) (Math.random() *6 + 1);
		int fishWeight12 = (int) (Math.random() *10 + 1);
		int fishSize12 = (int) (Math.random() *6 + 1);
		
		ArrayList<FishPoJo>fish= new ArrayList<FishPoJo>();
		
		fish.add(new FishPoJo("Large Mouth Bass", fishWeight1 , fishSize1));
		fish.add(new FishPoJo("Small Mouth Bass", fishWeight2 , fishSize2));
		fish.add(new FishPoJo("Rainbow Trout", fishWeight3 , fishSize3));
		fish.add(new FishPoJo("Brown Trout", fishWeight4 , fishSize4));
		fish.add(new FishPoJo("Cutthrout Trout", fishWeight5 , fishSize5));
		fish.add(new FishPoJo("Common Carp", fishWeight6 , fishSize6));
		fish.add(new FishPoJo("Grass Carp", fishWeight7 , fishSize7));
		fish.add(new FishPoJo("Sunfish", fishWeight8 , fishSize8));
		fish.add(new FishPoJo("BlueGills", fishWeight9 , fishSize9));
		fish.add(new FishPoJo("CatFish", fishWeight10 , fishSize10));
		fish.add(new FishPoJo("Crappie", fishWeight11 , fishSize11));
		fish.add(new FishPoJo("Walleye", fishWeight12 , fishSize12));
		
		System.out.println("Congrats! You just reeled in a:");
		int fishReeled = (int) (Math.random() *12 );
		System.out.print(fish.get(fishReeled).getTypesOfFish());
		System.out.print(", " + fish.get(fishReeled).getWeight() + " pounds");
		System.out.println(", " + fish.get(fishReeled).getSize() + " inches" );
}

}