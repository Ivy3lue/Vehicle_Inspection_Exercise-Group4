/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.startup;

import sda3.group4.iv.view.View;

public class Main {

    private static View view;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        view = new View();
        view.startSystem();
    }



}
