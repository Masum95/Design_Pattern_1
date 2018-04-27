package Pattern1;

public class Waiter {
    BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder b)
    {
        burgerBuilder = b;
    }

    public Burger getBurger()
    {
        assembleBurger();
        return burgerBuilder.getBurger();
    }

    public void assembleBurger()
    {
        burgerBuilder.createBurger();
        burgerBuilder.mixPatty();
        burgerBuilder.mixCheese();
        burgerBuilder.mixSauce();
    }
}
