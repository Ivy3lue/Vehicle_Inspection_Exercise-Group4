package sda3.group4.iv.integration;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarRegistryTest {

    CarRegistry instance;
    String regNo;

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
        instance = new CarRegistry();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validateRegistrationNumber method, of class CarRegistry.
     */
    @Test
    public void testValidateRegistrationNumberEmptyString() {
        regNo = "";
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateRegistrationNumberIncorrectString() {
        regNo = "Shoaib346349";
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateRegistrationNumberCorrectString() {
        regNo = "Gokce123";
        boolean expResult = true ;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }

}
