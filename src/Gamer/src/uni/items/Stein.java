package uni.items;

/**
 * Created by jm on 10/7/2014.
 */
public class Stein implements Item {
    public Stein() {
    }


    @Override public boolean besiegt(Item i1) {
        if (i1 instanceof Stein) {
            return false;
        } else if (i1 instanceof Schere) {
            return false;
        } else {
            return true;
        }
    }
}
