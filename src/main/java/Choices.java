import java.util.Scanner;
public class Choices {
    private String name;
    private String choice1;
    private String choice2;
    private String ending;
    public Choices() {
        super();
    }

    public void name()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();

    }
    public void Number1 ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You see a dark and abandoned mansion in the distance. You have two choices:"
                + "\nOne: approach the mansion"
                + "\nTwo: Run away"
                + "\nEnter 1 to approach or 2 to run way");
        this.choice1  = sc.nextLine();

    }
    public void Number2 ()
    {

        Scanner sc = new Scanner(System.in);
        if(this.choice1.equals("1") )
        {
            System.out.println("You chose to approach the mansion. The door is locked and you have no way to enter.  You have two choices:"
                    + "\nOne: break the door"
                    + "\nTwo: Look through a window"
                    + "\nEnter 1 to break the door or 2 to look");
            this.choice2 = sc.nextLine();
        }
        else if (this.choice1.equals("2"))
        {
            System.out.println("You chose to run away. You enter a dark forest and are completely lost. You remember that you still have your car in the distance You have two choices:"
                    + "\nOne: Go back to your car"
                    + "\nTwo: Explore the forest"
                    + "\nEnter 1 to go to your car or 2 to Explore");
            this.choice2 = sc.nextLine();
        }
        else
        {
            System.out.println("Error wrong input");
            this.choice2= " ";
        }
    }
    public void Number3 ()
    {
        if(this.choice1.equals("1") && this.choice2.equals("1"))
        {
            System.out.println("You try to break the door but you don't have the strength to break the door. You spent the rest of the night staring"
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 1";
        }
        else if(this.choice1.equals("1") && this.choice2.equals("2"))
        {
            System.out.println("You chose to look into the mansion and see a ghost. You run back to your car as fast as possible."
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 2";
        }
        else if(this.choice1.equals("2") && this.choice2.equals("1"))
        {
            System.out.println("You chose to go back to your car. You drive home."
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 3";
        }
        else if(this.choice1.equals("2") && this.choice2.equals("2"))
        {
            System.out.println("You chose to explore the forest. You are lost in the forest and never make it home"
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 4";
        }
        else
        {
            System.out.println("Error");
            this.ending = "Error Ending";
        }
    }

    @Override
    public String toString()
    {
        return ("Name: " +this.name
                +"\nChoice 1: " +this.choice1
                +"\nChoice 2: " +this.choice2
                +"\nEnding: " +this.ending);
    }

    public void start()
    {
       this.name();
       this.Number1();
       this.Number2();
       this.Number3();
       System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }
}
