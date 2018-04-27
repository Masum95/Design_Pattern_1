package Pattern1;

public class BeefBurgerBuilder extends BurgerBuilder{
    @Override
    public void mixCheese() {
        burger.setCheese("Cheese For Beef Burger");
    }

    @Override
    public void mixPatty() {
        burger.setPatty("Patty For Beef Burger");
    }

    @Override
    public void mixSauce() {
        burger.setSauce("Sauce For Beef Burger");
    }
}
