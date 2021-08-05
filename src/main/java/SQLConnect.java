import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SQLConnect {
    private String path;
    private Connection con = null;
    private Statement stmt;
    private final Logger log = LoggerFactory.getLogger(SQLConnect.class);
    public SQLConnect() {
        super();
    }

    /**
    * @exception Exception throws a exeption if the database is not found.
    * Creates a Table called History in the database.
    * */
    public void createTable() {
        try {
            //creating a Connection and Statement
            Class.forName("org.sqlite.JDBC");
            //finding the db file called test
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            stmt = con.createStatement();
            //Creating a string called SQL and creating table inside the database.
            String sql = "CREATE TABLE History" +
                    "(ID INT PRIMARY KEY NOT NULL," +
                    "Name VARCHAR(30)," +
                    "Choice1 VARCHAR(5)," +
                    "Choice2 VARCHAR(5)," +
                    "Ending  VARCHAR(10))";
            //executing the update to create the table
            stmt.executeUpdate(sql);
            log.info("SQL Table created");
            //Close both Connection and Statement
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //Prints out a message telling the programmer the table was created without error.
        System.out.println("Table created successfully");
    }
    /**
     * @param c the Choice object used to insert data into database.
     * Takes a choice object and inserts the values of the strings in the Choice object
     *          into a table called History in the SQLite database
     * */
    public void insert(Choices c) {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            con.setAutoCommit(false);
            stmt = con.createStatement();
            //String variable called sql used to insert a row into the History table
            String sql = "INSERT INTO History(Name, Choice1,Choice2,Ending)" +
                    "VALUES('"+c.getName()+"','"+c.getChoice1()+"','"+c.getChoice2()+"','"+c.getEnding()+"')";
            //executing the update to create the table
            stmt.executeUpdate(sql);
            //Close both Connection and Statement
            stmt.close();
            //committing changes
            con.commit();
            con.close();
        } catch (Exception e) {
            System.out.println("Failed");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Inserted Object successfully");
    }
    /**
     * Selects all the data from the History Table in the database
     * and prints out each row.
     * */
    public void select()
    {

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM History;" );
            /*
            * While there is a next row in the database table
            * prints the row to the terminal
            * */
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  name = rs.getString("name");
                String choice1  = rs.getString("Choice1");
                String  choice2 = rs.getString("Choice2");
                String  ending = rs.getString("Ending");

                System.out.println("New Entry");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "Choice1 = " + choice1 );
                System.out.println( "Choice2 = " + choice2 );
                System.out.println( "Ending = " + ending );
                System.out.println("===============================================================");
            }
            //Closing Result set, Connection, and Statement
            rs.close();
            stmt.close();
            con.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Select done successfully");
    }
}


