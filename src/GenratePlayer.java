public class GenratePlayer {
    public static int generatePlayerAge()
    {
        return 20 + (int)(Math.random()*20);
    }
    public static String generatePlayerName(int i)
    {
        String s="";
        s+=('A' + i);
        return s;
    }
}
