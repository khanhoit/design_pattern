package oit.com.creational_pattern.builder.concretebuilder;

import oit.com.creational_pattern.builder.builder.OrderBuilder;
import oit.com.creational_pattern.builder.product.order.Order;
import oit.com.creational_pattern.builder.product.type.BreadType;
import oit.com.creational_pattern.builder.product.type.OrderType;
import oit.com.creational_pattern.builder.product.type.SauceType;
import oit.com.creational_pattern.builder.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;

    private BreadType breadType;

    private SauceType sauceType;

    private VegetableType vegetableType;


    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order builder() {
        return new Order(orderType,breadType, sauceType,vegetableType);
    }
}
