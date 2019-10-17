
public class delay {
public static void delay()
{
	try 
	 {
		Thread.sleep(2000);
	 }
	catch(InterruptedException f)
	{
		f.printStackTrace();
	 }
}
public static void casting() 
{
	System.out.print("F ");
	delay();
	System.out.print("I ");
	delay();
	System.out.print("S ");
	delay();
	System.out.print("H ");
	delay();
	System.out.print("I ");
	delay();
	System.out.print("N ");
	delay();
	System.out.print("G ");
	delay();
}
	 
}
