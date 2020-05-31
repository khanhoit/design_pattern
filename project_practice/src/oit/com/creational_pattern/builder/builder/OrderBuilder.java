package oit.com.creational_pattern.builder.builder;

import oit.com.creational_pattern.builder.product.order.Order;
import oit.com.creational_pattern.builder.product.type.BreadType;
import oit.com.creational_pattern.builder.product.type.OrderType;
import oit.com.creational_pattern.builder.product.type.SauceType;
import oit.com.creational_pattern.builder.product.type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order builder();
}
