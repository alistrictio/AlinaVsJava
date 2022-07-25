package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson132Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("15000\n9000".getBytes()));
        Lesson132.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("8400\n9000".getBytes()));
        Lesson132.main(null);
        assertEquals("small country", outputStreamCaptor.toString().trim());
    }

    @Test
    void test4() {
        System.setIn(new ByteArrayInputStream("10000\n10000".getBytes()));
        Lesson132.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

}
