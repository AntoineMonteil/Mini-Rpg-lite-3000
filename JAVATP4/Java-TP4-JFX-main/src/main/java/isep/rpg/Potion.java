package isep.rpg;

import java.util.Random;

public class Potion implements Consumable {
    private final int lifePoints;
    public Potion() {
        lifePoints = (new Random()).nextInt(5) ;
    }
    @Override
    public int getLifePoints() {
        return lifePoints;
    }

}
