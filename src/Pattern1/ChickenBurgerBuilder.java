package Pattern1;

public class ChickenBurgerBuilder extends BurgerBuilder{
    @Override
    public void mixCheese() {
        burger.setCheese("Cheese For Chicken Burger");
    }

    @Override
    public void mixPatty() {
        burger.setPatty("Patty For Chicken Burger");
    }

    @Override
    public void mixSauce() {
        burger.setSauce("Sauce For Chicken Burger");
    }
}
