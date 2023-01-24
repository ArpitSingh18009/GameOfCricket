public class GamePlay {

    public static int gamePlay(int total)
    {
        int ballsCount = 0;
        int wicket = 0;
        int score = 0;
        int activity = 0;
        while(ballsCount < 120 && wicket < 10 && total >0){

            if(ballsCount%6 == 0)
                System.out.println();

            activity = GenerateRun.generateRunOnCurrentBall();

            if(activity == 7)
            {
                wicket++;
                System.out.print('W' + " ");
            }
            else
            {
                score += activity;
                total -=activity;
                System.out.print(activity + " ");
            }
            ballsCount++;
        }

        System.out.println();
        return score;
    }
}
