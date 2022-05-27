package isep.rpg;

public abstract class SpellCaster extends Hero {
    public SpellCaster() { this.setLifePoints(5); }
    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(2);

    }
    private int manaPoints;

    public int getManaPoints(){
            return manaPoints;
        }
}
