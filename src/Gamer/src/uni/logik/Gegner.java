package uni.logik;

import uni.items.Item;
import uni.items.Papier;
import uni.items.Schere;
import uni.items.Stein;

import java.util.Random;

/**
 * Created by jm on 10/7/2014.
 */
public class Gegner {

    public Gegner() {

    }

    public Item decision() {
       // Item p = new Papier();


        int random = new Random().nextInt(100);
        System.out.println(random);
        if (random < 33) {
            return new Papier();
        } else if (random >= 33 && random < 66) {
            return new Stein();
        } else {
            return new Schere();
        }
    }
}
