package isep.rpg;

public class Hunter extends Hero {
    public Hunter() {
        this.setLifePoints(5);
        int arrows = 20;
    }
    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(1);

    }

}
