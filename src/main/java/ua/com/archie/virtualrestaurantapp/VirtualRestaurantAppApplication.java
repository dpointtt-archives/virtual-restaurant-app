package ua.com.archie.virtualrestaurantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.com.archie.virtualrestaurantapp.pizza.PizzaSize;

@SpringBootApplication
public class VirtualRestaurantAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirtualRestaurantAppApplication.class, args);
    }

}
