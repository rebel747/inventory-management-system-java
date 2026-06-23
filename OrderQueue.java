package InventaryManegementSystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {
    PriorityQueue<Order> queue;

    public OrderQueue(){
        queue = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        queue.add(order);
    }
    public String processOrder(){
        if(!queue.isEmpty()){
            Order toporder=queue.peek();
            queue.remove();
            return toporder.getOrderId();
        }
        return null;
    }


}
