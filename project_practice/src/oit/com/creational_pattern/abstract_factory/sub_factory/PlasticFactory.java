package oit.com.creational_pattern.abstract_factory.sub_factory;

import oit.com.creational_pattern.abstract_factory.FurnitureAbstractFactory;
import oit.com.creational_pattern.abstract_factory.chair.Chair;
import oit.com.creational_pattern.abstract_factory.chair.PlasticChair;
import oit.com.creational_pattern.abstract_factory.table.PlasticTable;
import oit.com.creational_pattern.abstract_factory.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
