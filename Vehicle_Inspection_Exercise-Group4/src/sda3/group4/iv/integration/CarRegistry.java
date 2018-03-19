/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.integration;

public class CarRegistry {

    private String[] registry = {"Gokce123", "Ivy123", "Debby123", "Prad123", "Qaisar123"};

    public boolean validateRegistrationNumber(String regNo){

        for (int i = 0; i<registry.length; i++){
            if (regNo.equals(registry[i]))
            return true;
        }
        return false;
    }

}
