package Pokemons;
import attacks.physical.Scratch;
import attacks.physical.ShadowPunch;
import attacks.special.ThunderShock;

public class Metapod extends Caterpie {
    public Metapod(String name, int lvl) {
        super(name, lvl);
        setStats(50, 20, 55, 25, 25, 30);
        setMove(new ShadowPunch(), new ThunderShock(), new Scratch());
    }
}
