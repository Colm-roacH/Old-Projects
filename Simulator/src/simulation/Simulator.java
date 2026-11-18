package simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

import entities.Entity;


/**
 * Creates the GUI and controls the simulation timing.
 *
 * @version 2.4
 */
public class Simulator extends JPanel implements ActionListener {

    /**Simulation speed: 0 (fast) --> 1000 (slow)**/
    private int SPEED = 100;
    /**Number of rows in the pasture**/
    private final int NUM_ROWS = 60;
    /**Number of columns in the pasture**/
    private final int NUM_COLS = 80;
    /**Default background Dirt colour**/
    private final Color DIRT = new Color(139, 69, 19);
    /**The pasture 3D array and its methods**/
    private Pasture pasture;
    /**Default background Dirt colour**/
    private Timer time;

    /**
     * Initializes the Simulator
     * <ul>
     * <li>Create a new Pasture and initialize timer.</li>
     * <li>Adjust animation speed by changing SPEED field above</li>
     * </ul>
     */
    public Simulator() {

        //Populate a new world
        this.pasture = new Pasture(NUM_ROWS, NUM_COLS);

        JFrame frame = new JFrame("Pasture");
        frame.setVisible(true);
        frame.setSize(this.getNUM_COLS() * 10 + 16, this.getNUM_ROWS() * 10 + 38);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

        //Start the simulation
        time = new Timer(SPEED, this);
    }

    /**
     * Begin the simulation
     */
    public void start() {
        time.start();
    }

    /**
     * Getter for the Pasture x dimension
     *
     * @return the number of columns in the Pasture
     */
    public int getNUM_COLS() {
        return NUM_COLS;
    }

    /**
     * Getter for the Pasture y dimension
     *
     * @return the number of rows in the Pasture
     */
    public int getNUM_ROWS() {
        return NUM_ROWS;
    }

    /**
     * Indicates 1 unit of time has passed. The grass is updated first, 
     * followed by the animals.
     *
     * @param ae The triggering event (not used)
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        //1 unit of time passes
        for(int L = 0; L < pasture.numLevels(); L++){
            ArrayList<Entity> list = pasture.getEntities(L);

            for (Entity entity:list) {
                if (pasture.isAlive(entity, L)) {
                    entity.tick();
                }
            }
        }

        //Redraw the pasture
        repaint();
    }

    /**
     * Draws the pasture.  The grass is drawn first, followed by the animals.
     *
     * @param g Graphics
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Draw the ground
        g.setColor(DIRT);
        g.fillRect(0, 0, NUM_COLS * 10, NUM_ROWS * 10);

        //Draw the Entities
        for(int L = 0; L < pasture.numLevels(); L++){
            ArrayList<Entity> entityList = pasture.getEntities(L);

            for (Entity entity : entityList) {
                g.setColor(entity.getColor());
                g.fillRect(entity.getCol() * 10, entity.getRow() * 10, 10, 10);
            }
        }
    }

}