import java.util.ArrayList;
import java.util.Scanner;

public class InputValues {
     private int curr=0;
     private static int teamSize ;
     Scanner scanner = new Scanner(System.in);
     public String takeInputTeamName()
     {

         System.out.println("Enter Team name : ");
         String name = scanner.nextLine();
         return name;
     }
     public int takeInputOfNoOfOver()
     {
         System.out.println("Enter Number of overs : ");
         int noOfOver = scanner.nextInt();
         return noOfOver;
     }
     public int takeInputOfNoOfPlayerInATeam()
     {
         System.out.println("Enter Number of Player in a Team :");
         int teamSi = scanner.nextInt();
         this.teamSize = teamSi;
         return teamSize;
     }
     public ArrayList<Player> takePlayerInput()
     {
         ArrayList<Player> teamPlayer = new ArrayList<>();
         while(curr < teamSize ) {
             System.out.println("Enter Player name : ");
             String playerName = scanner.nextLine();
             //System.out.println(playerName);
             int playerType = 123;
             // get playerType
             playerType = InputValues.getPlayerType(playerType);

             Player player = InputValues.genratePlayer(playerType, playerName);
             teamPlayer.add(player);
             curr++;
         }
         return teamPlayer;
     }
    public static int getPlayerType(int playerType)
    {
        Scanner scanner = new Scanner(System.in);
        while(playerType !=1 && playerType !=2)
        {
            System.out.println("Enter Player type : "); // TODO : exception handling;
            System.out.println("For Batsman : Press 1 ");
            System.out.println("For Bowler : Press 2");
            playerType = Integer.parseInt(scanner.nextLine());
        }
        return playerType;
    }
    public static Player genratePlayer(int playerType,String playerName)
    {
        Player player = PlayerFactory.playerFactory(playerType);
        player.playerSetName(playerName);
        player.updateAge(GenratePlayerAge.generatePlayerAge());
        if(playerType == 1)
            player.setPlayerType(PlayerType.BATSMAN);
        else
            player.setPlayerType(PlayerType.BOWLER);


        return player;
    }
}
