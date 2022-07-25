package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson142Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        Lesson142.main(null);
        assertEquals("You are happy!", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("2".getBytes()));
        Lesson142.main(null);
        assertEquals("You are sad!", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        System.setIn(new ByteArrayInputStream("8".getBytes()));
        Lesson142.main(null);
        assertEquals("Unknown emotion.", outputStreamCaptor.toString().trim());
    }

}
