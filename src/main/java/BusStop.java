import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        queue = new ArrayList<Person>();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public Person removePersonFromQueue(){
         return this.queue.remove(0);
    }

    public int sizeOfQueue(){
        return this.queue.size();
    }
}
