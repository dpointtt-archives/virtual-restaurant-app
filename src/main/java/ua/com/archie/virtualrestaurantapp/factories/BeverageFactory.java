package ua.com.archie.virtualrestaurantapp.factories;

import ua.com.archie.virtualrestaurantapp.beverage.*;

public class BeverageFactory {
    public Beverage makeBeverage(String beverageType){
        return switch (beverageType) {
            case "Tea" -> new Tea();
            case "Coffee" -> new Coffee();
            case "Cola" -> new Cola();
            case "Fanta" -> new Fanta();
            // TODO: sdelayu potom exceptions svoi
            default -> null;
        };
    }
}
