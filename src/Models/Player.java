package Models;

public class Player {
    private String playerName ;
    private String teamName ;
    private int age ;
    private PlayerType playerType = PlayerType.BATSMAN;
    private int score ;
    private int ballFaced ;
    private double strikeRate ;
    private int playerTotal4s ;
    private int playerTotals6s;
    public Player() {
        this.score = 0;
        this.ballFaced = 0;
        this.strikeRate = 0;
        this.playerTotals6s =0;
        this.playerTotal4s =0;
    }
    public void playerSetName(String playerName)
    {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public int getBallFaced() {
        return ballFaced;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public int getPlayerTotal4s() {
        return playerTotal4s;
    }

    public int getPlayerTotals6s() {
        return playerTotals6s;
    }
    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
    public void updatePlayerTotal4s() {
        this.playerTotal4s +=1;

    }
    public void updateAge(int age)
    {
        this.age=age;
    }
    public void updatePlayerTotals6s() {
        this.playerTotals6s +=1;
    }
    public void addPlayerName(String name)
    {
        this.playerName = name;
    }
    public void addRunScored(int score)
    {
        this.score += score;
    }
    public void addballFaced ()
    {
        ballFaced++;
    }
    public void updateStrikeRate()
    {
        strikeRate = (1.00*score)/ballFaced ;
    }


}
