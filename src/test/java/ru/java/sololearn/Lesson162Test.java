package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson162Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        Lesson162.main(null);
        assertEquals("Welcome", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        Lesson162.main(null);
        assertEquals("Welcome\nWelcome\nWelcome", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        System.setIn(new ByteArrayInputStream("0".getBytes()));
        Lesson162.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

}
