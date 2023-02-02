import Controllers.CricketGame;

public class Main {
    public static void main(String[] args) {
        CricketGame statGame = new CricketGame();
        statGame.setUpGame();
        statGame.startMatch();
    }
}