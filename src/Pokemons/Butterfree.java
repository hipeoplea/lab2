package Pokemons;
import attacks.physical.Scratch;
import attacks.physical.ShadowPunch;
import attacks.special.ThunderShock;
import attacks.status.BatonPass;
import ru.ifmo.se.pokemon.Type;

public class Butterfree extends Metapod{
    public Butterfree(String name, int lvl) {
        super(name, lvl);
        addType(Type.FIGHTING);
        setStats(60, 45, 50, 90, 80, 70);

        setMove(new ShadowPunch(), new ThunderShock(), new Scratch(), new BatonPass());
    }
}