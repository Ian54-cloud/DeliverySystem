import Deliveries.BikeDelivery;
import Deliveries.CarDelivery;
import Deliveries.Delivery;
import Deliveries.DroneDelivery;
import Exceptions.DishNamenotinList;
import Exceptions.OptionDeliveryNotFound;
import Meals.Food;
import Meals.NonVegetarian;
import Meals.Vegetarian;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Welcome to online food System");
                    System.out.println("are you vegetarian or non-vegetarian?");
                    String user_answer_food = sc.nextLine();

                    ArrayList<Delivery> deliveries = new ArrayList<>();
                    //or null. To be checked
                    String user_input = "";
                    //String if_user_says_no="no";
                    switch (user_answer_food.toLowerCase()) {
                        case "vegetarian":
                            Food food = new Vegetarian();
                            if (food instanceof Vegetarian vegetarian) {
                                food = new Vegetarian();
                                ((Vegetarian) food).addVegetarianFoodInList(new Vegetarian("Coconut & squash dhansak", "Vegetarian", 50.95, 382));
                                ((Vegetarian) food).addVegetarianFoodInList(new Vegetarian("Spicy root & lentil casserole", "Vegetarian", 78.91, 600));
                                ((Vegetarian) food).addVegetarianFoodInList(new Vegetarian("Sweet potato & peanut curry", "Vegetarian", 100.00, 816));
                                ((Vegetarian) food).addVegetarianFoodInList(new Vegetarian("Margherita pizza", "Vegetarian", 100.00, 716));
                                vegetarian.DisplayVegetarianFoodInList();
                                System.out.println("According to the menu, write the dish that You want:");
                                String dish_user = sc.nextLine();
                                try {
                                    food.setDish_name(dish_user);
                                } catch (DishNamenotinList e) {
                                    System.out.println(e.getMessage());
                                }
                                //removed select dish from menu
                                Vegetarian selected = Vegetarian.vegetarianList.stream()
                                        .filter(v -> v.getDish_name().equalsIgnoreCase(dish_user))
                                        .findFirst()
                                        .orElse(null);

                                if (selected != null) {
                                    vegetarian.removeVegetarianFoodInList(selected);
                                    System.out.println("Remaining menu: " + Vegetarian.vegetarianList);
                                }

                            }
                        case "non-vegetarian":
                            Food food1=new NonVegetarian();
                            if(food1 instanceof NonVegetarian nonVegetarian){
                                food1=new NonVegetarian();
                                ((NonVegetarian) food1).addNonVegetarianFoodInList(new NonVegetarian("Bacalhau à Brás","non-vegetarian", 89.91,729 ));
                                ((NonVegetarian) food1).addNonVegetarianFoodInList(new NonVegetarian("Arroz de Marisco","non-vegetarian",91.79,825 ));
                                ((NonVegetarian) food1).addNonVegetarianFoodInList(new NonVegetarian("Bacalhau à Lagareiro", "non-vegetarian", 81.71, 915));
                                ((NonVegetarian) food1).addNonVegetarianFoodInList(new NonVegetarian("Francesinha", "non-vegetarian", 82.91, 368));
                                ((NonVegetarian) food1).addNonVegetarianFoodInList(new NonVegetarian("Piri-Piri Chicken", "non-vegetarian", 26.29, 358));
                                nonVegetarian.DisplayNonVegetarianFoodInList();
                                System.out.println("According to the menu, write the dish that You want:");
                                String dish_user = sc.nextLine();
                                try {
                                    food1.setDish_name(dish_user);
                                } catch (DishNamenotinList e) {
                                    System.out.println(e.getMessage());
                                }
                                //removed select dish from menu
                                NonVegetarian selected = NonVegetarian.nonVegetarianList.stream()
                                        .filter(v -> v.getDish_name().equalsIgnoreCase(dish_user))
                                        .findFirst()
                                        .orElse(null);

                                if (selected != null) {
                                    nonVegetarian.removeNonVegetarianFoodInList(selected);
                                    System.out.println("Remaining menu: " + NonVegetarian.nonVegetarianList);
                                }

                            }

                                while (!user_input.equalsIgnoreCase("no")) {

                                    System.out.println("How would You like to be delivered?");
                                    String user_answer = sc.nextLine();
                                    switch (user_answer.toLowerCase()) {

                                        case "bike":
                                             Delivery delivery = new BikeDelivery();
                                            if (delivery instanceof BikeDelivery bikeDelivery) {
                                                bikeDelivery.deliverOrder();
                                            }
                                            break;
                                        case "drone":
                                            Delivery delivery1 = new DroneDelivery();
                                            if (delivery1 instanceof DroneDelivery droneDelivery) {
                                                delivery1.deliverOrder();
                                            }
                                            break;
                                        case "car":
                                            Delivery delivery2 = new CarDelivery();
                                            if (delivery2 instanceof CarDelivery) {
                                                delivery2.deliverOrder();
                                            }
                                            break;

                                        default:
                                            try {
                                                UserWroteIncorrectOption();
                                            } catch (OptionDeliveryNotFound e) {
                                                System.out.println(e.getMessage());
                                            }
                                    }
                                }
                                            System.out.println("do you want to continue?");
                                            user_input = sc.nextLine();
                                            if (user_input.equalsIgnoreCase("no")) {
                                                break;
                                            }

                                }

                            }



    public static void UserWroteIncorrectOption() throws OptionDeliveryNotFound{
        String user_answer="";
        if(!user_answer.equalsIgnoreCase("bike") && !user_answer.equalsIgnoreCase("car") && !user_answer.equalsIgnoreCase("drone"))
            throw new OptionDeliveryNotFound("The option you wrote doesn't exist");
    }

                    }



