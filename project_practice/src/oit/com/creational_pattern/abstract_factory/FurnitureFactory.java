package oit.com.creational_pattern.abstract_factory;

import oit.com.creational_pattern.abstract_factory.sub_factory.PlasticFactory;
import oit.com.creational_pattern.abstract_factory.sub_factory.WoodFactory;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType materialType){
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new IllegalArgumentException("this material is unsupport");
        }
    }
}
