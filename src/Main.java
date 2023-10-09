import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class    Main {
    public static void main(String[] args) {
        Battle Fight = new Battle();
        Fight.addAlly(new Butterfree("boe", 4));
        Fight.addAlly(new Caterpie("kitty", 2));
        Fight.addAlly(new Chinchou("smash", 5));
        Fight.addFoe(new Liepard("heat", 3));
        Fight.addFoe(new Pansage("tablerone", 1));
        Fight.addFoe(new Metapod("beep", 6));
        Fight.go();

    }
}

