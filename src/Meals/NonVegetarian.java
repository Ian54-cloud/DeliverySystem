package Meals;

import java.util.ArrayList;
import java.util.List;

public class NonVegetarian extends Food{
    public static List<NonVegetarian> nonVegetarianList=new ArrayList<>();

    public NonVegetarian(String dish_name, String type,  double price, double calories){
        super(dish_name, type,price, calories );
    }
    public NonVegetarian(){
        super();
    }

    public void addNonVegetarianFoodInList(NonVegetarian nonVegetarian){
       nonVegetarianList.add(nonVegetarian);
    }
    public void removeNonVegetarianFoodInList(NonVegetarian nonVegetarian){
        nonVegetarianList.remove(nonVegetarian);
    }
    public void DisplayNonVegetarianFoodInList(){
        int i=0;
        for(NonVegetarian nv: nonVegetarianList){
            System.out.println(i+"."+nv);
            i++;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
