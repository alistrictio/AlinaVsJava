package ru.java.sololearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Lesson172Test {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void test1() {
        System.setIn(new ByteArrayInputStream("8819".getBytes()));
        Lesson172.main(null);
        assertEquals("Write password", outputStreamCaptor.toString().trim());
    }

    @Test
    void test2() {
        String input = "1520" + System.lineSeparator() + "819";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lesson172.main(null);
        assertEquals("Write password" + System.lineSeparator() + "Write password", outputStreamCaptor.toString().trim());
    }

    @Test
    void test3() {
        String input = "2635" + System.lineSeparator() + "8819";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lesson172.main(null);
        assertEquals("Write password" + System.lineSeparator() + "Write password", outputStreamCaptor.toString().trim());
    }

}
