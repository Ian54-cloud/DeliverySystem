public final class DroneDelivery implements Delivery{
public String name;

    @Override
    public void deliverOrder() {
        System.out.println("delivering by drone!");
    }

    }

