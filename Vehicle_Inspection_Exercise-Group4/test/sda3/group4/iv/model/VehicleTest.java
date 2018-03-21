package sda3.group4.iv.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest {

    public VehicleTest() {
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

    /**
     * Test of inspect method, of class Vehicle.
     */
    @Test
    public void testInspect() {

        Vehicle instance = new Vehicle();

        List inspectionList = new ArrayList<>();
        inspectionList.add("Tires");
        inspectionList.add("Engine");
        inspectionList.add("Brakes");
        System.out.println("inspection list " + inspectionList);

        List expResult = new ArrayList<>();
        expResult.add("Steering Wheel");
        expResult.add("Gear box");
        System.out.println("expected result " + expResult);

        List result = instance.inspect(inspectionList);
        System.out.println("result " + result);

        assertArrayEquals(expResult.toArray(), result.toArray());
    }

}
