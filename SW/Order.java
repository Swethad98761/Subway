package SW;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);

    }
    public double getCost(){
        double cost = 0.0;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

}
