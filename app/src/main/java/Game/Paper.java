package Game;

import com.nickmattmiller.rockpaperscissors.GameUtils;
import com.nickmattmiller.rockpaperscissors.R;

/**
 * Created by Nick on 9/21/2015.
 */
public class Paper implements GameType {

    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice== R.id.btnRock){
            return GameUtils.BEATS;
        }else if (opponentChoice==R.id.btnScissors){
            return GameUtils.LOSES_TO;
        }
        else{
            return GameUtils.TIES;
        }
    }
}
