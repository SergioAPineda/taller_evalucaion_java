package exercise4;

public class Product {
    private double tax = 0.21;
    private double basicCost;

    public Product(double basicCost) {
        this.basicCost = basicCost;
    }

    public double calculateCost(){
        double totalTaxes = this.basicCost * this.tax;
        double totalCost = this.basicCost + totalTaxes;
        return totalCost;
    }
}
