package isep.rpg;

public class Healer extends SpellCaster {
    public Healer() { this.setLifePoints(5);
    this.setManaPoints(20);}
    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(1);
    }
}
