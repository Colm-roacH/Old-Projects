package simulation;


import java.util.ArrayList;
import java.util.Random;

import entities.*;

/**
 * Maintains a 3D array of the pasture. It provides functionality for Entity 
 * Objects to interact with the array (movement, determining nearby objects, 
 * etc.)
 * 
 * @version 2.6
 */
public class Pasture {

    /*------------FIELDS-------------*/
    private Entity[][][] entities;
    private final int NUM_COLS;
    private final int NUM_ROWS;
    private final int GRASS = 0;
    private final int ANIMALS = 1;
    private final int NUM_LEVELS = 2;
    private final int GLOBAL_DELAY = 2;
    private int tickCounter = 0;

    /**
     * Initialize the Pasture
     *
     * @param NUM_ROWS the total number of rows in the pasture
     * @param NUM_COLS the total number of columns in the field
     */
    public Pasture(int NUM_ROWS, int NUM_COLS) {
        
        Entity.pasture = this;
        this.NUM_ROWS = NUM_ROWS;
        this.NUM_COLS = NUM_COLS;

        entities = new Entity[NUM_ROWS][NUM_COLS][NUM_LEVELS];

        /*---Create starting populations---*/
        int NUM_SHEEP = 15;
        int NUM_WOLVES = 5;
        int STARTING_GRASS = 10;

        for (int i = 0; i < NUM_SHEEP; i++) {
            placeAnimal(new Sheep());
        }
        
        for (int i = 0; i < NUM_WOLVES; i++) {
            placeAnimal(new Wolf());
        }
        
        for (int i = 0; i < STARTING_GRASS; i++) {
            placeGrass(new Grass(0,0));
        }
        
        //TODO Initialize other starting populations here	
        
        
        
        
    }

    /**
     * Determine if a space is already taken by an Entity
     *
     * @param the row of the Entity
     * @param the column of the Entity
     * @return
     */
    private boolean isOccupied(int row, int col) {
        if (entities[row][col][ANIMALS] != null) {
            return true;
        }
        return false;
    }
    
    private boolean isGrassy(int row, int col) {
        if (entities[row][col][GRASS] != null) {
            return true;
        }
        return false;
    }

    /**
     * Methods to determine if a specific row or column is valid
     */
    private boolean inRowRange(int r) {
        return r >= 0 && r < NUM_ROWS;
    }

    private boolean inColRange(int c) {
        return c >= 0 && c < NUM_COLS;
    }

    /**
     * Compares an Entity's current position to where it thinks it is.
     * <br>If the values do not match then the Entity has died
     *
     * @param entity An Entity
     * @return Is the entity alive
     */
    public boolean isAlive(Entity entity, int level) {
        return entity.equals(entities[entity.getRow()][entity.getCol()][level]);
    }

    /**
     * Add an Entity to the array - WARNING: highly inefficient for large
     * populations! - It will freeze the program if no spaces remain!
     */
    private void placeAnimal(Entity entity) {
        Random rand = new Random();
        int row = rand.nextInt(NUM_ROWS);
        int col = rand.nextInt(NUM_COLS);

        // Find an empty spot
        while (this.isOccupied(row, col)) {
            row = rand.nextInt(NUM_ROWS);
            col = rand.nextInt(NUM_COLS);
        }

        //Place Entity in location (row, col)
        entity.setRow(row);
        entity.setCol(col);
        entities[row][col][ANIMALS] = entity;
    }
    
    private void placeGrass(Entity entity) {
        Random rand = new Random();
        int row = rand.nextInt(NUM_ROWS);
        int col = rand.nextInt(NUM_COLS);

        // Find an empty spot
        while (this.isOccupied(row, col)) {
            row = rand.nextInt(NUM_ROWS);
            col = rand.nextInt(NUM_COLS);
        }

        //Place Entity in location (row, col)
        entity.setRow(row);
        entity.setCol(col);
        entities[row][col][GRASS] = entity;
    }

