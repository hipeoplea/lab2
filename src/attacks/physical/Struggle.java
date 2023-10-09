package attacks.physical;

import ru.ifmo.se.pokemon.*;

public class Struggle extends PhysicalMove {
    public Struggle() {
        super(Type.NORMAL, 50, Double.MAX_VALUE);
    }

    @Override
    public String describe() {
        return "using Physical attack Struggle";
    }

    @Override
    public void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, -(int)(damage / 2));
    }
}
