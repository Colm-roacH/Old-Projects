package entities;

import static entities.Entity.pasture;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author S300002639
 */
public class Grass extends Entity{
    
    private int delay;
    
    public Grass(int row, int col) {
        super(row, col, new Color(77, 181, 77));
        Random rand = new Random();
        delay = rand.nextInt(5) + 1;
    }
    
    @Override
    public void tick() {
        // Move when delay counts down to 0
        if (delay-- == 0) {
            pasture.growGrass();
            // Assign a random delay before next move
            Random rand = new Random();
            delay = rand.nextInt(5) + 1;
        }

        // Other stuff this Entity does goes here
    }
}
