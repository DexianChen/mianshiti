package recurrence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RecurrenceTest {
    @Test
    public void testJump() {
        int n = 6;
        System.out.println(Recurrence.jump(n));
    }
}
