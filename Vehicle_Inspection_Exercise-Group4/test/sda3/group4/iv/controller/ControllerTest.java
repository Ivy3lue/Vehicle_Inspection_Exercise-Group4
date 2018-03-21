package sda3.group4.iv.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {
    Controller instance;
    
    public ControllerTest() {
    }
       
    @Before
    public void setUp() {
        instance = new Controller();
    }
    
    @Test
    public void testGetCorrectIvyPrice() {
        String regNo = "Ivy123";
      
        int expResult = 150;
        int result = instance.getPrice(regNo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIncorrectIvyPrice() {
        String regNo = "Ivy123";
      
        int expResult = 350;
        int result = instance.getPrice(regNo);
        assertNotEquals(expResult, result);
    }

}
