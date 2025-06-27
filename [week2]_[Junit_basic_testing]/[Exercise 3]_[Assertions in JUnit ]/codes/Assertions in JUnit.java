import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        assertTrue(10 > 5);
        assertFalse(2 > 3);
        Object obj = null;
        assertNull(obj);
        Object obj2 = new Object();
        assertNotNull(obj2);
    } }
