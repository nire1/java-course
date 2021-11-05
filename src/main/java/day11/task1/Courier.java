package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }





    @Override
    public void doWork() {

        salary += 100;
        warehouse.incrementCountDeliveredOrder();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;


    }

    @Override
    public String toString() {
        return ("Зарплата: " + salary +
                "Выплачен бонус ? :" + isPayed);
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
