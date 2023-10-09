package attacks.special;

import ru.ifmo.se.pokemon.*;
public class RazorWind extends SpecialMove{
    public RazorWind(){
        super(Type.NORMAL, 80, 100);
    }

    @Override
    public String describe(){
        return "using Special attack Razor wind";
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
