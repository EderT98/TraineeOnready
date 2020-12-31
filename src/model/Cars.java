package model;

import java.text.DecimalFormat;

public class Cars extends Vehicles{
    private Integer doors;
    DecimalFormat formatPrice = new DecimalFormat("#,###.00");

    public Cars(String brands, String model, Double price, Integer doors) {
        super(brands, model, price);
        this.doors = doors;
    }

    public Integer getDoors() {
        return doors;
    }
    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Marca: " + getBrands() + " //" + " Modelo: " + getModel() + " //" +
                " Puertas: " + getDoors()+ " //" + " Precio: $" +formatPrice.format(getPrice());
    }
}
