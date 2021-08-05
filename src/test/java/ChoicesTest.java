import org.junit.Assert;
import org.junit.Test;

public class ChoicesTest {
       @Test
    public void testName()
    {
        Choices c = new Choices();
        c.setName("Rolando");
        Assert.assertEquals("Rolando", c.getName());
    }

    @Test
    public void testNumber1()
    {
        Choices c = new Choices();
        c.setChoice1("1");
        Assert.assertEquals("1", c.getChoice1());

    }

    @Test
    public void testNumber2() {
        Choices c = new Choices();
        c.setChoice1("1");
        c.setChoice2("1");
        Assert.assertEquals("1", c.getChoice1());
    }

    @Test
    public void testNumber3() {
        Choices c = new Choices();
        c.setChoice1("1");
        c.setChoice2("1");
        c.setEnding("Ending 1");
        Assert.assertEquals("Ending 1", c.getEnding());
    }

    @Test
    public void failChoice1()
    {
        Choices c = new Choices();
        c.setChoice1("3");
        if(!(c.getChoice1().equals("1") || c.getChoice1().equals("2")))
        {
            c.setChoice1("0");
        }
        Assert.assertEquals("0", c.getChoice1());
    }
    @Test
    public void failChoice2()
    {
        Choices c = new Choices();
        c.setChoice1("3");
        c.setChoice2(" ");
        if(!(c.getChoice1().equals("1") || c.getChoice1().equals("2")))
        {
            c.setChoice1("0");
        }
        if(!(c.getChoice2().equals("1") || c.getChoice2().equals("2")))
        {
            c.setChoice2("0");
        }
        Assert.assertEquals("0", c.getChoice2());
    }

    @Test
    public void failEnding()
    {
        Choices c = new Choices();
        c.setChoice1("3");
        c.setChoice2("4");
        if(!(c.getChoice1().equals("1") || c.getChoice1().equals("2")))
        {
            c.setChoice1("0");
        }
        if(!(c.getChoice2().equals("1") || c.getChoice2().equals("2")))
        {
            c.setChoice2("0");
            c.setEnding("Error Ending");
        }
        Assert.assertEquals("Error Ending", c.getEnding());
    }
}