package Others;

import Models.PlayerType;

public class CurrentBall {
    static int[] batsmanScore = new int[]{0,0,7,2,2,4,2,6,2,7,4,6};
    static int[] bowlerScore = new int[]{0,7,1,2,6,7,2,1,7,4,7,6};
    public static int generateRunOnCurrentBall(PlayerType playerType)
    {
        int index =  (int)(Math.random()*11);
        if(playerType == PlayerType.BATSMAN)
            return batsmanScore[index];
        else
            return bowlerScore[index];
    }
}
