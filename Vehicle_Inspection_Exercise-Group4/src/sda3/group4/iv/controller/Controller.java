/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.controller;

import java.util.List;
import sda3.group4.iv.integration.CarRegistry;
import sda3.group4.iv.model.Garage;
import sda3.group4.iv.model.QueueNumberDisplay;


public class Controller {

    QueueNumberDisplay queueNoDisplay;
    Garage garage;
    CarRegistry registry;

        public Controller(){

        queueNoDisplay = new QueueNumberDisplay();
        garage = new Garage();
        registry = new CarRegistry();


    }

    public void startInspection(){
        queueNoDisplay.incrementQueueNumberDisplay();
        garage.open();
        garage.close();
    }




    public void payCash(){

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

        return registry.validateRegistrationNumber(regNo);

    }

    public void showResult(List inspectionResult){


    }

}
