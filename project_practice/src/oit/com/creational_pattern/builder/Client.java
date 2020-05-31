package oit.com.creational_pattern.builder;

import oit.com.creational_pattern.builder.concretebuilder.FastFoodOrderBuilder;
import oit.com.creational_pattern.builder.product.order.Order;
import oit.com.creational_pattern.builder.product.type.BreadType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder().orderBread(BreadType.BEEF).builder();
        System.out.println(order.toString());
    }

}
