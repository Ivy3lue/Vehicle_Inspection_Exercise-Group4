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
        controller.callNextCustomer();

        String regNo = "";

        while (true){

            print("Please enter vehicle reistration number");
            regNo = getUserInput();

            if(controller.checkRegistrationNumber(regNo)){
               print("");
               print("Valid registration number");
               break;
            } else {
                print("");
                print("Invalid registration number...");
            }
        }

        int price = controller.getPrice(regNo);

        print("");
        print("The prise for your check up is: " + price);
        print("Please enter your credit card number: ");

        String creditCard = getUserInput();

        if (!controller.payByCreditCard(creditCard, price)){
            print("");
            print("Invalid credit card...");
        } else {
            controller.startInspection();
        }
        controller.manipulateGarageDoor();
    }
    
    /**
     * Takes the user input.
     */
    public String getUserInput(){
        return scanner.nextLine();
    }

    public void print(String message){
        System.out.println(message);
    }
}
