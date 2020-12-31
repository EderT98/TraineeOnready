package model;

import java.text.DecimalFormat;

public class Motorcycles extends Vehicles{

    private Integer cylinder;
    DecimalFormat formatPrice = new DecimalFormat("#,###.00");


    public Motorcycles(String brands, String model, Double price, Integer cylinder) {
        super(brands, model, price);
        this.cylinder = cylinder;
    }

    public Integer getCylinder() {return cylinder; }

    @Override
    public String toString() {
        return "Marca: " + getBrands() + " //" + " Modelo: " + getModel() + " //" +
                " Cilindrada: " + getCylinder()+ " //" + " Precio: $" +formatPrice.format(getPrice());
    }
}
