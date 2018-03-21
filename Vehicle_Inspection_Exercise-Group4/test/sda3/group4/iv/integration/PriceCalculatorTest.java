package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PriceCalculatorTest {

    PriceCalculator instance;

    @Before
    public void setUp() {
        instance = new PriceCalculator();
    }

    @Test
    public void testCalculateCostWithEmptyList() {
        List inspectionList = new ArrayList();
        int expResult = 100;
        int result = instance.calculateCost(inspectionList);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateCostWithNotAnEmptyList() {
        List inspectionList = new ArrayList();
        inspectionList.add("Wheels");
        inspectionList.add("Engine");
        int expResult = 200;
        int result = instance.calculateCost(inspectionList);
        assertEquals(expResult, result);
    }

}
