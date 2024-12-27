package com.cargoapp.model;

/**
 *
 * @author Prithivi
 */
public class CargoModel {
    private int cargoId;
    private double shippingCost;
    private double weight;
    private double volume;
    private String origin;
    private String destination;
    private String status;
    private int estimatedDelivery;

    public CargoModel(){
    
    }
    
    public CargoModel(int cargoId, double shippingCost, double weight, double volume, 
                      String origin, String destination, String status, int estimatedDelivery) {
        this.cargoId = cargoId;
        this.shippingCost = shippingCost;
        this.weight = weight;
        this.volume = volume;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
        this.estimatedDelivery = estimatedDelivery;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(int estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }
}