package Pattern2;

public class CoffeB implements  Coffe{
    private String milk,caffein,sugar;

    @Override
    public void setCaffein() {
        caffein = "Caffein Added";
    }

    @Override
    public void setMilk() {
        milk = "Milk Added";
    }

    @Override
    public void setSugar() {
        sugar = "No Sugar";
    }

    @Override
    public void makeCoffe() {
        setCaffein();
        setMilk();
        setSugar();
    }

    @Override
    public String toString() {
        return "CoffeB{" +
                "milk='" + milk + '\'' +
                ", caffein='" + caffein + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}
