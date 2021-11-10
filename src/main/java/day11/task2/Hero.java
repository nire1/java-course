package day11.task2;

public abstract class Hero implements PhyAttack {
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    final int MAX_HEALTH = 100;

    final int MIN_HEALTH = 0;

    public Hero() {
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attScore = physAtt * (1 - hero.physDef);
        if (hero.health - attScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else
            hero.health -= attScore;
    }
}
