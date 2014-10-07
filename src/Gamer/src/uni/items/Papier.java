package uni.items;

/**
 * Created by jm on 10/7/2014.
 */
public class Papier implements Item {
    public Papier() {

    }


    @Override public boolean besiegt(Item i1) {
        if (i1 instanceof Papier) {
            return false;
        } else if (i1 instanceof Stein) {
            return true;
        } else {
            return false;
        }
    }
}
