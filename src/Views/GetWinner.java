package Views;

import Models.Team;

public class GetWinner {
    public static void whoIsWinner(Team firstTeam, Team secondTeam)
    {
        if(firstTeam.getRunScored() > secondTeam.getRunScored())
        {
            System.out.println(firstTeam.getTeamName() + " Win the game ");
        }
        else if(firstTeam.getRunScored() == secondTeam.getRunScored())
            System.out.println("Match Draw");
        else
            System.out.println(secondTeam.getTeamName() + " Win the game");
    }

}
