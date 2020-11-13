package Burger;
import java.util.ArrayList;

// Abstraction
public class BasicBurger {

    // Encapsulation
    private String name;
    private double price;
    private ArrayList<String> sides = new ArrayList<String>();

    public BasicBurger(String name) {
        this.name = name;
        this.price = 5.00;
    }

    public void burgerOrder(Sides sides) {
        for (int i = 0; i < sides.getSidesAmount(); i++) {
            this.sides.add(sides.getSides().get(i));
        }
        this.price += sides.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.name + ", hinnaga " + this.price + "€" + ". Lisandid: " + this.sides;
    }
}