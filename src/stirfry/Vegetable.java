/*
 * Demonstrate the use of Abstract and Generalization
 */
package stirfry;

/**
 *
 * @author haki
 * @modified by .....
 * @date Nov. 16, 2020
 */
public abstract class Vegetable {

    private String name;
    private String color;

    protected Vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /*
    * A method that returns true if you like the taste of the vegetable
    * and false otherwise.
     */
    public abstract boolean isTasty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
