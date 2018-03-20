package sda3.group4.iv.startup;

import sda3.group4.iv.view.View;

/**
 * Contains the <code>main</code> method that starts up the system.
 */
public class Main {

    private static View view;

    /**
     * Starts the vehicle inspection application
     * @param args The application does not take command line arguments.
     */
    public static void main(String[] args) {
        view = new View();
        view.startSystem();
    }



}
