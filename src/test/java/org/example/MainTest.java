package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void roundDivision() {
        assertEquals("", Main.RoundDivision(1, 5, "fizz"));
        assertEquals("buzz", Main.RoundDivision(7, 7, "buzz"));
        assertEquals("fizz", Main.RoundDivision(10, 5, "fizz"));
    }

    @Test
    void reversion() {
        assertEquals("llatsni ekam", Main.reversion("make install"));
    }

    @Test
    void inputFilter() {
        assertTrue(Main.inputFilter("1.1"));
        assertFalse(Main.inputFilter("a"));
    }

    @Test
    void discriminant() {
        assertEquals(16, Main.discriminant(1, 2, -3));
        assertEquals(-8, Main.discriminant(1, 2, 3));
    }

    @Test
    void calculateX1() {
        assertEquals(1, Main.calculateX1(1, 2, 16));
    }

    @Test
    void calculateX2() {
        assertEquals(-3, Main.calculateX2(1, 2, 16));
    }

    @Test
    void sigmaExpression() {
        assertEquals(0.25, Main.sigmaExpression(2));
        assertEquals(9.950209153396405E-7, Main.sigmaExpression(1002));
    }
}