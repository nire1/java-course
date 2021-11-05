package day11.task2;

public class Paladin extends Hero implements Healer {
    final int HEAL_MYSELF = 25;
    final int HEAL_TEAMMATE = 10;
    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        health+= HEAL_MYSELF;
        if (health>MAX_HEALTH)
            health =MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health+HEAL_TEAMMATE>100)
            hero.health = MAX_HEALTH;
        else
            hero.health+= HEAL_TEAMMATE;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
