package ui;

import model.Cars;
import model.Motorcycles;
import model.Vehicles;

import java.util.ArrayList;
import java.util.List;


public class UiVehicles {

    public static void showProgram(){

        showVehicles();
        System.out.println("=============================");
        maxMinVehicles();
        searchY();
        System.out.println("=============================");
        sortVehicles();

    }

    private static List<Vehicles> list(){
        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(new Cars("Peugeot", "206",200000.00, 4));
        vehicles.add(new Motorcycles("Yamaha", "YBR", 80500.50, 160));
        vehicles.add(new Cars("Peugeot", "208",250000.00, 5));
        vehicles.add(new Motorcycles("Honda", "Titan", 60000.00, 125));

        return vehicles;
    }
    private static void showVehicles(){
        List<Vehicles> vehicles = list();
        for (Vehicles v: vehicles){System.out.println(v);}
    }

    private static void sortVehicles() {
        List<Vehicles> vehiclesSort = list();
        vehiclesSort.sort((v1, v2) -> v2.getPrice().compareTo(v1.getPrice()));

        for (Vehicles vehicles : vehiclesSort) {
            System.out.println(vehicles.getBrands() + " " +
                    vehicles.getModel());
        }
    }

    private static void searchY() {
        for (int i = 0; i < list().size(); i++) {
            char[] parameter = list().get(i).getBrands().toCharArray();
            for (char c : parameter) {
                if (c == 'Y') {
                    System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " +
                            list().get(i).getBrands() + " " +
                            list().get(i).getModel() + " $" +
                            list().get(i).getPrice());
                }
            }
        }
    }

    private static void maxMinVehicles(){
        List<Vehicles> vehiclesSort = list();
        vehiclesSort.sort((v1, v2) -> v2.getPrice().compareTo(v1.getPrice()));
        Vehicles minPrice = vehiclesSort.get(vehiclesSort.size()-1);
        Vehicles maxPrice = vehiclesSort.get(0);
        System.out.println("Vehículo más caro: " + maxPrice.getBrands() +" "+ maxPrice.getModel());
        System.out.println("Vehículo más barato: "+ minPrice.getBrands() +" "+ minPrice.getModel());
    }
}
