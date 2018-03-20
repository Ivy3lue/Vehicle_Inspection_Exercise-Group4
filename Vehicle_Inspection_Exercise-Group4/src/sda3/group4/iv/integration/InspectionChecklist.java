/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;

public class InspectionChecklist {

    List<String> inspectionList = new ArrayList<String>();
    
    public List getInspectionChecklist(String regNo) {
    inspectionList.add("Tires");
    inspectionList.add("Steering Wheel");
    inspectionList.add("Engine");
    inspectionList.add("Brakes");
    inspectionList.add("Gear box");
    return inspectionList;
    }

    public void updateInspectionCheckList(List inspectionChecklist) {

    }
}
