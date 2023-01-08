package ua.com.archie.virtualrestaurantapp.factories;

import ua.com.archie.virtualrestaurantapp.pizza.*;

public class PizzaFactory {
    public Pizza makePizza(PizzaSize size, String pizzaType){
        return switch (pizzaType){
            case "Pepperoni" -> new Pepperoni(size);
            case "FourCheeses" -> new FourCheeses(size);
            case "Hawaiian" -> new Hawaiian(size);
            case "BarbecueChicken" -> new BarbecueChicken(size);
            // TODO: zamenit na extentions
            default -> null;
        };
    }
}
