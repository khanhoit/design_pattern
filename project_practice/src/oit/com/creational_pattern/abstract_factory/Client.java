package oit.com.creational_pattern.abstract_factory;

import oit.com.creational_pattern.abstract_factory.chair.Chair;
import oit.com.creational_pattern.abstract_factory.table.Table;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory furnitureAbstractFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair = furnitureAbstractFactory.createChair();
        chair.create();

        Table table = furnitureAbstractFactory.createTable();
        table.create();
    }
}
