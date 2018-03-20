package sda3.group4.iv.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the list of inspection information.
 */
public class InspectionChecklist {
    List<String> inspectionChecklist = new ArrayList<String>();
    
    

    /**
     * @param regNo String to be check
     * @return The list of inspections to be done.
     */
    public List getInspectionChecklist(String regNo){
        switch(regNo){
            case "Debby123":
                return debbyInspectionChecklist();
            case "Gokce123":
                return gokceInspectionChecklist();
            case "Prad123":
                return pradInspectionChecklist();
            case "Qaisar123":
                return qaisarInspectionChecklist();
            case "Ivy123":
                return ivyInspectionChecklist();
            default:
                return null;
        }
    }    
    

    /**
     * Handles the inspection checklist.
     * @param inspectionChecklist The list to be updated.
     */
    public void updateInspectionCheckList(List inspectionChecklist) {

    }
    
    List debbyInspectionChecklist(){
        inspectionChecklist.add("Tires");
        inspectionChecklist.add("Brakes");
        return inspectionChecklist;
    }
    
    List gokceInspectionChecklist(){
        inspectionChecklist.add("Tires");
        inspectionChecklist.add("Steering Wheel");
        inspectionChecklist.add("Gear box");
        return inspectionChecklist;
    }
    
    List pradInspectionChecklist(){
        inspectionChecklist.add("Engine");
        inspectionChecklist.add("Brakes");
        inspectionChecklist.add("Gear box");
        return inspectionChecklist;
    }
    
    List qaisarInspectionChecklist(){
        inspectionChecklist.add("Tires");
        inspectionChecklist.add("Steering Wheel");
        inspectionChecklist.add("Engine");
        inspectionChecklist.add("Brakes");
        return inspectionChecklist;
    }
        
    List ivyInspectionChecklist(){
        inspectionChecklist.add("Tires");
        return inspectionChecklist;
    }
}