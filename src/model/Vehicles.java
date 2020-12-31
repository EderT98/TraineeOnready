package model;

import java.text.DecimalFormat;

public class Vehicles{

    private String brands;
    private String model;
    private Double price;

    public Vehicles(String brands, String model, Double price){
        this.brands = brands;
        this.model = model;
        this.price = price;
    }

    public String getBrands() {return brands; }
    public String getModel() {return model; }
    public Double getPrice() {return price;}
}
