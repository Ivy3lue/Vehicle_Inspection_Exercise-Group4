package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class InspectionChecklistTest {

    InspectionChecklist instance;

    public InspectionChecklistTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new InspectionChecklist();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInspectionChecklist method, of class InspectionChecklist.
     */
    @Test
    public void testGetInspectionChecklistCorrectRegNo() {
        String regNo = "Qaisar123";
        InspectionChecklist testResult = new InspectionChecklist();
        List expResult = testResult.qaisarInspectionChecklist();
        List result = instance.getInspectionChecklist(regNo);
        assertArrayEquals(expResult.toArray(), result.toArray());
    }

    @Test
    public void testGetInspectionChecklistIncorrectRegNo() {
        String regNo = "Shoaib123";
        List result = instance.getInspectionChecklist(regNo);
        assertNull(result);
    }

    /**
     * Test of updateInspectionCheckList method, of class InspectionChecklist.
     */
    @Ignore
    public void testUpdateInspectionCheckList() {
        System.out.println("updateInspectionCheckList");
        List inspectionChecklist = null;
        InspectionChecklist instance = new InspectionChecklist();
        instance.updateInspectionCheckList(inspectionChecklist);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of debbyInspectionChecklist method, of class InspectionChecklist.
     */
    @Ignore
    public void testDebbyInspectionChecklist() {
        System.out.println("debbyInspectionChecklist");
        InspectionChecklist instance = new InspectionChecklist();
        List expResult = null;
        List result = instance.debbyInspectionChecklist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gokceInspectionChecklist method, of class InspectionChecklist.
     */
    @Ignore
    public void testGokceInspectionChecklist() {
        System.out.println("gokceInspectionChecklist");
        InspectionChecklist instance = new InspectionChecklist();
        List expResult = null;
        List result = instance.gokceInspectionChecklist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pradInspectionChecklist method, of class InspectionChecklist.
     */
    @Ignore
    public void testPradInspectionChecklist() {
        System.out.println("pradInspectionChecklist");
        InspectionChecklist instance = new InspectionChecklist();
        List expResult = null;
        List result = instance.pradInspectionChecklist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of qaisarInspectionChecklist method, of class InspectionChecklist.
     */
    @Test
    public void testQaisarInspectionChecklistCorrect() {
        List<String> expResult = new ArrayList<>();
        expResult.add("Tires");
        expResult.add("Steering Wheel");
        expResult.add("Engine");
        expResult.add("Brakes");
        List result = instance.qaisarInspectionChecklist();
        assertArrayEquals(expResult.toArray(), result.toArray());
    }

    @Test
    public void testQaisarInspectionChecklistIncorrect() {
        List<String> expResult = new ArrayList<>();
        expResult.add("Tires");
        expResult.add("Steering Wheel");
        expResult.add("Engine");
        List result = instance.qaisarInspectionChecklist();
        result.removeAll(expResult);
        assertNotEquals(expResult.toArray(), result.toArray());
    }

    /**
     * Test of ivyInspectionChecklist method, of class InspectionChecklist.
     */
    @Ignore
    public void testIvyInspectionChecklist() {
        System.out.println("ivyInspectionChecklist");
        InspectionChecklist instance = new InspectionChecklist();
        List expResult = null;
        List result = instance.ivyInspectionChecklist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
