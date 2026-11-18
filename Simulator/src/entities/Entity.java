package entities;

import java.awt.Color;

import simulation.Pasture;

/**
 * The superclass for all animal and plant objects.
 *
 * @version 2.3
 */
abstract public class Entity {

    private int row;
    private int col;
    private Color colour;

    /**
     * A reference to the object that created this Entity. All entities share
     * the same static field reference.
     */
    public static Pasture pasture;

    /**
     * Initialize a new Entity
     *
     * @param row the Entity's row
     * @param col the Entity's column
     * @param colour the Entity's colour
     */
    public Entity(int row, int col, Color colour) {
        this.row = row;
        this.col = col;
        this.colour = colour;
    }

    /**
     * This method is called when it is time for the Entity to take an action.
     * It must be overridden by subclasses.
     */
    abstract public void tick();

    /**
     * Getter for the Entity colour
     *
     * @return the colour of the entity
     */
    public Color getColor() {
        return colour;
    }

    /**
     * Getter for Entity row
     *
     * @return the row of the entity
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter for Entity column
     *
     * @return the column of the entity
     */
    public int getCol() {
        return col;
    }

    /**
     * Setter for Entity row
     *
     * @param row the row of the Entity
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Setter for Entity column
     *
     * @param col the column of the Entity
     */
    public void setCol(int col) {
        this.col = col;
    }

}
