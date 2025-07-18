package Subclass.Chinese;

import Parentclass.Foodmenu;

public class Schzwannoodles implements Foodmenu {
    public void foodname(String name){
        System.out.println("The name of food is " +name);

    }
    public void cost(int cost){
        System.out.println("The cost of food is " +cost);

    }
    public void category(String Cat){
        System.out.println("The food belongs to category " +Cat);

    }
    public void quantity(int quan){
        System.out.println("The quantity of food is " +quan);

    }

}
