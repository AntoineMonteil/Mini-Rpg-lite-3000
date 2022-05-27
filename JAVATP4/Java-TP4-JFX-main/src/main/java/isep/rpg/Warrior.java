package isep.rpg;

public class Warrior extends Hero {

    public Warrior() { this.setLifePoints(5);
    this.setManaPoints(0);}


    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(1);
    }
}
