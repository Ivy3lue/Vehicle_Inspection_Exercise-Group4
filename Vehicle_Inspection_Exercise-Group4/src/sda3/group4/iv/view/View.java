package sda3.group4.iv.view;

import java.util.Scanner;
import sda3.group4.iv.controller.Controller;

/**
 * This is the applications view class,
 * which takes user input and outputs information from the controller.
 */
public class View {

    private Controller controller;
    private Scanner scanner;

    /**
     * Creates a new instance.
     */
    public View(){
        scanner = new Scanner(System.in);
    }

    /**
     * Takes the user input to start the system.
     */
    public void startSystem(){

        controller = new Controller();
        controller.startInspection();
        String regNo = getUserInput();
        while (true){
            if(controller.checkRegistrationNumber(regNo)){
                System.out.println("Valid registration number");
               break;
            } else {
                System.out.println("Invalid registration number...Please try again");
            }
        }
        int price = controller.getPrice(regNo);
        System.out.println("The prise for your check up is: " + price);
        }

    /**
     * Takes the user input.
     */
    public String getUserInput(){
        System.out.println("Please enter vehicle regNo: ");
        return scanner.nextLine();
    }
}
