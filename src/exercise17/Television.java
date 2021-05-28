package exercise17;

public class Television extends Appliance{
    private final int defaultInch = 20;
    private int inch;
    private boolean tdt = false;

    public Television() {
        this.inch = defaultInch;
    }

    public Television(double basicCost, int weight) {
        super(basicCost, weight);
        this.inch = defaultInch;
    }

    public Television(double basicCost, String color, char energyConsumption, int weight, int inch, boolean tdt) {
        super(basicCost, color, energyConsumption, weight);
        this.inch = inch;
        this.tdt = tdt;
    }

    @Override
    public double finalCost() {
        super.finalCost();
        this.basicCost = this.basicCost + (this.basicCost * percentByInch()) + TdtCost();
        return this.basicCost;
    }

    private double percentByInch() {
        return (this.inch > 40) ? 0.3 : 0.0;
    }

    private double TdtCost() {
        return (this.tdt) ? 50 : 0;
    }
}
