package sda3.group4.iv.integration;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarRegistryTest {

    public CarRegistryTest() {
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
     * Test of validateRegistrationNumber method, of class CarRegistry.
     */
    @Test
    public void testValidateRegistrationNumberEmptyString() {
        String regNo = "";
        CarRegistry instance = new CarRegistry();
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidateRegistrationNumberIncorrectString() {
        String regNo = "Shoaib346349";
        CarRegistry instance = new CarRegistry();
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testValidateRegistrationNumberCorrectString() {
        String regNo = "Gokce123";
        CarRegistry instance = new CarRegistry();
        boolean expResult = true ;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
