import java.sql.*;
public class SQLConnect {
    private String path;
    private Connection con = null;
    private Statement stmt;

    public SQLConnect() {
        super();
    }

    public void startConnection() {

        try {
            Class.forName("");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void createTable() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE History" +
                    "(ID INT PRIMARY KEY NOT NULL," +
                    "Name VARCHAR(30)," +
                    "Choice1 VARCHAR(5)," +
                    "Choice2 VARCHAR(5)," +
                    "Ending  VARCHAR(10))";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public void insert(Choices c) {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            con.setAutoCommit(false);
            stmt = con.createStatement();
            System.out.println("Statement created");
            String sql = "INSERT INTO History(Name, Choice1,Choice2,Ending)" +
                    "VALUES('"+c.getName()+"','"+c.getChoice1()+"','"+c.getChoice2()+"','"+c.getEnding()+"')";
            stmt.executeUpdate(sql);
            stmt.close();
            con.commit();
            con.close();
        } catch (Exception e) {
            System.out.println("Failed");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Inserted Object successfully");
    }

    public void select()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM History;" );

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
                System.out.println();
            }
            rs.close();
            stmt.close();
            con.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}


