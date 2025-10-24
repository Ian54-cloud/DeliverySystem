import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Delivery> deliveries = new ArrayList<>();

        deliveries.add(new BikeDelivery());
        deliveries.add(new CarDelivery());
        deliveries.add(new DroneDelivery());

        for (Delivery d : deliveries) {
            System.out.println("Class: " + d.getClass());


            if (d instanceof CarDelivery cd) {
                System.out.print("What is your name: ");
                String name = sc.nextLine();
                cd.deliverOrder();
            } else if (d instanceof DroneDelivery dd) {
                System.out.print("What is your name: ");
                String name = sc.nextLine();
                dd.deliverOrder();
            } else if (d instanceof BikeDelivery bd) {
                System.out.println("Bike delivery completed!");
                String name = sc.nextLine();
                bd.deliverOrder();
            }


        }

        sc.close();
    }
}
