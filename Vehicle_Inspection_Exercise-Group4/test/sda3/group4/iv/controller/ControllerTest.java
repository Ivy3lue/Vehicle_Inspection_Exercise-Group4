package sda3.group4.iv.controller;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class ControllerTest {
    Controller instance;

    public ControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Controller();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of callNextCustomer method, of class Controller.
     */
    @Ignore
    public void testCallNextCustomer() {
        System.out.println("callNextCustomer");
        Controller instance = new Controller();
        instance.callNextCustomer();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of manipulateGarageDoor method, of class Controller.
     */
    @Ignore
    public void testManipulateGarageDoor() {
        System.out.println("manipulateGarageDoor");
        Controller instance = new Controller();
        instance.manipulateGarageDoor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkRegistrationNumber method, of class Controller.
     */
    @Ignore
    public void testCheckRegistrationNumber() {
        System.out.println("checkRegistrationNumber");
        String regNo = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.checkRegistrationNumber(regNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Controller.
     */
    @Test
    public void testGetCorrectPrice() {
        String regNo = "Ivy123";

        int expResult = 150;
        int result = instance.getPrice(regNo);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIncorrectPrice() {
        String regNo = "Ivy123";

        int expResult = 350;
        int result = instance.getPrice(regNo);
        assertNotEquals(expResult, result);
    }


    /**
     * Test of payByCreditCard method, of class Controller.
     */
    @Ignore
    public void testPayByCreditCard() {
        System.out.println("payByCreditCard");
        String creditCard = "";
        int price = 0;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.payByCreditCard(creditCard, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of startInspection method, of class Controller.
     */
    @Ignore
    public void testStartInspection() {
        System.out.println("startInspection");
        Controller instance = new Controller();
        instance.startInspection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
