import junit.framework.TestCase;
import org.junit.Test;

public class ChoicesTest extends TestCase {

    @Test
    public void testName()
    {
        Choices c = new Choices();
        c.setName("Rolando");
        assertEquals("Rolando",c.getName());
    }

    @Test
    public void testNumber1()
    {
        Choices c = new Choices();
        c.setChoice1("1");
        assertEquals("1",c.getChoice1());

    }

    @Test
    public void testNumber2() {
        Choices c = new Choices();
        c.setChoice1("1");
        c.setChoice2("1");
        assertEquals("1",c.getChoice1());
    }

    @Test
    public void testNumber3() {
        Choices c = new Choices();
        c.setChoice1("1");
        c.setChoice2("1");
        c.setEnding("Ending 1");
        assertEquals("Ending 1",c.getEnding());
    }

}