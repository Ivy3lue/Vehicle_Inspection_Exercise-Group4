/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.controller;

import java.util.List;
import sda3.group4.iv.integration.CarRegistry;
import sda3.group4.iv.integration.CashRegistry;
import sda3.group4.iv.integration.InspectionChecklist;
import sda3.group4.iv.model.Garage;
import sda3.group4.iv.model.QueueNumberDisplay;


public class Controller {

    QueueNumberDisplay queueNoDisplay;
    Garage garage;
    CarRegistry carRegistry;
    CashRegistry cashRegistry;
    InspectionChecklist inspectionList;

        public Controller(){

        queueNoDisplay = new QueueNumberDisplay();
        garage = new Garage();
        carRegistry = new CarRegistry();
        cashRegistry = new CashRegistry();
        inspectionList = new InspectionChecklist();
    }

    public void startInspection(){
        queueNoDisplay.incrementQueueNumberDisplay();
        garage.open();
        garage.close();
    }

    public void inputAmount(int amount){

    }

    public int getPayment(){

        return 0;
    }

    public int getChange(){

        return 0;
    }

    public boolean checkRegistrationNumber(String regNo){

        return carRegistry.validateRegistrationNumber(regNo);
    }

    public void showResult(List inspectionResult){
        
    }

    public int getPrice(String regNo){
        int price = 0;
        price = cashRegistry.calculateCost(inspectionList.getInspectionChecklist(regNo));
    return price;    
    }
}
