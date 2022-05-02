import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void factorialTest() {
        assertEquals(120, SkillDemo.factorial(4));
    }
}
