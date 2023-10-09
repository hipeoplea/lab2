package Pokemons;
import attacks.physical.ShadowPunch;
import attacks.special.ThunderShock;
import ru.ifmo.se.pokemon.*;

public class Caterpie extends Pokemon {
    public Caterpie(String name, int lvl) {
        super(name, lvl);
        setType(Type.BUG);
        setStats(45, 30, 35, 20, 20, 45);
        setMove(new ShadowPunch(), new ThunderShock());
    }
}
