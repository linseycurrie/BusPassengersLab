import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person passenger){
        if(passengerCount() < capacity){
            this.passengers.add(passenger);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        if (busStop.sizeOfQueue() > 0) {
            Person passenger = busStop.removePersonFromQueue();
            this.addPassenger(passenger);
        }
    }
}
