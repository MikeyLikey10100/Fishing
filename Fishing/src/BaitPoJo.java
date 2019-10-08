
public class BaitPoJo
	{
		private String typesOfBait ; 
		private boolean alive ;
		private int size ;
		public BaitPoJo(String t, boolean a, int s)
		{
			typesOfBait = t; 
			alive = a; 
			size = s;
		}
		public String getTypesOfBait()
			{
				return typesOfBait;
			}
		public void setTypesOfBait(String typesOfBait)
			{
				this.typesOfBait = typesOfBait;
			}
		public boolean isAlive()
			{
				return alive;
			}
		public void setAlive(boolean alive)
			{
				this.alive = alive;
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
