/*
 * This class to model the Brocooli vegetable
 */
package stirfry;

/**
 *
 * @author haki
 * @modified ....
 * @date Nov. 16, 2020
 */
public class Broccoli extends Vegetable implements Organic {

    public Broccoli() {
        super("Broccoli", "green");
    }

    @Override
    public boolean isTasty() {
        return true;
    }

    @Override
    public boolean growWithOutPestiside() {
        return true;
    }

}
