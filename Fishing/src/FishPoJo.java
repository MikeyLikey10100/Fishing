
public class FishPoJo
	{
		private String typesOfFish ; 
		private int weight ;
		private int size ;
		private boolean male;
		public FishPoJo(String f, int w, int s, boolean m )
		{
			typesOfFish = f ; 
			weight = w; 
			size = s; 
			male = m;
		}
		public boolean isMale()
			{
				return male;
			}
		public void setMale(boolean male)
			{
				this.male = male;
			}
		public String getTypesOfFish()
			{
				return typesOfFish;
			}
		public void setTypesOfFish(String typesOfFish)
			{
				this.typesOfFish = typesOfFish;
			}
		public int getWeight()
			{
				return weight;
			}
		public void setWeight(int weight)
			{
				this.weight = weight;
			}
		public int getSize()
			{
				return size;
			}
		public void setSize(int size)
			{
				this.size = size;
			}

	}
