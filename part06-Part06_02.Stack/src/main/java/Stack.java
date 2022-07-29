
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();

    }

    public void add(String value) {
        this.items.add(value);
    }
    
    public ArrayList<String> values(){
    return items;}

    public String take() {
        String last = items.get(items.size() - 1);
       items.remove(last);
       return last;
               
    }

}
