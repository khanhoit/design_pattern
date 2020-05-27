package oit.com.creational_pattern.abstract_factory.table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("create wood table");
    }
}
