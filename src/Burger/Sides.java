package Burger;
import java.util.ArrayList;

public class Sides {

    private ArrayList<String> sides = new ArrayList<String>();
    private double price;

    // Polymorphism
    public Sides(ArrayList<String> sides) {
        for (int i = 0; i < sides.size(); i++) {
            this.price += 1.0;
            this.sides.add(sides.get(i));
        }
    }

    public Sides() {
        this.price = 1;
    }

    public int getSidesAmount() {
        return sides.size();
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public double getPrice() {
        return price;
    }
}
