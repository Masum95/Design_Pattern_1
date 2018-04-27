package Pattern2;

public class CoffeC implements Coffe{
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
        sugar = "Sugar Added";
    }

    @Override
    public void makeCoffe() {
        setCaffein();
        setMilk();
        setSugar();
    }

    @Override
    public String toString() {
        return "CoffeC{" +
                "milk='" + milk + '\'' +
                ", caffein='" + caffein + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}
