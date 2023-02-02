package Controllers;

import Models.Team;
import Views.GetWinner;
import Others.InputValues;
import Views.ScoreBoard;

public class CricketGame {
    InputValues inputValues = new InputValues();
    private Team firstTeam , secondTeam ;
    private Team battingTeam , bowlingTeam ;
    private int noOfOvers , noOfPlayerInATeam;

    public void setUpGame() {

        noOfOvers = inputValues.takeInputOfNoOfOver();
        noOfPlayerInATeam = inputValues.takeInputOfNoOfPlayerInATeam();
        System.out.println("Enter first team details --");
        firstTeam = new Team();

        System.out.println("\n--------------------------------------------------\n"); // for better presentation

        System.out.println("Enter second team details --");
        secondTeam = new Team();

        System.out.println("\n\n\n-------------------------------------------------------------------------------\n\n\n");     // for better visuals
    }
    public void startMatch() {

        System.out.println("MATCH STARTS");

        toss();

        System.out.println("\nInnings 1 - " + battingTeam.getTeamName() + " will bat & " + bowlingTeam.getTeamName() + " will bowl\n");
        int firstTeamScore = GamePlay.gamePlay(battingTeam , bowlingTeam, 100001, noOfOvers);
        System.out.println();
        System.out.println(battingTeam.getTeamName() + " " + battingTeam.getRunScored() + '/' + battingTeam.getWicketsFallen());


        swapTeamStatus();


        System.out.println("\nInnings 2 - Now, " + battingTeam.getTeamName() + " will bat & " + bowlingTeam.getTeamName() + " will bowl\n");
        int secondTeamScore = GamePlay.gamePlay(battingTeam, bowlingTeam, firstTeamScore + 1, noOfOvers);
        System.out.println();
        System.out.println(battingTeam.getTeamName() + " " + battingTeam.getRunScored() + '/' + battingTeam.getWicketsFallen());


        System.out.println();


        GetWinner.whoIsWinner(firstTeam, secondTeam);
        System.out.println();
        ScoreBoard.scoreBoard(bowlingTeam , battingTeam);
    }

    private void toss() {

        System.out.println("Toss is taking place...");

        try{
            Thread.sleep(300);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        // 0 --> team A bats,   1 --> team B bats
        int tossResults = (int) (Math.random() * 2);

        if(tossResults == 0) {
            battingTeam = firstTeam;
            bowlingTeam = secondTeam;
        }
        else {
            battingTeam = secondTeam;
            bowlingTeam = firstTeam;
        }
    }
    private void swapTeamStatus() {
        Team temp = battingTeam;
        battingTeam = bowlingTeam;
        bowlingTeam = temp;
    }
}
