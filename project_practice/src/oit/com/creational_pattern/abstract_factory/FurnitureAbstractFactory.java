package oit.com.creational_pattern.abstract_factory;

import oit.com.creational_pattern.abstract_factory.chair.Chair;
import oit.com.creational_pattern.abstract_factory.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
