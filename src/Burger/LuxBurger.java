package Burger;
import java.util.ArrayList;

// Inheritance
public class LuxBurger extends BasicBurger {

    private String name;
    private String bread;
    private double price;
    private ArrayList<String> sides = new ArrayList<String>();

    public LuxBurger(String name) {
        // Inheritance
        super(name);
        this.name = super.getName();
        this.bread = "Teravilja kukkel";
        this.price = super.getPrice() + 0.65;
    }

    public void orderLuxBurger(Sides sides) {
        for (int i = 0; i < sides.getSidesAmount(); i++) {
            // Composition
            this.sides.add(sides.getSides().get(i));
        }
        this.price += sides.getPrice();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + "koos teravilja kukkliga, hinnaga " + this.price + "€" + ". Lisandid: " + this.sides;
    }
}