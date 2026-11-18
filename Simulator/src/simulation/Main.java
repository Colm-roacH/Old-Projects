package simulation;

/**
 * Used to Instantiate and start the Simulation.
 *
 * @version 2.1
 */
public class Main {

    /**
     * Create a new instance of Simulator and set the simulation in motion.
     *
     * @param args standard arguments (not used)
     */
    public static void main(String[] args) {
        Simulator sim = new Simulator();
        sim.start();
    }
}
