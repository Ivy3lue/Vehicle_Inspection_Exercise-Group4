package sda3.group4.iv.model;

import java.util.ArrayList;
import java.util.List;

/**
 * TBD.
 */
public class Vehicle {
    List<String> inspectionChecklist = new ArrayList<>();
    List<String> failedInspections = new ArrayList<>();
/**
 * TBD
 * @param inspectionList
 */
    public List inspect(List inspectionList){
        inspectionChecklist();
        for (String element: inspectionChecklist){ 
            if (!inspectionList.contains(element))
                failedInspections.add(element);
      
        } 
        return failedInspections;
    }

    private List inspectionChecklist(){
        inspectionChecklist.add("Tires");
        inspectionChecklist.add("Steering Wheel");
        inspectionChecklist.add("Engine");
        inspectionChecklist.add("Brakes");
        inspectionChecklist.add("Gear box");
        return inspectionChecklist;
    }
    
 }
