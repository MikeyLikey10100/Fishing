
public class FishPoJo
	{
		private String typesOfFish ; 
		private int weight ;
		private int size ;
		public FishPoJo(String f, int w, int s )
		{
			typesOfFish = f ; 
			weight = w; 
			size = s; 
			
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
		public String isAlive() {
			// TODO Auto-generated method stub
			return null;
		}

	}
