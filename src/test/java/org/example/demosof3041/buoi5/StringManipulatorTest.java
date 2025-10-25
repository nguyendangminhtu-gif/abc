package org.example.demosof3041.buoi5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private StringManipulator stringManipulator;
    @BeforeEach
    void SetUp(){
        stringManipulator = new StringManipulator();
    }

    @Test
    public void SoDauNull(){
        assertThrows(NullPointerException.class,() -> stringManipulator.concatenate(null,"1"));
    }

    @Test
    public void SoSauNull(){
        assertThrows(NullPointerException.class,() -> stringManipulator.concatenate("1",null));
    }

    @Test
    public void HopLe(){
        String exp = stringManipulator.concatenate("Hello","World");
        assertEquals(exp,"HelloWorld");
    }
}