package InventaryManegementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private final int MAX_SIZE=10;
    public RecentlyViewedItems(){
        this.items = new LinkedList<>();
    }

    public void addItem(Item item){
        items.remove(item);
        items.addFirst(item);
        if (items.size()>MAX_SIZE){
            items.removeLast();
        }
    }

    public List<Item> getItems(){
        return new ArrayList<>(items);
    }
}
