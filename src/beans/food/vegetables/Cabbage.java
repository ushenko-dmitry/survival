package beans.food.vegetables;

import beans.food.Food;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Cabbage extends Food {
    
    private static int volume = new Random().nextInt(50) + 100;
    private static int weigth = new Random().nextInt(50) + 50;
    
    public Cabbage() {
        super(volume, weigth);
        setType(ObjectType.CABBAGE);
        setName(VegetablesNames.CABBAGE);
        setDescription("beautiful ripe red vegetable");
    }
    
}
