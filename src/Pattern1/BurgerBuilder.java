package Pattern1;

public abstract class BurgerBuilder {
    protected Burger burger;

    public Burger getBurger()
    {
        return burger;
    }

    public  void createBurger()
    {
        burger = new Burger();
    }

    public abstract void mixCheese();
    public abstract void mixPatty();
    public abstract void mixSauce();
}
