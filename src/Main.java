public class Main {
    public static void main(String[] args) {

        Player team1[] = new Player[11];
        Player team2[] = new Player[11];

        for(int i=0;i<11;i++)
        {
            team1[i] = new Player(nameGenrator(i),randomAge(),"team1");
            team2[i] = new Player(nameGenrator(i+12),randomAge(),"team2");
        }

        System.out.println("First Inning : team1 Batting : ");

        int team1Score = gamePlay(1000);

        System.out.println("team1 score : " + team1Score);

        System.out.println("Second Inning : team2 Batting : ");

        int team2Score = gamePlay(team1Score);

        System.out.println("team2 score : " + team2Score);

        if(team1Score > team2Score)
        {
            System.out.println("team1 Win the game");
        }
        else
            System.out.println("team2 Win the game");

        System.out.println("Winning team get reward wroth Rs.5000");
    }


    public static int randomAge()
    {
        return 20 + (int)(Math.random()*20);
    }

    public static String nameGenrator(int i)
    {
        char ch = (char)('A'+i);
        String s="";
        s+=ch;
        return s;
    }

    public static int gamePlay(int total)
    {
        int ballsCount = 0;
        int wicket = 0;
        int score = 0;
        int activity = 0;
        while(ballsCount < 120 && wicket < 10 && total >0){

            activity = runGenrator();

            if(ballsCount%6 == 0)
            System.out.println();

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

    public static int runGenrator()
    {
        return (int)(Math.random()*10) % 8 ;
    }

}