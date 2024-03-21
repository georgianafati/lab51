package teste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import exemplul2.Calculator;
import org.junit.jupiter.api.Test;
import exemplul3.PerecheNumere;
import static org.junit.jupiter.api.Assertions.*;

public class TestePerecheNumere {
    @Test
    void test1_cmmd() {
        PerecheNumere pN = new PerecheNumere(4, 5);
        assertEquals(1, pN.CMMC());
    }

    @Test
    void test2_fibonaci() {
        PerecheNumere pN = new PerecheNumere(2, 3);
        assertTrue(pN.fibonaci(2, 3) == true);
    }

    @Test
    void test3_cmmc() {
        PerecheNumere pN = new PerecheNumere(7, 6);
        assertFalse(pN.CMMC() != 42);
    }
}
