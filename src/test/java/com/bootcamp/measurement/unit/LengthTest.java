package com.bootcamp.measurement.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by kausalyamani on 12/04/16.
 */
public class LengthTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testValidEquivalence() throws Exception {
        Unit metre = new Metre(2);
        Unit centiMetre = new Centimetre(200);

        assertTrue(metre.equals(centiMetre));
    }

    @Test
    public void testInValidEquivalence() throws Exception {
        Unit metre = new Metre(200);
        Unit centiMetre = new Centimetre(200);
        Unit litre = new Litre(200);

        assertFalse(metre.equals(centiMetre));
        assertFalse(metre.equals(litre));
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
        Length centiMetre = new Centimetre(200);
        Length metre = new Metre(20);
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
