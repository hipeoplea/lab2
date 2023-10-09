package Pokemons;
import attacks.specSial.Aeroblast;
import attacks.special.Mud_Slap;
import attacks.special.RazorWind;
import attacks.status.FocusEnergy;
import ru.ifmo.se.pokemon.*;

public class Pansage extends Pokemon {
    public Pansage(String name, int lvl) {
        super(name, lvl);
        setType(Type.GRASS);
        setStats(50, 53, 48, 53, 48, 64);
        setMove(new FocusEnergy(), new RazorWind(), new Aeroblast(), new Mud_Slap());
    }
}
