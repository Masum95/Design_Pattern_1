package Pattern2;

public class CoffeDemo {
    public static void main(String[] args) {

        CoffeFactory coffeFactory = CoffeFactory.getInstance();

        Coffe coffe = coffeFactory.produceCoffe("CoffeA");
        System.out.println(coffe);

        coffe = coffeFactory.produceCoffe("CoffeB");
        System.out.println(coffe);

        coffe = coffeFactory.produceCoffe("CoffeC");
        System.out.println(coffe);


    }
}
