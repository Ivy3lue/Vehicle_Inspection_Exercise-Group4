package sda3.group4.iv.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueNumberDisplayTest {
     
    @Test
    public void testIncrementQueueNumberDisplay() {
        QueueNumberDisplay instance = new QueueNumberDisplay();
        assert(instance.getQueueNo() == 0); 
        instance.incrementQueueNumberDisplay();
        assert(instance.getQueueNo() == 1);       
    }
    
}
