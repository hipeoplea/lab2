package attacks.status;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, Double.MIN_VALUE, Double.MIN_VALUE);
    }

    @Override
    public String describe() {
        return "using Special attack Focus Energy";
    }

    @Override
    public void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.ACCURACY, +1);
    }
}
