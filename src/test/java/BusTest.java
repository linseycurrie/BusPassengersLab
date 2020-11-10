import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Glasgow", 10);
        busStop = new BusStop("Hope Street");
        busStop.addPersonToQueue(passenger);
    }

    @Test
    public void busCanAddPassengersWhenCapacityAvailable(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void passengerNotAddedWhenBusAtCapacity(){
        Bus fullBus = new Bus("London", 1);
        fullBus.addPassenger(passenger);
        fullBus.addPassenger(passenger);
        assertEquals(1, fullBus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void passengerCanBeRemovedFromQueueAndAddedToBus(){
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
//        assertEquals(0, busStop.sizeOfQueue());
    }
}
