package com.bootcamp.measurement.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {

    @Test
    public void testValidEquivalence() throws Exception {
        Volume litre = new Litre(2);
        Volume milliLitre = new MilliLitre(2000);

        assertTrue(litre.equals(milliLitre));
    }

    @Test
    public void testInValidEquivalence() throws Exception {
        Volume litre = new Litre(200);
        Volume milliLitre = new MilliLitre(200);

        assertFalse(litre.equals(milliLitre));
    }

    @Test
    public void testSumOfMetreAndCentimeterAsMetreIsCorrect() throws Exception {
        Volume litre = new Litre(20);
        Volume milliLitre = new MilliLitre(200);
        float expectedValue = 20.2f;
        float incorrectValue = 2200.0f;

        Litre actualValue = (Litre) litre.add(milliLitre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfCentiMeterAndMetreAsmilliLitreIsCorrect() throws Exception {
        MilliLitre milliLitre = new MilliLitre(200);
        Litre litre = new Litre(20);
        float expectedValue = 20200.0f;
        float incorrectValue = 22.0f;

        MilliLitre actualValue = (MilliLitre) milliLitre.add(litre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfMLs() throws Exception {
        Volume firstmilliLitre = new MilliLitre(20);
        Volume secondmilliLitre = new MilliLitre(20);
        float expectedValue = 40.0f;
        float incorrectValue = 400.0f;

        MilliLitre actualValue = (MilliLitre) firstmilliLitre.add(secondmilliLitre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }

    @Test
    public void testSumOfLitres() throws Exception {
        Volume firstLitre = new Litre(2);
        Volume secondLitre = new Litre(1);
        float expectedValue = 3.0f;
        float incorrectValue = 3000.0f;

        Litre actualValue = (Litre) firstLitre.add(secondLitre);

        assertEquals(expectedValue, actualValue.getValue(), 0);
        assertNotEquals(incorrectValue, actualValue.getValue(), 0);
    }
}