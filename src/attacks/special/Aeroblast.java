package attacks.specSial;

import ru.ifmo.se.pokemon.*;

public class Aeroblast extends SpecialMove {
    public Aeroblast() {
        super(Type.FLYING, 100, 95);
    }

    @Override
    public String describe() {
        return "using Special attack Aeroblast";
    }

    @Override
    public double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 170.0 > Math.random()) {
            System.out.println("Critical Hit");
            return 2;
        } else {
            return 1;
        }
    }
}
