package InventaryManegementSystem;

import java.util.Comparator;

public class ItemUtility implements Comparator<Item>{
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getPrice()<o2.getPrice()){
            return -1;
        }
        else if(o1.getPrice()>o2.getPrice()){
            return 1;
        }
        else return o1.getName().compareTo(o2.getName());
    }
}
