package sda3.group4.iv.integration;

import java.util.List;

/**
 * Calculates cost of the whole inspection.
 */
public class PriceCalculator {

    /**
     * Calculates the price based on how many inspections.
     * @param inspectionList The inspections to be done.
     * @return The amount to be paid.
     */
     public int calculateCost(List inspectionList){
        int price = 100;
         
        price += inspectionList.size() * 50; 
        
        return price;
     }

}
