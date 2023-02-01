import java.util.ArrayList;

import static java.lang.Math.max;

public class GamePlay {

    public static int gamePlay(Team battinTeam, Team bowlingTeam, int total, int noOfOver)
    {
        int currentScore = 0;

        ArrayList<Player> playersList = battinTeam.getTeamPlayer();
        int playerOnStrikeIndex = 0, playerOnNonStrikeIndex = 1;

        for(int currentOver = 0; currentOver < noOfOver ; currentOver++ )
        {
            for(int ball = 0; ball < 6 ; ball ++ )
            {
                try{
                    Thread.sleep(150);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                int scoreOnCurrentBall = CurrentBall.generateRunOnCurrentBall(playersList.get(playerOnStrikeIndex).getPlayerType());
                battinTeam.updateBallFaced();

                if(scoreOnCurrentBall > 6)
                {
                    System.out.print("W ");
                    battinTeam.upadateWicketFallen();
                    playersList.get(playerOnStrikeIndex).addballFaced();

                    if(battinTeam.getWicketsFallen() == (battinTeam.teamSize - 1))
                        return currentScore;

                    playerOnStrikeIndex = GamePlay.wicketFallen(playerOnNonStrikeIndex, playerOnStrikeIndex);
                }
                else
                {
                    currentScore += scoreOnCurrentBall ;
                    total-=scoreOnCurrentBall;

                    System.out.print(scoreOnCurrentBall + " ");
                    battinTeam.updateRunScored(scoreOnCurrentBall);

                    if(scoreOnCurrentBall == 4)
                        playersList.get(playerOnStrikeIndex).updatePlayerTotal4s();
                    else if(scoreOnCurrentBall == 6)
                        playersList.get(playerOnStrikeIndex).updatePlayerTotals6s();

                    playersList.get(playerOnStrikeIndex).addballFaced();
                    playersList.get(playerOnStrikeIndex).addRunScored(scoreOnCurrentBall);

                    boolean strikeRotate = GamePlay.strikeChange(scoreOnCurrentBall);
                    if(strikeChange(scoreOnCurrentBall))
                    {
                        int temp = playerOnNonStrikeIndex ;
                        playerOnNonStrikeIndex = playerOnStrikeIndex;
                        playerOnStrikeIndex = temp;
                    }
                }
                if(total < 0)
                    return currentScore;
            }
            int temp = playerOnNonStrikeIndex ;
            playerOnNonStrikeIndex = playerOnStrikeIndex;
            playerOnStrikeIndex = temp;
            System.out.println();
        }
        battinTeam.setTeamPlayer(playersList);
        return currentScore;
    }

    public static boolean strikeChange(int score)
    {
        if(score % 2 == 0)
            return false;
        return true;
    }
    public static int wicketFallen(int a, int b)
    {
        return max(a,b)+1;
    }

}
