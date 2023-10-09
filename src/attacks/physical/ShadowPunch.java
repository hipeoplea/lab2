package attacks.physical;
import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove{
    public ShadowPunch(){
        super(Type.GHOST, 60, Double.MAX_VALUE);
    }

    @Override
    public String describe(){
        return "using Physical attack Shadow Punch";
    }
    @Override
    public boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
}
