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
        String input = "15000" + System.lineSeparator() + "9000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lesson132.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        String input = "8400" + System.lineSeparator() + "9000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lesson132.main(null);
        assertEquals("small country", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        String input = "10000" + System.lineSeparator() + "10000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lesson132.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

}
