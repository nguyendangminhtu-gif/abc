import org.example.demosof3041.buoi1.Caculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {
    @Test
    public void add() {
        Caculator caculator = new Caculator();
        int result = caculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void add_1() {
        Caculator caculator = new Caculator();
        int result = caculator.add(100, 100);
        assertEquals(200, result);
    }

    @Test
    public void tru() {
        Caculator caculator = new Caculator();
        int result = caculator.tru(2, 1);
        assertEquals(1, result);
    }

    @Test
    public void nhan() {
        Caculator caculator = new Caculator();
        int result = caculator.nhan(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void chia() {
        Caculator caculator = new Caculator();
        int result = caculator.chia(2, 2);
        assertEquals(1, result);
    }
}