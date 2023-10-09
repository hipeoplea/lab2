package attacks.special;
import ru.ifmo.se.pokemon.*;

public class Mud_Slap extends SpecialMove{
    public Mud_Slap(){
        super(Type.GROUND, 20, 100);
    }

    @Override
    public String describe() {
        return "using Special attack Mud_Slap";
    }

    @Override
    public void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ACCURACY, -1);
    }

}
