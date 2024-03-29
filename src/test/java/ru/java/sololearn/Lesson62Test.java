package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson62Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("5".getBytes()));
        Lesson62.main(null);
        assertEquals("Round 1 results:" + System.lineSeparator() + "6" + System.lineSeparator() + "4", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        Lesson62.main(null);
        assertEquals("Round 1 results:" + System.lineSeparator() + "4" + System.lineSeparator() + "2", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        Lesson62.main(null);
        assertEquals("Round 1 results:" + System.lineSeparator() + "2" + System.lineSeparator() + "0", outputStreamCaptor.toString().trim());
    }

}
