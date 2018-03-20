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

        boolean flag = true;
        controller = new Controller();
        controller.startInspection();
        while (flag){
            if(controller.checkRegistrationNumber(getUserInput())){
                System.out.println("Valid registration number");
                flag = false;
            } else {
                System.out.println("Invalid registration number...Please try again");
            }
        }
    }

    public String getUserInput(){
        System.out.println("Please enter vehicle regNo: ");
        return scanner.nextLine();
    }
}
