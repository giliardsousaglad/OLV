package br.com.olv.api.model;

/**
 * Created by giliard-ss on 18/08/2017.
 */
public class Sale {
    private double cost;
    private String description;


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
