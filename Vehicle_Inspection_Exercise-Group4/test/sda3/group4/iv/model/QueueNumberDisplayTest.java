package sda3.group4.iv.model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class QueueNumberDisplayTest {

    public QueueNumberDisplayTest() {
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
     * Test of incrementQueueNumberDisplay method, of class QueueNumberDisplay.
     */
    @Test
    public void testIncrementQueueNumberDisplay() {
        QueueNumberDisplay instance = new QueueNumberDisplay();
        assert(instance.getQueueNo() == 0);
        instance.incrementQueueNumberDisplay();
        assert(instance.getQueueNo() == 1);
    }

    /**
     * Test of getQueueNo method, of class QueueNumberDisplay.
     */
    @Ignore
    public void testGetQueueNo() {
        System.out.println("getQueueNo");
        QueueNumberDisplay instance = new QueueNumberDisplay();
        int expResult = 0;
        int result = instance.getQueueNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
