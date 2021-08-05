import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Choices {
    private String name;
    private String choice1;
    private String choice2;
    private String ending;
    private final Logger log = LoggerFactory.getLogger(Choices.class);
    public Choices() {

        super();
        log.info("Building Object");
    }

    public void name()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        log.info("String name in Choice object is set");

    }
    /** Prints out a scenario that the user reads and picks one
     * The choice 1 string is set to Scanner nextLine
     * If the input is incorrect( not 1 or 2) then the method sets choice 1 to zero.
    * */
    public void Number1 ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You see a dark and abandoned mansion in the distance. You have two choices:"
                + "\nOne: approach the mansion"
                + "\nTwo: Run away"
                + "\nEnter 1 to approach or 2 to run way");
        this.choice1  = sc.nextLine();
        log.info("String Choice 1 in Choice object is set");
        //If the string
        if(!(this.choice1.equals("1") || this.choice1.equals("2")))
        {
            log.info("Error. Setting Choice 1 to zero");
            this.choice1 ="0";
        }

    }
    /** Based on the decision in Choice 1, the user is presented with
     * a new scenario and picks between two options
     *If the input is incorrect( not 1 or 2) then the method sets choice 2 to zero.
    * */
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
            log.info("Choice 2 is set");
        }
        else if (this.choice1.equals("2"))
        {
            System.out.println("You chose to run away. You enter a dark forest and are completely lost. You remember that you still have your car in the distance You have two choices:"
                    + "\nOne: Go back to your car"
                    + "\nTwo: Explore the forest"
                    + "\nEnter 1 to go to your car or 2 to Explore");
            this.choice2 = sc.nextLine();
            log.info("Choice 2 is set");
        }
        else
        {
            log.info("Error. Setting Choice 2 to zero");
            this.choice2= "0";
        }
    }
    /** Based on the decision in Choice 1, the user is presented with
     * a new scenario and picks between two options
     *If the input is incorrect( not 1 or 2) then the method sets choice 2 to zero.
     * */
    public void Number3 ()
    {
        if(this.choice1.equals("1") && this.choice2.equals("1"))
        {
            System.out.println("You try to break the door but you don't have the strength to break the door. You spent the rest of the night staring"
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 1";
            log.info("Ending set to Ending 1");
        }
        else if(this.choice1.equals("1") && this.choice2.equals("2"))
        {
            System.out.println("You chose to look into the mansion and see a ghost. You run back to your car as fast as possible."
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 2";
            log.info("Ending set to Ending 2");
        }
        else if(this.choice1.equals("2") && this.choice2.equals("1"))
        {
            System.out.println("You chose to go back to your car. You drive home."
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 3";
            log.info("Ending set to Ending 3");
        }
        else if(this.choice1.equals("2") && this.choice2.equals("2"))
        {
            System.out.println("You chose to explore the forest. You are lost in the forest and never make it home"
                    + "\nGame Over"
                    + "\nThanks for playing");
            this.ending = "Ending 4";
            log.info("Ending set to Ending 4");
        }
        else
        {
            log.info("Error. Setting Ending to Error Ending");
            this.ending = "Error Ending";
        }
    }

    /**
     * @return A string literal of the Choice object
     * */
    @Override
    public String toString()
    {
        return ("Name: " +this.name
                +"\nChoice 1: " +this.choice1
                +"\nChoice 2: " +this.choice2
                +"\nEnding: " +this.ending);
    }
    /**
     * Calls all the methods needed to complete the text adventure
    * */
    public void start()
    {
       log.info("Calling start method");
       this.name();
       this.Number1();
       this.Number2();
       this.Number3();
       System.out.println(this);
       log.info("Exiting start method");
    }
    /**
     * @return name from the Choice object
     * */
    public String getName() {
        return name;
    }
    /**
     * Sets the String variable called name in Choice object
     * Used only for testing in Junit
     * */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Choice1 from the Choice object
     * */
    public String getChoice1() {
        return choice1;
    }
    /**
     * Sets the String variable called Choice1 in Choice object
     * Used only for testing in Junit
     * */
    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }
    /**
     * @return Choice 2 from the Choice object
     * */
    public String getChoice2() {  return choice2;  }
    /**
     * Sets the String variable called Choice2 in Choice object
     * Used only for testing in Junit
     * */
    public void setChoice2(String choice2) {this.choice2 = choice2; }
    /**
     * @return Ending from the Choice object
     * */
    public String getEnding() { return ending; }

    /**
     * Sets the String variable called ending in Choice object
     * Used only for testing in Junit
     * */
    public void setEnding(String ending) {this.ending = ending; }
}
