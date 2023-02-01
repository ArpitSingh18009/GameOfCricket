
public class PlayerFactory {
    public static Player playerFactory(int arg)
    {
        if(arg == 1)
            return new Batsman();
        else if(arg == 2)
        {
            return new Bowler();
        }
        return null;
    }
}
