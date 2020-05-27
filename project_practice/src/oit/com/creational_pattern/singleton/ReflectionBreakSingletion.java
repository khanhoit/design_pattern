package oit.com.creational_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingletion {

    public static void main(String[] args) throws InstantiationException, IllegalArgumentException, InvocationTargetException, IllegalAccessException {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        Constructor<?>[] constructors = EnumConstantNotPresentException.class.getConstructors();

        for (Constructor<?> constructor: constructors) {
            constructor.setAccessible(true);
            instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

//     tương tự Eager initialization, implement theo bill ough singleton cũng bị break bởi reflection

}
