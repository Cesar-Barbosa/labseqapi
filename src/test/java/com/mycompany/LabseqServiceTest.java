package com.mycompany;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LabseqServiceTest {

    @Autowired
    private LabseqService labseqService;

    @BeforeEach
    public void setup() {
    }

    @Test
    public void testCalculateForZero() {
        long result = labseqService.calculate(0);
        assertEquals(0, result);
    }

    @Test
    public void testCalculateForOne() {
        long result = labseqService.calculate(1);
        assertEquals(1, result);
    }
    
    @Test
    public void testCalculateForTwo() {
        long result = labseqService.calculate(2);
        assertEquals(0, result);
    }

    @Test
    public void testCalculateForThree() {
        long result = labseqService.calculate(3);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateForFour() {
        long result = labseqService.calculate(4);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateForNegative() {
        assertThrows(IllegalArgumentException.class, () -> labseqService.calculate(-1));
    }

    @Test
    public void testCalculateForLargeNumber() {
        assertThrows(StackOverflowError.class, () -> labseqService.calculate(900000000));
    }

    @Test
    public void testCacheEfficiency() {
        long start = System.currentTimeMillis();
        labseqService.calculate(10000);
        long firstExecution = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        labseqService.calculate(10000);
        long secondExecution = System.currentTimeMillis() - start;

        assertTrue(secondExecution < firstExecution, "The second execution (with caching) should be faster than the first");
    }

    @Test
    public void testCalculateForNonCachedValue() {
        long result = labseqService.calculate(10);
        assertEquals(3, result);
    }
    
}
