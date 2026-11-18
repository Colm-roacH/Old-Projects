package entities;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import simulation.Pasture;

/**
 * The animal superclass
 * @author Colm Roach
 */
abstract class Animal extends Entity{
    public Animal(int row, int col, Color colour){
        super(row, col, colour);
    }
}
