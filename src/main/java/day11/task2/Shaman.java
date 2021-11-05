package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    final int HEAL_MYSELF = 50;
    final int HEAL_TEAMMATE = 30;
    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
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
    public void magicalAttack(Hero hero) {
        double attScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else
            hero.health -= attScore;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
