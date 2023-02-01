public class Bowler extends Player{
    protected int ballBowled ;
    protected int wicketTaken ;
    protected int runConceded ;
    protected double economy ;
    public Bowler()
    {

        ballBowled = 0;
        wicketTaken = 0;
        runConceded = 0;
        economy = 0.0;
    }
    public int getBallBowled() {
        return ballBowled;
    }

    public int getWicketTaken() {
        return wicketTaken;
    }

    public int getRunConceded() {
        return runConceded;
    }

    public double getEconomy() {
        return economy;
    }

    void addballBowled()
    {
        ballBowled +=1;
    }
    void addwicketTaken() {
        wicketTaken += 1;
    }

    void addrunConceded(int score)
    {
        runConceded +=score;
    }
    void updateEconomy()
    {
        economy = (1.00 * runConceded)/ballBowled ;
    }
}
