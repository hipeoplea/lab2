package attacks.special;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage() {
        super(Type.DRAGON, Double.MIN_VALUE, 10);
    }

    @Override
    public String describe() {
        return "using Special attack DragonRage";
    }

    @Override
    public void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, 40);
    }
}
