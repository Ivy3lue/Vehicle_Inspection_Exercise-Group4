package sda3.group4.iv.integration;

import java.util.List;

/**
 * Handles the printing of receipt and checklist.
 */
public class Printer {

    /**
     * Creates a formatted string with the entire content of the list.
     */
    public void printInspectionList(List inspectionResults, List checklist){
        System.out.println();
        System.out.println("Inspection Results");
        System.out.println("PASSED " + checklist);
        System.out.println("FAILED " + inspectionResults);
    }

    /**
     * Creates a formatted string with the entire content of the receipt.
     */
    public void printReceipt(int price){
        System.out.println();
        System.out.println("Payment sucessfull! " + price + "kr");
        System.out.println();
    }

}
