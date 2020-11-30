/*
 * This class is to model an Orange which is of type Vegetable!!
 */
package stirfry;

/**
 *
 * @author haki
 */
public class Orange extends Vegetable {

    public Orange() {
        super("Orange", "orange");
    }

    @Override
    public boolean isTasty() {
      return true;
    }
    
}
