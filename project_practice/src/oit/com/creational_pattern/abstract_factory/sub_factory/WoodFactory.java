package oit.com.creational_pattern.abstract_factory.sub_factory;

import oit.com.creational_pattern.abstract_factory.FurnitureAbstractFactory;
import oit.com.creational_pattern.abstract_factory.chair.Chair;
import oit.com.creational_pattern.abstract_factory.chair.WoodChair;
import oit.com.creational_pattern.abstract_factory.table.Table;
import oit.com.creational_pattern.abstract_factory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
