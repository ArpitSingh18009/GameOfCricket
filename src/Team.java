
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
     InputValues inputValues = new InputValues();
     public  int teamSize = 5;
     private String teamName ;
     private int runScored ;
     private int ballFaced;
     private int WicketsFallen;
     private ArrayList<Player> team ;
     public Team()
     {
         runScored = 0;
         ballFaced = 0;
         WicketsFallen = 0;
         team = new ArrayList<>();
         makeYourTeam();
     }
     public ArrayList<Player> getTeamPlayer()
     {
         return team;
     }
    public String getTeamName() {
        return teamName;
    }

    public int getRunScored() {
        return runScored;
    }

    public int getBallFaced() {
        return ballFaced;
    }

    public int getWicketsFallen() {
        return WicketsFallen;
    }

    void setTeamPlayer(ArrayList<Player> team)
    {
        this.team = team;
    }
    void updateRunScored(int score)
    {
        runScored += score;
    }
    void updateBallFaced()
    {
        ballFaced++;
    }
    void upadateWicketFallen()
    {
        WicketsFallen++;
    }
//    public void getTeamPlayerName()
//    {
//        for(Player player : team)
//        {
//            System.out.println(player.getPlayerName() + " " + player.getTeamName());
//        }
//    }
    public void makeYourTeam()
    {
          this.teamName = inputValues.takeInputTeamName();

          this.team = inputValues.takePlayerInput();
    }

}
