package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson152Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("2".getBytes()));
        Lesson152.main(null);
        assertEquals("2", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("5".getBytes()));
        Lesson152.main(null);
        assertEquals("120", outputStreamCaptor.toString().trim());
    }

}
