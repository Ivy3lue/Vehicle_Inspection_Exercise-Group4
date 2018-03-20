package sda3.group4.iv.integration;

/**
 * Contains the information about the car registry.
 */
public class CarRegistry {

    private String[] registry = {"Gokce123", "Ivy123", "Debby123", "Prad123", "Qaisar123"};

    /**
     * Validates the string if it is in the registry.
     * @param regNo The string registration number to be checked.
     * @return <code>true</code> if the string is found in the registry,
     *         <code>false</code> if it is not.
     */
    public boolean validateRegistrationNumber(String regNo){

        for (int i = 0; i<registry.length; i++){
            if (regNo.equals(registry[i]))
            return true;
        }
        return false;
    }

}
