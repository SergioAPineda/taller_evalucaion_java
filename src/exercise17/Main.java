package exercise17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Appliance[] electrodomesticos = new Appliance[10];

        electrodomesticos[0] = new WashingMachine(150, 35);
        electrodomesticos[1] = new WashingMachine(180, 45);
        electrodomesticos[2] = new WashingMachine(200, 55);
        electrodomesticos[3] = new WashingMachine(220, 65);
        electrodomesticos[4] = new Appliance(200, "violeta", 'F', 65);
        electrodomesticos[5] = new Appliance(190, "Amarillo", 'A', 60);
        electrodomesticos[6] = new Appliance(180, "Cafe", 'C', 55);
        electrodomesticos[7] = new Appliance(170, "Dorado", 'A', 50);
        electrodomesticos[8] = new Television(125, "Rojo", 'D', 10, 32, true);
        electrodomesticos[9] = new Television(225, "Aguamarina", 'C', 20, 55, true);

        Main.filterWashingmMachine(electrodomesticos);
        Main.filterAppliance(electrodomesticos);
        Main.filterTv(electrodomesticos);

    }

    public static void filterWashingmMachine(Appliance[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof WashingMachine).forEach(lav -> System.out.println("El costo total de la lavadora es:  "+lav.finalCost()));
    }
    public static void filterTv(Appliance[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Television).forEach(lav -> System.out.println("El costo total de la TV es:  "+lav.finalCost()));
    }
    public static void filterAppliance(Appliance[] elec){
        Arrays.stream(elec).filter(ele -> ele instanceof Appliance).forEach(lav -> System.out.println("El costo total del electrodomestico es:  "+lav.finalCost()));
    }
}
