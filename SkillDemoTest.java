import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void doublingtest(){
        int value = SkillDemo.doubling(2);
        assertEquals(6, value);
    }
}
