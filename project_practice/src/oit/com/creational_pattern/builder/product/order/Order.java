package oit.com.creational_pattern.builder.product.order;

import oit.com.creational_pattern.builder.product.type.BreadType;
import oit.com.creational_pattern.builder.product.type.OrderType;
import oit.com.creational_pattern.builder.product.type.SauceType;
import oit.com.creational_pattern.builder.product.type.VegetableType;

public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        super();
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderType=" + orderType +
                ", breadType=" + breadType +
                ", sauceType=" + sauceType +
                ", vegetableType=" + vegetableType +
                '}';
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }
}
