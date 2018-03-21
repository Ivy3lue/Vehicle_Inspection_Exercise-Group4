package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PriceCalculatorTest {

    public PriceCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testCalculateCostWithEmptyList() {
        List inspectionList = new ArrayList();
        PriceCalculator instance = new PriceCalculator();
        int expResult = 100;
        int result = instance.calculateCost(inspectionList);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateCostWithNotAnEmptyList() {
        List inspectionList = new ArrayList();
        inspectionList.add("Wheels");
        inspectionList.add("Engine");
        PriceCalculator instance = new PriceCalculator();
        int expResult = 200;
        int result = instance.calculateCost(inspectionList);
        assertEquals(expResult, result);
    }

}
