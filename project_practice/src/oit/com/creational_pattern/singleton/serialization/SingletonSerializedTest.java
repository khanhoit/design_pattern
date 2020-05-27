package oit.com.creational_pattern.singleton.serialization;

import oit.com.creational_pattern.singleton.EnumSingleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;


        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerializedTest.txt"));
        out.writeObject(serializedSingleton1);
        out.writeObject(enumSingleton1);
        out.close();

//        de-serialize from file to object

        ObjectInput in = new ObjectInputStream(new FileInputStream("SingletonSerializedTest.txt"));
        SerializedSingleton serializedSingleton2 = (SerializedSingleton) in.readObject();
        EnumSingleton enumSingleton2 = (EnumSingleton) in.readObject();
        in.close();

        System.out.println("serializedSingleton1 hashcode= " + serializedSingleton1.hashCode());
        System.out.println("serializedSingleton2 hashcode= " + serializedSingleton2.hashCode());
        System.out.println("enumSingleton1 hashcode= " + enumSingleton1.hashCode());
        System.out.println("enumSingleton2 hashcode= "+ enumSingleton2.hashCode());

    }
}
