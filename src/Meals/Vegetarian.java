package Meals;

import java.util.ArrayList;
import java.util.List;

public class Vegetarian extends Food {
    //static ArrayList. Easily access the elements without making out an object
    public static List<Vegetarian> vegetarianList=new ArrayList<>();
    public Vegetarian(String dish_name, String type,  double price, double calories){
        super(dish_name, type,price, calories );
    }
    public Vegetarian(){
super();
    }



    public void addVegetarianFoodInList(Vegetarian vegetarian){
        vegetarianList.add(vegetarian);
    }
    public void removeVegetarianFoodInList(Vegetarian vegetarian){
        vegetarianList.remove(vegetarian);
    }
    public void DisplayVegetarianFoodInList(){
        int i=1;
        for(Vegetarian v: vegetarianList){
            System.out.println(i+"."+v.toString());
            i++;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

    }

