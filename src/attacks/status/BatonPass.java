package attacks.status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BatonPass extends StatusMove{
    public BatonPass() {
        super(Type.NORMAL, Double.MIN_VALUE,  Double.MIN_VALUE);
    }

    @Override
    public String describe(){
        return "using Status attack Baton Pass";
    }
    // нет возможности менять покемонов
    ;

}
