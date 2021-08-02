import java.sql.*;
public class Project0 {
    public static void main(String[] args) {
        Choices c = new Choices();
        c.start();
        SQLConnect sqlConnect = new SQLConnect();
        sqlConnect.insert(c);
        sqlConnect.select();
    }
}
