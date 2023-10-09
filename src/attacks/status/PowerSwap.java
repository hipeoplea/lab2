package attacks.status;
import ru.ifmo.se.pokemon.*;
public class PowerSwap extends StatusMove{
    public PowerSwap(){
        super(Type.PSYCHIC, Double.MIN_VALUE, Double.MIN_VALUE);
    }
    @Override
    public String describe() {
        return "using Special attack Power Swap";
    }
    @Override
    public boolean checkAccuracy(Pokemon att, Pokemon def){
        int att1 = (int)att.getStat(Stat.HP);
        int att2 = (int)att.getStat(Stat.ATTACK);
        int att3 = (int)att.getStat(Stat.DEFENSE);
        int att4 = (int)att.getStat(Stat.SPECIAL_ATTACK);
        int att5 = (int)att.getStat(Stat.SPECIAL_DEFENSE);
        int att6 = (int)att.getStat(Stat.SPEED);

        int deff1 = (int)def.getStat(Stat.HP);
        int deff2 = (int)def.getStat(Stat.ATTACK);
        int deff3 = (int)def.getStat(Stat.DEFENSE);
        int deff4 = (int)def.getStat(Stat.SPECIAL_ATTACK);
        int deff5 = (int)def.getStat(Stat.SPECIAL_DEFENSE);
        int deff6 = (int)def.getStat(Stat.SPEED);

        att.setStats(att1, deff2, att3, att4, att5, att6);
        def.setStats(deff1, att2, deff3, deff4, deff5, deff6);

        return true;
    }

}
