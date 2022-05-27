package isep.rpg;

public class Mage extends SpellCaster {
    public Mage() {
        this.setLifePoints(5);
        this.setManaPoints(10);
    }


    /*public void setManaPoints(int currentManaPoints) {
        this.setManaPoints() = currentManaPoints;
    }*/


    @Override
    public boolean attack(Fighter enemy) { return enemy.receiveAttack(1);}
    /*public void fireball(Hero hero, Enemy enemy){
        int currentMP = getManaPoints();
        if(currentMP >= manaCost) {
            this.setManaPoints(currentMP - manaCost);
            heroAttack(enemy, damageFireball, hero);
        }
        else {
            System.out.println("Pas assez de mana");
            heroAttack(enemy, hero);
            System.out.println("Votre héros a attaqué normalement");
        }*/

}
