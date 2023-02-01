

import java.util.ArrayList;
import java.util.Formatter;

public class ScoreBoard {
    public static void scoreBoard(Team A , Team B)
    {
        ArrayList<Player> playerList = A.getTeamPlayer();

        System.out.println("Team " + A.getTeamName()+"Score");
        System.out.println("/-----------------------------------------------------------------------------------------/");

        System.out.format("%15s %15s %15s %15s %15s\n", "Player Name", "Score", "BallFaced", "4s", "6s");

        System.out.println("/-----------------------------------------------------------------------------------------/");
        for(Player player : playerList)
        {
            System.out.format("%14s %14s %17s %15s %15s\n",player.getPlayerName(),player.getScore(),player.getBallFaced(),player.getPlayerTotal4s(),player.getPlayerTotals6s() );
        }
        System.out.println("/-----------------------------------------------------------------------------------------/");
        System.out.println();

        System.out.println("Team " + B.getTeamName()+"Score");
        System.out.println("/-----------------------------------------------------------------------------------------/");
        System.out.format("%15s %15s %15s %15s %15s\n", "Player Name", "Score", "BallFaced", "4s", "6s");

        System.out.println("/-----------------------------------------------------------------------------------------/");
        playerList = B.getTeamPlayer();
        for(Player player : playerList)
        {
            System.out.format("%14s %14s %17s %15s %15s\n",player.getPlayerName(),player.getScore(),player.getBallFaced(),player.getPlayerTotal4s(),player.getPlayerTotals6s() );
        }
        System.out.println("/-----------------------------------------------------------------------------------------/");
    }
}

