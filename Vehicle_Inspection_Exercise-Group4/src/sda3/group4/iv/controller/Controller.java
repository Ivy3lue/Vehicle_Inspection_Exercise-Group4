package sda3.group4.iv.controller;

import java.util.ArrayList;
import java.util.List;
import sda3.group4.iv.integration.CarRegistry;
import sda3.group4.iv.integration.PriceCalculator;
import sda3.group4.iv.integration.InspectionChecklist;
import sda3.group4.iv.integration.PaymentAuthorisation;
import sda3.group4.iv.integration.Printer;
import sda3.group4.iv.model.Garage;
import sda3.group4.iv.model.QueueNumberDisplay;
import sda3.group4.iv.model.Vehicle;

/**
 * This is the application only controller class.
 * All calls to the model and integration pass through here.
 */
public class Controller {

    QueueNumberDisplay queueNoDisplay;
    Garage garage;
    CarRegistry carRegistry;
    PriceCalculator cashRegistry;
    InspectionChecklist inspectionList;
    PaymentAuthorisation authorisation;
    Printer printer;
    List<String> checklist;
    Vehicle vehicle;
    

    /**
     * Creates a new instance.
     */
    public Controller(){
        queueNoDisplay = new QueueNumberDisplay();
        garage = new Garage();
        carRegistry = new CarRegistry();
        cashRegistry = new PriceCalculator();
        inspectionList = new InspectionChecklist();
        authorisation = new PaymentAuthorisation();
        printer = new Printer();
        vehicle = new Vehicle();
        checklist = new ArrayList<>();
    }

    /**
     * Starts the vehicle inspection.
     */
    public void callNextCustomer(){
        queueNoDisplay.incrementQueueNumberDisplay();
        manipulateGarageDoor();
    }

    public void manipulateGarageDoor() {
        garage.open();
        garage.close();
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

    public int getPrice(String regNo){
        int price = 0;
        checklist = getChecklist(regNo);
        price = cashRegistry.calculateCost(checklist);
        return price;
    }

    private List getChecklist(String regNo) {
        return inspectionList.getInspectionChecklist(regNo);
      }

    public boolean payByCreditCard(String creditCard, int price) {
        if (authorisation.authorizePayment(creditCard, price)) {
            printer.printReceipt(price);
            return true;
        } else {
            return false;
        }
    }

    public void startInspection() {
        printer.printInspectionList(vehicle.inspect(checklist),checklist);
    }
    
}
