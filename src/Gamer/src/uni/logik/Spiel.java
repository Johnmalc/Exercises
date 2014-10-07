package uni.logik;

import uni.items.Item;
import uni.items.Papier;
import uni.items.Schere;
import uni.items.Stein;

import java.util.Scanner;

/**
 * Created by jm on 10/7/2014.
 */
public class Spiel {
    private final Gegner gegner;
    private final Item itemGegner;
    private final Item itemMeine;

    // final kann nicht uberschreiben durch zweites gegner = new Gegner();

    public Spiel() {
        gegner = new Gegner();
        itemGegner = gegner.decision();
        itemMeine = ourDecision();
    }

    public Item ourDecision() {
        Scanner io = new Scanner(System.in);
        do {
            System.out.println("Schere oder anderes");

            String auswahl = io.next();

            if (auswahl.equalsIgnoreCase("Schere")) {
                return new Schere();
            } else if (auswahl.equalsIgnoreCase("Papier")) {
                return new Papier();
            } else if (auswahl.equalsIgnoreCase("Stein")) {
                return new Stein();
            }
        } while (true);

    }

    public Gegner getG() {
        return gegner;
    }

    public String IWon() {
        boolean b1 = itemMeine.besiegt(itemGegner);
        if (b1) {
            return "du hast gewonnen";
        }
        boolean b2 = itemMeine.besiegt(itemGegner);
        if (b2) {
            return "du hast verloren";
        }

        //if (!b1 && !b2) {
            return "unetschieden";
        //}

        //return null;
    }

}
