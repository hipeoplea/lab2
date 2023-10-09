package attacks.status;
import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Swallow extends StatusMove{
    public Swallow() {
        super(Type.NORMAL, Double.MIN_VALUE, Double.MIN_VALUE);
    }

    @Override
    public String describe() {
        return "using Special attack Swallow";
    }

    @Override
    public void applySelfEffects(Pokemon p) {
        Random num = new Random();
        int number = num.nextInt(3) + 1;
        switch (number) {
            case 1 -> p.setMod(Stat.HP, (int)(p.getHP() * 1.25));
            case 2 -> p.setMod(Stat.HP, (int)(p.getHP() * 1.5));
            default -> p.setMod(Stat.HP, (int)(p.getHP() * 2));
        };
    }
}
