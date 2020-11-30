/*
 * Demonstrate having different type of constructor
 */
package stirfry;

/**
 *
 * @author haki
 */
public class Onion extends Vegetable{

    private int numLayers;
    public Onion(int numLayers) {
        super("Onion", "white");
        this.numLayers = numLayers;
    }

    @Override
    public boolean isTasty() {
        return false;
    }

    public int getNumLayers() {
        return numLayers;
    }

    public void setNumLayers(int numLayers) {
        this.numLayers = numLayers;
    }
    
}
