package Pattern1;

public class Main {

    public static void main(String[] args) {

        BurgerBuilder burgerBuilder = BurgerFactory.getBurgerBuilder("Chicken Burger");

        Waiter waiter = new Waiter();
        waiter.setBurgerBuilder(burgerBuilder);

        Burger burger = waiter.getBurger();
        System.out.println(burger);

        System.out.println("----------------------------------------------");
        burgerBuilder = BurgerFactory.getBurgerBuilder("Beef Burger");
        waiter.setBurgerBuilder(burgerBuilder);

        burger = waiter.getBurger();
        System.out.println(burger);
    }



}
