package oit.com.creational_pattern.singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();


//    private construtor to avoid client application to use constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
