
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }

        this.items.add(item);
    }

    public int totalWeight() {
        int sum = 0;
        int index = 0;
        while (index < this.items.size()) {
            sum += this.items.get(index).getWeight();
            index++;
        }
        return sum;
        
        
}
    public void printItems() {
        int index = 0;
        while (index < this.items.size()) {
            Item itm = this.items.get(index);
            System.out.println(itm);
            index++;
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);
        int index = 0;
        while (index < this.items.size()) {
            Item itm = this.items.get(index);

            if (itm.getWeight() > heaviest.getWeight()) {
                heaviest = itm;
            }

            index++;
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
