/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateaverage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Elek
 */
public class CalculateAverageIT {
    
    public CalculateAverageIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateAverage method, of class CalculateAverage.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        CalculateAverage calcA = new CalculateAverage();
        double num1 = 5.0;
        double num2 = 4.0;
        double num3 = 2.0;
        double expResult = 7.0;
        double result = calcA.calculateAverage(num1, num2, num3);
        assertEquals(expResult, result, 1.0);
    }
    
}