    /**
     * Moves an Entity to a new location
     * <br><i>Note: not currently checking for valid moves </i>
     *
     * @param entity Entity to be moved
     * @param newLoc int[row, col]
     */
    public void moveEntity(Entity entity, int[] newLoc) {
        // Temporarily store the previous row and column
        int oldRow = entity.getRow();
        int oldCol = entity.getCol();

        // Update this Entity's row and column to the new location
        entity.setRow(newLoc[0]);
        entity.setCol(newLoc[1]);

        // Move the Entity to the new location and set its old location to null 
        entities[entity.getRow()][entity.getCol()][ANIMALS] = entity;
        entities[oldRow][oldCol][ANIMALS] = null;
    }

    public void growGrass(){
        Random rand = new Random();
        if(++tickCounter < GLOBAL_DELAY){
            return;
        }
        tickCounter = 0; // Reset counter after spreading
        ArrayList<int[]> possibleSpots = new ArrayList<>();
        // Collect all valid spots where grass could spread
        for(int i = 0; i < NUM_ROWS; i++){
            for(int index = 0; index < NUM_COLS; index++){
                if(entities[i][index][GRASS] instanceof Grass){
                    int[][]directions = {{0, 1}, {0, -1}, {1, 0}, {1, -1}, {1, 1}, {-1, 0}, {-1, -1}, {-1, 1}};
                    for(int[]d:directions){
                        int moveRow = i + d[0];
                        int moveCol = index + d[1];
                        if(moveRow >= 0 && moveRow < NUM_ROWS && moveCol >= 0 && moveCol < NUM_COLS && entities[moveRow][moveCol][GRASS] == null){
                            possibleSpots.add(new int[]{moveRow, moveCol});
                        }
                    }
                }
            }
        }
        int area = NUM_ROWS*NUM_COLS;
        double spreadChance = Math.max(1,8);
        if(!possibleSpots.isEmpty() && rand.nextDouble(11) > spreadChance){
            int[] newTile = possibleSpots.get(rand.nextInt(possibleSpots.size()));
            entities[newTile[0]][newTile[1]][GRASS] = new Grass(newTile[0], newTile[1]);
        }
    }
    
    /**
     * Getter for the number of levels.
     * 
     * @return the number of levels in the 3D array
     */
    int numLevels(){
        return NUM_LEVELS;
    }
    
    /**
     * Returns a List of all Entity objects in the array
     *
     * @return an array list of
     */
    ArrayList<Entity> getEntities(int level) {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        Random rand = new Random();

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Entity entity = entities[row][col][level];
                if (entity != null) {
                    // Add to a random location to remove bias
                    int p = rand.nextInt(entityList.size() + 1);
                    entityList.add(p, entity);
                }
            }
        }
        return entityList;
    }

    /**
     * Returns a List of empty positions in the 8 adjacent cells to the target
     * Entity
     *
     * @param entity Entity checking for locations in adjacent positions
     * @return {@code ArrayList<int[row, col]>} of positions containing no
     * Entities
     */
    public ArrayList<int[]> getFreePositions(Entity entity) {

        ArrayList<int[]> entityList = new ArrayList<int[]>();

        int row = entity.getRow();
        int col = entity.getCol();

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (inRowRange(r) && inColRange(c) && !(r == row && c == col) && !isOccupied(r, c)) {
                    int[] i = {r, c};
                    entityList.add(i);
                }
            }
        }
        return entityList;
    }
    
    public ArrayList<int[]> getGrassPositions(Entity entity) {

        ArrayList<int[]> entityList = new ArrayList<int[]>();

        int row = entity.getRow();
        int col = entity.getCol();

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (inRowRange(r) && inColRange(c) && !(r == row && c == col) && !isGrassy(r, c)) {
                    int[] i = {r, c};
                    entityList.add(i);
                }
            }
        }
        return entityList;
    }

}