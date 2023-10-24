package Pokemons;
import attacks.special.Aeroblast;
import attacks.special.RazorWind;
import attacks.status.FocusEnergy;
import ru.ifmo.se.pokemon.*;

public class Liepard extends Pokemon {
    public Liepard(String name, int lvl) {
        super(name, lvl);
        setType(Type.DARK);
        setStats(64, 88, 50, 88, 50, 106);
        setMove(new FocusEnergy(), new RazorWind(), new Aeroblast());
    }
}
