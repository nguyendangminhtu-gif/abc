package org.example.demosof3041.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGraderTest {
    private StudentGrader studentGrader;

    @BeforeEach
    void setUp() {
        studentGrader = new StudentGrader();
    }

    @Test
    public void grader_1(){
        String result = studentGrader.xepLoai(35);
        String expected = "F";
        assertEquals(expected,result);
    }

    @Test
    public void grader_2(){
        String result = studentGrader.xepLoai(45);
        String expected = "D";
        assertEquals(expected,result);
    }

    @Test
    public void grader_3(){
        String result = studentGrader.xepLoai(61);
        String expected = "C";
        assertEquals(expected,result);
    }

    @Test
    public void grader_4(){
        String result = studentGrader.xepLoai(71);
        String expected = "B";
        assertEquals(expected,result);
    }

    @Test
    public void grader_5(){
        String result = studentGrader.xepLoai(85);
        String expected = "A";
        assertEquals(expected,result);
    }

    @Test
    public void testDiemAm(){
        assertThrows(IllegalArgumentException.class,() -> studentGrader.xepLoai(-10));
    }
}