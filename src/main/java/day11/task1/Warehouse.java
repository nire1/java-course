package day11.task1;

public class Warehouse {
    private  int countPickedOrders;
    private int countDeliveredOrders;

    public void incrementCountPickedOrder(){
        countPickedOrders++;
    }
    public void incrementCountDeliveredOrder(){
        countDeliveredOrders++;
    }
    @Override
    public String toString() {
        return ("Количество собранных заказов: " + countPickedOrders + " Количество доставленных заказов: " + countDeliveredOrders);
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
}
