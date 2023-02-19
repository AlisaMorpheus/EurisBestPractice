package builderecommerce;

import java.util.List;

public class ShoppingCart {
    private int id;
    private double cost;
    private double shippingRate;
    private Address address;
    private List<Item> item;

    public ShoppingCart(int id, double cost, double shippingRate, Address address, List<Item> item) {
        this.id = id;
        this.cost = cost;
        this.shippingRate = shippingRate;
        this.address = address;
        this.item = item;
    }

}
