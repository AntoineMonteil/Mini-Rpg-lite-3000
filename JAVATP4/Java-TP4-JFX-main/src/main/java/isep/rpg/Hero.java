package isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero extends Fighter {

    private int manaPoints;
    public int getManaPoints() { return manaPoints; }
    public void setManaPoints(int manaPoints) { this.manaPoints = manaPoints; }

    public boolean SpellAttack(int manaPoints) {
        this.manaPoints -= manaPoints;
        return this.manaPoints <= 0; // Vrai si le combattant est mort
    }

    public int getPotionsCount() {
        return potions.size();
    }
    public int getLembasCount() {
        return lembas.size();
    }

    protected final List<Potion> potions = new ArrayList<>();
    protected final List<Food> lembas = new ArrayList<>();

    public void useConsumable(Consumable consumable) {}

}
