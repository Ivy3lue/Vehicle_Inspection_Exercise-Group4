/*
 * Vehicle Inspection Application
 */
package sda3.group4.iv.model;

public class QueueNumberDisplay {

    private static int queueNo;

    public QueueNumberDisplay(){
        queueNo = 0;
    }


    public void incrementQueueNumberDisplay(){

        queueNo++;
        System.out.println("Next inspection: " + queueNo);

        }
}
