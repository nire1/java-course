package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    @Override
    public String toString() {
        return  ("Изготовитель: " + producer + ",год выпуска: " +", длина: "+", вес: ''' , количество топлива в баке: %d", producer, year, length, weight, fuel);
    }

    public static void compareAirplanes(Airplane x, Airplane y) {
        if (x.length > y.length)
            System.out.println(x.producer + " длиннее");
        else if (x.length < y.length)
            System.out.println(y.producer+ " длиннее");
        else if(x.length == y.length)
            System.out.println("Длинна самолетов равна");


    }

    void info() {
        System.out.printf("Изготовитель: %s ,год выпуска: %d, длина: %d , вес: %d , количество топлива в баке: %d", producer, year, length, weight, fuel);
    }

    void fillUp(int n) {
        fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
