package Pattern1;

public class BurgerFactory {

    public static BurgerBuilder getBurgerBuilder(String type)
    {
        if(type==null)
        {
            return null;
        }
        else if(type.trim().equalsIgnoreCase( "Chicken Burger"))
        {
            return new ChickenBurgerBuilder();
        }
        else if(type.trim().equalsIgnoreCase( "Beef Burger"))
        {
            return new BeefBurgerBuilder();
        }

        return  null;

    }
}
