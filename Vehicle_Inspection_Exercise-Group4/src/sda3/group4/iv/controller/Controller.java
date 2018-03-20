package sda3.group4.iv.controller;

import java.util.List;
import sda3.group4.iv.integration.CarRegistry;
import sda3.group4.iv.integration.CashRegistry;
import sda3.group4.iv.integration.InspectionChecklist;
import sda3.group4.iv.model.Garage;
import sda3.group4.iv.model.QueueNumberDisplay;

/**
 * This is the application only controller class.
 * All calls to the model and integration pass through here.
 */
public class Controller {

    QueueNumberDisplay queueNoDisplay;
    Garage garage;
    CarRegistry carRegistry;
    CashRegistry cashRegistry;
    InspectionChecklist inspectionList;

        /**
         * Creates a new instance.
         */
        public Controller(){

        queueNoDisplay = new QueueNumberDisplay();
        garage = new Garage();
        carRegistry = new CarRegistry();
        cashRegistry = new CashRegistry();
        inspectionList = new InspectionChecklist();
    }

    /**
     * Starts the vehicle inspection.
     */
    public void startInspection(){
        queueNoDisplay.incrementQueueNumberDisplay();
        garage.open();
        garage.close();
    }


    public void payCash(){

    }

    /**
     * The user handed over a specified amount.
     * @param amount The amount of cash handed by the user.
     */
    public void inputAmount(int amount){

    }

    /**
     * @return The total amount that need to be paid.
     */
    public int getPayment(){

        return 0;
    }

    /**
     * @return The amount to be returned to the user.
     */
    public int getChange(){

        return 0;
    }

    /**
     * Passes the registration number to be checked.
     * @param regNo The string registration number to be checked.
     * @return <code>true</code> if the string is found in the registry,
     *         <code>false</code> if it is not.
     */
    public boolean checkRegistrationNumber(String regNo){

        return carRegistry.validateRegistrationNumber(regNo);
    }

    /**
     * Outputs the result of the inspection.
     * @param inspectionResult The list inspections.
     */
    public void showResult(List inspectionResult){

    }

    public int getPrice(String regNo){
        int price = 0;
        price = cashRegistry.calculateCost(inspectionList.getInspectionChecklist(regNo));
    return price;
    }
}
