package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InspectionChecklistTest {

    InspectionChecklist instance;

    @Before
    public void SetUp(){
        instance = new InspectionChecklist();
    }

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
}
