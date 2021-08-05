import org.junit.Assert;
import org.junit.Test;


public class ProjectTest {

    @Test
    public void methodTest()
    {
        Assert.assertTrue(true);
    }
    @Test
    public void testSQLSelect()
    {
        SQLConnect sqlConnect = new SQLConnect();
        sqlConnect.select();
        Assert.assertNotNull(sqlConnect);

    }
    @Test
    public void testSQLInsert()
    {
        SQLConnect sqlConnect = new SQLConnect();
        Choices c = new Choices();
        c.setName("Test Case 3");
        c.setChoice1("7");
        c.setChoice2("7");
        c.setEnding("Test Ending 3");
        sqlConnect.insert(c);
        Assert.assertNotNull(sqlConnect);

    }

}
