package oit.com.creational_pattern.abstract_factory.table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("create plastic table");
    }
}
