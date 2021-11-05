package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }




    @Override
    public void doWork() {
        salary += 80;

        warehouse.incrementCountPickedOrder();
    }

    @Override
    public void bonus() {

            if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока недоступен");
                return;
            }
             if (isPayed) {
                 System.out.println("Бонус уже выплачен");
                 return;
             }
                salary += 70000;
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
