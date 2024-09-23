import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClasseXYZ {

    @Test
    public void testMetodoA() {
        // Test del metodo A
        assertEquals(10, ClasseXYZ.metodoA());
    }

    @Test
    public void testMetodoB() {
        // Test del metodo B
        assertTrue(ClasseXYZ.metodoB());
    }
}
