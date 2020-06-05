package oit.com.structural.adapter.vidu2;

public class Client {
    public static void main(String[] args) {

//      ClassA muốn sử dụng các phương thức của classB thông qua Adapter

        ClassA classA = new Adapter(new ClassB());
        classA.action();
    }
}
