package Decorator;

public class Basic implements Sandwich {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
