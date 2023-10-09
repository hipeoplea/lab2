package Pokemons;
import attacks.physical.Struggle;
import attacks.special.DragonRage;
import attacks.status.PowerSwap;
import attacks.status.Swallow;
import ru.ifmo.se.pokemon.*;

public class Chinchou extends Pokemon {
    public Chinchou(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ELECTRIC);
        setStats(75, 38, 38, 56, 56, 67);
        setMove(new Swallow(), new DragonRage(), new PowerSwap(), new Struggle());
    }
}
