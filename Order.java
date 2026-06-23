package InventaryManegementSystem;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress() && !o.isExpress()){
            return -1;
        }else if (!this.isExpress() && o.isExpress()){
            return 1;
        }else{
            return 0;
        }
    }
}
