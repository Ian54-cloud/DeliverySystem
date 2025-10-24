public final class CarDelivery implements Delivery{
    public String name;
    @Override
    public void deliverOrder() {
        System.out.println("Delivering by car!");
    }

    }

