package oit.com.creational_pattern.factory_method;

public class DuckFactory {
    public static Duck getDuck(DuckType duckType) {
        switch (duckType) {
            case BLACK:
                return new DuckBlack();
            case WHITE:
                return new DuckWhite();
            default:
                throw new IllegalArgumentException("this duck type is unsupport");
        }
    }
}
