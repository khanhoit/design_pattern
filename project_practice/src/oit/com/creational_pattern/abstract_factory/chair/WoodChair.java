package oit.com.creational_pattern.abstract_factory.chair;

import oit.com.creational_pattern.abstract_factory.chair.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("create wood chair");
    }
}
