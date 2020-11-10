import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private ArrayList<Person> queue;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Hope Street");
        queue = new ArrayList<Person>();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.sizeOfQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.sizeOfQueue());
    }
}
