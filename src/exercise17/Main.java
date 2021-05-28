package exercise17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Appliance[] electrodomesticos = new Appliance[10];

        electrodomesticos[0] = new WashingMachine(150, 50);
        electrodomesticos[1] = new Appliance(150, "rojo", 'B', 20);
        electrodomesticos[2] = new Television(150, "negro", 'A', 10, 50, true);
        electrodomesticos[3] = new WashingMachine(200, "gris", 'D',10,20 );
        electrodomesticos[4] = new Appliance(180, 50);
        electrodomesticos[5]= new Television(150, "negro",'F',10,50,true);
        electrodomesticos[6]= new Appliance(150,"negro",'C',20 );
        electrodomesticos[7]= new Appliance(190, 50);
        electrodomesticos[8]= new Television(150, "gris",'A',10,50,false);
        electrodomesticos[9]= new WashingMachine(200, "blanco",'A',10,30);

        Main.filterWashingmMachine(electrodomesticos);
        Main.filterTv(electrodomesticos);
        Main.filterAppliance(electrodomesticos);
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
