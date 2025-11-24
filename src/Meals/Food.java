package Meals;

import Exceptions.DishNamenotinList;

import java.util.Scanner;

public abstract class Food {

    private String dish_name;
    private String type;
    private double quantity;
    private double price;
    private double calories;
    //constructor
    public Food(String dish_name, String type, double price, double calories){
        this.dish_name=dish_name;
        this.type=type;

        this.price=price;
        this.calories=calories;
    }
    //empty constructor
    public Food(){

    }


    //user will type the name of dish he (data validation)
    public void setDish_name(String dish_name) throws DishNamenotinList {
        boolean exists = Vegetarian.vegetarianList.stream()
                .anyMatch(v -> v.getDish_name().equalsIgnoreCase(dish_name));

        if (!exists) {
            throw new DishNamenotinList("The dish '" + dish_name + "' is not on the menu.");
        }

        this.dish_name = dish_name;
    }

    public String getDish_name(){
        return dish_name;
    }
    //data validation
    public void setType(String type){
        Scanner sc=new Scanner(System.in);
        while(!type.equalsIgnoreCase("Non-vegetarian") && !type.equalsIgnoreCase("vegetarian")){
            System.out.println("please write the correct type of meal you want!");
            type=sc.nextLine();
        }
        this.type=type;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Dish Name:"+dish_name+"-"+ "Type:"+type+"-"+"Price:"+price+ "$"+"-"+"Calories:"+calories+"kcal";
    }
}
