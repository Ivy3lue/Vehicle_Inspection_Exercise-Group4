package sda3.group4.iv.model;

/**
 * Handles the displaying of the queue number.
 */
public class QueueNumberDisplay {

    private static int queueNo;

    /**
     * Instatiates the queue number.
     */
    public QueueNumberDisplay(){
        queueNo = 0;
    }

    /**
     * Increments the queue number display.
     */
    public void incrementQueueNumberDisplay(){
        queueNo++;
        System.out.println("Next inspection: " + queueNo);

        }
    
    public int getQueueNo(){
        return queueNo;
    }
}
