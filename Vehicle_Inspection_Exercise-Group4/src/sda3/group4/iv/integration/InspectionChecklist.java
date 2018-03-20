package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the list of inspection information.
 */
public class InspectionChecklist {
    List<String> inspectionList = new ArrayList<String>();

    /**
     * @param regNo String to be check
     * @return The list of inspections to be done.
     */
    public List getInspectionChecklist(String regNo){
        inspectionList.add("Tires");
        inspectionList.add("Steering Wheel");
        inspectionList.add("Engine");
        inspectionList.add("Brakes");
        inspectionList.add("Gear box");
        return inspectionList;
    }

    /**
     * Handles the inspection checklist.
     * @param inspectionChecklist The list to be updated.
     */
    public void updateInspectionCheckList(List inspectionChecklist) {

    }
}
