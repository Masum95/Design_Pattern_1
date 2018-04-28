package Pattern2;

public class CoffeFactory {

    private static CoffeFactory cf;

    private CoffeFactory(){}

    public static CoffeFactory getInstance()
    {
        if(cf==null)
        {
            synchronized (CoffeFactory.class)
            {
                if(cf==null)
                {
                    cf = new CoffeFactory();
                    return cf;
                }
            }
        }
        return cf;
    }

    public Coffe produceCoffe(String name)
    {
        if (name == null) return null;
        Coffe coffe = null;
        if (name.equalsIgnoreCase("CoffeA")) {
            coffe = new CoffeA();
        }
        if(name.equalsIgnoreCase("CoffeB"))
        {
            coffe = new CoffeB();
        }
        if(name.equalsIgnoreCase("CoffeC"))
        {
            coffe = new CoffeC();

        }

        coffe.makeCoffe();
        return coffe;



    }


}
