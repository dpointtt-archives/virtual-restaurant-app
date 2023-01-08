package ua.com.archie.virtualrestaurantapp.pizza;

public enum PizzaSize {
    BIG(45),
    SMALL_PIZZA(30);

    private final int size;
    PizzaSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
