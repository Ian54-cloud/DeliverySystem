package Deliveries;

public sealed interface Delivery permits DroneDelivery, CarDelivery, BikeDelivery {
    public void deliverOrder();
}
