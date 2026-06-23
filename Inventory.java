package InventaryManegementSystem;

import java.util.*;

public class Inventory <T extends Item>{
    private HashMap<String, T> items;
    private Set<T> wishList;

    public Inventory(){
        this.items = new HashMap<>();
        this.wishList = new HashSet<>();
    }


    public void addItem(T item){
        if (items.containsKey(item.getId())){
            throw new RuntimeException("item already exists"+item.getId());
        }
        items.put(item.getId(), item);

    }
    public void removeItem(String id){

        items.remove(id);
    }
    public T getItem(String id){
        return items.get(id);
    }
    public Collection<T> getallItems(){
        return new ArrayList<>(items.values());
    }




    public List<T> filterByRange(double minPrice, double maxPrice){
        List<T> ans = new ArrayList<>();
        for(Map.Entry<String,T> EntryKey:items.entrySet()){
            String id=EntryKey.getKey();
            T  item=EntryKey.getValue();
            if (minPrice <= item.getPrice() && item.getPrice() <= maxPrice) {
                ans.add(item);
            }
        }
        return ans;
    }

    public List<T> filterByAvailability(){
        List<T> ans = new ArrayList<>();
        for(Map.Entry<String,T> EntryKey:items.entrySet()){
            String id=EntryKey.getKey();
            T  item=EntryKey.getValue();
            if(item.getQuantity()>0){
                ans.add(item);
            }
        }
        return ans;
    }

    public void addToWishList(T item){
        wishList.add(item);
    }
    public void removeFromWishList(T item){
        wishList.remove(item);
    }




}
