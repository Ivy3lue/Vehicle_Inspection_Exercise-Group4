package sda3.group4.iv.integration;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CarRegistryTest {

    CarRegistry instance;
    String regNo;

    @Before
    public void SetUp(){
        instance = new CarRegistry();
    }

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
