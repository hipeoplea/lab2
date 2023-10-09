package attacks.special;
import ru.ifmo.se.pokemon.*;
public class ThunderShock extends SpecialMove{
    public ThunderShock(){
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    public String describe(){
        return "using Special attack Thunder Shock";
    }

    @Override
    public void applyOppEffects(Pokemon p){
        if (Math.random() > 0.9) {
            Effect.paralyze(p);
        }
    }
}
