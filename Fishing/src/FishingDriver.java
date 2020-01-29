import java.util.ArrayList;


import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import JOptionPane.ICON_PROPERTY;
public class FishingDriver
	{

		public static void main(String[] args)
			{
				JFrame frame = new JFrame();
				ImageIcon fish = new ImageIcon("fish test.jpg");
				JOptionPane.showMessageDialog(frame, fish);
				//Object[] bait2 = {"cod"};
		        Greeting.greeting();
				System.out.println();
				Bait.bait();
				System.out.println();
				delay.casting();
				System.out.println();
				System.out.println();
				Fishes.fishes();
				System.out.println();
				System.out.println("Thank you for playing");
				
			}

	}
