package exercise17;

import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;

public class Appliance {
    private final double defaultCost = 100;
    private final String defaultColor = "blanco";
    private final char defaultEnergyConsumption = 'F';
    private final int defaultWeight = 5;

    protected double basicCost;
    private String color;
    private char energyConsumption;
    private int weight;
    private final List<Character> charConsumption = Arrays.asList('A','B','C','D','F');
    private final List <String> availableColors = Arrays.asList("blanco","negro","rojo","azul","gris");
    private final List <Double> prices = Arrays.asList(100.0, 80.0, 60.0, 50.0, 30.0, 10.0);

    public Appliance() {
    }

    public Appliance(double basicCost, int weight) {
        this.basicCost = basicCost;
        this.weight = weight;
        this.color = this.defaultColor;
        this.energyConsumption = this.defaultEnergyConsumption;
    }

    public Appliance(double basicCost, String color, char energyConsumption, int weight) {
        this.basicCost = basicCost;
        this.color = checkColor(color.toLowerCase());
        this.energyConsumption = checkEnergyConsumption(energyConsumption);
        this.weight = weight;
        finalCost();
    }

    private String checkColor(String defaultColor) {
        List<String> colorRes = availableColors.stream().filter(caracter -> caracter.equals(defaultColor)).collect(Collectors.toList());
        return (colorRes.isEmpty()) ? defaultColor : colorRes.get(0);
    }

    private char checkEnergyConsumption(char energyConsumption) {
        List<Character> res = charConsumption.stream().filter(caracter -> caracter.equals(energyConsumption)).collect(Collectors.toList());
        return (res.isEmpty()) ? defaultEnergyConsumption : res.get(0);
    }

    private double calculateConsumtionCost() {
        int position = charConsumption.indexOf(this.energyConsumption);
        return (position < 0) ? 0.0 : prices.get(position);
    }

    private double calculateWeightCost() {
        if (weight < 19) return 10.0;
        else if (weight < 49) return 50.0;
        else if (weight < 79) return 80.0;
        else return 100.0;
    }

    protected double finalCost() {
        this.basicCost += calculateConsumtionCost() + calculateWeightCost();
        return this.basicCost;
    }

    public double getBasicCost() {
        return basicCost;
    }

    public String getColor() {
        return color;
    }

    public char getConsumption() {
        return energyConsumption;
    }

    public int getPeso() {
        return weight;
    }
}




