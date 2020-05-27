package oit.com.creational_pattern.singleton.serialization;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final Long serialVersionUID = 1741825395699241705L;

    private SerializedSingleton() {

    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
