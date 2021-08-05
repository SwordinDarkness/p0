public class Project0 {
    /**
     *
     * @author Rolando Leiva
     * version 1.0.0
    * */
    public static void main(String[] args) {
        Choices c = new Choices();
        c.start();
        SQLConnect sqlConnect = new SQLConnect();
        sqlConnect.insert(c);
        sqlConnect.select();

    }
}
