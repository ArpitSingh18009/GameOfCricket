public class GetWinner {
    public static void whoIsWinner(int team1Score, int team2Score)
    {
        if(team1Score > team2Score)
        {
            System.out.println("team1 Win the game");
        }
        else if(team1Score == team2Score)
            System.out.println("Match Draw");
        else
            System.out.println("team2 Win the game");
    }
}
