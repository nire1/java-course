package day11.task2;

public class Magician extends Hero implements MagicAttack  {
    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 0.8;

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
