package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson112Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("15000".getBytes()));
        Lesson112.main(null);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        System.setIn(new ByteArrayInputStream("16000".getBytes()));
        Lesson112.main(null);
        assertEquals("Gift card", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        System.setIn(new ByteArrayInputStream("38000".getBytes()));
        Lesson112.main(null);
        assertEquals("Gift card\nGift card", outputStreamCaptor.toString().trim());
    }

}
