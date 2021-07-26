 import java.util.Scanner;
 public class p0 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("You see a dark and abandoned mansion in the distance. You have two choices:"
				+ "\nOne: approach the mansion"
				+ "\nTwo: Run away"
				+ "\nEnter 1 to approach or 2 to run way");
				String choice = sc.nextLine();
			if(choice.equals("1"))
			{
				System.out.println("You chose to approach the mansion. The door is locked and you have no way to enter.  You have two choices:"
					+ "\nOne: break the door"
					+ "\nTwo: Look through a window"
					+ "\nEnter 1 to break the door or 2 to look");
					choice = sc.nextLine();
				if(choice.equals("1"))
				{
					System.out.println("You try to break the door but you don't have the strength to break the door. You spent the rest of the night staring"
					+ "\nGame Over"
					+ "\nThanks for playing");
				}
				else if(choice.equals("2"))
				{
					System.out.println("You chose to look into the mansion and see a ghost. You run back to your car as fast as possible."
					+ "\nGame Over"
					+ "\nThanks for playing");
				}
				else
				{
					System.out.println("Error 2");
				}
			}
			else if(choice.equals("2"))
			{
				System.out.println("You chose to run away. You enter a dark forest and are completely lost. You remember that you still have your car in the distance You have two choices:"
					+ "\nOne: Go back to your car"
					+ "\nTwo: Explore the forest"
					+ "\nEnter 1 to go to your car or 2 to Explore");
					choice = sc.nextLine();
				if(choice.equals("1"))
				{
					System.out.println("You chose to go back to your car. You drive home."
					+ "\nGame Over"
					+ "\nThanks for playing");
				}
				else if(choice.equals("2"))
				{
					System.out.println("You chose to explore the forest. You are lost in the forest and never make it home"
					+ "\nGame Over"
					+ "\nThanks for playing");
				}
				else
				{
					System.out.println("Error 3");
				}
			}
			else 
			{
				System.out.println("Error 1");
			}
			sc.close();
		
	}
	
 }
