public class Main {
    public static void main(String[] args) {

        Player team1[] = new Player[11];
        Player team2[] = new Player[11];

        for(int i=0;i<11;i++)
        {
            team1[i] = new Player(GenratePlayer.generatePlayerName(i),GenratePlayer.generatePlayerAge(),"team1");
            team2[i] = new Player(GenratePlayer.generatePlayerName(i+12),GenratePlayer.generatePlayerAge(),"team2");
        }

        System.out.println("First Inning : team1 Batting : ");

        int team1Score = GamePlay.gamePlay(1000);
        System.out.println("team1 score : " + team1Score);

        System.out.println("Second Inning : team2 Batting : ");

        int team2Score = GamePlay.gamePlay(team1Score);
        System.out.println("team2 score : " + team2Score);

        GetWinner.whoIsWinner(team1Score, team2Score);

    }


}