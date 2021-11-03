package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            countPlayers--;
    }

    static void info() {
        if (countPlayers < 6)
            System.out.println("Команлы неполные. На поле еще есть " + (6 - countPlayers) + "свободных мест");
        else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
