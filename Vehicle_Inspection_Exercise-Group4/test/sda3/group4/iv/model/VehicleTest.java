
package sda3.group4.iv.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {
    
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
