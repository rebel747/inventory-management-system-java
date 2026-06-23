package InventaryManegementSystem;

import java.util.Comparator;

public class CustomComparatorQuantity implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
