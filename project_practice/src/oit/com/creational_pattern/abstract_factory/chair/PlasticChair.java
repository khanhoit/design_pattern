package oit.com.creational_pattern.abstract_factory.chair;

import oit.com.creational_pattern.abstract_factory.chair.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("create plastic chair");
    }
}
