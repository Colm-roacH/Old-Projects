package entities;

import static entities.Entity.pasture;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author S300002639
 */
public class Wolf extends Animal{
    
    private int delay;

    public Wolf() {
        super(0, 0, new Color(128, 128, 128));
        Random rand = new Random();
        delay = rand.nextInt(5) + 1;
    }

    @Override
    public void tick() {
        // Move when delay counts down to 0
        if (delay-- == 0) {
            move();

            // Assign a random delay before next move
            Random rand = new Random();
            delay = rand.nextInt(5) + 1;
        }

        // Other stuff this Entity does goes here
    }

    /**
     * Get an ArrayList of available locations and pick one randomly
     */
    private void move() {
        Random rand = new Random();

        ArrayList<int[]> entityList = pasture.getFreePositions(this);
        if (entityList.size() > 0) {
            int moveTo = rand.nextInt(entityList.size());  //choose a random location
            int[] newLoc = entityList.get(moveTo);
            pasture.moveEntity(this, newLoc);

        }

    }
}
