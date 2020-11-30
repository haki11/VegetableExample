package stirfry;

import java.util.ArrayList;

/**
 * Demonstrate the use of Inheritance
 * 
 * @author Haki
 */
public class StirFry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Vegetable> veggies = new ArrayList();
        
        Vegetable v1 = new Orange();
        Vegetable v2 = new Broccoli();
        Vegetable v3 = new Onion(10);
        
        veggies.add(v1);
        veggies.add(v2);
        veggies.add(v3);
        
        boolean tasteGood = true;
        
        for(Vegetable vegetable: veggies) {
            if(!vegetable.isTasty()) {
                tasteGood = false;
            }
        }
        System.out.println("Does this stirfry taste good ? " + tasteGood);
        
        System.out.println("Is the Broccoli organic: " + 
                ((Broccoli)v2).growWithOutPestiside());
    }

}
