package com.bootcamp.measurement.test.calculator;

import com.bootcamp.measurement.unit.Centimetre;
import com.bootcamp.measurement.unit.Length;
import com.bootcamp.measurement.unit.Metre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testValidEquivalence() throws Exception {
        Length metre = new Metre(2);
        Length centiMetre = new Centimetre(200);

        assertTrue(metre.equals(centiMetre));
    }

    @Test
    public void testInValidEquivalence() throws Exception {
        Length metre = new Metre(200);
        Length centiMetre = new Centimetre(200);

        assertFalse(metre.equals(centiMetre));
    }

    @Test
    public void testSumOfMetreAndCentimeterAsMetreIsCorrect() throws Exception {
        Length metre = new Metre(20);
        Length centiMetre = new Centimetre(200);
        float expectedValue = 22.0f;
        float incorrectValue = 2200.0f;

        Metre actualValue = (Metre) metre.add(centiMetre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfCentiMeterAndMetreAsCentiMetreIsCorrect() throws Exception {
        Centimetre centiMetre = new Centimetre(200);
        Metre metre = new Metre(20);
        float expectedValue = 2200.0f;
        float incorrectValue = 22.0f;

        Centimetre actualValue = (Centimetre) centiMetre.add(metre);


        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfCentiMeterAndCentiMetreAsCentiMetreIsCorrect() throws Exception {
        Length firstCentiMetre = new Centimetre(20);
        Length secondCentiMetre = new Centimetre(20);
        float expectedValue = 40.0f;
        float incorrectValue = 400.0f;

        Centimetre actualValue = (Centimetre) firstCentiMetre.add(secondCentiMetre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfMeterAndMetreAsMetreIsCorrect() throws Exception {
        Length firstMetre = new Metre(2);
        Length secondMetre = new Metre(1);
        float expectedValue = 3.0f;
        float incorrectValue = 3000.0f;

        Metre actualValue = (Metre) firstMetre.add(secondMetre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }
}