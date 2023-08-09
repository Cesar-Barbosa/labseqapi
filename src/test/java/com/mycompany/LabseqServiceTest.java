package com.mycompany;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

}
