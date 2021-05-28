package exercise17;

public class WashingMachine extends Appliance {
    private final double defaultLoad = 5;
    private double load;

    public WashingMachine() {
    }

    public WashingMachine(double basicCost, int weight) {
        super(basicCost, weight);
    }

    public WashingMachine(double basicCost, String color, char energyConsumption, int weight, double load) {
        super(basicCost, color, energyConsumption, weight);
        this.load = load;
    }

    @Override
    public double finalCost() {
        super.finalCost();
        return this.basicCost += calculateLoadCost();
    }

    private double calculateLoadCost() {
        return (this.load >= 30) ? 50 : 0;
    }

    public double getLoad() {
        return load;
    }
}
