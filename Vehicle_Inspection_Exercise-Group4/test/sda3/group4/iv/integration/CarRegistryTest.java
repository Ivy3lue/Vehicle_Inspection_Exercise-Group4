package sda3.group4.iv.integration;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarRegistryTest {

    @Test
    public void testValidateRegistrationNumberEmptyString() {
        String regNo = "";
        CarRegistry instance = new CarRegistry();
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateRegistrationNumberIncorrectString() {
        String regNo = "Shoaib346349";
        CarRegistry instance = new CarRegistry();
        boolean expResult = false;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateRegistrationNumberCorrectString() {
        String regNo = "Gokce123";
        CarRegistry instance = new CarRegistry();
        boolean expResult = true ;
        boolean result = instance.validateRegistrationNumber(regNo);
        assertEquals(expResult, result);
    }
}
